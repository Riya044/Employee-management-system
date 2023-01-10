
package employee.management.system;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;
//import java.sql.*;

public class AddEmp extends JFrame implements ActionListener{
    
    Random ran=new Random();
    int number=ran.nextInt(99999);
    
    JTextField tname,tfname, tsalary,taddress,tphone,temail,tdesignation;
    JDateChooser ddob;
    JComboBox teducation;
    JLabel tempid;
    JButton addb, backb;
    
    
    
    AddEmp(){
        
        getContentPane().setBackground(new Color(255,248,220));
        setLayout(null);
        setUndecorated(true);
        
        
       //Heading 
        JLabel headings = new JLabel ("Add Employee Details ");
        headings.setBounds(300,30,500,50);
        headings.setFont(new Font("Serif", Font.BOLD, 40));
        headings.setForeground(Color.BLACK);
        add(headings);
        
        
        
        
        
        //name
        JLabel name=new JLabel("Name");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("monospaced", Font.PLAIN, 30));
        name.setForeground(Color.BLACK);
        add(name);
        
        tname = new JTextField();
        tname.setBounds(300,150,150,30);
        tname.setBackground(new Color(230,230,250));
        tname.setBorder(BorderFactory.createLineBorder(new Color(176,196,222)));
        add(tname);
        
        // Employee id
        JLabel empid=new JLabel("Employee Id");
        empid.setBounds(550,150,300,30);
        empid.setFont(new Font("monospaced", Font.PLAIN, 30));
        empid.setForeground(Color.BLACK);
        add(empid);
        
        tempid = new JLabel(""+number);
        tempid.setBounds(800,150,150,30);
        tempid.setFont(new Font("monospaced", Font.PLAIN, 30));
        tempid.setForeground(Color.BLUE);
        add(tempid);
        
        
        
        // fathers name
        JLabel fname=new JLabel("Father's Name");
        fname.setBounds(50,250,250,30);
        fname.setFont(new Font("monospaced", Font.PLAIN, 30));
        fname.setForeground(Color.BLACK);
        add(fname);
       
        
        tfname = new JTextField();
        tfname.setBounds(300,250,150,30);
        tfname.setBackground(new Color(230,230,250));
        tfname.setBorder(BorderFactory.createLineBorder(new Color(176,196,222)));
        add(tfname);
        
        // Dob
        
        JLabel dob=new JLabel("Date Of Birth");
        dob.setBounds(550,250,250,30);
        dob.setFont(new Font("monospaced", Font.PLAIN, 30));
        dob.setForeground(Color.BLACK);
        add(dob);
       
        
        ddob = new JDateChooser();
        ddob.setBounds(800,250,150,30);
        ddob.setBackground(new Color(230,230,250));
        ddob.setBorder(BorderFactory.createLineBorder(new Color(176,196,222)));
        ddob.getDateEditor().setEnabled(false);
        add(ddob);
        
        
        //salary
        JLabel salary=new JLabel("Salary");
        salary.setBounds(50,350,250,30);
        salary.setFont(new Font("monospaced", Font.PLAIN, 30));
        salary.setForeground(Color.BLACK);
        add(salary);
        
        
        tsalary = new JTextField();
        tsalary.setBounds(300,350,150,30);
        tsalary.setBackground(new Color(230,230,250));
        tsalary.setBorder(BorderFactory.createLineBorder(new Color(176,196,222)));
        add(tsalary);
        
        //Address
        JLabel address = new JLabel("Address");
        address.setBounds(550,350,250,30);
        address.setFont(new Font("monospaced", Font.PLAIN, 30));
        address.setForeground(Color.BLACK);
        add(address);
      
        
        taddress = new JTextField();
        taddress.setBounds(800,350,150,30);
        taddress.setBackground(new Color(230,230,250));
        taddress.setBorder(BorderFactory.createLineBorder(new Color(176,196,222)));
        add(taddress);
        
        //Phone
        JLabel phone=new JLabel("Phone No");
        phone.setBounds(50,450,250,30);
        phone.setFont(new Font("monospaced", Font.PLAIN, 30));
        
        phone.setForeground(Color.BLACK);
        add(phone);
       
        
        tphone = new JTextField();
        tphone.setBounds(300,450,150,30);
        tphone.setBackground(new Color(230,230,250));
        tphone.setBorder(BorderFactory.createLineBorder(new Color(176,196,222)));
        add(tphone);
        
        //E-mail
        JLabel email=new JLabel("E-Mail");
        email.setBounds(550,450,250,30);
        email.setFont(new Font("monospaced", Font.PLAIN, 30));
        email.setForeground(Color.BLACK);
        add(email);
       
        
        temail = new JTextField();
        temail.setBounds(800,450,150,30);
        temail.setBackground(new Color(230,230,250));
        temail.setBorder(BorderFactory.createLineBorder(new Color(176,196,222)));
        
        add(temail);
        
        
        // Highest Education
       
        JLabel education = new JLabel("Education");
        education.setBounds(50,550,250,30);
        education.setFont(new Font("monospaced", Font.PLAIN, 30));
        education.setForeground(Color.BLACK);
        add(education);
       
        
        String courses[] = {"B.Tech","BBA","BCA","BA","BSC","M.Tech","MSC","MS","MBA","MA","Phd"};
        teducation = new JComboBox(courses);
        teducation.setBounds(300,550,150,30);
        
        
        add(teducation);
        
        
        //Designation
        JLabel designation=new JLabel("Designation");
        designation.setBounds(550,550,250,30);
        designation.setFont(new Font("monospaced", Font.PLAIN, 30));
        designation.setForeground(Color.BLACK);
        add(designation);
        
        
        tdesignation = new JTextField();
        tdesignation.setBounds(800,550,150,30);
        tdesignation.setBackground(new Color(230,230,250));
        tdesignation.setBorder(BorderFactory.createLineBorder(new Color(176,196,222)));
        add(tdesignation);
        
        
        
        
        
        
        
        //button
        addb = new JButton ("Add Deatils");
        addb.setBounds(300, 650,200, 40);
        addb.setFont(new Font("Serif", Font.PLAIN, 20));
        addb.setBackground(new Color(173,216,230));
        addb.setBorder(BorderFactory.createLineBorder(new Color(173,216,230) ));
        addb.setForeground(Color.BLACK);
        addb.addActionListener(this);
        add(addb);
        
        
        
        //button
        backb = new JButton ("Back");
        backb.setBounds(550, 650,200, 40);
        backb.setFont(new Font("Serif", Font.PLAIN, 20));
        backb.setBackground(new Color(173,216,230));
        backb.setBorder(BorderFactory.createLineBorder(new Color(173,216,230) ));
        
        backb.setForeground(Color.BLACK);
        backb.addActionListener(this);
        add(backb);
        
        
        
        
        setSize(1000,750);
        setLocation(300,50);
        setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()== addb){
             String name= tname.getText();
             String fname= tfname.getText();
             String dob= ((JTextField) ddob.getDateEditor().getUiComponent()).getText();
             String salary= tsalary.getText();
             String email= temail.getText();
             String designation= tdesignation.getText();
             String address= taddress.getText();
             String phone= tphone.getText();
             String education= (String)teducation.getSelectedItem();
             String empid= tempid.getText();
             
             try{
                 Connection c = new Connection();
                 String query="insert into employee values('"+name+"','"+fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+empid+"')";
                 c.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Details added successfully");
                 new Homepage();
             }catch (Exception e){
                 e.printStackTrace();
             }
            
        }
         else{
             setVisible(false);
             new Homepage();
         }
         
         
         
         
     }
    
    
    
    public static void main(String args[]){
        new AddEmp();
    
}
}
