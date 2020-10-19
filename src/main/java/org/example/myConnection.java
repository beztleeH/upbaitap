package org.example;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Hello world!
 *
 */
public class myConnection
{
    public static Connection getConnection() {
        Connection conn = null;
        //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // tìm driver , phiên bản java cũ thì cần mới thì 0
        String dbURL = "jdbc:sqlserver://MSI:1433;databaseName=QLLH";
        // DESKTOP-U3GVQTN:1433 (Tên Host : port )
        String USER_NAME = "imicjavacore1";
        String PASSWORD = "1234567";
        try {
            DriverManager.registerDriver(new SQLServerDriver());
            conn = DriverManager.getConnection(dbURL, USER_NAME, PASSWORD);

            System.out.println("connect successfully!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return conn;
    }
}
