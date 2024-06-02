package taskmanagementsoftware;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstFrame implements ActionListener{
    //image icons have been created for the background and UI Card i.e. login card
    ImageIcon bg = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\bg.png");
    ImageIcon uicard = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\UIcard.png");
    ImageIcon logo = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\logo.png");
    ImageIcon frameicon = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\ICON.png");
    
    JFrame first_frame = new JFrame();
    
    //3 labels created to display background, Login card, Login heading text
    JLabel bgLabel;
    JLabel UIcard;
    JLabel login;
    JLabel logolabel;
    
    //Text displayed on the left side in larger font
    JLabel display_text1;
    JLabel display_text2;
    JLabel display_text3;
    
    //Text displayed on the left side in smaller font
    JLabel display_text4;
    JLabel display_text5;
    JLabel display_text6;
    
    //buttons created on the login card to choose the option
    JButton btn_admin;
    JButton btn_teacher;
    
    //constructor that implements all the functionality
    FirstFrame(){
        
        /////////////////////////////////////////////////////////////// Text Displayed on the
        // left side is contained in 6 labels just to keep the background visible
        display_text1 = new JLabel();
        display_text1.setText("Task");
        display_text1.setFont(new Font("Consolas",Font.BOLD,80));
        display_text1.setForeground(Color.white);
        display_text1.setBounds(130,200,600,100);
        
        display_text2 = new JLabel();
        display_text2.setText("Management");
        display_text2.setFont(new Font("Consolas",Font.BOLD,80));
        display_text2.setForeground(Color.white);
        display_text2.setBounds(130,300,600,100);
        
        display_text3 = new JLabel();
        display_text3.setText("System");
        display_text3.setFont(new Font("Consolas",Font.BOLD,80));
        display_text3.setForeground(Color.white);
        display_text3.setBounds(130,400,600,100);
        
        display_text4 = new JLabel();
        display_text4.setText("Software that enables you to create task list.");
        display_text4.setFont(new Font("Consolas",Font.PLAIN,20));
        display_text4.setForeground(Color.white);
        display_text4.setBounds(130,480,600,100);
        
        display_text5 = new JLabel();
        display_text5.setText("Enables managers to assign task to employees.");
        display_text5.setFont(new Font("Consolas",Font.PLAIN,20));
        display_text5.setForeground(Color.white);
        display_text5.setBounds(130,505,600,100);
        
        display_text6 = new JLabel();
        display_text6.setText("Lets employees check their task and mark them as done.");
        display_text6.setFont(new Font("Consolas",Font.PLAIN,20));
        display_text6.setForeground(Color.white);
        display_text6.setBounds(130,530,600,100);
        
        ////////////////////////////////////////////////////////// Buttons created on UI cards:
        btn_admin = new JButton();
        btn_admin.setText("Login as Admin");
        btn_admin.setFocusable(false);
        btn_admin.setBackground(new Color(0x2522AF));
        btn_admin.setOpaque(true);
        btn_admin.setForeground(Color.white);
        btn_admin.setFont(new Font("Open Sans",Font.PLAIN,20));
        btn_admin.setBounds(50,230,340,50);
        btn_admin.addActionListener(this);
        
        btn_teacher = new JButton();
        btn_teacher.setText("Login as Teacher");
        btn_teacher.setFocusable(false);
        btn_teacher.setBackground(new Color(0x2522AF));
        btn_teacher.setOpaque(true);
        btn_teacher.setForeground(Color.white);
        btn_teacher.setFont(new Font("Open Sans",Font.PLAIN,20));
        btn_teacher.setBounds(50,300,340,50);
        btn_teacher.addActionListener(this);
        
        ///////////////////////////////////////////////////////// Login Heading created on the Login card:
        login = new JLabel();
        login.setText("Login");
        login.setBounds(50,140,200,70);
        login.setFont(new Font("Open Sans",Font.BOLD,45));
        login.setForeground(Color.white);
        
        //////////////////////////////////////////////////////// Logo that is displayed on the UI/Login card:
        logolabel = new JLabel();
        logolabel.setLayout(null);
        logolabel.setBounds(45,50,100,100);
        logolabel.setIcon(logo);
        
        ///////////////////////////////////////////////////////// UI/Login card that contain login options:
        UIcard = new JLabel();
        UIcard.setText("Login");
        UIcard.setLayout(null);
        UIcard.setBounds(910,160,450,520);
        UIcard.setIcon(uicard); 
        UIcard.add(login);
        UIcard.add(btn_admin);
        UIcard.add(btn_teacher);
        UIcard.add(logolabel);
        
        //////////////////////////////////////////////////////// Label created to apply the background:
        bgLabel = new JLabel();
        bgLabel.setLayout(null);
        bgLabel.setBounds(0,0,1550,850);
        bgLabel.setIcon(bg);
        bgLabel.add(UIcard);
        bgLabel.add(display_text1);
        bgLabel.add(display_text2);
        bgLabel.add(display_text3);
        bgLabel.add(display_text4);
        bgLabel.add(display_text5);
        bgLabel.add(display_text6);
        
        //////////////////////////////////////////////////////// Frame specifications of the first login:
        first_frame.setSize(1940,1080);
        first_frame.setIconImage(frameicon.getImage());
        first_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        first_frame.setLocationRelativeTo(null);
        first_frame.setResizable(false);
        first_frame.setTitle("Task Management Software");
        first_frame.setLayout(null);
        first_frame.add(bgLabel);
        
        first_frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_admin){
            //this will contain the code to open the frame of the admin
            first_frame.dispose();
            new AdminLoginFrame();
            
        }
        else if(e.getSource()==btn_teacher){
            //this will contain the code to open the frame of the teacher portal
            first_frame.dispose();
            new TeacherLoginFrame();
        }
    }
}
