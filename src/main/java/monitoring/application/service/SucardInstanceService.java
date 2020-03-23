package monitoring.application.service;

import monitoring.application.app.web.model.get_model.SucardInstanceViewModel;
import monitoring.application.app.web.model.post_model.SucardInstancePostModel;

import java.util.List;

public interface SucardInstanceService {
    SucardInstanceViewModel save(SucardInstancePostModel sucardInstancePostModel);
    List<SucardInstanceViewModel> findAll();
    List<SucardInstanceViewModel> finByUsername(String username);


}
