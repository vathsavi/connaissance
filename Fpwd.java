package connaisance;

import javax.swing.*;
import javax.swing.border.Border;

//import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Fpwd extends JFrame implements ActionListener

{
    JTextField temail,rno;
    JLabel imgLabel2;
    JFrame f;
    JLabel pwd,enter;
    JButton submit;

    public static void main(String ...a)
    {
        Fpwd f1=new Fpwd();
        /*f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f1.setVisible(true); */
    }

    public void actionPerformed(ActionEvent e)
    {
        if(temail.getText().length()==0||rno.getText().length()==0)
        {

            JOptionPane.showMessageDialog(f, "incomplete information");
        }
        else if(!temail.getText().contains("@mechyd.ac.in"))
        {
            JOptionPane.showMessageDialog(f, "invalid email-id");

        }
        else
        {
            JOptionPane.showMessageDialog(f,"a mail is sent to the mentioned email address and concerned admin");
            f.setVisible(false);
        }
    }

    Fpwd()
    {
        pwd();
    }

    public void pwd()
    {
        f=new JFrame();
        f.setTitle("Forgot password"); 
        f.setSize(500,250);
        f.setLayout(null);
        ImageIcon imageIcon2 = new ImageIcon("clogo.png"); // load the image to a imageIcon
        Image imagel = imageIcon2.getImage(); // transform it 
        Image newimgl = imagel.getScaledInstance(300, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
         
        imgLabel2 = new JLabel(new ImageIcon(newimgl));
        imgLabel2.setBounds(150, 20, 200, 150);

        temail=new JTextField();
        temail.setBounds(250, 100, 100, 35);
        rno=new JTextField();
        rno.setBounds(250, 50, 100, 35);

        pwd=new JLabel("enter your email address");
        pwd.setBounds(100,90,200,50);
        pwd.setForeground(Color.black);
        enter=new JLabel("enter your rollno.");
        enter.setBounds(100,50,200,50);
        enter.setForeground(Color.black);


        submit=new JButton("SUBMIT");
        submit.setBounds(170,150,100,35);
        submit.addActionListener(this);

        //f.add(imgLabel2);
        f.add(temail);
        f.add(rno);
        f.add(enter);
        f.add(pwd);
        f.add(submit);
        f.setVisible(true);
       // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setBackground(Color.blue);
    }
}