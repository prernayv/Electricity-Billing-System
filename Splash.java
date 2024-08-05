package Electricity.billing.newpackage;
import javax.swing.*;
import java.awt.*;


public abstract class Splash extends JFrame implements Runnable {
    Thread t; //thread object for implements Runnable
    Splash(){
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/New4.png"));
        Image i2 = i1.getImage().getScaledInstance(898, 464,Image.SCALE_DEFAULT);
        
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,120,898,464);
        add(image);
        setVisible(true); //by default visibility hidden
        
        int x=1;
        for(int i=2;i<600;i+=4,x+=1)
        {
            setSize(i + x,i);
            setLocation(700-((i + x)/2), 400 - (i/2)); //by default origin
            try{
                Thread.sleep(1);
                
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        t=new Thread(this);
        t.start(); //start internally call run
        
        setSize(898,464);
        setLocation(100,100);
        
    }
    
    
    public void run(){             //overwrite
    try{
     Thread.sleep(7000);
     setVisible(false);
     
     //login frame
     new Login();
    }catch (Exception e){
        e.printStackTrace();
    }
}
    
   public static void main(String [] args) {
       new Splash() {};
   }   
}
