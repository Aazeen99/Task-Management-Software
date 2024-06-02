package taskmanagementsoftware;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteAccount extends JFrame implements ActionListener{

    JFrame jf=new JFrame();
    JPanel jp=new JPanel();
    
    JTextArea jta=new JTextArea();
    JTextField jt=new JTextField();
    
    JLabel jl=new JLabel("Delete the teacher: ");

    JButton delete=new JButton("Delete");
    JButton back=new JButton("Back");
    
    File f=new File("Task assigned.txt");
    String st1;
    
    DeleteAccount(){
        this.st1=st1;

    jf.setBounds(500,100,600,600);
    jf.setResizable(false);
    jf.setTitle("Task Assignment Section");
    jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    try {
        FileReader reader=new FileReader("C:\\Users\\aazee\\Documents\\NetBeansProjects\\TaskManagementSoftware\\TeacherFile.txt");
        BufferedReader br=new BufferedReader(reader);
        String line1;
        int i=1;
        while((line1 = br.readLine())!=null){
            String[] str2 = line1.split(",");
       for(String w: str2){
           if(i%3==0){
               jta.append(w+"\n");
           }
           else {
               jta.append(w+"  ");
           }
           i++;
       }

        }
        br.close();
        reader.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

    jta.setBounds(90,40,400,400);
    jta.setLineWrap(true);
    jta.setEditable(false);
    jta.setFont(new Font("Open Sans",Font.PLAIN,15));

    jt.setBounds(220,480,120,30);

    delete.setBounds(350,480,100,30);
    delete.setBackground(Color.blue);
    delete.setOpaque(true);
    delete.setForeground(Color.white);
    delete.addActionListener(this);
    delete.setFocusable(false);
    
    back.setBounds(460,480,70,30);
    back.setBackground(Color.white);
    back.setOpaque(true);
    back.setForeground(Color.blue);
    back.setFocusable(false);
    back.addActionListener(this);

    jl.setBounds(30,480,190,30);

    jf.add(jt);
    jf.add(jta);
    jf.add(delete);
    jf.add(back);
    jf.add(jl);
    jf.setLayout(null);
    jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==delete){
            String ID = jt.getText();
            String currentLine;
            String[] data;
            File oldfile =new File("TeacherFile.txt");
            File newfile=new File("DeletedAccounts.txt");
            StringBuffer sb1 = new StringBuffer();
            
            try{
                FileWriter writer = new FileWriter("DeletedAccounts.txt",true);
                BufferedWriter bw = new BufferedWriter(writer);
                PrintWriter pw=new PrintWriter(bw);
                
                FileReader fr = new FileReader("TeacherFile.txt");
                BufferedReader br = new BufferedReader(fr);
                
                while((currentLine=br.readLine())!=null){
                    data = currentLine.split(",");
                    if(!(data[0].equalsIgnoreCase(ID))){
                        pw.println(currentLine);
                    }
                }
                pw.flush();
                pw.close();
                fr.close();
                br.close();
                bw.close();
                writer.close();
                oldfile.delete();
                File dump=new File("TeacherFile.txt");
                newfile.renameTo(dump);
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
            jf.dispose();
        }
        if(e.getSource()==back){
            jf.setVisible(false);
            jf.dispose();
        }
    }
}
