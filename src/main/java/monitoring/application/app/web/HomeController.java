package monitoring.application.app.web;



import monitoring.application.service.ConnectionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Controller
public class HomeController {

  private final ConnectionService connection;

    public HomeController(ConnectionService connection) {
        this.connection = connection;
    }

    @GetMapping("/")
    public String getHome(){
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
}
