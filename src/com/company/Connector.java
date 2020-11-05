package com.company;

import java.sql.Connection;
import java.sql.*;

public class Connector {

    public Connection con;

        public void connetToDb(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("test");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

}
