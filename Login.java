
package employee.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;




public class Login  extends JFrame implements ActionListener {
    
    JTextField tusername,tpassw;
    Login()
    {
        setLayout(null);
        setUndecorated(true);
        
        
        
        
        //heading
        
        JLabel heading = new JLabel ("EMPLOYEE");
        heading.setBounds(50,70,300,90);
        heading.setFont(new Font("monospaced", Font.PLAIN, 50));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel heading1 = new JLabel ("Management System ");
        heading1.setBounds(60,120,300,90);
        heading1.setFont(new Font("monospaced", Font.PLAIN, 20));
        heading1.setForeground(Color.WHITE);
        add(heading1);
        
        
        
        JLabel heading2 = new JLabel (" LOGIN NOW ");
        heading2.setBounds(460,110,300,50);
        heading2.setFont(new Font("monospaced", Font.PLAIN, 40));
        heading2.setForeground(Color.WHITE);
        add(heading2);
        
        
        
        
        
        //username
        
        tusername = new JTextField("   Enter Username");
        tusername.setBounds(500,200,200,30);
        tusername.setBackground(new Color(160,160,160));
        add(tusername);
        
        
        
        //password
        tpassw = new JTextField("   Enter Password");
        tpassw.setBounds(500,250,200,30);
        tpassw.setBackground(new Color(160,160,160));
        add(tpassw);
        
        
        //button
        JButton login = new JButton ("LOGIN");
        login.setBounds(500, 350,200, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        //image
        
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/color.png"));
        Image img2 = img1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel imagee = new JLabel(img3);
        imagee.setBounds(0, 0, 350, 500);
        add(imagee);
        
        
        ImageIcon img11 = new ImageIcon(ClassLoader.getSystemResource("icons/color2.png"));
        Image img21 = img11.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon img31 = new ImageIcon(img21);
        JLabel imageee = new JLabel(img31);
        imageee.setBounds(350, 0, 500, 500);
        add(imageee);
        
        
        ImageIcon img12 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image img22 = img12.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon img32 = new ImageIcon(img22);
        JLabel imagee1 = new JLabel(img32);
        imagee1.setBounds(60, 220, 200, 200);
        imagee.add(imagee1);
        
        
        
        setSize(800,500);
        setLocation(300,150);
        setVisible(true);
        
       
        
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        try{
            String username=tusername.getText();
            String password=tpassw.getText();
            
            Connection c = new Connection();
            String query="select * from login where username='"+username+"'and password='"+password+"'";
            ResultSet rs=c.s.executeQuery(query);
            if (rs.next()){
                setVisible(false);
                new Homepage();
                
                
            } else{
                JOptionPane.showMessageDialog(null,"Invalid username or password");
                setVisible(false);
            }
           
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
 


        
    
    
    public static void main(String[]args){
        new Login();
        
}
}

    

