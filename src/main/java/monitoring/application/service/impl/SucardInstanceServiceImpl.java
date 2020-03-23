package monitoring.application.service.impl;

import monitoring.application.app.web.model.get_model.SucardInstanceViewModel;
import monitoring.application.app.web.model.post_model.SucardInstancePostModel;
import monitoring.application.entity.data.SqlScript;
import monitoring.application.entity.data.SucardInstance;
import monitoring.application.entity.data.User;
import monitoring.application.entity.repository.SucardInstanceRepository;
import monitoring.application.service.SucardInstanceService;
import monitoring.application.service.UserService;
import monitoring.application.service.model.UserServiceModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class SucardInstanceServiceImpl implements SucardInstanceService {


    private final SucardInstanceRepository sucardInstanceRepository;
    private final ModelMapper modelMapper;
    private final UserService userService;

    public SucardInstanceServiceImpl(SucardInstanceRepository sucardInstanceRepository, ModelMapper modelMapper, UserService userService) {
        this.sucardInstanceRepository = sucardInstanceRepository;
        this.modelMapper = modelMapper;
        this.userService = userService;
    }

    @Override
    public SucardInstanceViewModel save(SucardInstancePostModel sucardInstancePostModel) {


        SucardInstance sucardInstance = this.sucardInstanceRepository.findByName(sucardInstancePostModel.getName());
        if(sucardInstance == null){
            sucardInstance = new SucardInstance();
            sucardInstance.setUser(this.userService.findByUsername(sucardInstancePostModel.getUsername()));
            sucardInstance.setSqlScriptList(new ArrayList<>());
            sucardInstance.setConnectionConfiguration(sucardInstancePostModel.getConnectionConfiguration());
            sucardInstance.setName(sucardInstancePostModel.getName());
        }

        this.sucardInstanceRepository.save(sucardInstance);

        return this.modelMapper.map(sucardInstance,SucardInstanceViewModel.class);
    }

    @Override
    public List<SucardInstanceViewModel> findAll() {
        List<SucardInstanceViewModel> collect = this.sucardInstanceRepository.findAll().stream()
                .map(e -> this.modelMapper.map(e, SucardInstanceViewModel.class))
                .collect(Collectors.toList());
        return collect;
    }


    @Override
    public List<SucardInstanceViewModel> finByUsername(String username) {

        User byUsername = this.userService.findByUsername(username);

        List<SucardInstanceViewModel> collect = byUsername.getInstances()
                .stream()
                .map(e -> this.modelMapper.map(e, SucardInstanceViewModel.class))
                .collect(Collectors.toList());
        return collect;
    }
}
