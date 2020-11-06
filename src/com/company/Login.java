package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
        Scanner read= new Scanner(System.in);
        Connector conn = new Connector();

    public void login(){
        conn.connetToDb();
        System.out.println("Zaloguj sie");

        System.out.println("podaj imie do logowania:");
       String name = read.nextLine();

        System.out.println("podaj nazwisko do logowania:");
       String surname = read.nextLine();

        try {
            PreparedStatement prst = conn.con.prepareStatement("SELECT name FROM seller");
            PreparedStatement prst1 = conn.con.prepareStatement("SELECT surname FROM seller");
            ResultSet rsN = prst.executeQuery();
            ResultSet rsS = prst1.executeQuery();

            while (rsN.next() && rsS.next()){
              String nameFromDatabase =  rsN.getString(1);
              String surnamenameFromDatabase =  rsS.getString(1);
                if(nameFromDatabase.equals(name) && surnamenameFromDatabase.equals(surname)){
                    System.out.println("zalogowales sie");
                }else System.out.println("bledne dane do logowania");
            }



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
