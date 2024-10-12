/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;
import javax.swing.*;
/**
 *
 * @author anand
 */
public class doctor extends javax.swing.JFrame {

    /** Creates new form doctor */
    public doctor() {
        initComponents();
    }

    public doctor(String user,int id) {
        initComponents();
        lblid.setText(String.valueOf(id));
        lblusername.setText(user);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        viewdoctor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        viewappointement = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        viewprofile = new javax.swing.JMenuItem();
        change = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        Close = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1300, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 255));
        jLabel1.setText("Doctor Desktop");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 430, 60));

        lblid.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblid.setForeground(new java.awt.Color(255, 0, 102));
        lblid.setText("Id");
        getContentPane().add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 34, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Hello");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 70, -1));

        lblusername.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        lblusername.setText("username");
        getContentPane().add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 140, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 153));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 330, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-doctor-48.png"))); // NOI18N
        jMenu1.setText("Doctor");

        viewdoctor.setText("View Doctors");
        viewdoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewdoctorActionPerformed(evt);
            }
        });
        jMenu1.add(viewdoctor);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/list of members.png"))); // NOI18N
        jMenu2.setText("Appointments");

        viewappointement.setText("View Appointments");
        viewappointement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewappointementActionPerformed(evt);
            }
        });
        jMenu2.add(viewappointement);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-administrator-male-48.png"))); // NOI18N
        jMenu3.setText("Profile");

        viewprofile.setText("View profile");
        viewprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewprofileActionPerformed(evt);
            }
        });
        jMenu3.add(viewprofile);

        change.setText("Change password");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        jMenu3.add(change);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(255, 51, 51));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        jMenu4.setText("Exit");

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu4.add(logout);

        Close.setText("Close Application");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jMenu4.add(Close);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewprofileActionPerformed
       String name="Doctor";
       String user=lblusername.getText();
       new adminprofile(name,user).setVisible(true);
    }//GEN-LAST:event_viewprofileActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void viewappointementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewappointementActionPerformed
        int id=Integer.parseInt(lblid.getText());
        new viewappointement(id).setVisible(true);
        
    }//GEN-LAST:event_viewappointementActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        String user=lblusername.getText();
        new changepassword(user).setVisible(true);
    }//GEN-LAST:event_changeActionPerformed

    private void viewdoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewdoctorActionPerformed
        String user=lblusername.getText();
        new viewdoctor(user).setVisible(true);
    }//GEN-LAST:event_viewdoctorActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"DO YOU WANT TO CLOSE APPLICATION","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Close;
    private javax.swing.JMenuItem change;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblusername;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenuItem viewappointement;
    private javax.swing.JMenuItem viewdoctor;
    private javax.swing.JMenuItem viewprofile;
    // End of variables declaration//GEN-END:variables

}
