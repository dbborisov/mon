package monitoring.application.configurations;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
public class ApplicationBeenConfiguration {

    private  ModelMapper modelMapper;

   @Bean
    public ModelMapper modelMapper(){
       this.modelMapper = new ModelMapper();
       return  this.modelMapper;
   }
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public Connection oraConnection (){
//        try {
//            //load the driver class
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//
//            String url = "jdbc:oracle:thin:@osvboffodb1t.tst.srv:2403/boproct.tst.svc";
//            String user = "dobri";
//            String pass = "BoricaPwd001";
//
//            //create the connection object
//            Connection con = DriverManager.getConnection(url, user, pass);
//            System.out.println("Connection made to PDB");
//            return con;
//        }
//        catch(Exception e) {
//            System.out.print(e);
//            return null;
//        }
//    }
//
//    @Bean
//    GrantedAuthorityDefaults grantedAuthorityDefaults() {
//        return new GrantedAuthorityDefaults(""); // Remove the ROLE_ prefix
//    }
}
