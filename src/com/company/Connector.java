package com.company;

import java.sql.Connection;
import java.sql.*;

public class Connector {

    public Connection con;

        public void connetToDb(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "");
                PreparedStatement prst = con.prepareStatement("SELECT * FROM products");
                ResultSet rs = prst.executeQuery();


            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

}
