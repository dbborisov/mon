package monitoring.application.service.impl;


import monitoring.application.service.ConnectionService;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;

@Service
public class ConnectionServiceImpl  implements ConnectionService {


    @Override
    public Connection getConnection( String url,String user, String pass) {
        try {
            //load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

//            String url = "jdbc:oracle:thin:@osvboffodb1t.tst.srv:2403/boproct.tst.svc";
//            String user = "dobri";
//            String pass = "BoricaPwd001";

            //create the connection object
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection made to PDB");
            return con;
        }
        catch(Exception e) {
            System.out.print(e);
            return null;
        }
    }
}
