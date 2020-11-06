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
                while (rs.next()){
                    System.out.println("produkty :"
                            +rs.getInt("idProduct"+1)
                            +rs.getString("nazwa produktu:"+2)
                            +rs.getDate("data sporzycia"+3)
                            +rs.getInt("cena produktu:" +4)
                            +rs.getInt("ilosc sztuk w sklepie"+5)
                            +rs.getInt("kod kreskowy"+6)
                            +rs.getInt("waga produktu"+7)
                            +rs.getInt("kod produktu"+8)

                    );
                }


            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

}
