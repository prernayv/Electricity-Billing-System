package Electricity.billing.newpackage;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class MeterInfo extends JFrame implements ActionListener{
    
    JButton next;
    JLabel lblmeter;
    Choice location,type,phasecode,billtype;
    String meterno;
    MeterInfo(String meterno){
        this.meterno=meterno;
        
        setSize(700,500);
        setLocation(400,200);
        JPanel p =new JPanel();
        p.setLayout(null);
        p.setBackground(new Color(249,194,56));
        add(p);
        
        JLabel heading = new JLabel("Meter Information");
        heading.setBounds(180,10,200,25);
        heading.setFont(new Font("Tahoma",Font.PLAIN,24));
        p.add(heading);
        
        JLabel lblname = new JLabel("Meter number");
        lblname.setBounds(100,80,100,20);
         p.add(lblname);
         
         JLabel lblmeternom = new JLabel(meterno);
        lblmeternom.setBounds(240,80,100,20);
         p.add(lblmeternom);
         
      
         
         JLabel lblmeterno = new JLabel("Meter Location");
        lblmeterno.setBounds(100,120,100,20);
         p.add(lblmeterno);
         
           location = new Choice();
           location.add("Outside");
           location.add("Inside");
           location.setBounds(240,120,200,20);
           p.add(location);
           
           lblmeter = new JLabel(" ");
        lblmeter.setBounds(240,120,100,20);
         p.add(lblmeter);
         
         
         
           JLabel lbladdress = new JLabel("Meter type ");
        lbladdress.setBounds(100,160,100,20);
         p.add(lbladdress);
         
         type = new Choice();
           type.add("Electric meter");
           type.add("solar meter");
            type.add("smart meter");
           type.setBounds(240,160,200,20);
           p.add(type);
         
         JLabel lblcity = new JLabel("Phase Code");
        lblcity.setBounds(100,200,100,20);
         p.add(lblcity);
         
        phasecode = new Choice();
            phasecode.add("011");
            phasecode.add("022");
             phasecode.add("033");
             phasecode.add("044");
             phasecode.add("055");
             phasecode.add("066");
             phasecode.add("077");
             phasecode.add("088");
             phasecode.add("099");
            phasecode.setBounds(240,200,200,20);
           p.add( phasecode);
         
         JLabel lblstate = new JLabel("Bill Type");
        lblstate.setBounds(100,240,100,20);
         p.add(lblstate);
         
         billtype = new Choice();
           billtype.add("Normal");
           billtype.add("Industrial");
          billtype.setBounds(240,240,200,20);
           p.add(billtype);
         
         
         JLabel lblemail = new JLabel("Days");
        lblemail.setBounds(100,280,100,20);
         p.add(lblemail);
         
          JLabel lblemails = new JLabel("30 days");
        lblemails.setBounds(240,280,100,20);
         p.add(lblemails);
         
       
         
         JLabel lblphoneno = new JLabel("Note");
        lblphoneno.setBounds(100,320,100,20);
         p.add(lblphoneno);
         
          JLabel lblphonenos = new JLabel("By default bill is calculated for 30 days only");
        lblphonenos.setBounds(240,320,250,20);
         p.add(lblphonenos);
         
         next = new JButton("Submit");
         next.setBounds(220,390,100,25);
         next.setBackground(Color.black);
         next.setForeground(Color.white);
         next.addActionListener(this);
         p.add(next);
         
        
         
         setLayout(new BorderLayout());
         add(p,"Center");
         
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/hicon1.jpg"));
        Image i2=i1.getImage().getScaledInstance(150, 300,Image.SCALE_DEFAULT);
         ImageIcon i3 =new ImageIcon(i2);
         JLabel image =new JLabel(i3);
         add(image,"West");
         
         getContentPane().setBackground(Color.white);
         
         
         setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==next){
            String meter = meterno;
            String locations = location.getSelectedItem();
            String types = type.getSelectedItem();
            String code = phasecode.getSelectedItem();
            String typebill = billtype.getSelectedItem();
            String days = "30";
            
            
            String query ="insert into meter_info values('"+meter+"','"+locations+"','"+types+"','"+code+"','"+typebill+"','"+days+"')";
           
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
               
                
                JOptionPane.showMessageDialog(null,"Meter information Added Successfully");
                setVisible(false);
                
                //new frame
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
          setVisible(false);  
        }
    }
    public static void main(String[]args){
        new MeterInfo("");
    }
    
}
