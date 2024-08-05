package Electricity.billing.newpackage;
import java.sql.*; //for conn c


public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
       c=  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ebs","root","Kri$na1111481");
       s=c.createStatement();
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}