
package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Homepage extends JFrame implements ActionListener {
    JButton addd,vieww,updatee,removee;
    Homepage(){
        
        setLayout(null);
        setUndecorated(true);
        
        //delete panel
        JPanel trans = new JPanel();
        trans.setSize(400,350);
        trans.setBackground(new Color(0,0,0,90));
        trans.setBounds(280,120,650,300);
        setLayout(null);
        
        JLabel heading = new JLabel ("Employee Details");
        heading.setBounds(400,20,1000,90);
        heading.setFont(new Font("Serif", Font.BOLD, 50));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        
        //image
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/cover.jpg"));
        Image img2 = img1.getImage().getScaledInstance(1120, 700, Image.SCALE_SMOOTH);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel imagee = new JLabel(img3);
        imagee.setBounds(0, 0, 1120, 650);
        add(imagee);
        imagee.add(trans);
        
        
        
        
        
        
        //  add button
        addd = new JButton (" ADD EMPLOYEE  ");
        addd.setBounds(400, 200,170, 40);
        addd.setBackground(Color.BLACK);
        addd.setForeground(Color.WHITE);
        addd.addActionListener(this);
        imagee.add(addd);
        
        // View
        vieww = new JButton ("VIEW EMPLOYEE");
        vieww.setBounds(400, 300,170, 40);
        vieww.setBackground(Color.BLACK);
        vieww.setForeground(Color.WHITE);
        vieww.addActionListener(this);
        imagee.add(vieww);
        
        // update
        updatee= new JButton (" UPDATE EMPLOYEE");
        updatee.setBounds(600, 200,170, 40);
       updatee.setBackground(Color.BLACK);
       updatee.setForeground(Color.WHITE);
       updatee.addActionListener(this);
        imagee.add(updatee);
        
        
        //remove
        removee = new JButton ("REMOVE EMPLOYEE");
        removee.setBounds(600, 300,170, 40);
        removee.setBackground(Color.BLACK);
        removee.setForeground(Color.WHITE);
        removee.addActionListener(this);
        imagee.add(removee);
        
        
        
        setSize(1120,650);
        setLocation(100,80);
        setVisible(true);
        
    }
        
        
        public void actionPerformed(ActionEvent ae){
            
        if(ae.getSource()== addd){
            setVisible(false);
            new AddEmp();
            
        }else if(ae.getSource()== vieww){
            setVisible(false);
            new Viewemp();
            
        }else if (ae.getSource()== updatee){
            setVisible(false);
            new Viewemp();
            
            
        }else{
            setVisible(false);
            new Removeemp();
            
        }
        
    }
    
    
    
    public static void main(String args[]){
        new Homepage();
    }
}
