package taskmanagementsoftware;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLoginFrame implements ActionListener{
    ImageIcon bg = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\bg.png");
    ImageIcon uicard = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\UIcard.png");
    ImageIcon frameicon = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\ICON.png");
    ImageIcon logo = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\logo.png");
    
    JFrame admin_login_frame = new JFrame();
    
    JLabel UIcard;
    JLabel bgLabel;
    
    JLabel input_username;
    JLabel input_password;
    
    JTextField username;
    JPasswordField password;
    JButton login_btn;
    
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel logo_panel;
    
    JLabel logo_label;
    JButton back;
    
    AdminLoginFrame(){
        logo_label = new JLabel();
        logo_label.setLayout(null);
        logo_label.setBounds(175,20,130,130);
        logo_label.setIcon(logo);
        
        back = new JButton();
        back.setBounds(20,20,100,35);
        back.setFont(new Font("Open Sans",Font.BOLD,15));
        back.setText("Back");
        back.setBackground(new Color(0x2522AF));
        back.setOpaque(true);
        back.setForeground(Color.white);
        back.setFocusable(false);
        back.addActionListener(this);
        
        logo_panel = new JPanel();
        logo_panel.setBounds(0,0,450,200);
        logo_panel.setLayout(null);
        logo_panel.setBackground(new Color(0xC3C1F1));
        logo_panel.add(logo_label);
        logo_panel.add(back);
        
        input_username = new JLabel();
        input_username.setText("Enter Username:");
        input_username.setFont(new Font("Open Sans",Font.PLAIN,15));
        
        input_password = new JLabel();
        input_password.setText("Enter Password:");
        input_password.setFont(new Font("Open Sans",Font.PLAIN,15));
        
        username = new JTextField();
        username.setPreferredSize(new Dimension(170,27));
        username.setFont(new Font("Consolas",Font.BOLD,17));
        
        password = new JPasswordField();
        password.setPreferredSize(new Dimension(170,27));
        password.setFont(new Font("Consolas",Font.BOLD,17));
        
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,30,56));
        panel1.setBounds(0,120,450,100);
        panel1.setBackground(new Color(0xC3C1F1));
        //panel1.setBackground(Color.red);
        panel1.setOpaque(true);
        panel1.add(input_username);
        panel1.add(username);
        
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
        panel2.setBounds(0,220,450,100);
        panel2.setBackground(new Color(0xC3C1F1));
        //panel2.setBackground(Color.yellow);
        panel2.setOpaque(true);
        panel2.add(input_password);
        panel2.add(password);
        
        login_btn = new JButton();
        login_btn.setPreferredSize(new Dimension(150,35));
        login_btn.setFont(new Font("Open Sans",Font.BOLD,15));
        login_btn.setText("Login");
        login_btn.setBackground(new Color(0x2522AF));
        login_btn.setOpaque(true);
        login_btn.setForeground(Color.white);
        login_btn.setFocusable(false);
        login_btn.addActionListener(this);
        
        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.setBounds(0,320,450,100);
        panel3.setBackground(new Color(0xC3C1F1));
        //panel3.setBackground(Color.blue);
        panel3.setOpaque(true);
        panel3.add(login_btn);
        
        UIcard = new JLabel();
        UIcard.setText("Login");
        UIcard.setLayout(null);
        UIcard.setBackground(new Color(0xC3C1F1));
        UIcard.setOpaque(true);
        UIcard.setBounds(550,160,450,520);
        //UIcard.setIcon(uicard); 
        UIcard.add(panel1);
        UIcard.add(panel2);
        UIcard.add(panel3);
        UIcard.add(logo_panel);
        
        bgLabel = new JLabel();
        bgLabel.setLayout(null);
        bgLabel.setBounds(0,0,1550,850);
        bgLabel.setIcon(bg);
        bgLabel.add(UIcard);
        
        admin_login_frame.setSize(1940,1080);
        admin_login_frame.setLocationRelativeTo(null);
        admin_login_frame.setResizable(false);
        admin_login_frame.setTitle("Admin Login");
        admin_login_frame.setLayout(null);
        admin_login_frame.add(bgLabel);
        
        admin_login_frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login_btn){
            String entered_username = username.getText();
            String entered_password = password.getText();System.out.println(entered_password);
            if(entered_username.equalsIgnoreCase("admin") && entered_password.equalsIgnoreCase("admin")){
                
                new AdminSection();
                admin_login_frame.dispose();
            }
            
            else{
                username.setText("");
                password.setText("");
            }

        }
        else if(e.getSource()==back){
            admin_login_frame.dispose();
            new FirstFrame();
        }
    }
}
