package monitoring.application.service;

import java.sql.Connection;

public interface ConnectionService {

    Connection getConnection(String url,String user, String password);
}
