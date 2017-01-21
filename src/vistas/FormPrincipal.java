
package vistas;

import controlo.LigacaoBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Celina
 */
public class FormPrincipal extends javax.swing.JFrame {

    LigacaoBD liga = new LigacaoBD();       //variavel global
    
        public FormPrincipal() {
        initComponents();
        liga.ligarBD();
        }

//    public FormPrincipal(String user) {
//        initComponents();
//        liga.ligarBD();
//        jLabelUser.setText(user);
//       
//    }
//
//    private FormPrincipal() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButtonUsers = new javax.swing.JButton();
        jButtonDivisoes = new javax.swing.JButton();
        jButtonDispositivos = new javax.swing.JButton();
        jLabelUser = new javax.swing.JLabel();
        jLabelBACK = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUser = new javax.swing.JMenu();
        jMenuItemUser = new javax.swing.JMenuItem();
        jMenuItemDivisao = new javax.swing.JMenuItem();
        jMenuItemDispositivo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Principal");
        getContentPane().setLayout(null);

        jInternalFrame1.setTitle("Gestão Sistema");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        jButtonUsers.setText("Utilizadores");
        jButtonUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsersActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonUsers);
        jButtonUsers.setBounds(10, 11, 87, 76);

        jButtonDivisoes.setText("Divisoes");
        jInternalFrame1.getContentPane().add(jButtonDivisoes);
        jButtonDivisoes.setBounds(115, 11, 96, 76);

        jButtonDispositivos.setText("Dispositivos");
        jInternalFrame1.getContentPane().add(jButtonDispositivos);
        jButtonDispositivos.setBounds(229, 11, 105, 76);

        jLabelUser.setText("jLabel3");
        jInternalFrame1.getContentPane().add(jLabelUser);
        jLabelUser.setBounds(0, 150, 140, 14);

        jLabelBACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/internalframe.png"))); // NOI18N
        jLabelBACK.setText("jLabel2");
        jInternalFrame1.getContentPane().add(jLabelBACK);
        jLabelBACK.setBounds(0, 0, 534, 170);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 80, 540, 200);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        background.setText("background");
        background.setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().add(background);
        background.setBounds(0, 0, 540, 279);

        jMenuUser.setText("Registar");
        jMenuUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuUserMouseClicked(evt);
            }
        });

        jMenuItemUser.setText("Utilizador");
        jMenuItemUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemUserMouseClicked(evt);
            }
        });
        jMenuUser.add(jMenuItemUser);

        jMenuItemDivisao.setText("Divisao");
        jMenuUser.add(jMenuItemDivisao);

        jMenuItemDispositivo.setText("Dispositivo");
        jMenuUser.add(jMenuItemDispositivo);

        jMenuBar1.add(jMenuUser);

        jMenu2.setText("Relatorios");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sair");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(554, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuUserMouseClicked

    private void jMenuItemUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemUserMouseClicked
        
//         try {
//          liga.executaSql("select * from utilizador where username = '"+jLabelUser.getText()+"'");
//          liga.rs.first();
//          
//          if(liga.rs.getString("tipo").equals("proprietario")){
//              
//          
//          FormCriarUser criaUser = new FormCriarUser();
//          criaUser.setVisible(true);
//          
//          }else{
//              JOptionPane.showMessageDialog(rootPane,"sem permissão de acesso");
//          }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(rootPane,"sem permissão de acesso");
//        }

    }//GEN-LAST:event_jMenuItemUserMouseClicked

    private void jButtonUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsersActionPerformed
        
        FormCriarUser criaUser = new FormCriarUser();
        criaUser.setVisible(true);
    }//GEN-LAST:event_jButtonUsersActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButtonDispositivos;
    private javax.swing.JButton jButtonDivisoes;
    private javax.swing.JButton jButtonUsers;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBACK;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemDispositivo;
    private javax.swing.JMenuItem jMenuItemDivisao;
    private javax.swing.JMenuItem jMenuItemUser;
    private javax.swing.JMenu jMenuUser;
    // End of variables declaration//GEN-END:variables

}
