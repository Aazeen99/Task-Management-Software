package taskmanagementsoftware;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AnnouncementFrame implements ActionListener{
    //image icons have been created for the background and UI Card i.e. login card
    ImageIcon bg = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\bg.png");
    ImageIcon uicard = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\UIcard.png");
    ImageIcon logo = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\logo.png");
    ImageIcon frameicon = new ImageIcon("C:\\Users\\aazee\\Desktop\\OOP lab project\\ICON.png");
    
    JFrame frame_announcement = new JFrame();
    String announcement;
    JButton back;
    
    JLabel bgLabel;
    JPanel textPanel;
    
    JLabel heading;
    JButton publish;
    JButton reset;
    
    JTextArea announcementArea;
    
    AnnouncementFrame(){
        
        back = new JButton("Back");
        back.setBounds(30,30,70,27);
        back.setFont(new Font("Open Sans",Font.BOLD,13));
        back.setFocusable(false);
        back.setForeground(Color.blue);
        back.setBackground(Color.white);
        back.setOpaque(true);
        back.addActionListener(this);
        
        heading = new JLabel();
        heading.setBounds(485,180,700,200);
        heading.setText("Make an Announcement");
        heading.setFont(new Font("Open Sans",Font.BOLD,50));
        heading.setForeground(Color.white);
        
        publish = new JButton();
        publish.setBounds(650,600,100,27);
        publish.setText("Publish");
        publish.setFocusable(false);
        publish.setFont(new Font("Consolas",Font.BOLD,15));
        publish.setForeground(new Color(0x2522AF));
        publish.setBackground(Color.white);
        publish.setOpaque(true);
        publish.addActionListener(this);
        
        reset = new JButton();
        reset.setBounds(800,600,100,27);
        reset.setText("Reset");
        reset.setFocusable(false);
        reset.setFont(new Font("Consolas",Font.BOLD,15));
        reset.setForeground(Color.white);
        reset.setBackground(new Color(0x2522AF));
        reset.setOpaque(true);
        reset.addActionListener(this);
        
        announcementArea = new JTextArea();
        announcementArea.setBounds(15,15,665,215);
        announcementArea.setLineWrap(true);
        announcementArea.setFont(new Font("Consolas",Font.PLAIN,16));
        
        textPanel = new JPanel();
        textPanel.setBounds(430,330,700,250);
        textPanel.add(announcementArea);
        textPanel.setBackground(Color.white);
        textPanel.setOpaque(true);
        textPanel.setLayout(null);
        
        bgLabel = new JLabel();
        bgLabel.setLayout(null);
        bgLabel.setBounds(0,0,1550,850);
        bgLabel.setIcon(bg);
        bgLabel.add(textPanel);
        bgLabel.add(heading);
        bgLabel.add(reset);
        bgLabel.add(publish);
        bgLabel.add(back);
        
        frame_announcement.setSize(1940,1080);
        frame_announcement.setLocationRelativeTo(null);
        frame_announcement.setResizable(false);
        frame_announcement.setTitle("Admin Login");
        frame_announcement.setLayout(null);
        frame_announcement.add(bgLabel);
        frame_announcement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame_announcement.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==publish){
            //this will get the text from this area and display it on the accounts of all teachers
            announcement = announcementArea.getText();
            JOptionPane.showMessageDialog(null, "Announcement made!","Confirmation",JOptionPane.PLAIN_MESSAGE);
            StringBuffer sb1 = new StringBuffer();
            try{
                FileWriter writer = new FileWriter("announcementFile.txt");
                BufferedWriter bw = new BufferedWriter(writer);
                
                sb1.append(announcement);
                bw.write(sb1.toString());
                bw.newLine();
                bw.close();
                writer.close();
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
            frame_announcement.dispose();
            new AdminSection();
            
        }
        else if(e.getSource()==reset){
            //this will clear the text Area
            announcementArea.setText("");
        }
        
        if(e.getSource()==back){
            new AdminSection();
        }
    }
}
