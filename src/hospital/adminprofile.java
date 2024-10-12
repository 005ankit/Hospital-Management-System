/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;
import java.sql.*;
import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
/**
 *
 * @author anand
 */
public class adminprofile extends javax.swing.JFrame {

    /** Creates new form adminprofile */
    public adminprofile() {
        initComponents();
    }

    public adminprofile(String name,String user) {
        initComponents();
        
        if(name.equals("Admin")){
            getContentPane().add(dcdoj);
            getContentPane().add(txtspe);
            getContentPane().add(jLabel8);
            getContentPane().add(jLabel9);
            getContentPane().remove(dcdoj);
            getContentPane().remove(txtspe);
            getContentPane().remove(jLabel8);
            getContentPane().remove(jLabel9);
            getContentPane().revalidate();
            getContentPane().repaint();
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Admin");
                String q="Select * from admin where username=?";
                PreparedStatement ps=con.prepareStatement(q);
                ps.setString(1,user);
                ResultSet rs=ps.executeQuery();
                String i,n,p,e,u,pa,c,g;
                long milliseconds = System.currentTimeMillis();
                Date d= new Date(milliseconds);
                while(rs.next()){
                    i=rs.getString(1);
                    n=rs.getString(2);
                    p=rs.getString(3);
                    e=rs.getString(4);
                    u=rs.getString(5);
                    pa=rs.getString(6);
                    d=rs.getDate(7);
                    c=rs.getString(8);
                    g=rs.getString(9);
                            
                    lblid.setText(i);
                    txtname.setText(n);
                    txtmob.setText(p);
                    txtemail.setText(e);
                    txtusername.setText(u);
                    txtusername.setEditable(false);
                    dcdob.setDate(d);
                    txtcity.setText(c);
                    if(g.equals("Male")){
                        rbmale.setSelected(true);
                    }
                    else if(g.equals("Female")){
                        rbfemale.setSelected(true);
                    }
                    else{
                        rbother.setSelected(true);
                    }
                }
            }
            catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
           
        }else if(name.equals("Receptionist")){
            getContentPane().add(jLabel9);
            getContentPane().add(txtspe);
            getContentPane().remove(txtspe);
            getContentPane().remove(jLabel9);
            getContentPane().revalidate();
            getContentPane().repaint();
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Admin");
                String q="Select * from receptionist where username=?";
                PreparedStatement ps=con.prepareStatement(q);
                ps.setString(1,user);
                ResultSet rs=ps.executeQuery();
                String i,n,p,e,u,pa,c,g;
                long milliseconds = System.currentTimeMillis();
                Date d= new Date(milliseconds);
                long milliseconds1 = System.currentTimeMillis();
                Date d1= new Date(milliseconds1);
                while(rs.next()){
                    i=rs.getString(1);
                    n=rs.getString(2);
                    d1=rs.getDate(3);
                    p=rs.getString(4);
                    e=rs.getString(5);
                    u=rs.getString(6);
                    pa=rs.getString(7);
                    d=rs.getDate(8);
                    c=rs.getString(9);
                    g=rs.getString(10);
                            
                    lblid.setText(i);
                    txtname.setText(n);
                    dcdoj.setDate(d1);
                    txtmob.setText(p);
                    txtemail.setText(e);
                    txtusername.setText(u);
                    txtusername.setEditable(false);
                    dcdob.setDate(d);
                    txtcity.setText(c);
                    if(g.equals("Male")){
                        rbmale.setSelected(true);
                    }
                    else if(g.equals("Female")){
                        rbfemale.setSelected(true);
                    }
                    else{
                        rbother.setSelected(true);
                    }
                }
            }
            catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        else if(name.equals("Doctor")){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Admin");
                String q="Select * from doctor where username=?";
                PreparedStatement ps=con.prepareStatement(q);
                ps.setString(1,user);
                ResultSet rs=ps.executeQuery();
                String i,n,p,e,u,pa,c,g,s;
                long milliseconds = System.currentTimeMillis();
                Date d= new Date(milliseconds);
                long milliseconds1 = System.currentTimeMillis();
                Date d1= new Date(milliseconds1);
                while(rs.next()){
                    i=rs.getString(1);
                    n=rs.getString(2);
                    d1=rs.getDate(3);
                    p=rs.getString(4);
                    e=rs.getString(5);
                    u=rs.getString(6);
                    pa=rs.getString(7);
                    d=rs.getDate(8);
                    c=rs.getString(9);
                    g=rs.getString(10);
                    s=rs.getString(11);
                            
                    lblid.setText(i);
                    txtname.setText(n);
                    dcdoj.setDate(d1);
                    txtmob.setText(p);
                    txtemail.setText(e);
                    txtusername.setText(u);
                    txtusername.setEditable(false);
                    dcdob.setDate(d);
                    txtcity.setText(c);
                    if(g.equals("Male")){
                        rbmale.setSelected(true);
                    }
                    else if(g.equals("Female")){
                        rbfemale.setSelected(true);
                    }
                    else{
                        rbother.setSelected(true);
                    }
                    txtspe.setText(s);
                }
            }
            catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gendergroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        rbother = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmob = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dcdob = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtspe = new javax.swing.JTextField();
        btnedit = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        dcdoj = new com.toedter.calendar.JDateChooser();
        btnexit = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Gender: ");

        rbmale.setBackground(new java.awt.Color(255, 255, 255));
        Gendergroup.add(rbmale);
        rbmale.setText("Male");

        rbfemale.setBackground(new java.awt.Color(255, 255, 255));
        Gendergroup.add(rbfemale);
        rbfemale.setText("Female");

        rbother.setBackground(new java.awt.Color(255, 255, 255));
        Gendergroup.add(rbother);
        rbother.setText("Other");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Edit My Profile");

        jLabel2.setText("Name");

        jLabel3.setText("Mobile Number: ");

        jLabel4.setText("Email: ");

        jLabel5.setText("Username: ");

        jLabel6.setText("Date of  Birth : ");

        jLabel7.setText("City: ");

        jLabel8.setText("Date of Joining: ");

        jLabel9.setText("Specialization: ");

        btnedit.setBackground(new java.awt.Color(255, 224, 128));
        btnedit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-checkmark-30.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(106, 255, 103));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-home-30.png"))); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-close-window-30.png"))); // NOI18N
        btnexit.setFocusable(false);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        lblid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblid.setText("jLabel11");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 321, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(110, 110, 110)
                .add(btnexit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(jPanel1Layout.createSequentialGroup()
                .add(28, 28, 28)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(134, 134, 134))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(txtmob, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(txtemail)
                                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(txtname))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(lblid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(57, 57, 57)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(dcdob, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                        .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(txtcity))
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(txtusername, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                        .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                .add(rbmale, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(rbfemale, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(rbother, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(107, 107, 107)
                                .add(dcdoj, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                .add(181, 181, 181)
                                .add(btnedit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(37, 37, 37)
                                .add(btnback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE)))
                        .add(30, 30, 30))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtspe, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 223, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 416, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(lblid))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(11, 11, 11)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                            .add(jPanel1Layout.createSequentialGroup()
                                                .add(jLabel2)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(txtname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jPanel1Layout.createSequentialGroup()
                                                .add(jLabel5)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(txtusername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                                .add(28, 28, 28)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jLabel3)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(txtmob, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jLabel6)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(dcdob, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(29, 29, 29)
                                .add(jLabel7)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtcity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtemail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel10)
                            .add(jLabel8))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(rbmale)
                            .add(rbfemale)
                            .add(rbother)))
                    .add(btnexit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(64, 64, 64)
                        .add(dcdoj, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(txtspe, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(32, 32, 32)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnedit)
                    .add(btnback))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        String name=txtname.getText();
        String gender;
        String phone=txtmob.getText();
        String user=txtusername.getText();
        String email=txtemail.getText();
        String city=txtcity.getText();
            
        if(rbmale.isSelected()){
            gender="Male";
        }
        else if(rbfemale.isSelected()){
            gender="Female";
        }
        else if(rbother.isSelected()){
            gender="Other";
        }else{
            JOptionPane.showMessageDialog(this,"Please select Gender");
             return;  
        }
        
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter Name");
            txtname.setBackground(new Color(246, 53, 40));
            return;
        }
        if(phone.matches("^[0-9]*$")==false || phone.length()!=10){
            JOptionPane.showMessageDialog(this,"Please check Phone Number");
            txtmob.setBackground(new Color(246, 53, 40));
            return;
        }
        if(email.matches("[a-zA-Z0-9\\-\\.]+@[a-z]+\\.[a-z]{2,3}")==false){
            JOptionPane.showMessageDialog(this,"Please check email");
            txtemail.setBackground(new Color(246, 53, 40));
            return;
        }
         if(city.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter city");
            txtcity.setBackground(new Color(246, 53, 40));
            return;
        }
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Admin");
            String query1="update admin Set name=?,phone=?,email=?,dob=?,city=?,gender=? Where username=?";
            PreparedStatement ps2=con.prepareStatement(query1);
            ps2.setString(1,txtname.getText());
            ps2.setString(2,txtmob.getText());
            ps2.setString(3,txtemail.getText());;
            try{
                java.util.Date utilDate = dcdob.getDate();
                long milliseconds = utilDate.getTime();
                java.sql.Date sqlDate = new java.sql.Date(milliseconds);
                ps2.setDate(4,sqlDate);
                }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Please Enter Date of Birth");
                return;
            }
            ps2.setString(5,txtcity.getText());
            ps2.setString(6,gender);
            ps2.setString(7,txtusername.getText());
            int a1=ps2.executeUpdate();
            if(a1>0){
            JOptionPane.showMessageDialog(this,"Edited succussfully !!!");
            dispose();
            return;
            }  
            
            else{
                try{
                String query="update receptionist Set name=?,doj=?,phone=?,email=?,dob=?,city=?,gender=? Where username=?";
                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1,txtname.getText());
                try{
                java.util.Date utilDate1 = dcdoj.getDate();
                long milliseconds1 = utilDate1.getTime();
                java.sql.Date sqlDate1 = new java.sql.Date(milliseconds1);
                ps.setDate(2,sqlDate1);
                }
                catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Please Enter Date of joining");
                dcdoj.setBackground(new Color(246, 53, 40));
                return;
                }
                ps.setString(3,txtmob.getText());
                 ps.setString(4,txtemail.getText());
                try{
                    java.util.Date utilDate = dcdob.getDate();
                    long milliseconds = utilDate.getTime();
                    java.sql.Date sqlDate = new java.sql.Date(milliseconds);
                    ps.setDate(5,sqlDate);
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(this,"Please Enter Date of Birth");
                    dcdob.setBackground(new Color(246, 53, 40));
                    return;
                }
                ps.setString(6,txtcity.getText());
                ps.setString(7,gender);
                ps.setString(8,txtusername.getText());
                int a=ps.executeUpdate();
                if(a>0){
                    JOptionPane.showMessageDialog(this,"Updated succussfully !!!");
                    dispose();
                    return;
                }
                        else{
                            try{
                                String query2="update doctor Set name=?,doj=?,phone=?,email=?,dob=?,city=?,gender=?,specialization=? Where username=?";
                                PreparedStatement ps1=con.prepareStatement(query2);
                                ps1.setString(1,txtname.getText());
                                try{
                                    java.util.Date utilDate1 = dcdoj.getDate();
                                    long milliseconds1 = utilDate1.getTime();
                                    java.sql.Date sqlDate1 = new java.sql.Date(milliseconds1);
                                    ps1.setDate(2,sqlDate1);
                                }
                                catch(Exception ex){
                                    JOptionPane.showMessageDialog(this,"Please Enter Date of joining");
                                    dcdoj.setBackground(new Color(246, 53, 40));
                                    return;
                                }  

                                ps1.setString(3,txtmob.getText());
                                ps1.setString(4,txtemail.getText());
                                try{
                                    java.util.Date utilDate = dcdob.getDate();
                                    long milliseconds = utilDate.getTime();
                                    java.sql.Date sqlDate = new java.sql.Date(milliseconds);
                                    ps1.setDate(5,sqlDate);
                                }
                                catch(Exception ex){
                                    JOptionPane.showMessageDialog(this,"Please Enter Date of Birth");
                                    dcdob.setBackground(new Color(246, 53, 40));
                                    return;
                                }
                                ps1.setString(6,txtcity.getText());
                                ps1.setString(7,gender);
                                ps1.setString(8,txtspe.getText());
                                ps1.setString(9,txtusername.getText());
                                int a2=ps1.executeUpdate();
                                if(a2>0){
                                    JOptionPane.showMessageDialog(this,"Updated succussfully !!!");
                                    dispose();
                                    return;
                                }
                                else{
                                    JOptionPane.showMessageDialog(this,"You can not change username");
                                }
                                
                            }
                            catch(Exception e){
                                System.out.println("Error: "+e.getMessage());
                            }
                        }
                    }
                    catch(Exception e){
                        System.out.println("Error: "+e.getMessage());
                    }
                }
           }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gendergroup;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnexit;
    private com.toedter.calendar.JDateChooser dcdob;
    private com.toedter.calendar.JDateChooser dcdoj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblid;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JRadioButton rbother;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtspe;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

}
