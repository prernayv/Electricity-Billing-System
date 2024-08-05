package Electricity.billing.newpackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton login,cancel,signup;
    JTextField username,password;
    Choice logginin;
    Login(){
        super("Login Page"); //heading
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i41 = new ImageIcon(ClassLoader.getSystemResource("icon/New2.png"));
        Image i42 = i41.getImage().getScaledInstance(449, 600, Image.SCALE_DEFAULT);
        ImageIcon i43 = new ImageIcon(i42);
        JLabel image1 = new JLabel(i43);
        image1.setBounds(0, 0, 1000, 600);
        add(image1);

        // Login image
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/New1.png"));
        Image i8 = i7.getImage().getScaledInstance(300, 600, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image = new JLabel(i9);
        image.setBounds(0, 0, 280, 600);
        image1.add(image);
        
        JLabel lblusername =new JLabel("Username");
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblusername.setBounds(300,130 ,100 ,30 );
        image1.add(lblusername);
        
         username = new JTextField();
        username.setBounds(500,130,150,30);
        image1.add(username);
        
        JLabel lblpassword =new JLabel("Password");
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblpassword.setBounds(300,200 ,100 ,30 );
        image1.add(lblpassword);
        
         password = new JTextField();
        password.setBounds(500,200,150,30);
        image1.add(password);
        
        JLabel loggininas =new JLabel("Loggin in as");
        loggininas.setFont(new Font("Tahoma", Font.BOLD, 17));
       loggininas.setBounds(300,260 ,200 ,50 );
        image1.add(loggininas);
        
         logginin = new Choice();
        logginin.add("Admin");
        logginin.add("Customer");
        logginin.setBounds(500,270,150,30);
        image1.add(logginin);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i2=i1.getImage().getScaledInstance(16, 16,Image.SCALE_DEFAULT);
        
         login = new JButton("Login", new ImageIcon(i2));
        login.setBounds(500,400,150,30);
        login.addActionListener(this);
        image1.add(login);
                
        ImageIcon i3=new ImageIcon(ClassLoader.getSystemResource("icon/cancel.jpg"));
        Image i4=i3.getImage().getScaledInstance(16, 16,Image.SCALE_DEFAULT);
      
       
        
         cancel = new JButton("Cancel",new ImageIcon(i4));
        cancel.setBounds(300,400,150,30);
        cancel.addActionListener(this);
        image1.add(cancel);
                
        ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
        Image i6=i5.getImage().getScaledInstance(16, 16,Image.SCALE_DEFAULT);
        
         signup = new JButton("signup",new ImageIcon(i6));
        signup .setBounds(400,450,150,30);
        signup.addActionListener(this);
        image1.add(signup );
        

        
        setSize(740,600);
        setLocation(400,100);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            String susername=username.getText();
            String spassword =password.getText();
            String user = logginin.getSelectedItem();
            
            try{
                Conn c =new Conn();
                String query ="select * from login where username = '"+susername+"' and password = '"+spassword+"'and user ='"+user+"'";// table value extraction
                
                ResultSet rs = c.s.executeQuery(query);
                
                if(rs.next()){
                    String meter = rs.getString("meter_no");
                  setVisible(false);
                  new Project(user,meter);
                }else {
                    JOptionPane.showMessageDialog(null,"Invalid login");
                    username.setText(" ");
                    password.setText(" ");
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource() == cancel){
            setVisible(false);
        }else if(ae.getSource()==signup){
            setVisible(false);
            
            new Signup();
            
        }
        
    }
    
    public static void main(String[] args){
        new Login();
    }
    
}
