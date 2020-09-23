package connaisance;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.sun.glass.events.MouseEvent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Profpage extends JFrame implements ActionListener
{

    public static void main(String[] args) 
    {
    Profpage p=new Profpage();
    //p.setVisible(true);
    //p.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
 
    


    JFrame f1;
    JPanel left,leftcen,leftn,leftwes,right,center,centern;
    JLabel ppic,name;
    JButton  va1,va2,va3,va4,va5,va6,va7,home,profile,signout;
    JButton  vaa1,vaa2,vaa3,vaa4,vaa5,vaa6,vaa7;
    JButton scrollb,zoomb;
    JButton searchicon;
    JTextField searchbar;

    Profpage()
    {
        page();
    }

    public void page()
    {
        f1= new JFrame();
        f1.setLayout(new BorderLayout());
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight()); 
        f1.setSize(xSize,ySize);
        f1.setTitle("Profile");

            
        home = new labelbutton("HOME",new ImageIcon("homeicon.png"));
        profile = new labelbutton("PROFILE",new ImageIcon("prfileicon.png"));
        signout = new labelbutton("SIGNOUT",new ImageIcon("signouticon.png"));
       
        JPanel searchpanel = new JPanel();
        searchpanel.setPreferredSize(new Dimension(100,20));
        JMenuBar menuBar_1 = new JMenuBar();//Imagemenu(i.getImage().getScaledInstance(xSize, ySize,  java.awt.Image.SCALE_SMOOTH));
       // menuBar_1.setBounds(0, 0,xSize, 100);
        ImageIcon imageIcon = new ImageIcon("logo2.jpg"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(70, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        JLabel imgLabel = new JLabel(new ImageIcon(newimg));
        JLabel space = new JLabel("                                                                                   ");
        JLabel l1=new JLabel("MEC");
        searchbar = new JTextField(20);
        searchicon = new labelbutton(new ImageIcon("searchicon.png"));

        menuBar_1.add(imgLabel);
    //    / menuBar_1.add(l1);
        menuBar_1.add(space);
        menuBar_1.add(Box.createHorizontalGlue());
        //jb.setBounds(0,800,200,50);
       
        menuBar_1.add(searchbar);
        menuBar_1.add(searchicon);

        menuBar_1.add(home);
        menuBar_1.add(profile);
      //  menuBar_1.add(settings);
        menuBar_1.add(signout);
        //menuBar_1.setBackground(new Color(110, 178, 193));

        signout.addActionListener(this);
        home.addActionListener(this);

      
  

        left = new JPanel();
        //left.setLayout(null);
        //left.setVisible(true);
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
        left.setPreferredSize(new Dimension(250,ySize));
        JLabel fff=new JLabel("     FRIENDS");
        fff.setFont(new Font("Serif",Font.BOLD,30));        
        JLabel fr1=new JLabel("     Ananya");
        fr1.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel fr2=new JLabel("     Sai Sree");
        fr2.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel fr3=new JLabel("     Saudamini");
        fr3.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel fr4=new JLabel("     Rohan");
        fr4.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel fr5=new JLabel("     Qurram");
        fr5.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel fr6=new JLabel("     MAK");
        fr6.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel fr7=new JLabel("     Koushik");
        fr7.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel fr8=new JLabel("     Raghava");
        fr8.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel fr9=new JLabel("     Rochan");
        fr9.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel fr10=new JLabel("    Prakruthi");
        fr10.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel fr11=new JLabel("    Koushik");
        fr11.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel fr12=new JLabel("    Koushik");
        fr12.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel fr13=new JLabel("    Koushik");
        fr13.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel fr14=new JLabel("    Koushik");
        fr14.setFont(new Font("Serif",Font.PLAIN,15));
        left.add(Box.createRigidArea(new Dimension(0, 70)));
        left.add(fff);
        left.add(Box.createRigidArea(new Dimension(0, 50)));        
        left.add(fr1);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        left.add(fr2);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        left.add(fr3);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        left.add(fr4);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        left.add(fr5);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        left.add(fr6);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        left.add(fr7);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        left.add(fr8);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        left.add(fr9);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        left.add(fr10);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        left.add(fr11);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        left.add(fr12);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        left.add(fr13);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        left.add(fr14);
        left.add(Box.createRigidArea(new Dimension(0, 10)));        
        //left.add(fr7);










        JPanel up = new JPanel();
        name=new JLabel("    VATHSAVI BOGGARAPU");
        name.setFont(new Font("Serif",Font.BOLD,20));
        ImageIcon imageIcon1 = new ImageIcon("vathsavi.jpg"); // load the image to a imageIcon
        Image image1 = imageIcon1.getImage(); // transform it 
        Image newimg1 = image1.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        ppic = new JLabel(new ImageIcon(newimg1));
        right =new JPanel();
        right.setLayout(new BorderLayout());

        right.setPreferredSize(new Dimension(300,ySize));

        up.setLayout(new BorderLayout());
        up.add(Box.createRigidArea(new Dimension(0, 30)),BorderLayout.NORTH);
        up.add(name,BorderLayout.CENTER);
        up.add(ppic,BorderLayout.SOUTH);
        right.add(up,BorderLayout.NORTH);

        //ppic.setBounds(20,50,400,400);
        //name=new JLabel("Vathsavi Boggarapu");
        //name.setBounds(350,200,50,100);
        //left.add(ppic,BorderLayout.NORTH);
        
        //left.setPreferredSize(new Dimension(200, 500));
        //leftwes=new JPanel();
        //left.add(leftwes,BorderLayout.WEST);


        leftcen = new JPanel();
        JScrollPane lefts = new JScrollPane(left);    
        lefts.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
        //leftcen.setPreferredSize(new Dimension(200, 500));
        leftcen.setLayout(new BoxLayout(leftcen, BoxLayout.Y_AXIS));
        JLabel ab = new JLabel("            ABOUT");
        ab.setFont(new Font("Serif",Font.BOLD,20));
        JLabel v1= new JLabel(" AUGUST 9");
        v1.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel v2 = new JLabel("MAHINDRA ECOLE CENTRALE");
        v2.setFont(new Font("Serif",Font.PLAIN,15));
        JLabel v3= new JLabel(" ");
        JLabel v4= new JLabel("EVENTS");
        JLabel v5= new JLabel("WORKSHOPS");

        leftcen.add(ab);
        leftcen.add(Box.createRigidArea(new Dimension(0, 20)));
        leftcen.add(v1);
        leftcen.add(Box.createRigidArea(new Dimension(0, 20)));
        leftcen.add(v2);
        leftcen.add(Box.createRigidArea(new Dimension(0, 20)));
        right.add(leftcen,BorderLayout.CENTER);
        
        
        
        //left.add(leftn,BorderLayout.NORTH);
        //left.add(leftcen,BorderLayout.CENTER);
       /* ImageIcon imageIcon2 = new ImageIcon("bg1.png"); // load the image to a imageIcon
        Image image2 = imageIcon2.getImage(); // transform it 
        Image newimg2 = image2.getScaledInstance(xSize/4, ySize,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        JLabel bg = new JLabel(new ImageIcon(newimg2));
        left.add(bg,BorderLayout.CENTER);*/


        
        
  

        JPanel sp=new JPanel();
        //sp.setLayout (new GridLayout(3,1));  
        //sp.setSize(500, 500); 
        sp.setPreferredSize(new Dimension(5,200));
        sp.setLayout(new GridLayout(3,3,1,1));
        GridBagConstraints c1=new GridBagConstraints();
        c1.insets = new Insets(1, 1, 1, 1);     

        ImageIcon ii1 = new ImageIcon("v1.jpg"); // load the image to a imageIcon
        Image i1 = ii1.getImage(); // transform it 
        Image ni1 = i1.getScaledInstance(95, 95,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        va1 = new JButton(new ImageIcon(ni1)); 
        va1.setOpaque(false);
        va1.setBorderPainted(false);
        va1.setContentAreaFilled(false);  
        sp.add(va1,c1);
        ImageIcon ii2 = new ImageIcon("v2.jpg"); // load the image to a imageIcon
        Image i2 = ii2.getImage(); // transform it 
        Image ni2 = i2.getScaledInstance(95, 95,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        va2 = new JButton(new ImageIcon(ni2)); 
        va2.setOpaque(false);
        va2.setBorderPainted(false);
        va2.setContentAreaFilled(false);   
        sp.add(va2,c1);
        ImageIcon ii3 = new ImageIcon("v3.jpg"); // load the image to a imageIcon
        Image i3 = ii3.getImage(); // transform it 
        Image ni3 = i3.getScaledInstance(95, 95,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        va3 = new JButton(new ImageIcon(ni3));    
        va3.setOpaque(false);
        va3.setBorderPainted(false);
        va3.setContentAreaFilled(false);
        sp.add(va3,c1);
        ImageIcon ii4 = new ImageIcon("v4.jpg"); // load the image to a imageIcon
        Image i4 = ii4.getImage(); // transform it 
        Image ni4 = i4.getScaledInstance(95, 95,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        va4 = new JButton(new ImageIcon(ni4)); 
        va4.setOpaque(false);
        va4.setBorderPainted(false);
        va4.setContentAreaFilled(false);   
        sp.add(va4,c1);
        ImageIcon ii5 = new ImageIcon("v5.jpeg"); // load the image to a imageIcon
        Image i5 = ii5.getImage(); // transform it 
        Image ni5 = i5.getScaledInstance(95, 95,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        va5 = new JButton(new ImageIcon(ni5)); 
        va5.setOpaque(false);
        va5.setBorderPainted(false);
        va5.setContentAreaFilled(false);   
        sp.add(va5,c1);
        ImageIcon ii6 = new ImageIcon("v6.jpg"); // load the image to a imageIcon
        Image i6 = ii6.getImage(); // transform it 
        Image ni6 = i6.getScaledInstance(95, 95,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        va6 = new JButton(new ImageIcon(ni6));    
        va6.setOpaque(false);
        va6.setBorderPainted(false);
        va6.setContentAreaFilled(false);
        sp.add(va6,c1);
        ImageIcon ii7 = new ImageIcon("v8.jpg"); // load the image to a imageIcon
        Image i7 = ii7.getImage(); // transform it 
        Image ni7 = i7.getScaledInstance(95, 95,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        va7 = new JButton(new ImageIcon(ni7));    
        va7.setOpaque(false);
        va7.setBorderPainted(false);
        va7.setContentAreaFilled(false);
        sp.add(va7,c1);

        JScrollPane scroll = new JScrollPane(sp);    
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
        right.add(scroll,BorderLayout.SOUTH);

        ImageIcon iii1 = new ImageIcon("v1.jpg"); // load the image to a imageIcon
        Image im1 = iii1.getImage(); // transform it 
        Image nii1 = im1.getScaledInstance(600, 600,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        vaa1 = new JButton(new ImageIcon(nii1)); 
        vaa1.setOpaque(false);
        vaa1.setBorderPainted(false);
        vaa1.setContentAreaFilled(false); 
        ImageIcon iii2 = new ImageIcon("v2.jpg"); // load the image to a imageIcon
        Image im2 = iii2.getImage(); // transform it 
        Image nii2 = im2.getScaledInstance(600, 600,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        vaa2 = new JButton(new ImageIcon(nii2)); 
        vaa2.setOpaque(false);
        vaa2.setBorderPainted(false);
        vaa2.setContentAreaFilled(false);
        ImageIcon iii3 = new ImageIcon("v3.jpg"); // load the image to a imageIcon
        Image im3 = iii3.getImage(); // transform it 
        Image nii3 = im3.getScaledInstance(600, 600,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        vaa3 = new JButton(new ImageIcon(nii3));    
        vaa3.setOpaque(false);
        vaa3.setBorderPainted(false);
        vaa3.setContentAreaFilled(false);
        ImageIcon iii4 = new ImageIcon("v4.jpg"); // load the image to a imageIcon
        Image im4 = iii4.getImage(); // transform it 
        Image nii4 = im4.getScaledInstance(600, 600,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        vaa4 = new JButton(new ImageIcon(nii4)); 
        vaa4.setOpaque(false);
        vaa4.setBorderPainted(false);
        vaa4.setContentAreaFilled(false);
        ImageIcon iii5 = new ImageIcon("v5.jpeg"); // load the image to a imageIcon
        Image im5 = iii5.getImage(); // transform it 
        Image nii5 = im5.getScaledInstance(600, 600,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        vaa5 = new JButton(new ImageIcon(nii5)); 
        vaa5.setOpaque(false);
        vaa5.setBorderPainted(false);
        vaa5.setContentAreaFilled(false);
        ImageIcon iii6 = new ImageIcon("v6.jpg"); // load the image to a imageIcon
        Image im6 = iii6.getImage(); // transform it 
        Image nii6 = im6.getScaledInstance(600, 600,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        vaa6 = new JButton(new ImageIcon(nii6));    
        vaa6.setOpaque(false);
        vaa6.setBorderPainted(false);
        vaa6.setContentAreaFilled(false);
        ImageIcon iii7 = new ImageIcon("v8.jpg"); // load the image to a imageIcon
        Image im7 = iii7.getImage(); // transform it 
        Image nii7 = im7.getScaledInstance(600, 600,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        vaa7 = new JButton(new ImageIcon(nii7));    
        vaa7.setOpaque(false);
        vaa7.setBorderPainted(false);
        vaa7.setContentAreaFilled(false);

        center=new JPanel();
        center.setLayout(new BorderLayout());
        centern=new JPanel();
        centern.setLayout(new FlowLayout());
        /*scrollb=new JButton("SCROLL");
        scrollb.setPreferredSize(new Dimension(150,25));
        zoomb=new JButton("ZOOM");
        zoomb.setPreferredSize(new Dimension(150,25));

        centern.add(scrollb);
        centern.add(zoomb);
        center.add(centern,BorderLayout.NORTH);*/

        JButton ep = new JButton("EDIT PROFILE");
        JButton fr = new JButton("FRIENDS");
        fr.setOpaque(false);
        fr.setBorderPainted(false);
        fr.setContentAreaFilled(false);
        fr.setFont(new Font("Algerian",Font.PLAIN,20));
        ep.setOpaque(false);
        ep.setBorderPainted(false);
        ep.setContentAreaFilled(false);
        ep.setFont(new Font("Algerian",Font.PLAIN,20));
        //JMenu profile = new JMenu("PROFILE");
        //JMenu signout = new JMenu("SIGNOUT");
        JMenuBar mb1 = new JMenuBar();
        menuBar_1.setBounds(0, 0,center.getWidth(), 200);
        mb1.add(ep);
        //mb1.add(fr);
        //mb1.setRigidArea(new Dimension(200,0));
        center.add(mb1,BorderLayout.NORTH);


        JPanel sp1=new JPanel();
        BoxLayout boxl = new BoxLayout(sp1, BoxLayout.Y_AXIS); 
        sp1.setBorder(new EmptyBorder(new Insets(10, 60, 10, 10)));
        sp1.setLayout(boxl);
        sp1.add(vaa1);
        sp1.add(Box.createRigidArea(new Dimension(0, 50)));
        sp1.add(vaa2);
        sp1.add(Box.createRigidArea(new Dimension(0, 50)));        
        sp1.add(vaa3);
        sp1.add(Box.createRigidArea(new Dimension(0, 50)));
        sp1.add(vaa4);
        sp1.add(Box.createRigidArea(new Dimension(0, 50)));
        sp1.add(vaa5);
        sp1.add(Box.createRigidArea(new Dimension(0, 50)));
        sp1.add(vaa6);
        sp1.add(Box.createRigidArea(new Dimension(0, 50)));
        sp1.add(vaa7);
        sp1.add(Box.createRigidArea(new Dimension(0, 50)));
        
        JScrollPane scroll1 = new JScrollPane(sp1);    
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //scroll1.setStyle("-fx-background-color:transparent;");
        scroll1.setBorder(null);
        scroll1.getInsets().set(0, 0, 0, 0);
        scroll1.setViewportBorder(null);
        scroll1.getViewport().setBorder(null);
        scroll1.getViewport().getInsets().set(0, 0, 0, 0);
        scroll1.getViewport().setOpaque(true);
        center.add(scroll1,BorderLayout.CENTER);





        //right.add(leftn,BorderLayout.NORTH);

        f1.add(center,BorderLayout.CENTER);
        f1.add(menuBar_1,BorderLayout.NORTH);
        f1.add(lefts,BorderLayout.WEST);
        //f1.add(vaa1,BorderLayout.CENTER);
        f1.add(right,BorderLayout.EAST); 
        f1.setVisible(true);
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    /*public void mouseExited(MouseEvent e) {f1.add(va1,BorderLayout.CENTER);} 
    public void mouseEntered(MouseEvent e) {f1.add(va1,BorderLayout.CENTER);}  
     
    public void mousePressed(MouseEvent e) {}  
    public void mouseReleased(MouseEvent e) {} 
    public void mouseClicked(MouseEvent e) {} */

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==signout)
        {
            f1.setVisible(false);
            first f = new first();
            f.register();
            f.login();
        }
        if(e.getSource()==home)
        {
            f1.setVisible(false);
            new home();
        }


    }
}


class labelbutton extends JButton
{
    labelbutton(String name , ImageIcon i)
    {
        super(name, i);
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    
    }
    labelbutton(String name )
    {
        super(name);
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    
    }
    labelbutton( ImageIcon i)
    {
        super( i);
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    
    }
    
}