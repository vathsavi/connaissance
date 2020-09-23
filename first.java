package connaisance;

import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
//import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.HashMap;
import java.awt.Font;
public class first implements ActionListener
{
    JFrame f,f3;
    JButton loginb,register,forgotpass;
    JLabel usrnamelbl,passwordlbl;
    JTextField usrnametf;
    JPasswordField passwordtf;
    JCheckBox showpasscb,showpasscbr;
    char passwordChar;
    ImageIcon visibleicon,invisibleicon ;
    JLabel imgLabel2;

    JFrame f2;
    JButton createb,cancelb;
    JLabel namelbl,rollnolbl,batchlbl,genderlbl,phonenolbl,emailidlbl,passlbl,branchlbl,doblbl;
    JTextField nametf,rollnotf,batchtf,phonenotf,emailidtf,dobtf;
    JComboBox branchtf;
    JPasswordField passtf;
    JRadioButton malejrb,femalejrb,otherjrb;
    ButtonGroup g1;
    HashMap<String, String> map ;
    JLabel invalidtext;
    
    void login()
    {
        f= new JFrame("Login");
        loginb= new JButton("login");
        JPanel p =new JPanel(); 
        p.setLayout(null);
        loginb.addActionListener(this);

        invalidtext = new JLabel("invalid username or password");
        
//,new ImageIcon("invalid.png")
        map = new HashMap<>();
        map.put("vathsavi17560@mechyd.ac.in","vathsavi123"); 

        //to get size of the screen

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        f.setSize(xSize,ySize);

        // invisible icon for viewing password

        ImageIcon visibleicontemp = new ImageIcon("invisble.png"); // load the image to a imageIcon
        Image image3 = visibleicontemp.getImage();
        Image newimg3=image3.getScaledInstance(20,20, java.awt.Image.SCALE_SMOOTH);
        visibleicon = new ImageIcon(newimg3);

        // visible icon for viewing password

        ImageIcon visibleicontemp2 = new ImageIcon("visble.png"); // load the image to a imageIcon
        Image image4 = visibleicontemp2.getImage();
        Image newimg4=image4.getScaledInstance(20,20, java.awt.Image.SCALE_SMOOTH);
        invisibleicon = new ImageIcon(newimg4);
        showpasscb = new JCheckBox(visibleicon);
        //showpasscb.setIcon(visibleicon);
        showpasscb.addActionListener(this);

       // logo photo

        ImageIcon imageIcon = new ImageIcon("logo.jpg"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        JLabel imgLabel = new JLabel(new ImageIcon(newimg));
       // JLabel imgLabel = new JLabel(new ImageIcon("logo.jpg"));

        imgLabel.setBounds(250,70,500,500);
        
        f.add(imgLabel);
             
              
        ImageIcon imageIcon2 = new ImageIcon("bgimg.png"); // load the image to a imageIcon
        Image image2 = imageIcon2.getImage(); // transform it 
        Image newimg2 = image2.getScaledInstance(xSize, ySize,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
         
        imgLabel2 = new JLabel(new ImageIcon(newimg2));
        //ds;
        
        f.add(imgLabel2);
       imgLabel2.setBounds(0, 0, xSize, ySize);

        usrnamelbl = new JLabel("Username");
        passwordlbl = new JLabel("Password");
        forgotpass = new JButton("Forgot password?");
        forgotpass.setBorderPainted(false);
        forgotpass.setOpaque(false);
        forgotpass.setContentAreaFilled(false);
        forgotpass.addActionListener(this);
        register = new JButton("Register");
        register.setBorderPainted(false);
        register.setOpaque(false);
        register.setContentAreaFilled(false);
        


        usrnametf = new JTextField();
        passwordtf = new JPasswordField();
        passwordChar = passwordtf.getEchoChar();

        register.addActionListener(this);
        

         // create a seperator 
         //JSeparator s = new JSeparator(); 
          
         // set layout as vertical 
         //s.setOrientation(SwingConstants.VERTICAL); 


        usrnamelbl.setBounds(850, 220, 200, 25);
        passwordlbl.setBounds(850, 270, 200, 25);
        usrnametf.setBounds(950, 220, 175, 25);
        passwordtf.setBounds(950, 270, 150, 25);
        forgotpass.setBounds(830, 370, 200, 25);
        register.setBounds(1000, 370, 100, 25);

        usrnamelbl.setForeground(Color.white);
        passwordlbl.setForeground(Color.white);
        forgotpass.setForeground(Color.white);
        register.setForeground(Color.white);
        invalidtext.setForeground(Color.red);


        passwordtf.setBorder(null);
        usrnametf.setBorder(null);

        invalidtext.setBounds(850,300,150,25);

        loginb.setBounds(900, 320, 100, 25);

        showpasscb.setBounds(1100, 270, 25,25);

        

        p.setPreferredSize(new Dimension(400, 400));
        p.setBackground(Color.red);
        Border border = BorderFactory.createLineBorder(Color.blue, 10);
        border.isBorderOpaque();
        p.setBorder(border);
        

        //adding all items

       // p.add(s);
        imgLabel2.add(showpasscb);
        imgLabel2.add(loginb);
        imgLabel2.add(usrnamelbl);
        imgLabel2.add(passwordlbl);
        imgLabel2.add(usrnametf);
        imgLabel2.add(passwordtf);
        imgLabel2.add(forgotpass);
        imgLabel2.add(register);
        //f.add(p);
        //f.add(p);


        //f.add(p);

        // setting the size of the frame to be full screen
       
        
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    void register()
    {
       // map = new HashMap<>(); 
        f2=new JFrame("Register");
        f2.setLayout(null);

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        f2.setSize(xSize,ySize);

        createb = new JButton("Create Account");

        namelbl = new JLabel("Name");
        rollnolbl = new JLabel("Roll No.");
        genderlbl = new JLabel("Gender");
        batchlbl = new JLabel("Batch");
        branchlbl = new JLabel("Branch");
        phonenolbl = new JLabel("Phone Number");
        emailidlbl = new JLabel("College Email");
        passlbl=new JLabel("Email Password");

        nametf = new JTextField();
        rollnotf = new JTextField();
        batchtf = new JTextField();

        String[] comboval = {"CSE","MECH","EEE","CE"};
        branchtf = new JComboBox(comboval);
        phonenotf = new JTextField();
        emailidtf = new JTextField();
        passtf = new JPasswordField();

        malejrb = new JRadioButton("Male");
        femalejrb = new JRadioButton("Female");
        otherjrb = new JRadioButton("Other");

        cancelb= new JButton("Cancel");

        malejrb.setBorderPainted(false);
        malejrb.setOpaque(false);
        malejrb.setContentAreaFilled(false);
        malejrb.setForeground(Color.white);
        femalejrb.setBorderPainted(false);
        femalejrb.setOpaque(false);
        femalejrb.setContentAreaFilled(false);
        femalejrb.setForeground(Color.white);
        otherjrb.setBorderPainted(false);
        otherjrb.setOpaque(false);
        otherjrb.setContentAreaFilled(false);
        otherjrb.setForeground(Color.white);
        
        g1 = new ButtonGroup();
        

        //image section
        ImageIcon imageIcon = new ImageIcon("logo2.jpg"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(250, 130,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        JLabel imgLabel = new JLabel(new ImageIcon(newimg));
        imgLabel.setBounds(200,50,250,130);

        ImageIcon imageIcon2 = new ImageIcon("bgimg.png"); // load the image to a imageIcon
        Image image2 = imageIcon2.getImage(); // transform it 
        Image newimg2 = image2.getScaledInstance(xSize, ySize,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
         
        JLabel imgLabel2 = new JLabel(new ImageIcon(newimg2));
        imgLabel2.setBounds(0, 0, xSize, ySize);
        
        f2.add(imgLabel2);
        imgLabel2.add(imgLabel);




        //label section
        namelbl.setBounds(200, 200, 200, 25);
        rollnolbl.setBounds(200, 250, 200, 25);
        genderlbl.setBounds(200, 300, 200, 25);
        batchlbl.setBounds(200, 350, 200, 25);
        branchlbl.setBounds(200, 400, 200, 25);
        phonenolbl.setBounds(200, 450, 200, 25);
        emailidlbl.setBounds(200, 500, 200, 25);
        passlbl.setBounds(200,550,200,25);

        namelbl.setForeground(Color.white);
        rollnolbl.setForeground(Color.white);
        genderlbl.setForeground(Color.white);
        batchlbl.setForeground(Color.white);
        branchlbl.setForeground(Color.white);
        phonenolbl.setForeground(Color.white);
        emailidlbl.setForeground(Color.white);
        passlbl.setForeground(Color.white);   


      
        //text feild section
        nametf.setBounds(300, 200, 150, 25);
        rollnotf.setBounds(300, 250, 150, 25);
        malejrb.setBounds(300, 300, 60, 25);
        femalejrb.setBounds(360, 300, 70, 25);
        otherjrb.setBounds(430, 300, 65, 25);
        batchtf.setBounds(300, 350, 150, 25);
        branchtf.setBounds(300, 400, 150, 25);
        phonenotf.setBounds(300, 450, 150, 25);
        emailidtf.setBounds(300, 500, 150, 25);
        passtf.setBounds(300, 550, 125, 25);
        showpasscbr = new JCheckBox(visibleicon);
        showpasscbr.setBounds(425,550,25,25);
        showpasscbr.addActionListener(this);

        passtf.setBorder(null);


        createb.setBounds(190, 600, 130, 25);
        cancelb.setBounds(330, 600, 100, 25);

        createb.addActionListener(this);
        cancelb.addActionListener(this);


        malejrb.addActionListener(this);
        femalejrb.addActionListener(this);
        otherjrb.addActionListener(this);



        imgLabel2.add(namelbl);
        imgLabel2.add(rollnolbl);
        imgLabel2.add(genderlbl);
        imgLabel2.add(branchlbl);
        imgLabel2.add(batchlbl);
        imgLabel2.add(emailidlbl);
        imgLabel2.add(phonenolbl);
        imgLabel2.add(passlbl);

        imgLabel2.add(createb);

        imgLabel2.add(nametf);
        imgLabel2.add(rollnotf);
        imgLabel2.add(branchtf);
        g1.add(malejrb);
        g1.add(femalejrb);
        g1.add(otherjrb);
        //f.add(g1);
        imgLabel2.add(malejrb);
        imgLabel2.add(femalejrb);
        imgLabel2.add(otherjrb);
        imgLabel2.add(batchtf);
        imgLabel2.add(emailidtf);
        imgLabel2.add(phonenotf);
        imgLabel2.add(passtf);
        imgLabel2.add(showpasscbr);
        imgLabel2.add(cancelb);

        

        //f2.setVisible(false);
        
        f2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

     


    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==showpasscb)
        {
            if(showpasscb.isSelected())
            {
                passwordtf.setEchoChar((char)0);
                showpasscb.setIcon(invisibleicon);              
            }
            else
            {
                passwordtf.setEchoChar(passwordChar);
                showpasscb.setIcon(visibleicon);
            }
        }
        if(e.getSource()==showpasscbr)
        {
            if(showpasscbr.isSelected())
            {
                passtf.setEchoChar((char)0);
                showpasscbr.setIcon(invisibleicon);              
            }
            else
            {
                passtf.setEchoChar(passwordChar);
                showpasscbr.setIcon(visibleicon);
            }
        }
        if(e.getSource()==forgotpass)
        {
            new Fpwd();
            //f.setVisible(false);
        }
        if(e.getSource()==register)
        {
            f2.setVisible(true);
            f.setVisible(false);
        }
        if(e.getSource()==createb)
        {
            if(nametf.getText().length()==0||rollnotf.getText().length()==0|phonenotf.getText().length()==0||emailidtf.getText().length()==0||batchtf.getText().length()==0)
            {                
                JOptionPane.showMessageDialog(f2, "incomplete information");
            }
            else if(!emailidtf.getText().contains("@mechyd.ac.in"))
        {
            JOptionPane.showMessageDialog(f, "invalid email-id");

        }
            else      
            {
                if(map.containsKey(emailidtf.getText()))
                {
                    JOptionPane.showMessageDialog(f2, "account exists");
                }
                else
                {
                    map.put(emailidtf.getText(),new String(passtf.getPassword()));
                    //imgLabel2.remove(invalidtext);
                    usrnametf.setText("");
                    passwordtf.setText("");

                    f2.setVisible(false);
                    f.setVisible(true);
                    
                }
                
            }
        }
        if(e.getSource()==cancelb)
        {
            usrnametf.setText("");
            passwordtf.setText("");

            f2.setVisible(false);
            f.setVisible(true);
        }
        if(e.getSource()==loginb)
        {
            if(map.containsKey(usrnametf.getText()))
            {
                if(map.get(usrnametf.getText()).equals(new String(passwordtf.getPassword())))
                {
                    f.setVisible(false);
                    new home();
                }       
            }
            else
            {
                   // imgLabel2.add(invalidtext); 
                   
                   JOptionPane.showMessageDialog(f, "invalid username or password");               
                   usrnametf.setText("");
                   passwordtf.setText("");
             }
        }
    }
   
    public static void main(String args[])
    {
        first obj = new first();
        obj.login();
        obj.register();
        
    }
}

