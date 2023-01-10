
package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class Updateemp extends JFrame implements ActionListener{
    
    
    
    JTextField teducation,tfname, tsalary,taddress,tphone,temail,tdesignation;
    
    JLabel tempid;
    JButton addb, backb;
    String employeeid;
     
    
    Updateemp(String employeeid){
        
        
        this.employeeid = employeeid;
         getContentPane().setBackground(new Color(255,248,220));
        setLayout(null);
        setUndecorated(true);
        
        
       //Heading 
       JLabel headings = new JLabel ("Update Employee Details ");
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
        
        JLabel lblname = new JLabel();
        lblname .setBounds(300,150,150,30);
        lblname.setFont(new Font("monospaced", Font.PLAIN, 20));
        lblname.setForeground(Color.BLUE);
        add(lblname );
        
        // Employee id
        JLabel empid=new JLabel("Employee Id");
        empid.setBounds(550,150,300,30);
        empid.setFont(new Font("monospaced", Font.PLAIN, 30));
        empid.setForeground(Color.BLACK);
        add(empid);
        
        tempid = new JLabel();
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
        
        JLabel lbldob = new JLabel();
        lbldob.setBounds(800,250,150,30);
        lbldob.setFont(new Font("monospaced", Font.PLAIN, 20));
        lbldob.setForeground(Color.BLUE);
        add(lbldob);
        
        
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
        temail.setBorder(BorderFactory.createLineBorder(new Color(176,196,222)));
        
        add(temail);
        
        
        // Highest Education
       
        JLabel education = new JLabel("Education");
        education.setBounds(50,550,250,30);
        education.setFont(new Font("monospaced", Font.PLAIN, 32));
        education.setForeground(Color.BLACK);
        add(education);
        
        
        teducation =new JTextField();
        teducation.setBounds(300,550,150,30);
        teducation.setBackground(new Color(230,230,250));
        teducation.setBorder(BorderFactory.createLineBorder(new Color(176,196,222)));
        
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
        
        
        
        
        
        try{
            Connection c = new Connection();
            String query = "select * from employee where employeeid = '"+employeeid+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                lblname.setText(rs.getString("name"));
                tfname.setText(rs.getString("fname"));
                lbldob.setText(rs.getString("dob"));
                tsalary.setText(rs.getString("salary"));
                taddress.setText(rs.getString("address"));
                tphone.setText(rs.getString("phoneno"));
                temail.setText(rs.getString("email"));
                teducation.setText(rs.getString("education"));
                tdesignation.setText(rs.getString("designation"));
                tempid.setText(rs.getString("employeeid"));
                
                
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        
        
        //button
        addb = new JButton ("Update Deatils");
        addb.setBounds(300, 650,200, 40);
        addb.setBackground(new Color(173,216,230));
        addb.setBorder(BorderFactory.createLineBorder(new Color(173,216,230) ));
        addb.setForeground(Color.BLACK);
        addb.addActionListener(this);
        add(addb);
        
        
        
        //button
        backb = new JButton ("Back");
        backb.setBounds(550, 650,200, 40);
        backb.setBackground(new Color(173,216,230));
        backb.setBorder(BorderFactory.createLineBorder(new Color(173,216,230) ));
        backb.setForeground(Color.BLACK);
        backb.addActionListener(this);
        add(backb);
        
        
        
        //frame 
        setSize(1000,750);
        setLocation(300,50);
        setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()== addb){
             
             
             String fname= tfname.getText();
             
             String salary= tsalary.getText();
             String email= temail.getText();
             String designation= tdesignation.getText();
             String address= taddress.getText();
             String phone= tphone.getText();
             String education= teducation.getText();
            
             
             try{
                 Connection c = new Connection();
                 String query="update employee set fname ='"+fname+"',salary='"+salary+"',address='"+address+"',phoneno='"+phone+"',email='"+email+"',education = '"+education+"',designation = '"+designation+"' where employeeid ='"+employeeid+"'" ;
                 c.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Details updated successfully");
                 setVisible(false);
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
        new Updateemp("");
    
}
}

