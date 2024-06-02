package taskmanagementsoftware;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaskAssignment extends JFrame implements ActionListener{
    //image icons have been created for the background and UI Card i.e. login card
    ImageIcon bg = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\bg.png");
    ImageIcon uicard = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\UIcard.png");
    ImageIcon logo = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\logo.png");
    ImageIcon frameicon = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\ICON.png");
    
    JFrame task_assignment = new JFrame();
    JLabel bgLabel;
    JPanel taskListPanel;
    JButton back;
    
    JPanel commandPanel;
    JLabel tasks;
    JComboBox cb;
    JButton reset;
    
    JPanel task1,task2,task3,task4,task5;
    JLabel task1Label,task2Label,task3Label,task4Label,task5Label;
    JTextArea task1TA,task2TA,task3TA,task4TA,task5TA;
    JButton assignButton1,assignButton2,assignButton3,assignButton4,assignButton5;
    
    JButton done;
    
    TaskAssignment(){
        done = new JButton("Done");
        done.setBounds(300,465,100,27);
        done.setFont(new Font("Open Sans",Font.BOLD,13));
        done.setFocusable(false);
        done.setForeground(Color.white);
        done.setBackground(Color.blue);
        done.setOpaque(true);
        done.addActionListener(this);
        
        back = new JButton("Back");
        back.setBounds(30,30,70,27);
        back.setFont(new Font("Open Sans",Font.BOLD,13));
        back.setFocusable(false);
        back.setForeground(Color.blue);
        back.setBackground(Color.white);
        back.setOpaque(true);
        back.addActionListener(this);
        
        tasks = new JLabel("Create tasks: ");
        tasks.setForeground(Color.black);
        tasks.setBounds(17,15,110,27);
        tasks.setFont(new Font("Open Sans",Font.BOLD,15));
        
        String[] taskNumber = {"1 task","2 tasks","3 tasks","4 tasks","5 tasks"};
        cb = new JComboBox(taskNumber);
        cb.setBounds(135,15,70,27);
        cb.setBackground(Color.white);
        cb.addActionListener(this);
        
        reset = new JButton("Reset task list");
        reset.setBounds(220,15,120,27);
        reset.setFont(new Font("Open Sans",Font.BOLD,13));
        reset.setFocusable(false);
        reset.setForeground(Color.white);
        reset.setBackground(Color.blue);
        reset.setOpaque(true);
        reset.addActionListener(this);
        
        commandPanel = new JPanel();
        commandPanel.setLayout(null);
        commandPanel.setBounds(0,0,730,50);
        commandPanel.setBackground(new Color(0xDFF6FF));
        commandPanel.setOpaque(true);
        commandPanel.add(tasks);
        commandPanel.add(cb);
        commandPanel.add(reset);
        
        //////////////////////////////////////////////////////////////all the elements of first task:
        assignButton1 = new JButton("Assign Task");
        assignButton1.setFocusable(false);
        assignButton1.setPreferredSize(new Dimension(110,27));
        assignButton1.setFont(new Font("Open Sans",Font.BOLD,13));
        assignButton1.setForeground(Color.white);
        assignButton1.setBackground(Color.blue);
        assignButton1.setOpaque(true);
        assignButton1.addActionListener(this);
        
        task1Label = new JLabel("Task 1");
        task1Label.setFont(new Font("Open Sans",Font.BOLD,15));
        task1Label.setForeground(Color.black);
        
        task1TA = new JTextArea();
        task1TA.setPreferredSize(new Dimension(480,50));
        
        task1 = new JPanel();
        task1.setBounds(0,50,730,80);
        task1.setBackground(new Color(0xDFF6FF));
        task1.setOpaque(true);
        task1.setLayout(new FlowLayout(FlowLayout.CENTER,27,15));
        task1.add(task1Label);
        task1.add(task1TA);
        task1.add(assignButton1);
        task1.setVisible(false);
        /////////////////////////////////////////////////////////////first task ends here.
        
        //////////////////////////////////////////////////////////////all the elements of second task:
        assignButton2 = new JButton("Assign Task");
        assignButton2.setFocusable(false);
        assignButton2.setPreferredSize(new Dimension(110,27));
        assignButton2.setFont(new Font("Open Sans",Font.BOLD,13));
        assignButton2.setForeground(Color.white);
        assignButton2.setBackground(Color.blue);
        assignButton2.setOpaque(true);
        assignButton2.addActionListener(this);
        
        task2Label = new JLabel("Task 2");
        task2Label.setFont(new Font("Open Sans",Font.BOLD,15));
        task2Label.setForeground(Color.black);
        
        task2TA = new JTextArea();
        task2TA.setPreferredSize(new Dimension(480,50));
        
        task2 = new JPanel();
        task2.setBounds(0,130,730,80);
        task2.setBackground(new Color(0xDFF6FF));
        task2.setOpaque(true);
        task2.setLayout(new FlowLayout(FlowLayout.CENTER,27,15));
        task2.add(task2Label);
        task2.add(task2TA);
        task2.add(assignButton2);
        task2.setVisible(false);
        /////////////////////////////////////////////////////////////second task ends here.
        
        //////////////////////////////////////////////////////////////all the elements of third task:
        assignButton3 = new JButton("Assign Task");
        assignButton3.setFocusable(false);
        assignButton3.setPreferredSize(new Dimension(110,27));
        assignButton3.setFont(new Font("Open Sans",Font.BOLD,13));
        assignButton3.setForeground(Color.white);
        assignButton3.setBackground(Color.blue);
        assignButton3.setOpaque(true);
        assignButton3.addActionListener(this);
        
        task3Label = new JLabel("Task 3");
        task3Label.setFont(new Font("Open Sans",Font.BOLD,15));
        task3Label.setForeground(Color.black);
        
        task3TA = new JTextArea();
        task3TA.setPreferredSize(new Dimension(480,50));
        
        task3 = new JPanel();
        task3.setBounds(0,210,730,80);
        task3.setBackground(new Color(0xDFF6FF));
        task3.setOpaque(true);
        task3.setLayout(new FlowLayout(FlowLayout.CENTER,27,15));
        task3.add(task3Label);
        task3.add(task3TA);
        task3.add(assignButton3);
        task3.setVisible(false);
        /////////////////////////////////////////////////////////////third task ends here.
        
        //////////////////////////////////////////////////////////////all the elements of fourth task:
        assignButton4 = new JButton("Assign Task");
        assignButton4.setFocusable(false);
        assignButton4.setPreferredSize(new Dimension(110,27));
        assignButton4.setFont(new Font("Open Sans",Font.BOLD,13));
        assignButton4.setForeground(Color.white);
        assignButton4.setBackground(Color.blue);
        assignButton4.setOpaque(true);
        assignButton4.addActionListener(this);
        
        task4Label = new JLabel("Task 4");
        task4Label.setFont(new Font("Open Sans",Font.BOLD,15));
        task4Label.setForeground(Color.black);
        
        task4TA = new JTextArea();
        task4TA.setPreferredSize(new Dimension(480,50));
        
        task4 = new JPanel();
        task4.setBounds(0,290,730,80);
        task4.setBackground(new Color(0xDFF6FF));
        task4.setOpaque(true);
        task4.setLayout(new FlowLayout(FlowLayout.CENTER,27,15));
        task4.add(task4Label);
        task4.add(task4TA);
        task4.add(assignButton4);
        task4.setVisible(false);
        /////////////////////////////////////////////////////////////fourth task ends here. 
         
        //////////////////////////////////////////////////////////////all the elements of fourth task:
        assignButton5 = new JButton("Assign Task");
        assignButton5.setFocusable(false);
        assignButton5.setPreferredSize(new Dimension(110,27));
        assignButton5.setFont(new Font("Open Sans",Font.BOLD,13));
        assignButton5.setForeground(Color.white);
        assignButton5.setBackground(Color.blue);
        assignButton5.setOpaque(true);
        assignButton5.addActionListener(this);
        
        task5Label = new JLabel("Task 5");
        task5Label.setFont(new Font("Open Sans",Font.BOLD,15));
        task5Label.setForeground(Color.black);
       
        task5TA = new JTextArea();
        task5TA.setPreferredSize(new Dimension(480,50));
        
        task5 = new JPanel();
        task5.setBounds(0,370,730,80);
        task5.setBackground(new Color(0xDFF6FF));
        task5.setOpaque(true);
        task5.setLayout(new FlowLayout(FlowLayout.CENTER,27,15));
        task5.add(task5Label);
        task5.add(task5TA);
        task5.add(assignButton5);
        task5.setVisible(false);
        /////////////////////////////////////////////////////////////fourth task ends here.
        
        taskListPanel = new JPanel();
        taskListPanel.setBounds(400,230,730,500);
        taskListPanel.setBackground(new Color(0xDFF6FF));
        taskListPanel.setOpaque(true);
        taskListPanel.setLayout(null);
        taskListPanel.add(task1);
        taskListPanel.add(task2);
        taskListPanel.add(task3);
        taskListPanel.add(task4);
        taskListPanel.add(task5);
        taskListPanel.add(commandPanel);
        taskListPanel.add(done);
        
        bgLabel = new JLabel();
        bgLabel.setLayout(null);
        bgLabel.setBounds(0,0,1550,850);
        bgLabel.setIcon(bg);
        bgLabel.add(taskListPanel);
        bgLabel.add(back);
        
        task_assignment.setSize(1940,1080);
        task_assignment.setLocationRelativeTo(null);
        task_assignment.setResizable(false);
        task_assignment.setTitle("Task Assignment");
        task_assignment.setLayout(null);
        task_assignment.add(bgLabel);
        task_assignment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        task_assignment.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cb){
            if(cb.getSelectedItem()=="1 task"){
                task1.setVisible(true);
                
            }
            else if(cb.getSelectedItem()=="2 tasks"){
                task1.setVisible(true);
                task2.setVisible(true);
            }
            else if(cb.getSelectedItem()=="3 tasks"){
                task1.setVisible(true);
                task2.setVisible(true);
                task3.setVisible(true);
            }
            else if(cb.getSelectedItem()=="4 tasks"){
                task1.setVisible(true);
                task2.setVisible(true);
                task3.setVisible(true);
                task4.setVisible(true);
            }
            else if(cb.getSelectedItem()=="5 tasks"){
                task1.setVisible(true);
                task2.setVisible(true);
                task3.setVisible(true);
                task4.setVisible(true);
                task5.setVisible(true);
            }
        }
        
        if(e.getSource()==reset){
                task1.setVisible(false);
                task2.setVisible(false);
                task3.setVisible(false);
                task4.setVisible(false);
                task5.setVisible(false);
        }
        
        if(e.getSource()==done){
            new AdminSection();
        }
        
        if(e.getSource()==back){
            task_assignment.dispose();
            new AdminSection();
        }
        String st1="";
        if(e.getSource()==assignButton1){
            st1=task1TA.getText();
            new Filechooser(st1);

        }
        if(e.getSource()==assignButton2){
            st1=task2TA.getText();
            new Filechooser(st1);
        }
        if(e.getSource()==assignButton3){
            st1=task3TA.getText();
            new Filechooser(st1);
        }
        if(e.getSource()==assignButton4){
            st1=task4TA.getText();
            new Filechooser(st1);
        }
        if(e.getSource()==assignButton5){
            st1=task5TA.getText();
            new Filechooser(st1);
        }
        if(e.getSource()==done){
        task_assignment.dispose();
        new AdminSection();
        }

    }
}
