package Electricity.billing.newpackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
    String atype,meter;
    Project(String atype,String meter){
        this.atype = atype;
        this.meter = meter;
        setExtendedState(JFrame.MAXIMIZED_BOTH); //full screen
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/backgroung2.png"));
        Image i2=i1.getImage().getScaledInstance(1550, 850,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        
        JMenu master = new JMenu("Master");
        master.setForeground(Color.BLUE);
        //mb.add(master);

        
        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospaced",Font.PLAIN,12));
        newcustomer.setBackground(Color.white);
        ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image1=icon1.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(image1));
        newcustomer.setMnemonic('D');
        newcustomer.addActionListener(this);
        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        master.add(newcustomer);
        add(image);
        
        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced",Font.PLAIN,12));
        newcustomer.setBackground(Color.white);
        ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image image2=icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(image2));
        customerdetails.setMnemonic('M');
        customerdetails.addActionListener(this);
        customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        master.add(customerdetails);
        add(image);
        
        JMenuItem depositedetails = new JMenuItem("Deposite details");
        depositedetails.setFont(new Font("monospaced",Font.PLAIN,12));
        depositedetails.setBackground(Color.white);
        ImageIcon icon3=new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image image3=icon3.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        depositedetails.setIcon(new ImageIcon(image3));
        depositedetails.setMnemonic('N');
        depositedetails.addActionListener(this);
        depositedetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        master.add(depositedetails);
        add(image);
        
         JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospaced",Font.PLAIN,12));
        calculatebill.setBackground(Color.white);
        ImageIcon icon4=new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
        Image image4=icon4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(image3));
        calculatebill.setMnemonic('B');
        calculatebill.addActionListener(this);
        calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        master.add(calculatebill);
        add(image);
        
        
        JMenu info = new JMenu("Information");
        info.setForeground(Color.red);
       
        
        JMenuItem updateinfo = new JMenuItem("Update Information");
        updateinfo.setFont(new Font("monospaced",Font.PLAIN,12));
        updateinfo.setBackground(Color.white);
        ImageIcon icon5=new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image5=icon5.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        updateinfo.setIcon(new ImageIcon(image3));
        updateinfo.setMnemonic('O');
        updateinfo.addActionListener(this);
        updateinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
        info.add(updateinfo);
        add(image);
        
         JMenuItem viewinfo = new JMenuItem("View Information");
         viewinfo.setFont(new Font("monospaced",Font.PLAIN,12));
         viewinfo.setBackground(Color.white);
        ImageIcon icon6=new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6=icon6.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         viewinfo.setIcon(new ImageIcon(image3));
         viewinfo.setMnemonic('P');
         viewinfo.addActionListener(this);
         viewinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        info.add( viewinfo);
        add(image);
        
        JMenu user = new JMenu("User");
       user.setForeground(Color.blue);
        
        
        JMenuItem paybill = new JMenuItem("Pay Bill");
         paybill.setFont(new Font("monospaced",Font.PLAIN,12));
         paybill.setBackground(Color.white);
        ImageIcon icon7=new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image7=icon7.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         paybill.setIcon(new ImageIcon(image3));
         paybill.setMnemonic('R');
         paybill.addActionListener(this);
         paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
        user.add( paybill);
        add(image);
        
         JMenuItem billdomain = new JMenuItem("Bill Details");
         billdomain.setFont(new Font("monospaced",Font.PLAIN,12));
         billdomain.setBackground(Color.white);
        ImageIcon icon8=new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image8=icon8.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         billdomain.setIcon(new ImageIcon(image3));
         billdomain.setMnemonic('L');
         billdomain.addActionListener(this);
         billdomain.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        user.add( billdomain);
        add(image);
        
        JMenu report = new JMenu("Report");
       report.setForeground(Color.red);
       
        
        JMenuItem generatebill = new JMenuItem("Generate Bill");
         generatebill.setFont(new Font("monospaced",Font.PLAIN,12));
         generatebill.setBackground(Color.white);
        ImageIcon icon9=new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image image9=icon9.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         generatebill.setIcon(new ImageIcon(image3));
         generatebill.setMnemonic('U');
         generatebill.addActionListener(this);
         generatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
        report.add( generatebill);
        add(image);
        
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.blue);
      
        
        JMenuItem notepad = new JMenuItem("Notepad");
         notepad.setFont(new Font("monospaced",Font.PLAIN,12));
         notepad.setBackground(Color.white);
        ImageIcon icon10=new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image10=icon10.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         notepad.setIcon(new ImageIcon(image3));
         notepad.setMnemonic('Q');
         notepad.addActionListener(this);
         notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.CTRL_MASK));
        utility.add( notepad);
        add(image);
        
         JMenuItem calculator = new JMenuItem("Calculator");
         calculator.setFont(new Font("monospaced",Font.PLAIN,12));
         calculator.setBackground(Color.white);
        ImageIcon icon11=new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image image11=icon11.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         calculator.setIcon(new ImageIcon(image3));
         calculator.setMnemonic('S');
         calculator.addActionListener(this);
         calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
        utility.add( calculator);
        add(image);
        
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.red);
        mb.add(exit);
        
        JMenuItem eexit = new JMenuItem("Exit");
         eexit.setFont(new Font("monospaced",Font.PLAIN,12));
         eexit.setBackground(Color.white);
        ImageIcon icon12=new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image image12=icon12.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         eexit.setIcon(new ImageIcon(image3)); 
         eexit.setMnemonic('V');
         eexit.addActionListener(this);
         eexit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
        exit.add( eexit);
        add(image);
        
        if(atype.equals("Admin")){
            mb.add(master);
        }else{
       
         mb.add(info);
         mb.add(user);
          mb.add(report);
        }
         mb.add(utility);
        mb.add(exit);
        
        setLayout(new FlowLayout());
        
        setVisible(true);
    }

    Project() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if (msg.equals("New Customer")){
            new NewCustomer();
        }else if(msg.equals("Customer Details")){
            new CustomerDetails();
        }else if(msg.equals("Deposite details")){
            new DepositeDetails();
        }else if(msg.equals("Calculate Bill")){
            new Calculatebill();
        }else if(msg.equals("View Information")){
            new ViewInfo(meter);
        }else if(msg.equals("Update Information")){
            new UpdateInfo(meter);
        }else if(msg.equals("Bill Details")){
            new BillDetails(meter);
        }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(msg.equals("Calculator")){
           try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(msg.equals("Exit")){
            setVisible(false);
            new Login();
        }else if(msg.equals("Pay Bill")){
            new PayBill(meter);
        }else if(msg.equals("Generate Bill")){
            new GenerateBill(meter);
        }
    }
    public static void main(String[]args){
        new Project("","");
    }
}

