package monitoring.application.service.impl;


import monitoring.application.app.web.model.post_model.UserPostModel;
import monitoring.application.entity.data.User;
import monitoring.application.entity.repository.UserRepository;
import monitoring.application.service.UserService;
import monitoring.application.service.model.UserServiceModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public UserServiceModel saveUser(UserPostModel userPostModel) {
        User user = this.userRepository.findByUsername(userPostModel.getUsername());

        if(user != null){
            return  null;
        }
        user = this.modelMapper.map(userPostModel,User.class);
        user.setInstances(new ArrayList<>());
        user = this.userRepository.save(user);

        return this.modelMapper.map(user,UserServiceModel.class);
    }

    @Override
    public User findByUsername(String userName) {
        User byUsername = this.userRepository.findByUsername(userName);
        return byUsername;
    }


    @Override
    public UserServiceModel findByID(long id) {
        return this.modelMapper.map(this.userRepository.findById(id),UserServiceModel.class);
    }

    @Override
    public boolean updateListInstance(User user) {
        User byId = this.userRepository.findById(user.getId()).orElse(null);

        if (byId == null){
            return false;
        }

        this.userRepository.save(user);

        return true;
    }
}
