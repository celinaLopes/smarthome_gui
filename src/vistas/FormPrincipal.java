
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
    
    //para nao abrir varias janelas aomesmo tempo
   // FormCriarUser criaUser = new FormCriarUser();
    
        public FormPrincipal() {
       //      public FormPrincipal(String user) {
        initComponents();
      //  jLabelUser.setText(user);
        liga.ligarBD();
        }

//    private FormPrincipal() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButtonUsers = new javax.swing.JButton();
        jButtonRegras = new javax.swing.JButton();
        jButtonOutros = new javax.swing.JButton();
        jButtonDispositivos = new javax.swing.JButton();
        jButtonDivisoes = new javax.swing.JButton();
        jButtonCenarios = new javax.swing.JButton();
        jLabelBACK = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUser = new javax.swing.JMenu();
        jMenuItemUser = new javax.swing.JMenuItem();
        jMenuItemDivisao = new javax.swing.JMenuItem();
        jMenuItemDispositivo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Principal");
        getContentPane().setLayout(null);

        jLabel2.setText("utilizador");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 80, 60, 20);

        jLabelUser.setText("jLabel3");
        getContentPane().add(jLabelUser);
        jLabelUser.setBounds(560, 80, 90, 20);

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
        jButtonUsers.setBounds(260, 10, 87, 76);

        jButtonRegras.setText("Regras");
        jButtonRegras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegrasActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonRegras);
        jButtonRegras.setBounds(130, 120, 90, 76);

        jButtonOutros.setText("Outros");
        jButtonOutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOutrosActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonOutros);
        jButtonOutros.setBounds(260, 120, 90, 76);

        jButtonDispositivos.setText("Dispositivos");
        jButtonDispositivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDispositivosActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonDispositivos);
        jButtonDispositivos.setBounds(130, 10, 90, 76);

        jButtonDivisoes.setText("Divisoes");
        jButtonDivisoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisoesActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonDivisoes);
        jButtonDivisoes.setBounds(10, 10, 90, 76);

        jButtonCenarios.setText("Cenários");
        jButtonCenarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCenariosActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonCenarios);
        jButtonCenarios.setBounds(10, 120, 90, 76);

        jLabelBACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/internalframe.png"))); // NOI18N
        jLabelBACK.setText("jLabel2");
        jInternalFrame1.getContentPane().add(jLabelBACK);
        jLabelBACK.setBounds(-10, 0, 650, 240);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 100, 650, 240);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        background.setText("background");
        background.setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().add(background);
        background.setBounds(0, 0, 650, 340);

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
        jMenuItemDivisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemDivisaoMouseClicked(evt);
            }
        });
        jMenuUser.add(jMenuItemDivisao);

        jMenuItemDispositivo.setText("Dispositivo");
        jMenuItemDispositivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemDispositivoMouseClicked(evt);
            }
        });
        jMenuUser.add(jMenuItemDispositivo);

        jMenuBar1.add(jMenuUser);

        jMenu3.setText("Sair");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(664, 403));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuUserMouseClicked

    private void jMenuItemUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemUserMouseClicked

//        
//        try {
//            liga.executaSql("select * from user where username='"+jLabelUser.getText()+"'");
//            liga.rs.first();
//            
//            if(liga.rs.getString("tipo").equals("admin")){  //se for dotipo admin abre o form
//                
//            FormCriarUser criaUser = new FormCriarUser();
//            criaUser.setVisible(true);
//            
//            }else{
//                JOptionPane.showMessageDialog(rootPane,"sem permissão de acesso");
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(rootPane,"sem permissão de acesso");
//            
//        }
    }//GEN-LAST:event_jMenuItemUserMouseClicked

    private void jButtonUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsersActionPerformed
        
//        try {
//            liga.executaSql("select * from user where username='"+jLabelUser.getText()+"'");
//            liga.rs.first();
//            
//            if(liga.rs.getString("tipo").equals("admin")){  //se for dotipo admin abre o form
//                
//            FormCriarUser criaUser = new FormCriarUser();
//            criaUser.setVisible(true);
//            
//            }else{
//                JOptionPane.showMessageDialog(rootPane,"sem permissão de acesso");
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(rootPane,"sem permissão de acesso");
//            
//        }
//      
  FormCriarUser criaUser = new FormCriarUser();
  criaUser.setVisible(true);
    }//GEN-LAST:event_jButtonUsersActionPerformed

    private void jButtonRegrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegrasActionPerformed
       
        FormCriarRegras criaRegras = new FormCriarRegras();
        criaRegras.setVisible(true);
    }//GEN-LAST:event_jButtonRegrasActionPerformed

    private void jButtonOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOutrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOutrosActionPerformed

    private void jButtonDispositivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDispositivosActionPerformed
        
        FormCriarDispositivo criaDispositivo = new FormCriarDispositivo();
        criaDispositivo.setVisible(true);
    }//GEN-LAST:event_jButtonDispositivosActionPerformed

    private void jButtonDivisoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisoesActionPerformed
       
        FormCriarDivisao criaDivisao = new FormCriarDivisao();
        criaDivisao.setVisible(true);
    }//GEN-LAST:event_jButtonDivisoesActionPerformed

    private void jButtonCenariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCenariosActionPerformed
       
        FormCriarCenario criaCenario = new FormCriarCenario();
        criaCenario.setVisible(true);
    }//GEN-LAST:event_jButtonCenariosActionPerformed

    private void jMenuItemDivisaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemDivisaoMouseClicked
        
        FormCriarDivisao criaDivisao = new FormCriarDivisao();
        criaDivisao.setVisible(true);
    }//GEN-LAST:event_jMenuItemDivisaoMouseClicked

    private void jMenuItemDispositivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemDispositivoMouseClicked
        
        FormCriarDispositivo criaDispositivo = new FormCriarDispositivo();
        criaDispositivo.setVisible(true);
    }//GEN-LAST:event_jMenuItemDispositivoMouseClicked

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
    private javax.swing.JButton jButtonCenarios;
    private javax.swing.JButton jButtonDispositivos;
    private javax.swing.JButton jButtonDivisoes;
    private javax.swing.JButton jButtonOutros;
    private javax.swing.JButton jButtonRegras;
    private javax.swing.JButton jButtonUsers;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBACK;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemDispositivo;
    private javax.swing.JMenuItem jMenuItemDivisao;
    private javax.swing.JMenuItem jMenuItemUser;
    private javax.swing.JMenu jMenuUser;
    // End of variables declaration//GEN-END:variables

}
