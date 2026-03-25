package Repositories;

import java.sql.*;

// DbUtils
public class JDBC {

    // khoi tao ket noi den database
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:sqlserver://192.168.1.8:1433;trustServerCertificate=true;databaseName=SP26_SD21304_Demo;",
                "sa",
                "AnhTT184!"
        );
    }

}
