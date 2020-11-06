package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowAllProducts {

    Connector conn = new Connector();
    public void showAllProducts(){
        conn.connetToDb();




    }
}
