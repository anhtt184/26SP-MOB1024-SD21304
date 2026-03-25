package Repositories;

import java.sql.*;

public class JDBC {
    private static Connection cnn = null;

    public static Connection getSqlserverConnection() {
        if (cnn == null) {
            String databaseName = "SP26_SD21304_Demo";
            String acc = "sa";
            String pwd = "AnhTT184";
            try {
                cnn = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;trustServerCertificate=true;databaseName=" + databaseName + ";",
                        acc,
                        pwd
                );
            } catch (SQLException e) {
                System.out.println("Get connection error: ");
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }

        return cnn;
    }
}
