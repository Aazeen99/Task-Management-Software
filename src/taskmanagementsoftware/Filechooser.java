package taskmanagementsoftware;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Filechooser implements ActionListener{
    JFrame jf=new JFrame();
    JPanel jp=new JPanel();
    
    JTextArea jta=new JTextArea();
    JTextField jt=new JTextField();
    
    JLabel jl=new JLabel("Add to the following teachers: ");

    JButton Add=new JButton("Add");
    JButton back=new JButton("Back");
    
    File f=new File("Task assigned.txt");
    String st1;
Filechooser(String st1){
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

    Add.setBounds(350,480,70,30);
    Add.setBackground(Color.blue);
    Add.setOpaque(true);
    Add.setForeground(Color.white);
    Add.addActionListener(this);
    
    back.setBounds(430,480,70,30);
    back.setBackground(Color.white);
    back.setOpaque(true);
    back.setForeground(Color.blue);
    back.addActionListener(this);

    jl.setBounds(30,480,190,30);


    jf.add(jt);
    jf.add(jta);
    jf.add(Add);
    jf.add(back);
    jf.add(jl);
    jf.setLayout(null);
    jf.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Add){
            String ID=jt.getText();
            StringBuffer sb=new StringBuffer();
            try {
                FileWriter writer=new FileWriter(f,true);
                BufferedWriter bw=new BufferedWriter(writer);
                sb.append(ID+","+st1);
                bw.write(sb.toString());
                bw.newLine();
                bw.close();
                writer.close();
            } catch (IOException ev) {
                ev.printStackTrace();
            }
            jf.dispose();
        }
        if(e.getSource()==back){
            jf.setVisible(false);
            jf.dispose();
        }
    }

}
