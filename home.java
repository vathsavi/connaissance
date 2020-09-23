
package connaisance;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class home implements ActionListener , MouseListener
{
    JButton clubs,events,studentc,all,official,workshop;
    JPanel left,centre,right,innermenu,rightcentre,righttop,aetherimgs,rightdown,claether,centrecl,centresouth,centredown,emptyspace;
    JMenuBar insetclubs,insetevents;
    JButton baja,enigma,spicmacay,eic,sports,erudite,media;
    JButton aether,tedx,ccc,ecoletyohar,airo,prev,next;
    JFrame f3;
    JLabel aetherdp,airodp,tedxdp,ecoletyohardp,sportsdp,defaultdp,about,nextimg,aethercapown,previmg,clubsdp,workshopdp,officialdp,eventsdp,enigmadp;
     
    JLabel aethersecondfull,aetherthirdfull,aetherfourthfull,aetherfifthfull,aethersixthfull,aetherseventhfull;
    JLabel allfirstfull,allsecondfull,allthirdfull,allfourthfull,allfifthfull,allsixthfull;
    JCheckBox aether1like,aether2like,aether3like,aether4like,aether5like,aether6like;
    JScrollPane allgallery, aethergallery,airogallery,tedxgallery,sportsgallery,eicgallery,tyohargallery,cccgallery,enigmagallery,bajagallery; 
    JLabel tyoharcapown,airocapown,tedxcapown,eiccapown,sportscapown,enigmacapown,bajacapown,ccccapown;
    JLabel airofirstfull,airosecondfull,airothirdfull,airofourthfull,airofifthfull,airosixthfull,bajafirstfull,bajasecondfull,bajathirdfull,bajafourthfull,bajafifthfull,bajasixthfull,eicfirstfull,eicsecondfull,eicthirdfull,eicfourthfull,eicfifthfull,tedxfirstfull,tedxsecondfull,tedxthirdfull,tedxfourthfull,tedxfifthfull,tedxsixthfull,tyoharfirstfull,tyoharsecondfull,tyoharthirdfull,tyoharfourthfull,tyoharfifthfull,enigmafirstfull,enigmasecondfull,enigmathirdfull,enigmafourthfull,enigmafifthfull,sportsfirstfull,sportssecondfull,sportsthirdfull,cccfirstfull,cccsecondfull,cccthirdfull,cccfourthfull,cccfifthfull;
    CardLayout card;
    ImageIcon interested,uninterested;
    int aether1likecount,aether2likecount,aether3likecount,aether4likecount,aether5likecount,aether6likecount,aethercurrentcard;
    JTextArea aethercaption1,airocaption1,tedxcaption1,tyoharcaption1,sportscaption1,eiccaption1,bajacaption1,enigmacaption1,ccccaption1;


    galleryimg  aetherfirst,aethersecond,aetherthird,aetherfourth,aetherfifth,aethersixth,aetherseventh,eicfirst,eicsecond,eicthird,eicfourth,eicfifth,eicsixth,bajafirst,bajasecond,bajathird,bajafourth,bajafifth,bajasixth,tedxfirst,tedxsecond,tedxthird,tedxfourth,tedxfifth,tedxsixth,tyoharfirst,tyoharsecond,tyoharthird,tyoharfourth,tyoharfifth,tyoharsixth,enigmafirst,enigmasecond,enigmathird,enigmafourth,enigmafifth,enigmasixth,cccfirst,cccsecond,cccthird,cccfourth,cccfifth,cccsixth,airofirst,airosecond,airothird,airofourth,airofifth,airosixth,sportsfirst,sportssecond,sportsthird,sportsfourth,sportsfifth,sportssixth;

    slideshowimg aetherfirstfull;

    
    galleryimg  allfirst,allsecond,allthird,allfourth,allfifth,allsixth;
    JPanel allimgs,bajaimgs,airoimgs,enigmaimgs,cccimgs,sportsimgs,eicimgs,tedximgs,tyoharimgs;

    JLabel bajadp;

    JPanel clall,alall,clairo,clenigma,cleic,clsports,cltedx,cltyohar,clccc,clbaja;

    JCheckBox baja1like,baja2like,baja3like,baja4like,baja5like,baja6like;
    JCheckBox tedx1like,tedx2like,tedx3like,tedx4like,tedx5like,tedx6like;
    JCheckBox eic1like,eic2like,eic3like,eic4like,eic5like;
    JCheckBox airo1like,airo2like,airo3like,airo4like,airo5like;
    JCheckBox tyohar1like,tyohar2like,tyohar3like,tyohar4like,tyohar5like;
    JCheckBox enigma1like,enigma2like,enigma3like,enigma4like,enigma5like;
    JCheckBox ccc1like,ccc2like,ccc3like,ccc4like;
    JCheckBox sports1like,sports2like,sports3like;

    int baja1likecount,baja2likecount,baja3likecount,baja4likecount,baja5likecount,baja6likecount,bajacurrentcard;
    int tedx1likecount,tedx2likecount,tedx3likecount,tedx4likecount,tedx5likecount,tedx6likecount,tedxcurrentcard;
    int eic1likecount,eic2likecount,eic3likecount,eic4likecount,eic5likecount,eiccurrentcard;
    int airo1likecount,airo2likecount,airo3likecount,airo4likecount,airo5likecount,airocurrentcard;
    int enigma1likecount,enigma2likecount,enigma3likecount,enigma4likecount,enigma5likecount,enigmacurrentcard;
    int tyohar1likecount,tyohar2likecount,tyohar3likecount,tyohar4likecount,tyohar5likecount,tyoharcurrentcard;

    int ccc1likecount,ccc2likecount,ccc3likecount,ccc4likecount,ccccurrentcard;
    int sports1likecount,sports2likecount,sports3likecount,sportscurrentcard;

    int currentbutton,allcurrentcard;
    int xSize,ySize;

    JTextField searchbar;
    JButton searchicon;
    JButton signout,profile,home;

    home()
    {
        f3 = new JFrame("MEC");
        f3.setLayout(new BorderLayout());  
        Toolkit tk = Toolkit.getDefaultToolkit();
         xSize = ((int) tk.getScreenSize().getWidth());
         ySize = ((int) tk.getScreenSize().getHeight());
        f3.setSize(xSize,ySize); 

             
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
        JLabel space = new JLabel("                                                         ");
        JLabel l1=new JLabel("MEC");
        searchbar = new JTextField(20);
        searchicon = new labelbutton(new ImageIcon("searchicon.png"));

        menuBar_1.add(imgLabel);
        menuBar_1.add(l1);
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
        profile.addActionListener(this);
  

        right = new JPanel();
       // right.setPreferredSize(new Dimension(250, 500));
        f3.add(right,BorderLayout.EAST);

        ImageIcon imageIcon2 = new ImageIcon("aether.png"); // load the image to a imageIcon
        Image image2 = imageIcon2.getImage(); // transform it 
        Image newimg2 = image2.getScaledInstance(300, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        aetherdp = new JLabel(new ImageIcon(newimg2));

        ImageIcon imageIcon3 = new ImageIcon("tedx.jpg"); // load the image to a imageIcon
        Image image3 = imageIcon3.getImage(); // transform it 
        Image newimg3 = image3.getScaledInstance(300, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        tedxdp = new JLabel(new ImageIcon(newimg3));

        ImageIcon imageIcon4= new ImageIcon("ecoletyohar.png"); // load the image to a imageIcon
        Image image4= imageIcon4.getImage(); // transform it 
        Image newimg4 = image4.getScaledInstance(300, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        ecoletyohardp = new JLabel(new ImageIcon(newimg4));

        ImageIcon imageIcon5 = new ImageIcon("airo.png"); // load the image to a imageIcon
        Image image5 = imageIcon5.getImage(); // transform it 
        Image newimg5 = image5.getScaledInstance(300, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        airodp = new JLabel(new ImageIcon(newimg5));

        ImageIcon imageIcon6 = new ImageIcon("logo2.jpg"); // load the image to a imageIcon
        Image image6 = imageIcon6.getImage(); // transform it 
        Image newimg6 = image6.getScaledInstance(300, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        defaultdp = new JLabel(new ImageIcon(newimg6));

        ImageIcon imageIcon109 = new ImageIcon("enigma.png"); // load the image to a imageIcon
        Image image109 = imageIcon109.getImage(); // transform it 
        Image newimg109 = image109.getScaledInstance(300, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        enigmadp = new JLabel(new ImageIcon(newimg109));

        ImageIcon imageIcon110 = new ImageIcon("sports.png"); // load the image to a imageIcon
        Image image110 = imageIcon110.getImage(); // transform it 
        Image newimg110 = image110.getScaledInstance(300, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        sportsdp = new JLabel(new ImageIcon(newimg110));


        
        right.setLayout(new BorderLayout());
        righttop =new JPanel();
        righttop.add(defaultdp);
        right.add(righttop,BorderLayout.NORTH);


        aetherimgs=new JPanel();
        bajaimgs=new JPanel();
        airoimgs=new JPanel();
        cccimgs=new JPanel();
        tyoharimgs=new JPanel();
        enigmaimgs=new JPanel();
        tedximgs=new JPanel();
        sportsimgs=new JPanel();
        eicimgs=new JPanel();
        allimgs=new JPanel();

       

        //aetherimgs.setPreferredSize(new Dimension(200,400));
        rightdown=new JPanel();
        rightdown.setPreferredSize(new Dimension(5,200));
        right.add(rightdown,BorderLayout.SOUTH);

      
        aethergallery = new JScrollPane(aetherimgs);
        bajagallery = new JScrollPane( bajaimgs);
        airogallery = new JScrollPane(airoimgs);
        cccgallery = new JScrollPane(cccimgs);
        tyohargallery = new JScrollPane(tyoharimgs);
        tedxgallery = new JScrollPane(tedximgs);
        enigmagallery = new JScrollPane( enigmaimgs);
        sportsgallery = new JScrollPane(sportsimgs);
        eicgallery = new JScrollPane(eicimgs);
        allgallery = new JScrollPane(allimgs);


        

       // right.add(rightdown,BorderLayout.SOUTH);
        //rightdown.setLayout(new BorderLayout());
        aetherimgs.setLayout(new GridLayout(3,3,1,1));
        bajaimgs.setLayout(new GridLayout(2,3,1,1));
        airoimgs.setLayout(new GridLayout(2,3,1,1));
        cccimgs.setLayout(new GridLayout(1,3,1,1));
        sportsimgs.setLayout(new GridLayout(1,3,1,1));
        tedximgs.setLayout(new GridLayout(2,3,1,1));
        enigmaimgs.setLayout(new GridLayout(2,3,1,1));
        eicimgs.setLayout(new GridLayout(2,3,1,1));
        tyoharimgs.setLayout(new GridLayout(2,3,1,1));
        allimgs.setLayout(new GridLayout(2,3,1,1));
        
       
        
        aetherfirst = new galleryimg("aether1.jpg");             
        aethersecond = new galleryimg("aether2.jpg");
        aetherthird = new galleryimg("aether3.jpg");
        aetherfourth = new galleryimg("aether4.jpg");
        aetherfifth = new galleryimg("aether5.jpg");
        aethersixth = new galleryimg("aether6.jpg");
        aetherseventh = new galleryimg("aether7.jpg");


        bajafirst = new galleryimg("baja1.jpg");             
        bajasecond = new galleryimg("baja2.jpg");
        bajathird = new galleryimg("baja3.jpg");
        bajafourth = new galleryimg("baja4.jpg");
        bajafifth = new galleryimg("baja5.jpg");
        bajasixth = new galleryimg("baja6.jpg");

        tedxfirst = new galleryimg("tedx1.jpg");             
        tedxsecond = new galleryimg("tedx2.jpg");
        tedxthird = new galleryimg("tedx3.png");
        tedxfourth = new galleryimg("tedx4.jpg");
        tedxfifth = new galleryimg("tedx5.jpg");
        tedxsixth = new galleryimg("tedx6.jpg");

        airofirst = new galleryimg("airo1.jpg");             
        airosecond = new galleryimg("airo2.jpg");
        airothird = new galleryimg("airo3.jpg");
        airofourth = new galleryimg("airo4.png");
        airofifth = new galleryimg("airo5.png");

        tyoharfirst = new galleryimg("tyohar1.jpg");             
        tyoharsecond = new galleryimg("tyohar2.jpg");
        tyoharthird = new galleryimg("tyohar3.jpg");
        tyoharfourth = new galleryimg("tyohar4.jpg");
        tyoharfifth = new galleryimg("tyohar5.jpg");

        enigmafirst = new galleryimg("enigma1.jpeg");             
        enigmasecond = new galleryimg("enigma2.jpg");
        enigmathird = new galleryimg("enigma3.jpg");
        enigmafourth = new galleryimg("enigma4.jpg");
        enigmafifth = new galleryimg("enigma5.jpeg");

        eicfirst = new galleryimg("eic1.jpg");             
        eicsecond = new galleryimg("eic2.jpg");
        eicthird = new galleryimg("eic3.jpg");
        eicfourth = new galleryimg("eic4.jpg");
        eicfifth = new galleryimg("eic5.jpg");

        sportsfirst = new galleryimg("sports1.jpg");             
        sportssecond = new galleryimg("sports2.jpg");
        sportsthird = new galleryimg("sports3.jpg");
        

        cccfirst = new galleryimg("ccc1.jpg");             
        cccsecond = new galleryimg("ccc2.jpg");
        cccthird = new galleryimg("ccc3.jpg");
        cccfourth = new galleryimg("ccc4.jpg");
        cccfifth = new galleryimg("ccc5.jpg");

        allfirst = new galleryimg("enigma1.jpeg");             
        allsecond = new galleryimg("airo2.jpg");
        allthird = new galleryimg("baja3.jpg");
        allfourth = new galleryimg("tyohar4.jpg");
        allfifth = new galleryimg("aether5.jpg");
        allsixth = new galleryimg("tedx6.jpg");



   
        aetherimgs.add(aetherfirst);
        aetherimgs.add(aethersecond);
        aetherimgs.add(aetherthird);
        aetherimgs.add(aetherfourth);
        aetherimgs.add(aetherfifth);
        aetherimgs.add(aethersixth);
        aetherimgs.add(aetherseventh);
        //aetherimgs.add(aethersixth);

        tedximgs.add(tedxfirst);
        tedximgs.add(tedxsecond);
        tedximgs.add(tedxthird);
        tedximgs.add(tedxfourth);
        tedximgs.add(tedxfifth);
        tedximgs.add(tedxsixth);

        bajaimgs.add(bajafirst);
        bajaimgs.add(bajasecond);
        bajaimgs.add(bajathird);
        bajaimgs.add(bajafourth);
        bajaimgs.add(bajafifth);
        bajaimgs.add(bajasixth);

        airoimgs.add(airofirst);
        airoimgs.add(airosecond);
        airoimgs.add(airothird);
        airoimgs.add(airofourth);
        airoimgs.add(airofifth);

        enigmaimgs.add(enigmafirst);
        enigmaimgs.add(enigmasecond);
        enigmaimgs.add(enigmathird);
        enigmaimgs.add(enigmafourth);
        enigmaimgs.add(enigmafifth);

        cccimgs.add(cccfirst);
        cccimgs.add(cccsecond);
        cccimgs.add(cccthird);
        //cccimgs.add(cccfourth);

        eicimgs.add(eicfirst);
        eicimgs.add(eicsecond);
        eicimgs.add(eicthird);
        eicimgs.add(eicfourth);
        eicimgs.add(eicfifth);

        sportsimgs.add(sportsfirst);
        sportsimgs.add(sportssecond);
        sportsimgs.add(sportsthird);

        tyoharimgs.add(tyoharfirst);
        tyoharimgs.add(tyoharsecond);
        tyoharimgs.add(tyoharthird);
        tyoharimgs.add(tyoharfourth);
        tyoharimgs.add(tyoharfifth);

        
        allimgs.add(allfirst);
        allimgs.add(allsecond);
        allimgs.add(allthird);
        allimgs.add(allfourth);
        allimgs.add(allfifth);
        allimgs.add(allsixth);
              
       
        aetherfirst.addMouseListener(this);
        aethersecond.addMouseListener(this);
        aetherthird.addMouseListener(this);
        aetherfourth.addMouseListener(this);
        aetherfifth.addMouseListener(this);
        aethersixth.addMouseListener(this);
     




        rightcentre=new JPanel();
        about = new JLabel("ABOUT");
        rightcentre.add(about);
        right.add(rightcentre,BorderLayout.CENTER);
        

        centre = new JPanel();
        centre.setLayout(new BorderLayout());

        innermenu = new JPanel();


        insetclubs = new JMenuBar();
        enigma = new labelbutton("ENIGMA");
        baja = new labelbutton("BAJA");
        spicmacay = new labelbutton("SPICMACAY");
        eic= new labelbutton("EIC");
        sports= new labelbutton("SPORTS");
        media= new labelbutton("MEDIA");

        enigma.addActionListener(this);
        baja.addActionListener(this);
        sports.addActionListener(this);
        eic.addActionListener(this);
      
  
        insetclubs.add(enigma);
        insetclubs.add(baja);
        insetclubs.add(spicmacay);
        insetclubs.add(eic);
        insetclubs.add(sports);
        insetclubs.add(media);


        insetevents = new JMenuBar();
        aether = new labelbutton("AETHER");
        tedx = new labelbutton("TEDX");
        ecoletyohar = new labelbutton("ECOLE TYOHAR");
        ccc= new labelbutton("CCC");
        airo= new labelbutton("AIRO");

        airo.addActionListener(this);
        aether.addActionListener(this);
        tedx.addActionListener(this);
        ecoletyohar.addActionListener(this);
        ccc.addActionListener(this);
        


         

        insetevents.add(aether);
        insetevents.add(airo);
        insetevents.add(tedx);
        insetevents.add(ecoletyohar);
        insetevents.add(ccc);

    
        //inner.add(insetclubs);
        innermenu.setPreferredSize(new Dimension(xSize-400, 30));
           
        aetherfirstfull = new slideshowimg("aether1.jpg");
        aethersecondfull = new slideshowimg("aether2.jpg");
        aetherthirdfull = new slideshowimg("aether3.jpg");
        aetherfourthfull = new slideshowimg("aether4.jpg");
        aetherfifthfull = new slideshowimg("aether5.jpg");
        aethersixthfull = new slideshowimg("aether6.jpg");
        aetherseventhfull = new slideshowimg("aether7.jpg");

        bajafirstfull = new slideshowimg("baja1.jpg");             
        bajasecondfull = new slideshowimg("baja2.jpg");
        bajathirdfull = new slideshowimg("baja3.jpg");
        bajafourthfull = new slideshowimg("baja4.jpg");
        bajafifthfull = new slideshowimg("baja5.jpg");
        bajasixthfull = new slideshowimg("baja6.jpg");

        tedxfirstfull = new slideshowimg("tedx1.jpg");             
        tedxsecondfull = new slideshowimg("tedx2.jpg");
        tedxthirdfull = new slideshowimg("tedx3.png");
        tedxfourthfull = new slideshowimg("tedx4.jpg");
        tedxfifthfull = new slideshowimg("tedx5.jpg");
        tedxsixthfull = new slideshowimg("tedx6.jpg");

        airofirstfull = new slideshowimg("airo1.jpg");             
        airosecondfull = new slideshowimg("airo2.jpg");
        airothirdfull = new slideshowimg("airo3.jpg");
        airofourthfull = new slideshowimg("airo4.png");
        airofifthfull = new slideshowimg("airo5.png");

        tyoharfirstfull = new slideshowimg("tyohar1.jpg");             
        tyoharsecondfull = new slideshowimg("tyohar2.jpg");
        tyoharthirdfull = new slideshowimg("tyohar3.jpg");
        tyoharfourthfull = new slideshowimg("tyohar4.jpg");
        tyoharfifthfull = new slideshowimg("tyohar5.jpg");

        enigmafirstfull = new slideshowimg("enigma1.jpeg");             
        enigmasecondfull = new slideshowimg("enigma2.jpg");
        enigmathirdfull = new slideshowimg("enigma3.jpg");
        enigmafourthfull = new slideshowimg("enigma4.jpg");
        enigmafifthfull = new slideshowimg("enigma5.jpeg");

        eicfirstfull = new slideshowimg("eic1.jpg");             
        eicsecondfull = new slideshowimg("eic2.jpg");
        eicthirdfull = new slideshowimg("eic3.jpg");
        eicfourthfull = new slideshowimg("eic4.jpg");
        eicfifthfull = new slideshowimg("eic5.jpg");

        sportsfirstfull = new slideshowimg("sports1.jpg");             
        sportssecondfull = new slideshowimg("sports2.jpg");
        sportsthirdfull = new slideshowimg("sports3.jpg");
        

        cccfirstfull = new slideshowimg("ccc1.jpg");             
        cccsecondfull = new slideshowimg("ccc2.jpg");
        cccthirdfull = new slideshowimg("ccc3.jpg");
        cccfourthfull = new slideshowimg("ccc4.jpg");
        cccfifthfull = new slideshowimg("ccc5.jpg");

        allfirstfull = new slideshowimg("enigma1.jpeg");
        allsecondfull = new slideshowimg("airo2.jpg");
        allthirdfull = new slideshowimg("baja3.jpg");
        allfourthfull = new slideshowimg("tyohar4.jpg");
        allfifthfull = new slideshowimg("aether5.jpg");
        allsixthfull = new slideshowimg("tedx6.jpg");
        


        ImageIcon imageIcon20 = new ImageIcon("next.png"); // load the image to a imageIcon
        Image image20 = imageIcon20.getImage(); // transform it 
        Image newimg20 = image20.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        next = new JButton(new ImageIcon(newimg20));

        ImageIcon imageIcon21 = new ImageIcon("prev.png"); // load the image to a imageIcon
        Image image21 = imageIcon21.getImage(); // transform it 
        Image newimg21 = image21.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        prev = new JButton(new ImageIcon(newimg21));

       
        card = new CardLayout();
        centrecl = new JPanel();
      
        centrecl.setLayout(new BorderLayout());
        
        claether = new JPanel();
        clairo = new JPanel();
        cltedx = new JPanel();
        clsports = new JPanel();
        clenigma = new JPanel();
        cltyohar = new JPanel();
        clccc = new JPanel();
        cleic = new JPanel();
        clbaja = new JPanel();
        clall=new JPanel();

        
        claether.setLayout(card);
        clairo.setLayout(card);
        cltedx.setLayout(card);
        clsports.setLayout(card);
        cltyohar.setLayout(card);
        clccc.setLayout(card);
        cleic.setLayout(card);
        clenigma.setLayout(card);
        clbaja.setLayout(card);
        clall.setLayout(card);


        claether.add(aetherfirstfull,"1");
        claether.add(aethersecondfull,"2");
        claether.add(aetherthirdfull,"3");
        claether.add(aetherfourthfull,"4");
        claether.add(aetherfifthfull,"5");
        claether.add(aethersixthfull,"6");

        clairo.add(airofirstfull,"1");
        clairo.add(airosecondfull,"2");
        clairo.add(airothirdfull,"3");
        clairo.add(airofourthfull,"4");
        clairo.add(airofifthfull,"5");
        //clairo.add(airosixthfull,"6");


        
        ImageIcon imageIcon33 = new ImageIcon("baja.png"); // load the image to a imageIcon
        Image image75 = imageIcon33.getImage(); // transform it 
        Image newimg33 = image75.getScaledInstance(300, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        bajadp = new JLabel(new ImageIcon(newimg33));
        clbaja.add(bajafirstfull,"1");
        clbaja.add(bajasecondfull,"2");
        clbaja.add(bajathirdfull,"3");
        clbaja.add(bajafourthfull,"4");
        clbaja.add(bajafifthfull,"5");
        clbaja.add(bajasixthfull,"6");

        cltedx.add(tedxfirstfull,"1");
        cltedx.add(tedxsecondfull,"2");
        cltedx.add(tedxthirdfull,"3");
        cltedx.add(tedxfourthfull,"4");
        cltedx.add(tedxfifthfull,"5");
        cltedx.add(tedxsixthfull,"6");

        cleic.add(eicfirstfull,"1");
        cleic.add(eicsecondfull,"2");
        cleic.add(eicthirdfull,"3");
        cleic.add(eicfourthfull,"4");
        cleic.add(eicfifthfull,"5");
        //cleic.add(eicsixthfull,"6");

        clsports.add(sportsfirstfull,"1");
        clsports.add(sportssecondfull,"2");
        clsports.add(sportsthirdfull,"3");
        //clsports.add(sportsfourthfull,"4");
        //clsports.add(sportsfifthfull,"5");
        //clsports.add(sportssixthfull,"6");

        clenigma.add(enigmafirstfull,"1");
        clenigma.add(enigmasecondfull,"2");
        clenigma.add(enigmathirdfull,"3");
        clenigma.add(enigmafourthfull,"4");
        clenigma.add(enigmafifthfull,"5");
        //clenigma.add(enigmasixthfull,"6");

        clccc.add(cccfirstfull,"1");
        clccc.add(cccsecondfull,"2");
        clccc.add(cccthirdfull,"3");
        clccc.add(cccfourthfull,"4");
        //clccc.add(cccfifthfull,"5");
        //clccc.add(cccsixthfull,"6");

        cltyohar.add(tyoharfirstfull,"1");
        cltyohar.add(tyoharsecondfull,"2");
        cltyohar.add(tyoharthirdfull,"3");
        cltyohar.add(tyoharfourthfull,"4");
        cltyohar.add(tyoharfifthfull,"5");
        //cltyohar.add(tyoharsixthfull,"6");


        clall.add(allfirstfull,"1");
        clall.add(allsecondfull,"2");
        clall.add(allthirdfull,"3");
        clall.add(allfourthfull,"4");
        clall.add(allfifthfull,"5");
        clall.add(allsixthfull,"6");

       /* prev = new JButton(nextimg);    
        next = new JButton(previmg);*/
        prev.setOpaque(false);
        prev.setContentAreaFilled(false);
        prev.setBorderPainted(false);
        next.setOpaque(false);
        next.setContentAreaFilled(false);
        next.setBorderPainted(false);
        
        
        centrecl.add(prev,BorderLayout.WEST);
        centrecl.add(next,BorderLayout.EAST);
       
       
        prev.addActionListener(this);
        next.addActionListener(this);

        
        centre.add(innermenu,BorderLayout.NORTH);
        centre.setBorder(BorderFactory.createLineBorder(Color.gray));

        f3.add(centre,BorderLayout.CENTER);
        centre.add(centrecl,BorderLayout.CENTER); 
        
        centredown = new JPanel();
        centresouth = new JPanel();
        centre.add(centredown,BorderLayout.SOUTH);

        ImageIcon imageIcon26 = new ImageIcon("likeimage.jpg"); // load the image to a imageIcon
        Image image26= imageIcon26.getImage(); // transform it 
        Image newimg26 = image26.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        uninterested = new ImageIcon(newimg26);

        ImageIcon imageIcon27 = new ImageIcon("likedimg.jpg"); // load the image to a imageIcon
        Image image27= imageIcon27.getImage(); // transform it 
        Image newimg27 = image27.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        interested = new ImageIcon(newimg27);


        aether1likecount=0;
        
        aether1like = new interestbutton("0", uninterested);
        aether1like.addActionListener(this);
        aether2like = new interestbutton("0", uninterested);
        aether2like.addActionListener(this);
        aether3like = new interestbutton("0", uninterested);
        aether3like.addActionListener(this);
        aether4like = new interestbutton("0", uninterested);
        aether4like.addActionListener(this);
        aether5like = new interestbutton("0", uninterested);
        aether5like.addActionListener(this);
        aether6like = new interestbutton("0", uninterested);
        aether6like.addActionListener(this);


        tedx1like = new interestbutton("0", uninterested);
        tedx1like.addActionListener(this);
        tedx2like = new interestbutton("0", uninterested);
        tedx2like.addActionListener(this);
        tedx3like = new interestbutton("0", uninterested);
        tedx3like.addActionListener(this);
        tedx4like = new interestbutton("0", uninterested);
        tedx4like.addActionListener(this);
        tedx5like = new interestbutton("0", uninterested);
        tedx5like.addActionListener(this);
        tedx6like = new interestbutton("0", uninterested);
        tedx6like.addActionListener(this);

        eic1like = new interestbutton("0", uninterested);
        eic1like.addActionListener(this);
        eic2like = new interestbutton("0", uninterested);
        eic2like.addActionListener(this);
        eic3like = new interestbutton("0", uninterested);
        eic3like.addActionListener(this);
        eic4like = new interestbutton("0", uninterested);
        eic4like.addActionListener(this);
        eic5like = new interestbutton("0", uninterested);
        eic5like.addActionListener(this);
        
        baja1like = new interestbutton("0", uninterested);
        baja1like.addActionListener(this);
        baja2like = new interestbutton("0", uninterested);
        baja2like.addActionListener(this);
        baja3like = new interestbutton("0", uninterested);
        baja3like.addActionListener(this);
        baja4like = new interestbutton("0", uninterested);
        baja4like.addActionListener(this);
        baja5like = new interestbutton("0", uninterested);
        baja5like.addActionListener(this);
        baja6like = new interestbutton("0", uninterested);
        baja6like.addActionListener(this);

        airo1like = new interestbutton("0", uninterested);
        airo1like.addActionListener(this);
        airo2like = new interestbutton("0", uninterested);
        airo2like.addActionListener(this);
        airo3like = new interestbutton("0", uninterested);
        airo3like.addActionListener(this);
        airo4like = new interestbutton("0", uninterested);
        airo4like.addActionListener(this);
        airo5like = new interestbutton("0", uninterested);
        airo5like.addActionListener(this);
  
        enigma1like = new interestbutton("0", uninterested);
        enigma1like.addActionListener(this);
        enigma2like = new interestbutton("0", uninterested);
        enigma2like.addActionListener(this);
        enigma3like = new interestbutton("0", uninterested);
        enigma3like.addActionListener(this);
        enigma4like = new interestbutton("0", uninterested);
        enigma4like.addActionListener(this);
        enigma5like = new interestbutton("0", uninterested);
        enigma5like.addActionListener(this);

        tyohar1like = new interestbutton("0", uninterested);
        tyohar1like.addActionListener(this);
        tyohar2like = new interestbutton("0", uninterested);
        tyohar2like.addActionListener(this);
        tyohar3like = new interestbutton("0", uninterested);
        tyohar3like.addActionListener(this);
        tyohar4like = new interestbutton("0", uninterested);
        tyohar4like.addActionListener(this);
        tyohar5like = new interestbutton("0", uninterested);
        tyohar5like.addActionListener(this);

        ccc1like = new interestbutton("0", uninterested);
        ccc1like.addActionListener(this);
        ccc2like = new interestbutton("0", uninterested);
        ccc2like.addActionListener(this);
        ccc3like = new interestbutton("0", uninterested);
        ccc3like.addActionListener(this);
        ccc4like = new interestbutton("0", uninterested);
        ccc4like.addActionListener(this);
        
        sports1like = new interestbutton("0", uninterested);
        sports1like.addActionListener(this);
        sports2like = new interestbutton("0", uninterested);
        sports2like.addActionListener(this);
        sports3like = new interestbutton("0", uninterested);
        sports3like.addActionListener(this);
       
    
       
        centredown.setLayout(new BorderLayout());
        centredown.add(centresouth,BorderLayout.CENTER);
        emptyspace = new JPanel();
        emptyspace.setPreferredSize(new Dimension(100,100));;
        centredown.add(emptyspace, BorderLayout.WEST);

        
       
        centresouth.setLayout(new BorderLayout());
        aethercapown = new JLabel("TEAM AETHER   ");
        aethercapown.setFont(aethercapown.getFont().deriveFont(Font.BOLD));
        aethercaption1= new JTextArea("welcome to the new event mec hacks\nto register for the event click on the below link \nhttps://www.instagram.com/mecenigma/");
        aethercaption1.setEditable(false);
        aethercaption1.setLineWrap(true);
        aethercaption1.setOpaque(false);
        aethercaption1.setFont(aethercaption1.getFont().deriveFont(Font.ITALIC));

        airocapown = new JLabel("TEAM AIRO   ");

        airocaption1= new JTextArea("Airo 2018 was a burst of adrenaline see u guys there");
        airocaption1.setLineWrap(true);
        airocaption1.setOpaque(false);
        airocaption1.setEditable(false);
        
        airocaption1.setFont(airocaption1.getFont().deriveFont(Font.ITALIC));

        tedxcapown = new JLabel("TEAM TEDX   ");

        tedxcaption1= new JTextArea("tedx first edition was a joyous one \nthanks to all the speakers for making this a succesful event");
        tedxcaption1.setLineWrap(true);
        tedxcaption1.setOpaque(false);
        tedxcaption1.setFont(tedxcaption1.getFont().deriveFont(Font.ITALIC));
        
        ccccapown = new JLabel("TEAM CONCLAVE   ");

        ccccaption1= new JTextArea("the first convlave hosted by proF Venkatraman");
        ccccaption1.setLineWrap(true);
        ccccaption1.setOpaque(false);
        ccccaption1.setFont(ccccaption1.getFont().deriveFont(Font.ITALIC));

        ccccaption1.setEditable(false);
        eiccapown = new JLabel("TEAM EIC   ");

        eiccaption1= new JTextArea("eic team along with mentor prof rajkumar phatate");
        eiccaption1.setLineWrap(true);
        eiccaption1.setOpaque(false);
        eiccaption1.setFont(eiccaption1.getFont().deriveFont(Font.ITALIC));
        eiccaption1.setEditable(false);
        enigmacapown = new JLabel("TEAM ENIGMA   ");

        enigmacaption1= new JTextArea("welcome to the new event mec hacks \n cjnecknckn\nncksneksnc\njcn knck");
        enigmacaption1.setLineWrap(true);
        enigmacaption1.setOpaque(false);
        enigmacaption1.setFont(enigmacaption1.getFont().deriveFont(Font.ITALIC));
        enigmacaption1.setEditable(false);

        bajacapown = new JLabel("TEAM GASMONKEYS RACING  ");

        bajacaption1= new JTextArea("sae baja team that reperesented our college in sae 2019 pune");
        bajacaption1.setLineWrap(true);
        bajacaption1.setOpaque(false);
        bajacaption1.setFont(bajacaption1.getFont().deriveFont(Font.ITALIC));
        bajacaption1.setEditable(false);

        sportscapown = new JLabel("TEAM SPORTS   ");

        sportscaption1= new JTextArea("volleyball tournament held during airo");
        sportscaption1.setLineWrap(true);
        sportscaption1.setOpaque(false);
        sportscaption1.setFont(sportscaption1.getFont().deriveFont(Font.ITALIC));
        
        tyoharcapown = new JLabel("TEAM TYOHAR   ");
        
        tyoharcaption1= new JTextArea("ecole tyohar 2015 the first of its kind");
        tyoharcaption1.setLineWrap(true);
        tyoharcaption1.setOpaque(false);
        tyoharcaption1.setFont(tyoharcaption1.getFont().deriveFont(Font.ITALIC));
        
        
       
       
       // ImagePanel left = new ImagePanel(new ImageIcon(newimg111).getImage());
        left = new JPanel();
        //left.setBackground(Color.DARK_GRAY);
        left.setPreferredSize(new Dimension(200, 500));
        //left.setForeground(Color.black);
        left.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(1, 1, 1, 1);
        clubs = new labelbutton("CLUBS");
        all= new labelbutton("ALL");
        studentc = new labelbutton("STUDENT COUNCIL");
        official= new labelbutton("OFFICIAL");
        events= new labelbutton("EVENTS");
        workshop= new labelbutton("WORKSHOPS");


        clubs.addActionListener(this);
        events.addActionListener(this);
        official.addActionListener(this);
        studentc.addActionListener(this);
        all.addActionListener(this);
        workshop.addActionListener(this);

                
        c.gridx=0;
        c.gridy=0;
       // c.weighty=1;
        //c.weightx=1;;
        c.anchor=GridBagConstraints.WEST;
        left.add(all,c);

        c.gridx=0;
        c.gridy=1;    

        left.add(clubs,c);
        
        c.gridx=0;
        c.gridy=2;
        //c.weighty=0;
        //c.weightx=0;
        left.add(studentc,c);

        c.gridx=0;
        c.gridy=3;
        left.add(events,c);

        c.gridx=0;
        c.gridy=4;
        //c.weightx=1;
        //c.weighty=1;
        left.add(workshop,c);

        c.gridx=0;
        c.gridy=5;
        left.add(official,c);

        ImageIcon imageIcon22 = new ImageIcon("workshops.png"); // load the image to a imageIcon
        Image image22 = imageIcon22.getImage(); // transform it 
        Image newimg22 = image22.getScaledInstance(300, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        workshopdp = new JLabel(new ImageIcon(newimg22));

        ImageIcon imageIcon23 = new ImageIcon("clubs.png"); // load the image to a imageIcon
        Image image23 = imageIcon23.getImage(); // transform it 
        Image newimg23 = image23.getScaledInstance(300, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        clubsdp = new JLabel(new ImageIcon(newimg23));

        ImageIcon imageIcon24 = new ImageIcon("official.jpg"); // load the image to a imageIcon
        Image image24 = imageIcon24.getImage(); // transform it 
        Image newimg24 = image24.getScaledInstance(300, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        officialdp = new JLabel(new ImageIcon(newimg24));

        ImageIcon imageIcon25 = new ImageIcon("events.png"); // load the image to a imageIcon
        Image image25= imageIcon25.getImage(); // transform it 
        Image newimg25 = image25.getScaledInstance(300, 225,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        eventsdp = new JLabel(new ImageIcon(newimg25));



        
        

        f3.add(left,BorderLayout.WEST);

        
        //JMenuBar vert = new VerticalMenuBar();


        centrecl.add(clall,BorderLayout.CENTER);

        centrecl.add(prev,BorderLayout.WEST);
        centrecl.add(next,BorderLayout.EAST);

            
           
        rightdown.add(allgallery);

           
        centresouth.add(enigmacapown , BorderLayout.CENTER);
        centresouth.add(enigma1like, BorderLayout.NORTH);
        centresouth.add(enigmacaption1,BorderLayout.SOUTH);  
            
        allcurrentcard=1;
           

        card.first(clall);
        currentbutton =1;

        f3.add(menuBar_1,BorderLayout.NORTH);
        
		
        //jb.setBounds(150,150,100,50);
        //f3.add(jb);
        f3.setVisible(true);
        f3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
   /* void clean()
    {
        this.removeAll();
        this.revalidate();
        this.repaint();
    }*/
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==clubs)
        {
            innermenu.removeAll();
            innermenu.revalidate();
            innermenu.repaint();
           // innnermenu.clean();
            innermenu.add(insetclubs);
            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(enigmadp);

            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(clenigma,BorderLayout.CENTER);
            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);
           
            enigmacurrentcard=1;

            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
            rightdown.add(enigmagallery);

            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(enigmacapown , BorderLayout.CENTER);
            centresouth.add(enigma1like, BorderLayout.NORTH);
            centresouth.add(enigmacaption1,BorderLayout.SOUTH);   

            currentbutton =4;
        }
        if(e.getSource()==signout)
        {
            f3.setVisible(false);
            first f =new first();
            f.register();
            f.login();
        }
        if(e.getSource()==profile)
        {
            f3.setVisible(false);
            new Profpage();
        }
        if(e.getSource()==events)
        {
            innermenu.removeAll();
            innermenu.revalidate();
            innermenu.repaint();
            innermenu.add(insetevents);

            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(aetherdp);
            //aethergallery.add(aetherimgs);
            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
            rightdown.add(aethergallery);
            
            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(claether,BorderLayout.CENTER);
            card.first(claether);
            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);

           // centresouth.add(aethercapown , BorderLayout.CENTER);
            aethercurrentcard=1;

            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(aethercapown , BorderLayout.CENTER);
            centresouth.add(aether1like, BorderLayout.NORTH);
            centresouth.add(aethercaption1,BorderLayout.SOUTH);         
          
            currentbutton=11;

        }
        if(e.getSource()==workshop)
        {
            innermenu.removeAll();
            innermenu.revalidate();
            innermenu.repaint();
            //innermenu.add(insetevents);

            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(workshopdp);

            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);

            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
           


            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
        }
        if(e.getSource()==official)
        {
            innermenu.removeAll();
            innermenu.revalidate();
            innermenu.repaint();
            //innermenu.add(insetevents);

            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(officialdp);

            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);

            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
           

            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
        }
        if(e.getSource()==studentc)
        {
            innermenu.removeAll();
            innermenu.revalidate();
            innermenu.repaint();
            //innermenu.add(insetevents);

            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();

            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);
           
            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();

            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
        }
        if(e.getSource()==all)
        {
            innermenu.removeAll();
            innermenu.revalidate();
            innermenu.repaint();
            //innermenu.add(insetevents);

            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(defaultdp);

            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(clall,BorderLayout.CENTER);

            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);
           
            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
            rightdown.add(allgallery);

            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(enigmacapown , BorderLayout.CENTER);
            centresouth.add(enigma1like, BorderLayout.NORTH);
            centresouth.add(enigmacaption1,BorderLayout.SOUTH);  
            
            allcurrentcard=1;
           

            card.first(clall);
            currentbutton =1;
        }
        if(e.getSource()==aether)
        {
            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(aetherdp);
            //aethergallery.add(aetherimgs);
            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
            rightdown.add(aethergallery);
            
            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(claether,BorderLayout.CENTER);
            card.first(claether);
            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);

           // centresouth.add(aethercapown , BorderLayout.CENTER);
            aethercurrentcard=1;

            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(aethercapown , BorderLayout.CENTER);
            centresouth.add(aether1like, BorderLayout.NORTH);
            centresouth.add(aethercaption1,BorderLayout.SOUTH);         
          
            currentbutton=11;

        }
        if(e.getSource()==airo)
        {
            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(airodp);

            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(clairo,BorderLayout.CENTER);
            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);
           
            airocurrentcard=1;
            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
            rightdown.add(airogallery);
            airocurrentcard=1;
            card.first(clairo);
            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(airocapown , BorderLayout.CENTER);
            centresouth.add(airo1like, BorderLayout.NORTH);
            centresouth.add(airocaption1,BorderLayout.SOUTH);   
            currentbutton=12;

        }
        if(e.getSource()==tedx)
        {
            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(tedxdp);

            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(cltedx,BorderLayout.CENTER);
            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);

            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
            rightdown.add(tedxgallery);

            card.first(cltedx);
            tedxcurrentcard=1;
            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(tedxcapown , BorderLayout.CENTER);
            centresouth.add(tedx1like, BorderLayout.NORTH);
            centresouth.add(tedxcaption1,BorderLayout.SOUTH);
            currentbutton = 13;

        }
        if(e.getSource()==ecoletyohar)
        {
            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(ecoletyohardp);

            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(cltyohar,BorderLayout.CENTER);
            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);
           
            currentbutton=14;

            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
            rightdown.add(tyohargallery);
            card.first(cltyohar);

            tyoharcurrentcard=1;
            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(tyoharcapown , BorderLayout.CENTER);
            centresouth.add(tyohar1like, BorderLayout.NORTH);
            centresouth.add(tyoharcaption1,BorderLayout.SOUTH);   

        }
        if(e.getSource()==enigma)
        {
            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(enigmadp);

            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(clenigma,BorderLayout.CENTER);
            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);
           
            enigmacurrentcard=1;

            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
            rightdown.add(enigmagallery);

            card.first(clenigma);

            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(enigmacapown , BorderLayout.CENTER);
            centresouth.add(enigma1like, BorderLayout.NORTH);
            centresouth.add(enigmacaption1,BorderLayout.SOUTH);   

            currentbutton =3;

        }
        if(e.getSource()==eic)
        {
            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(tedxdp);

            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(cleic,BorderLayout.CENTER);

            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);

            eiccurrentcard=1;
            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
            rightdown.add(eicgallery);

            card.first(cleic);

            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(eiccapown , BorderLayout.CENTER);
            centresouth.add(eic1like, BorderLayout.NORTH);
            centresouth.add(eiccaption1,BorderLayout.SOUTH);   
            currentbutton=6;
        }
        if(e.getSource()==sports)
        {
            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(sportsdp);

            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(clsports,BorderLayout.CENTER);

            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);

            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
            rightdown.add(sportsgallery);

            card.first(clsports);

            sportscurrentcard=1;
            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(sportscapown , BorderLayout.CENTER);
            centresouth.add(sports1like, BorderLayout.NORTH);
            centresouth.add(sportscaption1,BorderLayout.SOUTH);   
            currentbutton=7;

        }
        if(e.getSource()==baja)
        {
            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(bajadp);

            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(clbaja,BorderLayout.CENTER);

            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);

            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
            rightdown.add(bajagallery);

            card.first(clbaja);

            bajacurrentcard=1;
            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(bajacapown , BorderLayout.CENTER);
            centresouth.add(baja1like, BorderLayout.NORTH);
            centresouth.add(bajacaption1,BorderLayout.SOUTH);   
            currentbutton=4;

        }
        if(e.getSource()==ccc)
        {
            righttop.removeAll();
            righttop.revalidate();
            righttop.repaint();
            righttop.add(tedxdp);

            centrecl.removeAll();
            centrecl.revalidate();
            centrecl.repaint();
            centrecl.add(clccc,BorderLayout.CENTER);
            centrecl.add(prev,BorderLayout.WEST);
            centrecl.add(next,BorderLayout.EAST);

            rightdown.removeAll();
            rightdown.revalidate();
            rightdown.repaint();
            rightdown.add(cccgallery);

            card.first(clccc);

            ccccurrentcard=1;
            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(ccccapown , BorderLayout.CENTER);
            centresouth.add(ccc1like, BorderLayout.NORTH);
            centresouth.add(ccccaption1,BorderLayout.SOUTH);   
            currentbutton=15;

        }

        if(e.getSource()==next)
        {

            
            if(aethercurrentcard==6)
            {
                aethercurrentcard=1;
            }
            else if(aethercurrentcard<6)
            {
                aethercurrentcard++;
            }
            
            if(bajacurrentcard==6)
            {
                bajacurrentcard=1;
            }
            else if(bajacurrentcard<6)
            {
                bajacurrentcard++;
            }

            if(airocurrentcard==6)
            {
                airocurrentcard=1;
            }
            else if(airocurrentcard<6)
            {
                airocurrentcard++;
            }

            if(tedxcurrentcard==6)
            {
                tedxcurrentcard=1;
            }
            else if(tedxcurrentcard<6)
            {
                tedxcurrentcard++;
            }

            if(ccccurrentcard==4)
            {
                ccccurrentcard=1;
            }
            else if(ccccurrentcard<4)
            {
                ccccurrentcard++;
            }

            if(enigmacurrentcard==5)
            {
                enigmacurrentcard=1;
            }
            else if(enigmacurrentcard<4)
            {
                enigmacurrentcard++;
            }

            if(sportscurrentcard==3)
            {
                sportscurrentcard=1;
            }
            else if(sportscurrentcard<3)
            {
                sportscurrentcard++;
            }

            if(tyoharcurrentcard==5)
            {
                tyoharcurrentcard=1;
            }
            else if(tyoharcurrentcard<5)
            {
                tyoharcurrentcard++;
            }

            if(eiccurrentcard==5)
            {
                eiccurrentcard=1;
            }
            else if(eiccurrentcard<5)
            {
                eiccurrentcard++;
            }

            if(allcurrentcard==6)
            {
                allcurrentcard=1;
            }
            else if(allcurrentcard<6)
            {
                allcurrentcard++;
            }

           
            card.next(claether);
            card.next(clairo);
            card.next(clenigma);
            card.next(cltedx);
            card.next(cltyohar);
            card.next(cleic);
            card.next(clsports);
            card.next(clccc);
            card.next(clbaja);
            card.next(clall);




            if(currentbutton ==11)
            {            
            if(aethercurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether1like, BorderLayout.NORTH);
                centresouth.add(aethercaption1,BorderLayout.SOUTH);
            }
            if(aethercurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether2like, BorderLayout.NORTH);
                //centresouth.add(aethercaption1,BorderLayout.SOUTH);
            }
            if(aethercurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether3like, BorderLayout.NORTH);
                //centresouth.add(aethercaption1,BorderLayout.SOUTH);
            }
            if(aethercurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether4like, BorderLayout.NORTH);
                //centresouth.add(aethercaption1,BorderLayout.SOUTH);
            }
            if(aethercurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether5like, BorderLayout.NORTH);
                //centresouth.add(aethercaption1,BorderLayout.SOUTH);
            }
            if(aethercurrentcard==6)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether6like, BorderLayout.NORTH);
                //centresouth.add(aethercaption1,BorderLayout.SOUTH);
            }
        }
        if(currentbutton ==4)
        {
            if(bajacurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja1like, BorderLayout.NORTH);
                centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(bajacurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja2like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(bajacurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja3like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(bajacurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja4like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(bajacurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja5like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(bajacurrentcard==6)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja6like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
        }
        if(currentbutton==13)
        {
            if(tedxcurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx1like, BorderLayout.NORTH);
                centresouth.add(tedxcaption1,BorderLayout.SOUTH);
            }
            if(tedxcurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx2like, BorderLayout.NORTH);
                //centresouth.add(tedxcaption1,BorderLayout.SOUTH);
            }
            if(tedxcurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx3like, BorderLayout.NORTH);
                //centresouth.add(tedxcaption1,BorderLayout.SOUTH);
            }
            if(tedxcurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx4like, BorderLayout.NORTH);
                //centresouth.add(tedxcaption1,BorderLayout.SOUTH);
            }
            if(tedxcurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx5like, BorderLayout.NORTH);
                //centresouth.add(tedxcaption1,BorderLayout.SOUTH);
            }
            if(tedxcurrentcard==6)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx6like, BorderLayout.NORTH);
                //centresouth.add(tedxcaption1,BorderLayout.SOUTH);
            }
        }
        if(currentbutton==3)
        {
            if(enigmacurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(enigmacapown , BorderLayout.CENTER);
                centresouth.add(enigma1like, BorderLayout.NORTH);
                centresouth.add(enigmacaption1,BorderLayout.SOUTH);
            }
            if(enigmacurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(enigmacapown , BorderLayout.CENTER);
                centresouth.add(enigma2like, BorderLayout.NORTH);
                //centresouth.add(enigmacaption1,BorderLayout.SOUTH);
            }
            if(enigmacurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(enigmacapown , BorderLayout.CENTER);
                centresouth.add(enigma3like, BorderLayout.NORTH);
                //centresouth.add(enigmacaption1,BorderLayout.SOUTH);
            }
            if(enigmacurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(enigmacapown , BorderLayout.CENTER);
                centresouth.add(enigma4like, BorderLayout.NORTH);
                //centresouth.add(enigmacaption1,BorderLayout.SOUTH);
            }
            if(enigmacurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(enigmacapown , BorderLayout.CENTER);
                centresouth.add(enigma5like, BorderLayout.NORTH);
                //centresouth.add(enigmacaption1,BorderLayout.SOUTH);
            }
        }
        if(currentbutton ==6)
        {
            if(eiccurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(eiccapown , BorderLayout.CENTER);
                centresouth.add(eic1like, BorderLayout.NORTH);
                centresouth.add(eiccaption1,BorderLayout.SOUTH);
            }
            if(eiccurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(eiccapown , BorderLayout.CENTER);
                centresouth.add(eic2like, BorderLayout.NORTH);
                //centresouth.add(eiccaption1,BorderLayout.SOUTH);
            }
            if(eiccurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(eiccapown , BorderLayout.CENTER);
                centresouth.add(eic3like, BorderLayout.NORTH);
                //centresouth.add(eiccaption1,BorderLayout.SOUTH);
            }
            if(eiccurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(eiccapown , BorderLayout.CENTER);
                centresouth.add(eic4like, BorderLayout.NORTH);
                //centresouth.add(eiccaption1,BorderLayout.SOUTH);
            }
            if(eiccurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(eiccapown , BorderLayout.CENTER);
                centresouth.add(eic5like, BorderLayout.NORTH);
                //centresouth.add(eiccaption1,BorderLayout.SOUTH);
            }

        }
        if(currentbutton ==12)
        {
            
            if(airocurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(airocapown , BorderLayout.CENTER);
                centresouth.add(airo1like, BorderLayout.NORTH);
                centresouth.add(airocaption1,BorderLayout.SOUTH);
            }
            if(airocurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(airocapown , BorderLayout.CENTER);
                centresouth.add(airo2like, BorderLayout.NORTH);
                //centresouth.add(airocaption1,BorderLayout.SOUTH);
            }
            if(airocurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(airocapown , BorderLayout.CENTER);
                centresouth.add(airo3like, BorderLayout.NORTH);
                //centresouth.add(airocaption1,BorderLayout.SOUTH);
            }
            if(airocurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(airocapown , BorderLayout.CENTER);
                centresouth.add(airo4like, BorderLayout.NORTH);
                //centresouth.add(airocaption1,BorderLayout.SOUTH);
            }
            if(airocurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(airocapown , BorderLayout.CENTER);
                centresouth.add(airo5like, BorderLayout.NORTH);
                //centresouth.add(airocaption1,BorderLayout.SOUTH);
            }
        }
        if(currentbutton ==14)
        {
            if(tyoharcurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tyoharcapown , BorderLayout.CENTER);
                centresouth.add(tyohar1like, BorderLayout.NORTH);
                centresouth.add(tyoharcaption1,BorderLayout.SOUTH);
            }
            if(tyoharcurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tyoharcapown , BorderLayout.CENTER);
                centresouth.add(tyohar2like, BorderLayout.NORTH);
                //centresouth.add(tyoharcaption1,BorderLayout.SOUTH);
            }
            if(tyoharcurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tyoharcapown , BorderLayout.CENTER);
                centresouth.add(tyohar3like, BorderLayout.NORTH);
                //centresouth.add(tyoharcaption1,BorderLayout.SOUTH);
            }
            if(tyoharcurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tyoharcapown , BorderLayout.CENTER);
                centresouth.add(tyohar4like, BorderLayout.NORTH);
                //centresouth.add(tyoharcaption1,BorderLayout.SOUTH);
            }
            if(tyoharcurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tyoharcapown , BorderLayout.CENTER);
                centresouth.add(tyohar5like, BorderLayout.NORTH);
                //centresouth.add(tyoharcaption1,BorderLayout.SOUTH);
            }
        }
        if(currentbutton==15)
        {   
            if(ccccurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(ccccapown , BorderLayout.CENTER);
                centresouth.add(ccc1like, BorderLayout.NORTH);
                centresouth.add(ccccaption1,BorderLayout.SOUTH);
            }
            if(ccccurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(ccccapown , BorderLayout.CENTER);
                centresouth.add(ccc2like, BorderLayout.NORTH);
                //centresouth.add(ccccaption1,BorderLayout.SOUTH);
            }
            if(ccccurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(ccccapown , BorderLayout.CENTER);
                centresouth.add(ccc3like, BorderLayout.NORTH);
                //centresouth.add(ccccaption1,BorderLayout.SOUTH);
            }
            if(ccccurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(ccccapown , BorderLayout.CENTER);
                centresouth.add(ccc4like, BorderLayout.NORTH);
                //centresouth.add(ccccaption1,BorderLayout.SOUTH);
            }

        }
        if(currentbutton ==7)
        {
            if(sportscurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(sportscapown , BorderLayout.CENTER);
                centresouth.add(sports1like, BorderLayout.NORTH);
                centresouth.add(sportscaption1,BorderLayout.SOUTH);
            }
            if(sportscurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(sportscapown , BorderLayout.CENTER);
                centresouth.add(sports2like, BorderLayout.NORTH);
                //centresouth.add(sportscaption1,BorderLayout.SOUTH);
            }
            if(sportscurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(sportscapown , BorderLayout.CENTER);
                centresouth.add(sports3like, BorderLayout.NORTH);
                //centresouth.add(sportscaption1,BorderLayout.SOUTH);
            }
        }   

        if(currentbutton ==1)
        {
            if(allcurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(enigmacapown , BorderLayout.CENTER);
                centresouth.add(enigma1like, BorderLayout.NORTH);
                centresouth.add(enigmacaption1,BorderLayout.SOUTH);
            }
            if(allcurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(airocapown , BorderLayout.CENTER);
                centresouth.add(airo2like, BorderLayout.NORTH);
                //centresouth.add(sportscaption1,BorderLayout.SOUTH);
            }
            if(allcurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja3like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(allcurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tyoharcapown , BorderLayout.CENTER);
                centresouth.add(tyohar3like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(allcurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether3like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(allcurrentcard==6)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx3like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
        }   
           

        }
        if(e.getSource()==prev)
        {

            if(aethercurrentcard==1)
            {
                aethercurrentcard=6;
            }
            else if(aethercurrentcard>1)
            {
                aethercurrentcard--;
            }
            
            if(bajacurrentcard==1)
            {
                bajacurrentcard=6;
            }
            else if(bajacurrentcard>1)
            {
                bajacurrentcard--;
            }

            if(airocurrentcard==1)
            {
                airocurrentcard=6;
            }
            else if(airocurrentcard>1)
            {
                airocurrentcard--;
            }

            if(tedxcurrentcard==1)
            {
                tedxcurrentcard=6;
            }
            else if(tedxcurrentcard>1)
            {
                tedxcurrentcard--;
            }

            if(ccccurrentcard==1)
            {
                ccccurrentcard=4;
            }
            else if(ccccurrentcard>1)
            {
                ccccurrentcard--;
            }

            if(enigmacurrentcard==1)
            {
                enigmacurrentcard=5;
            }
            else if(enigmacurrentcard>1)
            {
                enigmacurrentcard--;
            }

            if(sportscurrentcard==1)
            {
                sportscurrentcard=3;
            }
            else if(sportscurrentcard>1)
            {
                sportscurrentcard--;
            }

            if(tyoharcurrentcard==1)
            {
                tyoharcurrentcard=5;
            }
            else if(tyoharcurrentcard>1)
            {
                tyoharcurrentcard--;
            }

            if(eiccurrentcard==1)
            {
                eiccurrentcard=5;
            }
            else if(eiccurrentcard>1)
            {
                eiccurrentcard--;
            }

            if(allcurrentcard==1)
            {
                allcurrentcard=6;
            }
            else if(allcurrentcard>1)
            {
                allcurrentcard--;
            }


            card.previous(claether);
            card.previous(clairo);
            card.previous(clenigma);
            card.previous(cltedx);
            card.previous(cltyohar);
            card.previous(cleic);
            card.previous(clsports);
            card.previous(clccc);
            card.previous(clbaja);
            card.previous(clall);
            
                      
            
            if(currentbutton ==11)
            {            
            if(aethercurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether1like, BorderLayout.NORTH);
                centresouth.add(aethercaption1,BorderLayout.SOUTH);
            }
            if(aethercurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether2like, BorderLayout.NORTH);
                //centresouth.add(aethercaption1,BorderLayout.SOUTH);
            }
            if(aethercurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether3like, BorderLayout.NORTH);
                //centresouth.add(aethercaption1,BorderLayout.SOUTH);
            }
            if(aethercurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether4like, BorderLayout.NORTH);
                //centresouth.add(aethercaption1,BorderLayout.SOUTH);
            }
            if(aethercurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether5like, BorderLayout.NORTH);
                //centresouth.add(aethercaption1,BorderLayout.SOUTH);
            }
            if(aethercurrentcard==6)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether6like, BorderLayout.NORTH);
                //centresouth.add(aethercaption1,BorderLayout.SOUTH);
            }
        }
        if(currentbutton ==4)
        {
            if(bajacurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja1like, BorderLayout.NORTH);
                centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(bajacurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja2like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(bajacurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja3like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(bajacurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja4like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(bajacurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja5like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(bajacurrentcard==6)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja6like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
        }
        if(currentbutton==13)
        {
            if(tedxcurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx1like, BorderLayout.NORTH);
                centresouth.add(tedxcaption1,BorderLayout.SOUTH);
            }
            if(tedxcurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx2like, BorderLayout.NORTH);
                //centresouth.add(tedxcaption1,BorderLayout.SOUTH);
            }
            if(tedxcurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx3like, BorderLayout.NORTH);
                //centresouth.add(tedxcaption1,BorderLayout.SOUTH);
            }
            if(tedxcurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx4like, BorderLayout.NORTH);
                //centresouth.add(tedxcaption1,BorderLayout.SOUTH);
            }
            if(tedxcurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx5like, BorderLayout.NORTH);
                //centresouth.add(tedxcaption1,BorderLayout.SOUTH);
            }
            if(tedxcurrentcard==6)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx6like, BorderLayout.NORTH);
                //centresouth.add(tedxcaption1,BorderLayout.SOUTH);
            }
        }
        if(currentbutton==3)
        {
            if(enigmacurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(enigmacapown , BorderLayout.CENTER);
                centresouth.add(enigma1like, BorderLayout.NORTH);
                centresouth.add(enigmacaption1,BorderLayout.SOUTH);
            }
            if(enigmacurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(enigmacapown , BorderLayout.CENTER);
                centresouth.add(enigma2like, BorderLayout.NORTH);
                //centresouth.add(enigmacaption1,BorderLayout.SOUTH);
            }
            if(enigmacurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(enigmacapown , BorderLayout.CENTER);
                centresouth.add(enigma3like, BorderLayout.NORTH);
                //centresouth.add(enigmacaption1,BorderLayout.SOUTH);
            }
            if(enigmacurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(enigmacapown , BorderLayout.CENTER);
                centresouth.add(enigma4like, BorderLayout.NORTH);
                //centresouth.add(enigmacaption1,BorderLayout.SOUTH);
            }
            if(enigmacurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(enigmacapown , BorderLayout.CENTER);
                centresouth.add(enigma5like, BorderLayout.NORTH);
                //centresouth.add(enigmacaption1,BorderLayout.SOUTH);
            }
        }
        if(currentbutton ==6)
        {
            if(eiccurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(eiccapown , BorderLayout.CENTER);
                centresouth.add(eic1like, BorderLayout.NORTH);
                centresouth.add(eiccaption1,BorderLayout.SOUTH);
            }
            if(eiccurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(eiccapown , BorderLayout.CENTER);
                centresouth.add(eic2like, BorderLayout.NORTH);
                //centresouth.add(eiccaption1,BorderLayout.SOUTH);
            }
            if(eiccurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(eiccapown , BorderLayout.CENTER);
                centresouth.add(eic3like, BorderLayout.NORTH);
                //centresouth.add(eiccaption1,BorderLayout.SOUTH);
            }
            if(eiccurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(eiccapown , BorderLayout.CENTER);
                centresouth.add(eic4like, BorderLayout.NORTH);
                //centresouth.add(eiccaption1,BorderLayout.SOUTH);
            }
            if(eiccurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(eiccapown , BorderLayout.CENTER);
                centresouth.add(eic5like, BorderLayout.NORTH);
                //centresouth.add(eiccaption1,BorderLayout.SOUTH);
            }

        }
        if(currentbutton ==12)
        {
            
            if(airocurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(airocapown , BorderLayout.CENTER);
                centresouth.add(airo1like, BorderLayout.NORTH);
                centresouth.add(airocaption1,BorderLayout.SOUTH);
            }
            if(airocurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(airocapown , BorderLayout.CENTER);
                centresouth.add(airo2like, BorderLayout.NORTH);
                //centresouth.add(airocaption1,BorderLayout.SOUTH);
            }
            if(airocurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(airocapown , BorderLayout.CENTER);
                centresouth.add(airo3like, BorderLayout.NORTH);
                //centresouth.add(airocaption1,BorderLayout.SOUTH);
            }
            if(airocurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(airocapown , BorderLayout.CENTER);
                centresouth.add(airo4like, BorderLayout.NORTH);
                //centresouth.add(airocaption1,BorderLayout.SOUTH);
            }
            if(airocurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(airocapown , BorderLayout.CENTER);
                centresouth.add(airo5like, BorderLayout.NORTH);
                //centresouth.add(airocaption1,BorderLayout.SOUTH);
            }
        }
        if(currentbutton ==14)
        {
            if(tyoharcurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tyoharcapown , BorderLayout.CENTER);
                centresouth.add(tyohar1like, BorderLayout.NORTH);
                centresouth.add(tyoharcaption1,BorderLayout.SOUTH);
            }
            if(tyoharcurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tyoharcapown , BorderLayout.CENTER);
                centresouth.add(tyohar2like, BorderLayout.NORTH);
                //centresouth.add(tyoharcaption1,BorderLayout.SOUTH);
            }
            if(tyoharcurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tyoharcapown , BorderLayout.CENTER);
                centresouth.add(tyohar3like, BorderLayout.NORTH);
                //centresouth.add(tyoharcaption1,BorderLayout.SOUTH);
            }
            if(tyoharcurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tyoharcapown , BorderLayout.CENTER);
                centresouth.add(tyohar4like, BorderLayout.NORTH);
                //centresouth.add(tyoharcaption1,BorderLayout.SOUTH);
            }
            if(tyoharcurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tyoharcapown , BorderLayout.CENTER);
                centresouth.add(tyohar5like, BorderLayout.NORTH);
                //centresouth.add(tyoharcaption1,BorderLayout.SOUTH);
            }
        }
        if(currentbutton==15)
        {   
            if(ccccurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(ccccapown , BorderLayout.CENTER);
                centresouth.add(ccc1like, BorderLayout.NORTH);
                centresouth.add(ccccaption1,BorderLayout.SOUTH);
            }
            if(ccccurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(ccccapown , BorderLayout.CENTER);
                centresouth.add(ccc2like, BorderLayout.NORTH);
                //centresouth.add(ccccaption1,BorderLayout.SOUTH);
            }
            if(ccccurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(ccccapown , BorderLayout.CENTER);
                centresouth.add(ccc3like, BorderLayout.NORTH);
                //centresouth.add(ccccaption1,BorderLayout.SOUTH);
            }
            if(ccccurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(ccccapown , BorderLayout.CENTER);
                centresouth.add(ccc4like, BorderLayout.NORTH);
                //centresouth.add(ccccaption1,BorderLayout.SOUTH);
            }

        }
        if(currentbutton ==7)
        {
            if(sportscurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(sportscapown , BorderLayout.CENTER);
                centresouth.add(sports1like, BorderLayout.NORTH);
                centresouth.add(sportscaption1,BorderLayout.SOUTH);
            }
            if(sportscurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(sportscapown , BorderLayout.CENTER);
                centresouth.add(sports2like, BorderLayout.NORTH);
                //centresouth.add(sportscaption1,BorderLayout.SOUTH);
            }
            if(sportscurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(sportscapown , BorderLayout.CENTER);
                centresouth.add(sports3like, BorderLayout.NORTH);
                //centresouth.add(sportscaption1,BorderLayout.SOUTH);
            }
        } 
        if(currentbutton ==1)
        {
            if(allcurrentcard==1)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(enigmacapown , BorderLayout.CENTER);
                centresouth.add(enigma1like, BorderLayout.NORTH);
                centresouth.add(enigmacaption1,BorderLayout.SOUTH);
            }
            if(allcurrentcard==2)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(airocapown , BorderLayout.CENTER);
                centresouth.add(airo2like, BorderLayout.NORTH);
                //centresouth.add(sportscaption1,BorderLayout.SOUTH);
            }
            if(allcurrentcard==3)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(bajacapown , BorderLayout.CENTER);
                centresouth.add(baja3like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(allcurrentcard==4)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tyoharcapown , BorderLayout.CENTER);
                centresouth.add(tyohar3like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(allcurrentcard==5)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(aethercapown , BorderLayout.CENTER);
                centresouth.add(aether3like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
            if(allcurrentcard==6)
            {
                centresouth.repaint();
                centresouth.revalidate();
                centresouth.removeAll();
                centresouth.add(tedxcapown , BorderLayout.CENTER);
                centresouth.add(tedx3like, BorderLayout.NORTH);
                //centresouth.add(bajacaption1,BorderLayout.SOUTH);
            }
        }   
             
        }
        if(e.getSource()==aether1like )
        {
            if(aether1like.isSelected())
            {
                aether1like.setIcon(interested);
                aether1like.setToolTipText("interested");
                aether1likecount = Integer.parseInt(aether1like.getText());
                ++aether1likecount;
                aether1like.setText(Integer.toString(aether1likecount));

                //aether1check=aether1check+1;
            }
            else
            {
                aether1like.setIcon(uninterested);
                aether1like.setToolTipText("not interested");
                aether1likecount = Integer.parseInt(aether1like.getText());
                --aether1likecount;
                aether1like.setText(Integer.toString(aether1likecount));
            }
        
        }
        if(e.getSource()==aether2like )
        {
            if(aether2like.isSelected())
            {
                aether2like.setIcon(interested);
                aether2like.setToolTipText("interested");
                aether2likecount = Integer.parseInt(aether2like.getText());
                ++aether2likecount;
                aether2like.setText(Integer.toString(aether2likecount));

                //aether1check=aether1check+1;
            }
            else
            {
                aether2like.setIcon(uninterested);
                aether2like.setToolTipText("not interested");
                aether2likecount = Integer.parseInt(aether2like.getText());
                --aether2likecount;
                aether2like.setText(Integer.toString(aether2likecount));
            }
        
        }
        if(e.getSource()==aether3like )
        {
            if(aether3like.isSelected())
            {
                aether3like.setIcon(interested);
                aether3like.setToolTipText("interested");
                aether3likecount = Integer.parseInt(aether3like.getText());
                ++aether3likecount;
                aether3like.setText(Integer.toString(aether3likecount));

                //aether1check=aether1check+1;
            }
            else
            {
                aether3like.setIcon(uninterested);
                aether3like.setToolTipText("not interested");
                aether3likecount = Integer.parseInt(aether3like.getText());
                --aether3likecount;
                aether3like.setText(Integer.toString(aether3likecount));
            }
        
        }
        if(e.getSource()==aether4like )
        {
            if(aether4like.isSelected())
            {
                aether4like.setIcon(interested);
                aether4like.setToolTipText("interested");
                aether4likecount = Integer.parseInt(aether4like.getText());
                ++aether4likecount;
                aether4like.setText(Integer.toString(aether4likecount));

                //aether1check=aether1check+1;
            }
            else
            {
                aether4like.setIcon(uninterested);
                aether4like.setToolTipText("not interested");
                aether4likecount = Integer.parseInt(aether4like.getText());
                --aether4likecount;
                aether4like.setText(Integer.toString(aether4likecount));
            }
        
        }
        if(e.getSource()==aether5like )
        {
            if(aether5like.isSelected())
            {
                aether5like.setIcon(interested);
                aether5like.setToolTipText("interested");
                aether5likecount = Integer.parseInt(aether5like.getText());
                ++aether5likecount;
                aether5like.setText(Integer.toString(aether5likecount));

                //aether1check=aether1check+1;
            }
            else
            {
                aether5like.setIcon(uninterested);
                aether5like.setToolTipText("not interested");
                aether5likecount = Integer.parseInt(aether5like.getText());
                --aether5likecount;
                aether5like.setText(Integer.toString(aether5likecount));
            }
        
        }
        if(e.getSource()==aether6like )
        {
            if(aether6like.isSelected())
            {
                aether6like.setIcon(interested);
                aether6like.setToolTipText("interested");
                aether6likecount = Integer.parseInt(aether6like.getText());
                ++aether6likecount;
                aether6like.setText(Integer.toString(aether6likecount));

                //aether1check=aether1check+1;
            }
            else
            {
                aether6like.setIcon(uninterested);
                aether6like.setToolTipText("not interested");
                aether6likecount = Integer.parseInt(aether6like.getText());
                --aether6likecount;
                aether6like.setText(Integer.toString(aether6likecount));
            }
        
        }

        if(e.getSource()==tedx1like )
        {
            if(tedx1like.isSelected())
            {
                tedx1like.setIcon(interested);
                tedx1like.setToolTipText("interested");
                tedx1likecount = Integer.parseInt(tedx1like.getText());
                ++tedx1likecount;
                tedx1like.setText(Integer.toString(tedx1likecount));

                //tedx1check=tedx1check+1;
            }
            else
            {
                tedx1like.setIcon(uninterested);
                tedx1like.setToolTipText("not interested");
                tedx1likecount = Integer.parseInt(tedx1like.getText());
                --tedx1likecount;
                tedx1like.setText(Integer.toString(tedx1likecount));
            }
        
        }
        if(e.getSource()==tedx2like )
        {
            if(tedx2like.isSelected())
            {
                tedx2like.setIcon(interested);
                tedx2like.setToolTipText("interested");
                tedx2likecount = Integer.parseInt(tedx2like.getText());
                ++tedx2likecount;
                tedx2like.setText(Integer.toString(tedx2likecount));

                //tedx1check=tedx1check+1;
            }
            else
            {
                tedx2like.setIcon(uninterested);
                tedx2like.setToolTipText("not interested");
                tedx2likecount = Integer.parseInt(tedx2like.getText());
                --tedx2likecount;
                tedx2like.setText(Integer.toString(tedx2likecount));
            }
        
        }
        if(e.getSource()==tedx3like )
        {
            if(tedx3like.isSelected())
            {
                tedx3like.setIcon(interested);
                tedx3like.setToolTipText("interested");
                tedx3likecount = Integer.parseInt(tedx3like.getText());
                ++tedx3likecount;
                tedx3like.setText(Integer.toString(tedx3likecount));

                //tedx1check=tedx1check+1;
            }
            else
            {
                tedx3like.setIcon(uninterested);
                tedx3like.setToolTipText("not interested");
                tedx3likecount = Integer.parseInt(tedx3like.getText());
                --tedx3likecount;
                tedx3like.setText(Integer.toString(tedx3likecount));
            }
        
        }
        if(e.getSource()==tedx4like )
        {
            if(tedx4like.isSelected())
            {
                tedx4like.setIcon(interested);
                tedx4like.setToolTipText("interested");
                tedx4likecount = Integer.parseInt(tedx4like.getText());
                ++tedx4likecount;
                tedx4like.setText(Integer.toString(tedx4likecount));

                //tedx1check=tedx1check+1;
            }
            else
            {
                tedx4like.setIcon(uninterested);
                tedx4like.setToolTipText("not interested");
                tedx4likecount = Integer.parseInt(tedx4like.getText());
                --tedx4likecount;
                tedx4like.setText(Integer.toString(tedx4likecount));
            }
        
        }
        if(e.getSource()==tedx5like )
        {
            if(tedx5like.isSelected())
            {
                tedx5like.setIcon(interested);
                tedx5like.setToolTipText("interested");
                tedx5likecount = Integer.parseInt(tedx5like.getText());
                ++tedx5likecount;
                tedx5like.setText(Integer.toString(tedx5likecount));

                //tedx1check=tedx1check+1;
            }
            else
            {
                tedx5like.setIcon(uninterested);
                tedx5like.setToolTipText("not interested");
                tedx5likecount = Integer.parseInt(tedx5like.getText());
                --tedx5likecount;
                tedx5like.setText(Integer.toString(tedx5likecount));
            }
        
        }
        if(e.getSource()==tedx6like )
        {
            if(tedx6like.isSelected())
            {
                tedx6like.setIcon(interested);
                tedx6like.setToolTipText("interested");
                tedx6likecount = Integer.parseInt(tedx6like.getText());
                ++tedx6likecount;
                tedx6like.setText(Integer.toString(tedx6likecount));

                //tedx1check=tedx1check+1;
            }
            else
            {
                tedx6like.setIcon(uninterested);
                tedx6like.setToolTipText("not interested");
                tedx6likecount = Integer.parseInt(tedx6like.getText());
                --tedx6likecount;
                tedx6like.setText(Integer.toString(tedx6likecount));
            }
        
        }

        if(e.getSource()==baja1like )
        {
            if(baja1like.isSelected())
            {
                baja1like.setIcon(interested);
                baja1like.setToolTipText("interested");
                baja1likecount = Integer.parseInt(baja1like.getText());
                ++baja1likecount;
                baja1like.setText(Integer.toString(baja1likecount));

                //baja1check=baja1check+1;
            }
            else
            {
                baja1like.setIcon(uninterested);
                baja1like.setToolTipText("not interested");
                baja1likecount = Integer.parseInt(baja1like.getText());
                --baja1likecount;
                baja1like.setText(Integer.toString(baja1likecount));
            }
        
        }
        if(e.getSource()==baja2like )
        {
            if(baja2like.isSelected())
            {
                baja2like.setIcon(interested);
                baja2like.setToolTipText("interested");
                baja2likecount = Integer.parseInt(baja2like.getText());
                ++baja2likecount;
                baja2like.setText(Integer.toString(baja2likecount));

                //baja1check=baja1check+1;
            }
            else
            {
                baja2like.setIcon(uninterested);
                baja2like.setToolTipText("not interested");
                baja2likecount = Integer.parseInt(baja2like.getText());
                --baja2likecount;
                baja2like.setText(Integer.toString(baja2likecount));
            }
        
        }
        if(e.getSource()==baja3like )
        {
            if(baja3like.isSelected())
            {
                baja3like.setIcon(interested);
                baja3like.setToolTipText("interested");
                baja3likecount = Integer.parseInt(baja3like.getText());
                ++baja3likecount;
                baja3like.setText(Integer.toString(baja3likecount));

                //baja1check=baja1check+1;
            }
            else
            {
                baja3like.setIcon(uninterested);
                baja3like.setToolTipText("not interested");
                baja3likecount = Integer.parseInt(baja3like.getText());
                --baja3likecount;
                baja3like.setText(Integer.toString(baja3likecount));
            }
        
        }
        if(e.getSource()==baja4like )
        {
            if(baja4like.isSelected())
            {
                baja4like.setIcon(interested);
                baja4like.setToolTipText("interested");
                baja4likecount = Integer.parseInt(baja4like.getText());
                ++baja4likecount;
                baja4like.setText(Integer.toString(baja4likecount));

                //baja1check=baja1check+1;
            }
            else
            {
                baja4like.setIcon(uninterested);
                baja4like.setToolTipText("not interested");
                baja4likecount = Integer.parseInt(baja4like.getText());
                --baja4likecount;
                baja4like.setText(Integer.toString(baja4likecount));
            }
        
        }
        if(e.getSource()==baja5like )
        {
            if(baja5like.isSelected())
            {
                baja5like.setIcon(interested);
                baja5like.setToolTipText("interested");
                baja5likecount = Integer.parseInt(baja5like.getText());
                ++baja5likecount;
                baja5like.setText(Integer.toString(baja5likecount));

                //baja1check=baja1check+1;
            }
            else
            {
                baja5like.setIcon(uninterested);
                baja5like.setToolTipText("not interested");
                baja5likecount = Integer.parseInt(baja5like.getText());
                --baja5likecount;
                baja5like.setText(Integer.toString(baja5likecount));
            }
        
        }
        if(e.getSource()==baja6like )
        {
            if(baja6like.isSelected())
            {
                baja6like.setIcon(interested);
                baja6like.setToolTipText("interested");
                baja6likecount = Integer.parseInt(baja6like.getText());
                ++baja6likecount;
                baja6like.setText(Integer.toString(baja6likecount));

                //baja1check=baja1check+1;
            }
            else
            {
                baja6like.setIcon(uninterested);
                baja6like.setToolTipText("not interested");
                baja6likecount = Integer.parseInt(baja6like.getText());
                --baja6likecount;
                baja6like.setText(Integer.toString(baja6likecount));
            }
        
        }

        if(e.getSource()==enigma1like )
        {
            if(enigma1like.isSelected())
            {
                enigma1like.setIcon(interested);
                enigma1like.setToolTipText("interested");
                enigma1likecount = Integer.parseInt(enigma1like.getText());
                ++enigma1likecount;
                enigma1like.setText(Integer.toString(enigma1likecount));

                //enigma1check=enigma1check+1;
            }
            else
            {
                enigma1like.setIcon(uninterested);
                enigma1like.setToolTipText("not interested");
                enigma1likecount = Integer.parseInt(enigma1like.getText());
                --enigma1likecount;
                enigma1like.setText(Integer.toString(enigma1likecount));
            }
        
        }
        if(e.getSource()==enigma2like )
        {
            if(enigma2like.isSelected())
            {
                enigma2like.setIcon(interested);
                enigma2like.setToolTipText("interested");
                enigma2likecount = Integer.parseInt(enigma2like.getText());
                ++enigma2likecount;
                enigma2like.setText(Integer.toString(enigma2likecount));

                //enigma1check=enigma1check+1;
            }
            else
            {
                enigma2like.setIcon(uninterested);
                enigma2like.setToolTipText("not interested");
                enigma2likecount = Integer.parseInt(enigma2like.getText());
                --enigma2likecount;
                enigma2like.setText(Integer.toString(enigma2likecount));
            }
        
        }
        if(e.getSource()==enigma3like )
        {
            if(enigma3like.isSelected())
            {
                enigma3like.setIcon(interested);
                enigma3like.setToolTipText("interested");
                enigma3likecount = Integer.parseInt(enigma3like.getText());
                ++enigma3likecount;
                enigma3like.setText(Integer.toString(enigma3likecount));

                //enigma1check=enigma1check+1;
            }
            else
            {
                enigma3like.setIcon(uninterested);
                enigma3like.setToolTipText("not interested");
                enigma3likecount = Integer.parseInt(enigma3like.getText());
                --enigma3likecount;
                enigma3like.setText(Integer.toString(enigma3likecount));
            }
        
        }
        if(e.getSource()==enigma4like )
        {
            if(enigma4like.isSelected())
            {
                enigma4like.setIcon(interested);
                enigma4like.setToolTipText("interested");
                enigma4likecount = Integer.parseInt(enigma4like.getText());
                ++enigma4likecount;
                enigma4like.setText(Integer.toString(enigma4likecount));

                //enigma1check=enigma1check+1;
            }
            else
            {
                enigma4like.setIcon(uninterested);
                enigma4like.setToolTipText("not interested");
                enigma4likecount = Integer.parseInt(enigma4like.getText());
                --enigma4likecount;
                enigma4like.setText(Integer.toString(enigma4likecount));
            }
        
        }
        if(e.getSource()==enigma5like )
        {
            if(enigma5like.isSelected())
            {
                enigma5like.setIcon(interested);
                enigma5like.setToolTipText("interested");
                enigma5likecount = Integer.parseInt(enigma5like.getText());
                ++enigma5likecount;
                enigma5like.setText(Integer.toString(enigma5likecount));

                //enigma1check=enigma1check+1;
            }
            else
            {
                enigma5like.setIcon(uninterested);
                enigma5like.setToolTipText("not interested");
                enigma5likecount = Integer.parseInt(enigma5like.getText());
                --enigma5likecount;
                enigma5like.setText(Integer.toString(enigma5likecount));
            }
        
        }

        
        if(e.getSource()==eic1like )
        {
            if(eic1like.isSelected())
            {
                eic1like.setIcon(interested);
                eic1like.setToolTipText("interested");
                eic1likecount = Integer.parseInt(eic1like.getText());
                ++eic1likecount;
                eic1like.setText(Integer.toString(eic1likecount));

                //eic1check=eic1check+1;
            }
            else
            {
                eic1like.setIcon(uninterested);
                eic1like.setToolTipText("not interested");
                eic1likecount = Integer.parseInt(eic1like.getText());
                --eic1likecount;
                eic1like.setText(Integer.toString(eic1likecount));
            }
        
        }
        if(e.getSource()==eic2like )
        {
            if(eic2like.isSelected())
            {
                eic2like.setIcon(interested);
                eic2like.setToolTipText("interested");
                eic2likecount = Integer.parseInt(eic2like.getText());
                ++eic2likecount;
                eic2like.setText(Integer.toString(eic2likecount));

                //eic1check=eic1check+1;
            }
            else
            {
                eic2like.setIcon(uninterested);
                eic2like.setToolTipText("not interested");
                eic2likecount = Integer.parseInt(eic2like.getText());
                --eic2likecount;
                eic2like.setText(Integer.toString(eic2likecount));
            }
        
        }
        if(e.getSource()==eic3like )
        {
            if(eic3like.isSelected())
            {
                eic3like.setIcon(interested);
                eic3like.setToolTipText("interested");
                eic3likecount = Integer.parseInt(eic3like.getText());
                ++eic3likecount;
                eic3like.setText(Integer.toString(eic3likecount));

                //eic1check=eic1check+1;
            }
            else
            {
                eic3like.setIcon(uninterested);
                eic3like.setToolTipText("not interested");
                eic3likecount = Integer.parseInt(eic3like.getText());
                --eic3likecount;
                eic3like.setText(Integer.toString(eic3likecount));
            }
        
        }
        if(e.getSource()==eic4like )
        {
            if(eic4like.isSelected())
            {
                eic4like.setIcon(interested);
                eic4like.setToolTipText("interested");
                eic4likecount = Integer.parseInt(eic4like.getText());
                ++eic4likecount;
                eic4like.setText(Integer.toString(eic4likecount));

                //eic1check=eic1check+1;
            }
            else
            {
                eic4like.setIcon(uninterested);
                eic4like.setToolTipText("not interested");
                eic4likecount = Integer.parseInt(eic4like.getText());
                --eic4likecount;
                eic4like.setText(Integer.toString(eic4likecount));
            }
        
        }
        if(e.getSource()==eic5like )
        {
            if(eic5like.isSelected())
            {
                eic5like.setIcon(interested);
                eic5like.setToolTipText("interested");
                eic5likecount = Integer.parseInt(eic5like.getText());
                ++eic5likecount;
                eic5like.setText(Integer.toString(eic5likecount));

                //eic1check=eic1check+1;
            }
            else
            {
                eic5like.setIcon(uninterested);
                eic5like.setToolTipText("not interested");
                eic5likecount = Integer.parseInt(eic5like.getText());
                --eic5likecount;
                eic5like.setText(Integer.toString(eic5likecount));
            }
        
        }

        
        if(e.getSource()==tyohar1like )
        {
            if(tyohar1like.isSelected())
            {
                tyohar1like.setIcon(interested);
                tyohar1like.setToolTipText("interested");
                tyohar1likecount = Integer.parseInt(tyohar1like.getText());
                ++tyohar1likecount;
                tyohar1like.setText(Integer.toString(tyohar1likecount));

                //tyohar1check=tyohar1check+1;
            }
            else
            {
                tyohar1like.setIcon(uninterested);
                tyohar1like.setToolTipText("not interested");
                tyohar1likecount = Integer.parseInt(tyohar1like.getText());
                --tyohar1likecount;
                tyohar1like.setText(Integer.toString(tyohar1likecount));
            }
        
        }
        if(e.getSource()==tyohar2like )
        {
            if(tyohar2like.isSelected())
            {
                tyohar2like.setIcon(interested);
                tyohar2like.setToolTipText("interested");
                tyohar2likecount = Integer.parseInt(tyohar2like.getText());
                ++tyohar2likecount;
                tyohar2like.setText(Integer.toString(tyohar2likecount));

                //tyohar1check=tyohar1check+1;
            }
            else
            {
                tyohar2like.setIcon(uninterested);
                tyohar2like.setToolTipText("not interested");
                tyohar2likecount = Integer.parseInt(tyohar2like.getText());
                --tyohar2likecount;
                tyohar2like.setText(Integer.toString(tyohar2likecount));
            }
        
        }
        if(e.getSource()==tyohar3like )
        {
            if(tyohar3like.isSelected())
            {
                tyohar3like.setIcon(interested);
                tyohar3like.setToolTipText("interested");
                tyohar3likecount = Integer.parseInt(tyohar3like.getText());
                ++tyohar3likecount;
                tyohar3like.setText(Integer.toString(tyohar3likecount));

                //tyohar1check=tyohar1check+1;
            }
            else
            {
                tyohar3like.setIcon(uninterested);
                tyohar3like.setToolTipText("not interested");
                tyohar3likecount = Integer.parseInt(tyohar3like.getText());
                --tyohar3likecount;
                tyohar3like.setText(Integer.toString(tyohar3likecount));
            }
        
        }
        if(e.getSource()==tyohar4like )
        {
            if(tyohar4like.isSelected())
            {
                tyohar4like.setIcon(interested);
                tyohar4like.setToolTipText("interested");
                tyohar4likecount = Integer.parseInt(tyohar4like.getText());
                ++tyohar4likecount;
                tyohar4like.setText(Integer.toString(tyohar4likecount));

                //tyohar1check=tyohar1check+1;
            }
            else
            {
                tyohar4like.setIcon(uninterested);
                tyohar4like.setToolTipText("not interested");
                tyohar4likecount = Integer.parseInt(tyohar4like.getText());
                --tyohar4likecount;
                tyohar4like.setText(Integer.toString(tyohar4likecount));
            }
        
        }
        if(e.getSource()==tyohar5like )
        {
            if(tyohar5like.isSelected())
            {
                tyohar5like.setIcon(interested);
                tyohar5like.setToolTipText("interested");
                tyohar5likecount = Integer.parseInt(tyohar5like.getText());
                ++tyohar5likecount;
                tyohar5like.setText(Integer.toString(tyohar5likecount));

                //tyohar1check=tyohar1check+1;
            }
            else
            {
                tyohar5like.setIcon(uninterested);
                tyohar5like.setToolTipText("not interested");
                tyohar5likecount = Integer.parseInt(tyohar5like.getText());
                --tyohar5likecount;
                tyohar5like.setText(Integer.toString(tyohar5likecount));
            }
        
        }

        
        if(e.getSource()==airo1like )
        {
            if(airo1like.isSelected())
            {
                airo1like.setIcon(interested);
                airo1like.setToolTipText("interested");
                airo1likecount = Integer.parseInt(airo1like.getText());
                ++airo1likecount;
                airo1like.setText(Integer.toString(airo1likecount));

                //airo1check=airo1check+1;
            }
            else
            {
                airo1like.setIcon(uninterested);
                airo1like.setToolTipText("not interested");
                airo1likecount = Integer.parseInt(airo1like.getText());
                --airo1likecount;
                airo1like.setText(Integer.toString(airo1likecount));
            }
        
        }
        if(e.getSource()==airo2like )
        {
            if(airo2like.isSelected())
            {
                airo2like.setIcon(interested);
                airo2like.setToolTipText("interested");
                airo2likecount = Integer.parseInt(airo2like.getText());
                ++airo2likecount;
                airo2like.setText(Integer.toString(airo2likecount));

                //airo1check=airo1check+1;
            }
            else
            {
                airo2like.setIcon(uninterested);
                airo2like.setToolTipText("not interested");
                airo2likecount = Integer.parseInt(airo2like.getText());
                --airo2likecount;
                airo2like.setText(Integer.toString(airo2likecount));
            }
        
        }
        if(e.getSource()==airo3like )
        {
            if(airo3like.isSelected())
            {
                airo3like.setIcon(interested);
                airo3like.setToolTipText("interested");
                airo3likecount = Integer.parseInt(airo3like.getText());
                ++airo3likecount;
                airo3like.setText(Integer.toString(airo3likecount));

                //airo1check=airo1check+1;
            }
            else
            {
                airo3like.setIcon(uninterested);
                airo3like.setToolTipText("not interested");
                airo3likecount = Integer.parseInt(airo3like.getText());
                --airo3likecount;
                airo3like.setText(Integer.toString(airo3likecount));
            }
        
        }
        if(e.getSource()==airo4like )
        {
            if(airo4like.isSelected())
            {
                airo4like.setIcon(interested);
                airo4like.setToolTipText("interested");
                airo4likecount = Integer.parseInt(airo4like.getText());
                ++airo4likecount;
                airo4like.setText(Integer.toString(airo4likecount));

                //airo1check=airo1check+1;
            }
            else
            {
                airo4like.setIcon(uninterested);
                airo4like.setToolTipText("not interested");
                airo4likecount = Integer.parseInt(airo4like.getText());
                --airo4likecount;
                airo4like.setText(Integer.toString(airo4likecount));
            }
        
        }
        if(e.getSource()==airo5like )
        {
            if(airo5like.isSelected())
            {
                airo5like.setIcon(interested);
                airo5like.setToolTipText("interested");
                airo5likecount = Integer.parseInt(airo5like.getText());
                ++airo5likecount;
                airo5like.setText(Integer.toString(airo5likecount));

                //airo1check=airo1check+1;
            }
            else
            {
                airo5like.setIcon(uninterested);
                airo5like.setToolTipText("not interested");
                airo5likecount = Integer.parseInt(airo5like.getText());
                --airo5likecount;
                airo5like.setText(Integer.toString(airo5likecount));
            }
        
        }
       
        
        if(e.getSource()==ccc1like )
        {
            if(ccc1like.isSelected())
            {
                ccc1like.setIcon(interested);
                ccc1like.setToolTipText("interested");
                ccc1likecount = Integer.parseInt(ccc1like.getText());
                ++ccc1likecount;
                ccc1like.setText(Integer.toString(ccc1likecount));

                //ccc1check=ccc1check+1;
            }
            else
            {
                ccc1like.setIcon(uninterested);
                ccc1like.setToolTipText("not interested");
                ccc1likecount = Integer.parseInt(ccc1like.getText());
                --ccc1likecount;
                ccc1like.setText(Integer.toString(ccc1likecount));
            }
        
        }
        if(e.getSource()==ccc2like )
        {
            if(ccc2like.isSelected())
            {
                ccc2like.setIcon(interested);
                ccc2like.setToolTipText("interested");
                ccc2likecount = Integer.parseInt(ccc2like.getText());
                ++ccc2likecount;
                ccc2like.setText(Integer.toString(ccc2likecount));

                //ccc1check=ccc1check+1;
            }
            else
            {
                ccc2like.setIcon(uninterested);
                ccc2like.setToolTipText("not interested");
                ccc2likecount = Integer.parseInt(ccc2like.getText());
                --ccc2likecount;
                ccc2like.setText(Integer.toString(ccc2likecount));
            }
        
        }
        if(e.getSource()==ccc3like )
        {
            if(ccc3like.isSelected())
            {
                ccc3like.setIcon(interested);
                ccc3like.setToolTipText("interested");
                ccc3likecount = Integer.parseInt(ccc3like.getText());
                ++ccc3likecount;
                ccc3like.setText(Integer.toString(ccc3likecount));

                //ccc1check=ccc1check+1;
            }
            else
            {
                ccc3like.setIcon(uninterested);
                ccc3like.setToolTipText("not interested");
                ccc3likecount = Integer.parseInt(ccc3like.getText());
                --ccc3likecount;
                ccc3like.setText(Integer.toString(ccc3likecount));
            }
        
        }
        if(e.getSource()==ccc4like )
        {
            if(ccc4like.isSelected())
            {
                ccc4like.setIcon(interested);
                ccc4like.setToolTipText("interested");
                ccc4likecount = Integer.parseInt(ccc4like.getText());
                ++ccc4likecount;
                ccc4like.setText(Integer.toString(ccc4likecount));

                //ccc1check=ccc1check+1;
            }
            else
            {
                ccc4like.setIcon(uninterested);
                ccc4like.setToolTipText("not interested");
                ccc4likecount = Integer.parseInt(ccc4like.getText());
                --ccc4likecount;
                ccc4like.setText(Integer.toString(ccc4likecount));
            }
        
        }

        
        if(e.getSource()==sports1like )
        {
            if(sports1like.isSelected())
            {
                sports1like.setIcon(interested);
                sports1like.setToolTipText("interested");
                sports1likecount = Integer.parseInt(sports1like.getText());
                ++sports1likecount;
                sports1like.setText(Integer.toString(sports1likecount));

                //sports1check=sports1check+1;
            }
            else
            {
                sports1like.setIcon(uninterested);
                sports1like.setToolTipText("not interested");
                sports1likecount = Integer.parseInt(sports1like.getText());
                --sports1likecount;
                sports1like.setText(Integer.toString(sports1likecount));
            }
        
        }
        if(e.getSource()==sports2like )
        {
            if(sports2like.isSelected())
            {
                sports2like.setIcon(interested);
                sports2like.setToolTipText("interested");
                sports2likecount = Integer.parseInt(sports2like.getText());
                ++sports2likecount;
                sports2like.setText(Integer.toString(sports2likecount));

                //sports1check=sports1check+1;
            }
            else
            {
                sports2like.setIcon(uninterested);
                sports2like.setToolTipText("not interested");
                sports2likecount = Integer.parseInt(sports2like.getText());
                --sports2likecount;
                sports2like.setText(Integer.toString(sports2likecount));
            }
        
        }
        if(e.getSource()==sports3like )
        {
            if(sports3like.isSelected())
            {
                sports3like.setIcon(interested);
                sports3like.setToolTipText("interested");
                sports3likecount = Integer.parseInt(sports3like.getText());
                ++sports3likecount;
                sports3like.setText(Integer.toString(sports3likecount));

                //sports1check=sports1check+1;
            }
            else
            {
                sports3like.setIcon(uninterested);
                sports3like.setToolTipText("not interested");
                sports3likecount = Integer.parseInt(sports3like.getText());
                --sports3likecount;
                sports3like.setText(Integer.toString(sports3likecount));
            }
        
        }
        
          

    }
    public void mouseClicked(MouseEvent e)
    {
        if(e.getSource()==aetherfirst)
        {
            card.show(claether,"1");
            aethercurrentcard=1;
            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(aethercapown , BorderLayout.CENTER);
            centresouth.add(aether1like, BorderLayout.NORTH);
            centresouth.add(aethercaption1,BorderLayout.SOUTH);
        
        }
        if(e.getSource()==aethersecond)
        {
            card.show(claether,"2");
            aethercurrentcard=2;
            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(aethercapown , BorderLayout.CENTER);
            centresouth.add(aether2like, BorderLayout.NORTH);
            //centresouth.add(aethercaption2,BorderLayout.SOUTH);
        

        }
        if(e.getSource()==aetherthird)
        {
            card.show(claether,"3");
            aethercurrentcard=3;
            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(aethercapown , BorderLayout.CENTER);
            centresouth.add(aether3like, BorderLayout.NORTH);
            //centresouth.add(aethercaption3,BorderLayout.SOUTH);

        }
        if(e.getSource()==aetherfourth)
        {
            card.show(claether,"4");
            aethercurrentcard=4;
            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(aethercapown , BorderLayout.CENTER);
            centresouth.add(aether4like, BorderLayout.NORTH);
            //centresouth.add(aethercaption4,BorderLayout.SOUTH);

        }
        if(e.getSource()==aetherfifth)
        {
            card.show(claether,"5");
            aethercurrentcard=5;
            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(aethercapown , BorderLayout.CENTER);
            centresouth.add(aether5like, BorderLayout.NORTH);
            //centresouth.add(aethercaption5,BorderLayout.SOUTH);

        }
        if(e.getSource()==aethersixth)
        {
            card.show(claether,"6");
            aethercurrentcard=6;
            centresouth.repaint();
            centresouth.revalidate();
            centresouth.removeAll();
            centresouth.add(aethercapown , BorderLayout.CENTER);
            centresouth.add(aether6like, BorderLayout.NORTH);
            //centresouth.add(aethercaption6,BorderLayout.SOUTH);

        }
        
    }
    public void mousePressed(MouseEvent e) 
    { 
  
    }
    public void mouseReleased(MouseEvent e) 
    { 
  
    } 
    public void mouseExited(MouseEvent e) 
    { 
  
    } 
    public void mouseEntered(MouseEvent e) 
    { 
       
    } 
    public static void main(String args[])
    {
        home obj = new home();
    }

}

class Imagemenu extends JMenuBar {

    private Image img;
  
    public Imagemenu(String img) {
      this(new ImageIcon(img).getImage());
    }
  
    public Imagemenu(Image img) {
      this.img = img;
     // this.img  = img.getScaledInstance(xSize, ySize,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
         
       // JLabel imgLabel2 = new JLabel(new ImageIcon(newimg2));ds(0, 0, xSize, ySize);
        
     /* Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
      setPreferredSize(size);
      setMinimumSize(size);
      setMaximumSize(size);
      setSize(size);
      setLayout(null);*/
    }
  
    public void paintComponent(Graphics g) {
      g.drawImage(img, 0, 0, null);
    }
  
  }

class galleryimg extends JLabel
{
    galleryimg(String s)
    {
        ImageIcon imageIcon115 = new ImageIcon(s); // load the image to a imageIcon
        Image image115 = imageIcon115.getImage(); // transform it 
        Image newimg115 = image115.getScaledInstance(95,95,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        this.setIcon(new ImageIcon(newimg115));        
    }
}

class slideshowimg extends JLabel
{
    slideshowimg(String s)
    {
        ImageIcon imageIcon116 = new ImageIcon(s); // load the image to a imageIcon
        Image image116 = imageIcon116.getImage(); // transform it 
        Image newimg116 = image116.getScaledInstance(650,500,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        this.setIcon(new ImageIcon(newimg116));        
    }
}

class interestbutton extends JCheckBox
{
    interestbutton(String state , ImageIcon i)
    {
        super(state, i);
        setBorderPainted(false);
        setToolTipText("not interested");
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
  