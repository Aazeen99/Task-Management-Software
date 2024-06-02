package taskmanagementsoftware;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TeacherSection extends JFrame implements ActionListener{
    //image icons have been created for the background and UI Card i.e. login card
    ImageIcon bg = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\bg.png");
    ImageIcon uicard = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\UIcard.png");
    ImageIcon logo = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\logo.png");
    ImageIcon frameicon = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\ICON.png");
    
    JFrame teacherSectionFrame = new JFrame();
    
    JLabel bgLabel;
    JLabel timetable;
    JLabel inside_timetable;
    
    JLabel display_form;
    
    JLabel name;
    JLabel ID;
    JLabel department;
    
    JTextField name_tf;
    JTextField ID_tf;
    JTextField department_tf;
    
    JLabel taskList;
    JLabel noticeBoard;
    JTextArea taskListTA;
    JButton taskdone;
    
    JTextArea noticeBoardTA;
    JLabel taskListHeading;
    JLabel noticeBoardHeading;
    
    JButton back;
    
    JLabel left_border;
    JLabel top_border;
    JTextArea ta1,ta2,ta3,ta4,ta5,ta6,ta7,ta8,ta9,ta10,ta11,ta12,ta13,ta14,ta15,ta16,ta17,ta18,ta19,ta20;
    JTextArea monday,tuesday,wednesday,thursday,friday;
    JTextArea slot1,slot2,slot3,slot4;
    
    TeacherSection(){
        
        back = new JButton("Back");
        back.setBounds(30,30,70,27);
        back.setFont(new Font("Open Sans",Font.BOLD,13));
        back.setFocusable(false);
        back.setForeground(Color.blue);
        back.setBackground(Color.white);
        back.setOpaque(true);
        back.addActionListener(this);
        
        name = new JLabel();
        name.setText("Teacher Name:");
        name.setBounds(55,40,300,30);
        name.setFont(new Font("Open Sans",Font.BOLD,15));
        
        name_tf = new JTextField();
        name_tf.setBounds(55,80,250,30);
        name_tf.setFont(new Font("Consolas",Font.BOLD,15));
        name_tf.setEditable(false);
        
        ID = new JLabel();
        ID.setText("Teacher ID:");
        ID.setBounds(55,120,300,30);
        ID.setFont(new Font("Open Sans",Font.BOLD,15));
        
        ID_tf = new JTextField();
        ID_tf.setBounds(55,160,250,30);
        ID_tf.setFont(new Font("Consolas",Font.BOLD,15));
        ID_tf.setEditable(false);
        
        department = new JLabel();
        department.setText("Department:");
        department.setBounds(55,200,300,30);
        department.setFont(new Font("Open Sans",Font.BOLD,15));
        
        department_tf = new JTextField();
        department_tf.setBounds(55,240,250,30);
        department_tf.setFont(new Font("Consolas",Font.BOLD,15));
        department_tf.setEditable(false);
        
        display_form = new JLabel();
        display_form.setLayout(null);
        display_form.setBackground(new Color(0xC3C1F1));
        display_form.setOpaque(true);
        display_form.setBounds(140,30,380,400);
        display_form.add(name);
        display_form.add(ID);
        display_form.add(department);
        display_form.add(name_tf);
        display_form.add(ID_tf);
        display_form.add(department_tf);
        
        ta1 = new JTextArea();ta11 = new JTextArea();ta2 = new JTextArea();ta12 = new JTextArea();
        ta3 = new JTextArea();ta13 = new JTextArea();ta4 = new JTextArea();ta14 = new JTextArea();
        ta5 = new JTextArea();ta15 = new JTextArea();ta6 = new JTextArea();ta16 = new JTextArea();
        ta7 = new JTextArea();ta17 = new JTextArea();ta8 = new JTextArea();ta18 = new JTextArea();
        ta9 = new JTextArea();ta19 = new JTextArea();ta10 = new JTextArea();ta20 = new JTextArea();
        
        ta1.setEditable(false);ta10.setEditable(false);ta2.setEditable(false);ta11.setEditable(false);
        ta3.setEditable(false);ta12.setEditable(false);ta4.setEditable(false);ta13.setEditable(false);
        ta5.setEditable(false);ta14.setEditable(false);ta6.setEditable(false);ta15.setEditable(false);
        ta7.setEditable(false);ta16.setEditable(false);ta8.setEditable(false);ta17.setEditable(false);
        ta9.setEditable(false);ta18.setEditable(false);ta10.setEditable(false);ta20.setEditable(false);
        
        ta1.setFont(new Font("Consolas",Font.BOLD,15));ta10.setFont(new Font("Consolas",Font.BOLD,15));
        ta2.setFont(new Font("Consolas",Font.BOLD,15));ta11.setFont(new Font("Consolas",Font.BOLD,15));
        ta3.setFont(new Font("Consolas",Font.BOLD,15));ta12.setFont(new Font("Consolas",Font.BOLD,15));
        ta4.setFont(new Font("Consolas",Font.BOLD,15));ta13.setFont(new Font("Consolas",Font.BOLD,15));
        ta5.setFont(new Font("Consolas",Font.BOLD,15));ta14.setFont(new Font("Consolas",Font.BOLD,15));
        ta6.setFont(new Font("Consolas",Font.BOLD,15));ta15.setFont(new Font("Consolas",Font.BOLD,15));
        ta7.setFont(new Font("Consolas",Font.BOLD,15));ta16.setFont(new Font("Consolas",Font.BOLD,15));
        ta8.setFont(new Font("Consolas",Font.BOLD,15));ta17.setFont(new Font("Consolas",Font.BOLD,15));
        ta9.setFont(new Font("Consolas",Font.BOLD,15));ta18.setFont(new Font("Consolas",Font.BOLD,15));
        ta10.setFont(new Font("Consolas",Font.BOLD,15));ta20.setFont(new Font("Consolas",Font.BOLD,15));
        
        ta1.setLineWrap(true);ta10.setLineWrap(true);ta2.setLineWrap(true);ta11.setLineWrap(true);
        ta3.setLineWrap(true);ta12.setLineWrap(true);ta4.setLineWrap(true);ta13.setLineWrap(true);
        ta5.setLineWrap(true);ta14.setLineWrap(true);ta6.setLineWrap(true);ta15.setLineWrap(true);
        ta7.setLineWrap(true);ta16.setLineWrap(true);ta8.setLineWrap(true);ta17.setLineWrap(true);
        ta9.setLineWrap(true);ta18.setLineWrap(true);ta10.setLineWrap(true);ta20.setLineWrap(true);
        ////////////////////////////////////////////////////////////////////
        
        inside_timetable = new JLabel();
        inside_timetable.setLayout(new GridLayout());
        //inside_timetable.setBackground(Color.red);
        //inside_timetable.setOpaque(true);
        inside_timetable.setBounds(70,70,680,330);
        inside_timetable.setLayout(new GridLayout(4,5,5,5));
        inside_timetable.add(ta1);
        inside_timetable.add(ta2);
        inside_timetable.add(ta3);
        inside_timetable.add(ta4);
        inside_timetable.add(ta5);
        inside_timetable.add(ta6);
        inside_timetable.add(ta7);
        inside_timetable.add(ta8);
        inside_timetable.add(ta9);
        inside_timetable.add(ta10);
        inside_timetable.add(ta11);
        inside_timetable.add(ta12);
        inside_timetable.add(ta13);
        inside_timetable.add(ta14);
        inside_timetable.add(ta15);
        inside_timetable.add(ta16);
        inside_timetable.add(ta17);
        inside_timetable.add(ta18);
        inside_timetable.add(ta19);
        inside_timetable.add(ta20);
        
        
        monday = new JTextArea("Monday");
        monday.setEditable(false);
        monday.setFont(new Font("Consolas",Font.BOLD,20));
        monday.setBackground(new Color(0xFFBE00));
        monday.setOpaque(true);
        
        tuesday = new JTextArea("Tuesday");
        tuesday.setEditable(false);
        tuesday.setFont(new Font("Consolas",Font.BOLD,20));
        tuesday.setBackground(new Color(0xFFBE00));
        tuesday.setOpaque(true);
        
        wednesday = new JTextArea("Wednesday");
        wednesday.setEditable(false);
        wednesday.setFont(new Font("Consolas",Font.BOLD,20));
        wednesday.setBackground(new Color(0xFFBE00));
        wednesday.setOpaque(true);
        
        thursday = new JTextArea("Thursday");
        thursday.setEditable(false);
        thursday.setFont(new Font("Consolas",Font.BOLD,20));
        thursday.setBackground(new Color(0xFFBE00));
        thursday.setOpaque(true);
        
        friday = new JTextArea("Friday");
        friday.setEditable(false);
        friday.setFont(new Font("Consolas",Font.BOLD,20));
        friday.setBackground(new Color(0xFFBE00));
        friday.setOpaque(true);
        
        top_border = new JLabel();
        top_border.setBounds(70,0,680,65);
        top_border.add(monday);
        top_border.add(tuesday);
        top_border.add(wednesday);
        top_border.add(thursday);
        top_border.add(friday);
        top_border.setLayout(new GridLayout(1,5,5,5));
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        slot1 = new JTextArea("Slot 1");
        slot1.setEditable(false);
        slot1.setFont(new Font("Consolas",Font.BOLD,18));
        slot1.setBackground(new Color(0xFFBE00));
        slot1.setOpaque(true);
        
        slot2 = new JTextArea("Slot 2");
        slot2.setEditable(false);
        slot2.setFont(new Font("Consolas",Font.BOLD,18));
        slot2.setBackground(new Color(0xFFBE00));
        slot2.setOpaque(true);
        
        slot3 = new JTextArea("Slot 3");
        slot3.setEditable(false);
        slot3.setFont(new Font("Consolas",Font.BOLD,18));
        slot3.setBackground(new Color(0xFFBE00));
        slot3.setOpaque(true);
        
        slot4 = new JTextArea("Slot 4");
        slot4.setEditable(false);
        slot4.setFont(new Font("Consolas",Font.BOLD,18));
        slot4.setBackground(new Color(0xFFBE00));
        slot4.setOpaque(true);
        
        left_border = new JLabel();
        left_border.setBounds(0,70,65,330);
        left_border.add(slot1);
        left_border.add(slot2);
        left_border.add(slot3);
        left_border.add(slot4);
        left_border.setLayout(new GridLayout(4,1,5,5));
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        
        timetable = new JLabel();
        timetable.setLayout(null);
        timetable.setBackground(new Color(0xC3C1F1));
        timetable.setOpaque(true);
        timetable.setBounds(640,30,750,400);
        timetable.add(inside_timetable);
        timetable.add(top_border);
        timetable.add(left_border);
        
        taskdone = new JButton("Task Done");
        taskdone.setBounds(260,30,100,27);
        taskdone.setBackground(Color.blue);
        taskdone.setOpaque(true);
        taskdone.setForeground(Color.white);
        taskdone.setFocusable(false);
        taskdone.addActionListener(this);
        
        taskListTA = new JTextArea();
        taskListTA.setBounds(10,80,360,260);
        taskListTA.setEditable(false);
        taskListTA.setFont(new Font("Consolas",Font.BOLD,18));
        taskListTA.setLineWrap(true);
        
        taskListHeading = new JLabel("Assigned Tasks:");
        taskListHeading.setBounds(10,10,270,60);
        taskListHeading.setFont(new Font("Open Sanse",Font.BOLD,27));
        taskListHeading.setForeground(Color.BLACK);
        
        taskList = new JLabel();
        taskList.setLayout(null);
        taskList.setBackground(new Color(0xC3C1F1));
        taskList.setOpaque(true);
        taskList.setBounds(140,450,380,350);
        taskList.add(taskListTA);
        taskList.add(taskListHeading);
        taskList.add(taskdone);
        
        noticeBoardHeading = new JLabel("Notice Board:");
        noticeBoardHeading.setBounds(10,10,300,60);
        noticeBoardHeading.setFont(new Font("Open Sanse",Font.BOLD,27));
        noticeBoardHeading.setForeground(Color.BLACK);
        
        noticeBoardTA = new JTextArea();
        noticeBoardTA.setBounds(10,80,730,260);
        noticeBoardTA.setEditable(false);
        noticeBoardTA.setFont(new Font("Consolas",Font.BOLD,20));
        noticeBoardTA.setLineWrap(true);
        
        noticeBoard = new JLabel();
        noticeBoard.setLayout(null);
        noticeBoard.setBackground(new Color(0xC3C1F1));
        noticeBoard.setOpaque(true);
        noticeBoard.setBounds(640,450,750,350);
        noticeBoard.add(noticeBoardTA);
        noticeBoard.add(noticeBoardHeading);
        
        bgLabel = new JLabel();
        bgLabel.setLayout(null);
        bgLabel.setBounds(0,0,1550,850);
        bgLabel.setIcon(bg);
        bgLabel.add(timetable);
        bgLabel.add(display_form);
        bgLabel.add(taskList);
        bgLabel.add(noticeBoard);
        bgLabel.add(back);
        
        teacherSectionFrame.setSize(1940,1080);
        teacherSectionFrame.setLocationRelativeTo(null);
        teacherSectionFrame.setResizable(false);
        teacherSectionFrame.setTitle("Teacher Section");
        teacherSectionFrame.setLayout(null);
        teacherSectionFrame.add(bgLabel);
        
        teacherSectionFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            teacherSectionFrame.dispose();
            new TeacherLoginFrame();
        }
        if(e.getSource()==taskdone){
            taskListTA.setText("");
        }
    }
}
