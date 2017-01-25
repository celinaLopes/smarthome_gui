
package vistas;

import controlo.ControloCriarRegras;
import controlo.LigacaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloCriarRegras;

/**
 *
 * @author Celina
 */
public class FormCriarRegras extends javax.swing.JFrame {
    
    LigacaoBD liga = new LigacaoBD();
    ModeloCriarRegras mod = new ModeloCriarRegras();
    ControloCriarRegras controlo = new ControloCriarRegras();


    public FormCriarRegras() {
        initComponents();
        preencherDivisao();
        preencherDispositivos();
        preencherCenario();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaScript = new javax.swing.JTextArea();
        jComboBoxNomeDispositivo = new javax.swing.JComboBox<>();
        jComboBoxNomeCenario = new javax.swing.JComboBox<>();
        jComboBoxNomeDivisao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIDRegra = new javax.swing.JTextField();
        jButtonGravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Regra Cenario");
        getContentPane().setLayout(null);

        jLabel1.setText("script");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(78, 191, 39, 20);

        jTextAreaScript.setColumns(20);
        jTextAreaScript.setRows(5);
        jScrollPane1.setViewportView(jTextAreaScript);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(127, 164, 263, 131);

        jComboBoxNomeDispositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomeDispositivoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNomeDispositivo);
        jComboBoxNomeDispositivo.setBounds(226, 100, 90, 20);

        getContentPane().add(jComboBoxNomeCenario);
        jComboBoxNomeCenario.setBounds(350, 100, 110, 20);

        jComboBoxNomeDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomeDivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNomeDivisao);
        jComboBoxNomeDivisao.setBounds(127, 100, 80, 20);

        jLabel2.setText("Criar Regra Cenario");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 20, 95, 28);

        jButtonSair.setText("sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(430, 290, 70, 23);

        jLabel3.setText("id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 40, 20);

        jTextFieldIDRegra.setEnabled(false);
        getContentPane().add(jTextFieldIDRegra);
        jTextFieldIDRegra.setBounds(30, 50, 40, 30);

        jButtonGravar.setText("gravar");
        getContentPane().add(jButtonGravar);
        jButtonGravar.setBounds(20, 140, 65, 23);

        setSize(new java.awt.Dimension(544, 395));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
      //metodo para preencher a combobox com o nome das divisoes
        public void preencherDivisao(){
        
        liga.ligarBD();
        liga.executaSql("select * from division order by name");
     
        
        try {
            liga.rs.first();
            jComboBoxNomeDivisao.removeAllItems();
            do{
                jComboBoxNomeDivisao.addItem(liga.rs.getString("name"));

            }while(liga.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"erro ao preencher a lista das divisoes"+ex);
        }
 
    }
        
        //metodo para preencher a combobox com o nome do dispositivo
        public void preencherDispositivos(){
        
        liga.ligarBD();
        liga.executaSql("select * from device order by name");
     
        
        try {
            liga.rs.first();
            jComboBoxNomeDispositivo.removeAllItems();
            do{
                jComboBoxNomeDispositivo.addItem(liga.rs.getString("name"));

            }while(liga.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"erro ao preencher a lista dos dispositivos"+ex);
        }
 
    }
        
              //metodo para preencher a combobox com o nome do cenario
        public void preencherCenario(){
        
        liga.ligarBD();
        liga.executaSql("select * from scenario order by name");
     
        
        try {
            liga.rs.first();
            jComboBoxNomeCenario.removeAllItems();
            do{
                jComboBoxNomeCenario.addItem(liga.rs.getString("name"));

            }while(liga.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"erro ao preencher a lista dos cenarios"+ex);
        }
 
    }
    private void jComboBoxNomeDispositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomeDispositivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNomeDispositivoActionPerformed

    private void jComboBoxNomeDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomeDivisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNomeDivisaoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        
        FormPrincipal principal = new FormPrincipal();
        principal.setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(FormCriarRegras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCriarRegras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCriarRegras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCriarRegras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCriarRegras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxNomeCenario;
    private javax.swing.JComboBox<String> jComboBoxNomeDispositivo;
    private javax.swing.JComboBox<String> jComboBoxNomeDivisao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaScript;
    private javax.swing.JTextField jTextFieldIDRegra;
    // End of variables declaration//GEN-END:variables
}
