
package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;


public class Viewemp extends JFrame implements ActionListener {
    
    JTable table;
    Choice cempid;
    JButton searchh,print,update,back;
    
    
    Viewemp(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setUndecorated(true);
        
        JLabel search = new JLabel("Search by Employee Id");
        search.setBounds(20,20,150,20);
        add(search);
        
        cempid = new Choice();
        cempid.setBounds(180,20,150,20);
        add(cempid);
        
        
        
        
        table = new JTable();
        try{
            Connection c = new Connection();
            ResultSet rs = c.s.executeQuery("select * from employee");
            
            
            while(rs.next()){
                cempid.add(rs.getString("employeeid"));
                
            }
        }catch (Exception e){
            e.printStackTrace();
            
        }
        try{
            Connection c = new Connection();
            ResultSet rs = c.s.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            while(rs.next()){
                cempid.add(rs.getString("employeeid"));
                
            }
        }catch (Exception e){
            e.printStackTrace();
            
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,100,1000,760);
        add(jsp);
        
        
        searchh = new JButton("Search");
        searchh.setBounds(20, 70,80, 20);
        searchh.addActionListener(this);
        add(searchh);
        
        print = new JButton("Print");
        print.setBounds(120, 70,80, 20);
        print.addActionListener(this);
        add(print);
        
        
        update = new JButton("Update");
        update.setBounds(220, 70,80, 20);
        update.addActionListener(this);
        add(update);
        
        
        back= new JButton("Back");
        back.setBounds(320, 70,80, 20);
        back.addActionListener(this);
        add(back);
        
        
        
        
        setSize(1000,760);
        setLocation(300,50);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== searchh){
            
            String query ="select * from employee where employeeid = '"+cempid.getSelectedItem()+"'";
            try{
                Connection c = new Connection();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }
                catch (Exception e){
                e.printStackTrace();
                }
            
        }else if (ae.getSource()== print){
                
                try{
                    table.print();
                
                }catch (Exception e){
                    e.printStackTrace();
                
                }
            
                
            
            
            
            
        }else if (ae.getSource()== update){
            setVisible(false);
            new Updateemp(cempid.getSelectedItem());
        }else{
            setVisible(false);
            new Homepage();
            
        }
        
    }
    

     public static void main(String args[]){
        new Viewemp();
   }
}
    