package taskmanagementsoftware;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TeacherLoginFrame implements ActionListener{
    ImageIcon bg = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\bg.png");
    ImageIcon uicard = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\UIcard.png");
    ImageIcon frameicon = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\ICON.png");
    ImageIcon logo = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\logo.png");
    
    JFrame teacher_login_frame = new JFrame();
    
    JLabel UIcard;
    JLabel bgLabel;
    
    JLabel input_ID;
    JTextField ID;
    JButton login_btn;
    
    JPanel logo_panel;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    
    JLabel logo_label;
    JButton back;
    
    TeacherLoginFrame(){
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
        
        input_ID = new JLabel();
        input_ID.setText("Enter Teacher ID");
        input_ID.setFont(new Font("Open Sans",Font.BOLD,18));
        
        login_btn = new JButton();
        login_btn.setPreferredSize(new Dimension(150,35));
        login_btn.setFont(new Font("Open Sans",Font.BOLD,15));
        login_btn.setText("Login");
        login_btn.setBackground(new Color(0x2522AF));
        login_btn.setOpaque(true);
        login_btn.setForeground(Color.white);
        login_btn.setFocusable(false);
        login_btn.addActionListener(this);
        
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,30,56));
        panel1.setBounds(0,140,450,100);
        panel1.setBackground(new Color(0xC3C1F1));
        //panel1.setBackground(Color.red);
        panel1.setOpaque(true);
        panel1.add(input_ID);
        
        ID = new JTextField();
        ID.setPreferredSize(new Dimension(200,27));
        ID.setFont(new Font("Consolas",Font.BOLD,17));
        
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,30,10));
        panel2.setBounds(0,240,450,60);
        panel2.setBackground(new Color(0xC3C1F1));
        //panel2.setBackground(Color.yellow);
        panel2.setOpaque(true);
        panel2.add(ID);
        
        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.setBounds(0,300,450,100);
        panel3.setBackground(new Color(0xC3C1F1));
        //panel3.setBackground(Color.blue);
        panel3.setOpaque(true);
        panel3.add(login_btn);
        
        UIcard = new JLabel();
        UIcard.setLayout(null);
        UIcard.setBackground(new Color(0xC3C1F1));
        UIcard.setOpaque(true);
        UIcard.setBounds(550,160,450,520);
        UIcard.add(panel1);
        UIcard.add(panel2);
        UIcard.add(panel3);
        UIcard.add(logo_panel);
        
        bgLabel = new JLabel();
        bgLabel.setLayout(null);
        bgLabel.setBounds(0,0,1550,850);
        bgLabel.setIcon(bg);
        bgLabel.add(UIcard);
        
        teacher_login_frame.setSize(1940,1080);
        teacher_login_frame.setLocationRelativeTo(null);
        teacher_login_frame.setResizable(false);
        teacher_login_frame.setTitle("Teacher Login");
        teacher_login_frame.setLayout(null);
        teacher_login_frame.add(bgLabel);
        
        teacher_login_frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login_btn){
            
            String entered_ID = ID.getText();
            if(entered_ID.equals("")){
            }
            else{
                
                //this will open up the teacher section
            String extracted_name;
            String extracted_ID;
            String extracted_dep;
            
            teacher_login_frame.dispose();
            TeacherSection tc = new TeacherSection();
            
            try{
                FileReader fr1 = new FileReader("C:\\Users\\aazee\\Documents\\NetBeansProjects\\TaskManagementSoftware\\TeacherFile.txt");
                BufferedReader br1 = new BufferedReader(fr1);
                String line1;
                while((line1 = br1.readLine())!=null){
                    String[] str1 = line1.split(",");
                    int size = str1.length;
                    if(entered_ID.equals(str1[0])){
                        extracted_name = str1[1];
                        extracted_ID = str1[0];
                        extracted_dep = str1[2];
                        
                        tc.name_tf.setText(extracted_name);
                        tc.ID_tf.setText(extracted_ID);
                        tc.department_tf.setText(extracted_dep);
                    }
                }
                
            } 
            catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
            
            /////////////////////////////////////////////////////////////////////////////////////////////////
            
            String extracted1;String extracted11;
            String extracted2;String extracted12;
            String extracted3;String extracted13;
            String extracted4;String extracted14;
            String extracted5;String extracted15;
            String extracted6;String extracted16;
            String extracted7;String extracted17;
            String extracted8;String extracted18;
            String extracted9;String extracted19;
            String extracted10;String extracted20;
            
            try{
                FileReader fr2 = new FileReader("C:\\Users\\aazee\\Documents\\NetBeansProjects\\TaskManagementSoftware\\TeacherTimetable.txt");
                BufferedReader br2 = new BufferedReader(fr2);
                String line2;
                while((line2 = br2.readLine())!=null){
                    String[] str2 = line2.split(",");
                    int size = str2.length;
                    if(entered_ID.equals(str2[0])){
                        extracted1 = str2[1];extracted11 = str2[11];
                        extracted2 = str2[2];extracted12 = str2[12];
                        extracted3 = str2[3];extracted13 = str2[13];
                        extracted4 = str2[4];extracted14 = str2[14];
                        extracted5 = str2[5];extracted15 = str2[15];
                        extracted6 = str2[6];extracted16 = str2[16];
                        extracted7 = str2[7];extracted17 = str2[17];
                        extracted8 = str2[8];extracted18 = str2[18];
                        extracted9 = str2[9];extracted19 = str2[19];
                        extracted10 = str2[10];extracted20 = str2[20];
                        
                        tc.ta1.setText(extracted1);tc.ta11.setText(extracted11);tc.ta2.setText(extracted2);tc.ta12.setText(extracted12);
                        tc.ta3.setText(extracted3);tc.ta13.setText(extracted13);tc.ta4.setText(extracted4);tc.ta14.setText(extracted14);
                        tc.ta5.setText(extracted5);tc.ta15.setText(extracted15);tc.ta6.setText(extracted6);tc.ta16.setText(extracted16);
                        tc.ta7.setText(extracted7);tc.ta17.setText(extracted17);tc.ta8.setText(extracted8);tc.ta18.setText(extracted18);
                        tc.ta9.setText(extracted9);tc.ta19.setText(extracted19);tc.ta10.setText(extracted10);tc.ta20.setText(extracted20);
                    }
                }
                
            } 
            catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
                
            try{
                FileReader fr3 = new FileReader("announcementFile.txt");
                BufferedReader br3 = new BufferedReader(fr3);
                String line3;
                while((line3 = br3.readLine())!=null){
                    String str3 = line3;
                    tc.noticeBoardTA.setText(str3);
                }
            } 
            catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
            
            try{
                FileReader fr4 = new FileReader("Task assigned.txt");
                BufferedReader br4 = new BufferedReader(fr4);
                String line4;
                String extracted_task;
                while((line4 = br4.readLine())!=null){
                    String[] str4 = line4.split(",");
                    if(entered_ID.equals(str4[0])){
                        extracted_task = str4[1];
                        tc.taskListTA.setText(extracted_task +"\n");
                    }
                }
            } 
            catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
            }
        }
        
        else if(e.getSource()==back){
            teacher_login_frame.dispose();
            new FirstFrame();
        }
    }
}
