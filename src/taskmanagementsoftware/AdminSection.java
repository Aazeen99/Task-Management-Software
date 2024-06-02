package taskmanagementsoftware;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminSection implements ActionListener{
    
    ImageIcon bg = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\bg.png");
    ImageIcon uicard = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\UIcard.png");
    ImageIcon frameicon = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\ICON.png");
    
    JFrame admin_section_frame = new JFrame();
    
    JLabel bgLabel;
    JLabel UIcard;
    JLabel heading;
    
    JButton add_account;
    JButton del_account;
    JButton assign_task;
    JButton make_announcement;
    
    JButton logout;
    
    AdminSection(){
        add_account = new JButton();
        add_account.setFocusable(false);
        add_account.setBackground(new Color(0x2522AF));
        add_account.setOpaque(true);
        add_account.setForeground(Color.white);
        add_account.setFont(new Font("Open Sans",Font.PLAIN,20));
        add_account.setBounds(90,(80-15),340,50);
        add_account.setText("Add a new Teacher");
        add_account.addActionListener(this);
        
        del_account = new JButton();
        del_account.setFocusable(false);
        del_account.setBackground(new Color(0x2522AF));
        del_account.setOpaque(true);
        del_account.setForeground(Color.white);
        del_account.setFont(new Font("Open Sans",Font.PLAIN,20));
        del_account.setBounds(90,(150-15),340,50);
        del_account.setText("Delete an Account");
        del_account.addActionListener(this);
        
        assign_task = new JButton();
        assign_task.setFocusable(false);
        assign_task.setBackground(new Color(0x2522AF));
        assign_task.setOpaque(true);
        assign_task.setForeground(Color.white);
        assign_task.setFont(new Font("Open Sans",Font.PLAIN,20));
        assign_task.setBounds(90,(220-15),340,50);
        assign_task.setText("Assign the task");
        assign_task.addActionListener(this);
        
        make_announcement = new JButton();
        make_announcement.setText("Make an Announcement");
        make_announcement.setFocusable(false);
        make_announcement.setBackground(new Color(0x2522AF));
        make_announcement.setOpaque(true);
        make_announcement.setForeground(Color.white);
        make_announcement.setFont(new Font("Open Sans",Font.PLAIN,20));
        make_announcement.setBounds(90,(290-15),340,50);
        make_announcement.addActionListener(this);
        
        logout = new JButton();
        logout.setText("Logout");
        logout.setFocusable(false);
        logout.setBackground(new Color(0x4E4BD1));
        logout.setOpaque(true);
        logout.setForeground(Color.white);
        logout.setFont(new Font("Open Sans",Font.PLAIN,15));
        logout.setBounds(190,360,140,30);
        logout.addActionListener(this);
        
        
        heading = new JLabel();
        heading.setText("Login");
        heading.setLayout(null);
        heading.setText("Admin Section");
        heading.setFont(new Font("Consolas",Font.BOLD,50));
        heading.setForeground(Color.white);
        heading.setBounds(560,110,530,200);
        
        UIcard = new JLabel();
        UIcard.setText("Login");
        UIcard.setLayout(null);
        UIcard.setBounds(480,260,530,440);
        UIcard.setIcon(uicard); 
        UIcard.add(add_account);
        UIcard.add(del_account);
        UIcard.add(assign_task);
        UIcard.add(make_announcement);
        UIcard.add(logout);
        
        bgLabel = new JLabel();
        bgLabel.setLayout(null);
        bgLabel.setBounds(0,0,1550,850);
        bgLabel.setIcon(bg);
        bgLabel.add(UIcard);
        bgLabel.add(heading);
        
        admin_section_frame.setSize(1940,1080);
        admin_section_frame.setIconImage(frameicon.getImage());
        admin_section_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        admin_section_frame.setLocationRelativeTo(null);
        admin_section_frame.setResizable(false);
        admin_section_frame.setTitle("Task Management Software");
        admin_section_frame.setLayout(null);
        admin_section_frame.add(bgLabel);
        
        admin_section_frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add_account){
            //this will allow the admin to create an account for the teacher
            File teacherFile = new File("TeacherFile.txt");
            try{
                if(teacherFile.createNewFile()){
                    System.out.println("Teacher file created successfully.");
                }
                else{
                    System.out.println("File with the same name already exists.");
                }
            }
            catch(IOException io){
                io.printStackTrace();
            }
            File teacherTimetable = new File("TeacherTimetable.txt");
            try{
                if(teacherTimetable.createNewFile()){
                    System.out.println("Timetable file created successfully.");
                }
                else{
                    System.out.println("File with the same name already exists.");
                }
            }
            catch(IOException io){
                io.printStackTrace();
            }
            admin_section_frame.dispose();
            new AddTeacherAccount();
        }
        else if(e.getSource()==del_account){
            //this will allow the admin to delete the pre-existing account of any teacher when he has left the job
            new DeleteAccount();
            File deletedaccuntfile = new File("DeletedAccounts.txt");
            /*
            try {
                if(deletedaccuntfile.createNewFile()){
                    System.out.println("File created");
                }
                else{
                    System.out.println("File with the same name already exists.");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
*/
        }
        else if(e.getSource()==assign_task){
            //this will allow the admin to add the task to to-do list and let him assign it to teacher
            new TaskAssignment();
        }
        else if(e.getSource()==make_announcement){
            try{
                File announcementFile = new File("announcementFile.txt");
                if(announcementFile.createNewFile()){
                    System.out.println("File created");
                }
                else{
                    System.out.println("File already exists");
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
            new AnnouncementFrame();
        }
        else if(e.getSource()==logout){
            admin_section_frame.dispose();
            new AdminLoginFrame();
        }
    }
}
