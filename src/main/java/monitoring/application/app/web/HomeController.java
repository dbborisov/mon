package monitoring.application.app.web;


import monitoring.application.app.web.model.post_model.SucardInstancePostModel;
import monitoring.application.app.web.model.post_model.UserPostModel;
import monitoring.application.service.ConnectionService;
import monitoring.application.service.SucardInstanceService;
import monitoring.application.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final ConnectionService connection;
    private final SucardInstanceService sucardInstance;
    private final UserService userService;

    public HomeController(ConnectionService connection, SucardInstanceService sucardInstance, UserService userService) {
        this.connection = connection;
        this.sucardInstance = sucardInstance;
        this.userService = userService;
    }

    @GetMapping("/")
    public String getHome() {
//
//        try {
//            PreparedStatement statement = connection.getConnection().prepareStatement("select  * from CRLOG.ISSUERS");
//           ResultSet resultSet =statement.executeQuery();
//           while (resultSet.next()){
//               System.out.println(resultSet.getString(1));
//           }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        return "home";
    }


    @PostMapping("/")
    String postHome(@ModelAttribute SucardInstancePostModel sucardInstancePostModel){

//        sucardInstancePostModel.setUsername("root");
        sucardInstance.save(sucardInstancePostModel);
        return "home";
    }


    @GetMapping("user")
    String getUser(){

        return "user";
    }

    @PostMapping("user")
    String postUser(@ModelAttribute UserPostModel postModel){
        this.userService.saveUser(postModel);
        return "user";
    }


}



