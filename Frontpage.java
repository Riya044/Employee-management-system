
package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Frontpage extends JFrame implements ActionListener{
    Frontpage()
    {   setLayout(null);
        setUndecorated(true);
        
        
        
        
        
        
        //Heading 
        
        JLabel headings = new JLabel ("ABC COMPANY ");
        headings.setBounds(300,50,1200,80);
        headings.setFont(new Font("Serif", Font.BOLD, 80));
        headings.setForeground(Color.WHITE);
        add(headings);
        
        
        // image 
        
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image img2 = img1.getImage().getScaledInstance(1170, 700, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel imagee = new JLabel(img3);
        imagee.setBounds(0, 0, 1170, 650);
        add(imagee);
        
        
        
        
        //button
        JButton continuee = new JButton ("CLICK HERE TO CONTINUE");
        continuee.setBounds(450, 500,300, 70);
        continuee.setBackground(Color.BLACK);
        continuee.setForeground(Color.WHITE);
        
        continuee.addActionListener(this);
        
        imagee.add(continuee);
        
        
        
        
        
        setSize(1170,650);
        setLocation(100,80);
        setVisible(true);
        
        
        while(true){
            headings.setVisible(false);
            try{
                Thread.sleep(800);
                
               }catch(Exception e){
                
            }
            
            headings.setVisible(true);
            try{
                Thread.sleep(800);
                
               }catch(Exception e){
                
            }
        }
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
        
        
    }

    
    public static void main(String args[]) {
        new Frontpage();
        
    }
}
