package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testConnection {
    public static void main(String[] args) {
        Connection con = myConnection.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM HOC_VIEN");

            while (rs.next()){
                String ten = rs.getString(2);
                String dc = rs.getString(3);
                System.out.println(ten + "----" + dc);
            }
            String maHV = "HJ006";

            st.executeUpdate("INSERT INTO HOC_VIEN VALUES ('"+maHV+"', 'TRAN TEO', 'ABC','JVC')");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}


