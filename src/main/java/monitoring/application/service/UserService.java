package monitoring.application.service;

import monitoring.application.app.web.model.post_model.UserPostModel;
import monitoring.application.entity.data.SucardInstance;
import monitoring.application.entity.data.User;
import monitoring.application.service.model.UserServiceModel;

import java.util.List;

public interface UserService {

    UserServiceModel saveUser(UserPostModel userPostModel);

    User findByUsername (String userName);

    UserServiceModel findByID (long id);

    boolean updateListInstance(User user);
}
