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
import java.awt.Image;
import java.awt.Color;
/**
 *
 * @author anand
 */
public class Adminlogin extends javax.swing.JFrame {

    /** Creates new form Adminlogin */
    public Adminlogin() {
        initComponents();
    }
    public String user;
    public String pass;
    
    public Adminlogin(String msg) {
        initComponents();
        name.setText(msg);
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        cbshow = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undraw_profile_pic_ic5t.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 180, 160));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-close-window-30.png"))); // NOI18N
        btnClose.setFocusPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 24, 24));

        name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name.setText("Welcome");
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 220, 30));

        txtusername.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 1, 14))); // NOI18N
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 260, 50));

        btnlogin.setBackground(new java.awt.Color(204, 204, 255));
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        btnlogin.setText("Login");
        btnlogin.setFocusPainted(false);
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel2.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lifeline Hospital");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your Health is Our Mission");

        exit.setBackground(new java.awt.Color(153, 153, 255));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-macos-close-30.png"))); // NOI18N
        jLabel5.setText("Exit");

        org.jdesktop.layout.GroupLayout exitLayout = new org.jdesktop.layout.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(exitLayout.createSequentialGroup()
                .add(78, 78, 78)
                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(81, 81, 81)
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(exit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(0, 3, Short.MAX_VALUE)
                .add(jLabel2))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(58, 58, 58)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 25, Short.MAX_VALUE)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(46, 46, 46)
                .add(exit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(134, 134, 134))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 470));

        txtpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 1, 14))); // NOI18N
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 260, 50));

        cbshow.setBackground(new java.awt.Color(255, 255, 255));
        cbshow.setText("Show password");
        cbshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbshowActionPerformed(evt);
            }
        });
        jPanel2.add(cbshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 120, 30));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"DO YOU WANT TO CLOSE APPLICATION","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
       exit.setBackground( new Color(9, 50, 236));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground( new Color(153,153, 255));
    }//GEN-LAST:event_exitMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
         Login l=new Login();
         l.setVisible(true);
         dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed

        String user=txtusername.getText();
        String pass=txtpassword.getText();
        String n=name.getText();
        
        if(n=="Admin"){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Admin");
                String query="select * from admin where username=? and password=md5(?)";
                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1,user);
                ps.setString(2,pass);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    new admin(user).setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(this,"Incorrect username or password");
                    txtusername.setText("");
                    txtpassword.setText("");
                }
        }
            catch(Exception e){
                System.out.println("Error "+e.getMessage());
            }
        }
        else if(n=="Doctor"){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Admin");
                String query="select id from doctor where username=? and password=md5(?)";
                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1,user);
                ps.setString(2,pass);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    int a=rs.getInt(1);
                    new doctor(user,a).setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(this,"Incorrect username or password");
                    txtusername.setText("");
                    txtpassword.setText("");
                }  
        }
            catch(Exception e){
                System.out.println("Error "+e.getMessage());
            }
        }
        else if(n=="Receptionist"){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Admin");
                String query="select id from receptionist where username=? and password=md5(?)";
                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1,user);
                ps.setString(2,pass);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    int a=rs.getInt(1);
                    new Receptionist(user,a).setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(this,"Incorrect username or password");
                    txtusername.setText("");
                    txtpassword.setText("");
                }  
        }
            catch(Exception e){
                System.out.println("Error "+e.getMessage());
            }
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void cbshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbshowActionPerformed
        if(cbshow.isSelected()){
            txtpassword.setEchoChar((char)0);
        }
        else{
            txtpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_cbshowActionPerformed

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
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnlogin;
    private javax.swing.JCheckBox cbshow;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

}
