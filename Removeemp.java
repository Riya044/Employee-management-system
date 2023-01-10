
package employee.management.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;


public class Removeemp extends JFrame implements ActionListener{
    Choice cempid;
    JButton delete,back;
    Removeemp(){
        
        
        
        
        getContentPane().setBackground(new Color(255,248,220));
        setLayout(null);
        setUndecorated(true);
        
        //Heading 
        JLabel headings = new JLabel (" Remove Employee ");
        headings.setBounds(200,20,500,50);
        headings.setFont(new Font("Serif", Font.BOLD, 40));
        headings.setForeground(Color.BLACK);
        add(headings);
        
        
        
        
        
        
        
        
        // emp id
        JLabel empid = new JLabel("EMPLOYEE ID");
        empid.setBounds(50,90,200,30);
        empid.setFont(new Font("monospaced", Font.BOLD, 25));
        empid.setForeground(Color.BLACK);
        add(empid);
        
        cempid = new Choice();
        cempid.setBounds(250,95,200,30);
        add(cempid);
        
        try{
            Connection c = new Connection();
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                cempid.add(rs.getString("employeeid"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        // name
        JLabel name = new JLabel("NAME");
        name.setBounds(50,130,200,30);
        name.setFont(new Font("monospaced", Font.BOLD, 25));
        name.setForeground(Color.BLACK);
        add(name);
        
        JLabel tname = new JLabel();
        tname.setBounds(250,130,200,30);
        tname.setFont(new Font("monospaced", Font.BOLD, 30));
        tname.setForeground(Color.BLUE);
        add(tname);
        
        // phone no
        JLabel phone = new JLabel("PHONE NO");
        phone.setBounds(50,170,200,30);
        phone.setFont(new Font("monospaced", Font.BOLD, 25));
        phone.setForeground(Color.BLACK);
        add(phone);
        
        JLabel tphone = new JLabel();
        tphone.setBounds(250,170,200,30);
        tphone.setFont(new Font("monospaced", Font.BOLD, 30));
        tphone.setForeground(Color.BLUE);
        add(tphone);
        
        // email
        JLabel email = new JLabel("EMAIL ID");
        email.setBounds(50,210,200,30);
        email.setFont(new Font("monospaced", Font.BOLD, 25));
        email.setForeground(Color.BLACK);
        add(email);
        
        JLabel temail = new JLabel();
        temail.setBounds(250,210,800,30);
        temail.setFont(new Font("monospaced", Font.BOLD, 30));
        temail.setForeground(Color.BLUE);
        add(temail);
        
        
        //button
       
        delete = new JButton ("DELETE");
        delete.setBounds(150, 300,150, 30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        add(delete);
        
        back = new JButton ("BACK");
        back.setBounds(350, 300,150, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        try{
            Connection c = new Connection();
            String query = "select * from employee where employeeid = '"+cempid.getSelectedItem()+ "'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                tname.setText(rs.getString("name"));
                tphone.setText(rs.getString("phoneno"));
                temail.setText(rs.getString("email"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        cempid.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie) {
                try {
                    Connection c = new Connection();
                    String query = "select * from employee where employeeid = '"+cempid.getSelectedItem()+"'";
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()) {
                        tname.setText(rs.getString("name"));
                        tphone.setText(rs.getString("phoneno"));
                        temail.setText(rs.getString("email"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
            
        
        
        setSize(800,400);
        setLocation(400,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == delete) {
            try {
                Connection c = new Connection();
                String query = "delete from employee where employeeid = '"+cempid.getSelectedItem()+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee Information Deleted Sucessfully");
                setVisible(false);
                new Homepage();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Homepage();
        }
    }
    

    
    public static void main(String args[]){
        new Removeemp();
    }
    
}
