package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowAllProducts {

    Connector conn = new Connector();
    public void showAllProducts(){

        try {

            conn.connetToDb();
           PreparedStatement prst = conn.con.prepareStatement("SELECT * FROM products");
            ResultSet rs = prst.executeQuery();
            while (rs.next()){
                System.out.println(
                        "id produktu :" +rs.getInt(1) +
                                " nazwa produktu :"  +rs.getString(2)+
                                " data sporzycia :" +rs.getDate(3)+
                                " cena:"  +rs.getInt(4)+
                                " ilość sztuk na sklepie :"  +rs.getInt(5)+
                                " kod kreskowy :"  +rs.getInt(6)+
                                " waga  :"  +rs.getInt(7)+
                                " kod produktu  :"  +rs.getInt(8)

                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
