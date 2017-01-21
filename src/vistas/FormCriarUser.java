
package vistas;

import controlo.ControloCriarUser;
import modelo.ModeloCriarUser;
import controlo.LigacaoBD;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ModeloTabela;


/**
 *
 * @author Celina
 */
public class FormCriarUser extends javax.swing.JFrame {

    ModeloCriarUser mod = new ModeloCriarUser();
    ControloCriarUser controlo = new ControloCriarUser();
    LigacaoBD liga = new LigacaoBD();
  
    int flag = 0;
    
    
    
    public FormCriarUser() {
        initComponents();
        preencherTabela("select * from utilizador order by id");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonGravar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldIDuser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUser = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jComboBoxTipoUser = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jPasswordFieldConfPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("criar utilizador");
        getContentPane().setLayout(null);

        jButtonGravar.setText("gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGravar);
        jButtonGravar.setBounds(570, 160, 90, 23);

        jButtonEliminar.setText("eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar);
        jButtonEliminar.setBounds(570, 280, 90, 23);

        jButtonSair.setText("sair");
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(570, 320, 90, 23);

        jButtonAlterar.setText("alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlterar);
        jButtonAlterar.setBounds(570, 200, 90, 23);

        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(31, 46, 20, 20);

        jTextFieldIDuser.setEnabled(false);
        getContentPane().add(jTextFieldIDuser);
        jTextFieldIDuser.setBounds(60, 40, 40, 30);

        jLabel2.setText("nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 124, 70, 20);

        jTextFieldNomeUser.setEnabled(false);
        getContentPane().add(jTextFieldNomeUser);
        jTextFieldNomeUser.setBounds(140, 120, 150, 30);

        jLabel3.setText("password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 164, 60, 20);

        jLabel4.setText("confirmar pass");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 204, 90, 20);

        jTableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableUser);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 280, 460, 90);
        getContentPane().add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(140, 40, 230, 30);

        jButtonPesquisar.setText("pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(390, 40, 130, 23);

        jComboBoxTipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "comum" }));
        jComboBoxTipoUser.setEnabled(false);
        getContentPane().add(jComboBoxTipoUser);
        jComboBoxTipoUser.setBounds(390, 130, 120, 20);

        jLabel5.setText("Tipo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(340, 124, 30, 20);

        jButtonNovo.setText("novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(570, 120, 90, 23);

        jButtonCancelar.setText("cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(570, 240, 90, 23);

        jPasswordFieldPass.setEnabled(false);
        getContentPane().add(jPasswordFieldPass);
        jPasswordFieldPass.setBounds(140, 160, 150, 30);

        jPasswordFieldConfPass.setEnabled(false);
        getContentPane().add(jPasswordFieldConfPass);
        jPasswordFieldConfPass.setBounds(140, 200, 150, 30);

        setSize(new java.awt.Dimension(714, 485));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        
        mod.setIdUser(Integer.parseInt(jTextFieldIDuser.getText()));
        mod.setNomeUser(jTextFieldNomeUser.getText());
        mod.setTipo((String)jComboBoxTipoUser.getSelectedItem());
        
        //chama o metodo para excluir os dados da bd
        controlo.eliminar(mod);
        
         //limpar os campos
        jTextFieldIDuser.setText("");
        jTextFieldNomeUser.setText("");
        jPasswordFieldPass.setText("");
        jPasswordFieldConfPass.setText("");
        jTextFieldPesquisa.setText("");
      
        //mudar estado dos botoes
        jButtonGravar.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(!true);
      
        //mudar estado dos campos
        jTextFieldNomeUser.setEnabled(!true);
        jPasswordFieldPass.setEnabled(!true);
        jPasswordFieldConfPass.setEnabled(!true);
 
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
      flag = 1;
//        //limpar os campos
//        jTextFieldIDuser.setText("");
//        jTextFieldNomeUser.setText("");
//        jPasswordFieldConfPass.setText("");
//        jTextFieldPesquisa.setText("");
//        jTextFieldPesquisa.setText("");
//        
        //mudar estado dos campos
        jTextFieldNomeUser.setEnabled(true);
        jPasswordFieldPass.setEnabled(true);
        jPasswordFieldConfPass.setEnabled(true);
        jComboBoxTipoUser.setEnabled(true);
//      
//        //mudar estado dos botoes
//        jButtonGravar.setEnabled(true);
//        jButtonNovo.setEnabled(true);
//        jButtonCancelar.setEnabled(true);
//        jButtonAlterar.setEnabled(false);
//        jButtonEliminar.setEnabled(true);

        

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       
        //limpar os campos
        jTextFieldIDuser.setText("");
        jTextFieldNomeUser.setText("");
        jPasswordFieldPass.setText("");
        jPasswordFieldConfPass.setText("");
        jTextFieldPesquisa.setText("");
       
        //mudar estado dos botoes
        jButtonGravar.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
       
        //mudar estado dos campos
        jTextFieldNomeUser.setEnabled(!true);
        jPasswordFieldPass.setEnabled(!true);
        jPasswordFieldConfPass.setEnabled(!true);

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
       
        if(jTextFieldNomeUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"insira o nome de utilizador");
            jTextFieldNomeUser.requestFocus();
        }else if(jPasswordFieldConfPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"confirme a password");
            jPasswordFieldConfPass.requestFocus();
        }else if(jPasswordFieldPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"insira a password");
            jPasswordFieldPass.requestFocus();
        }else
        if(flag == 1){
       
            if(jPasswordFieldPass.getText().equals(jPasswordFieldConfPass.getText())){
               
            mod.setNomeUser(jTextFieldNomeUser.getText());
                mod.setTipo((String)jComboBoxTipoUser.getSelectedItem());
                mod.setPassword(jPasswordFieldPass.getText());

                //chama metodo para gravar os dados na bd
                controlo.gravar(mod);

                //limpar os campos
                jTextFieldIDuser.setText("");
                jTextFieldNomeUser.setText("");
                jPasswordFieldPass.setText("");
                jPasswordFieldConfPass.setText("");
                jTextFieldPesquisa.setText("");

                //mudar estado dos botoes
                jButtonGravar.setEnabled(!true);
                jButtonNovo.setEnabled(!false);
                jButtonCancelar.setEnabled(!true);
                jButtonAlterar.setEnabled(false);
                jButtonEliminar.setEnabled(false);

                //mudar estado dos campos
                jTextFieldNomeUser.setEnabled(!true);
                jPasswordFieldPass.setEnabled(!true);
                jPasswordFieldConfPass.setEnabled(!true);

        }else{
            JOptionPane.showMessageDialog(rootPane,"a password não é igual");
        }
        } else{
              if(jPasswordFieldPass.getText().equals(jPasswordFieldConfPass.getText())){
                  
              
                //limpar os campos
                jTextFieldIDuser.setText("");
                jTextFieldNomeUser.setText("");
                jPasswordFieldPass.setText("");
                jPasswordFieldConfPass.setText("");
                jTextFieldPesquisa.setText("");

                //mudar estado dos botoes
                jButtonGravar.setEnabled(!true);
                jButtonNovo.setEnabled(!false);
                jButtonCancelar.setEnabled(!true);
                jButtonAlterar.setEnabled(false);
                jButtonEliminar.setEnabled(false);

                //mudar estado dos campos
                jTextFieldNomeUser.setEnabled(!true);
                jPasswordFieldPass.setEnabled(!true);
                jPasswordFieldConfPass.setEnabled(!true);
                //ativa o botao salvar;
             //   flag=1;  
                
                }else{
                     JOptionPane.showMessageDialog(rootPane,"a password não é igual");
        }
                
        }
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        flag=2;
        //mudar estado dos botoes
        jButtonGravar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
       
        //mudar estado dos campos
        jTextFieldNomeUser.setEnabled(true);
        jPasswordFieldPass.setEnabled(true);
        jPasswordFieldConfPass.setEnabled(!true);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        
        mod.setPesquisa(jTextFieldPesquisa.getText());
        ModeloCriarUser modelo = controlo.pesquisaUser(mod);
        jTextFieldIDuser.setText(String.valueOf(modelo.getIdUser()));
        jTextFieldNomeUser.setText(modelo.getNomeUser());
      
        jComboBoxTipoUser.setSelectedItem(modelo.getTipo());
        jPasswordFieldPass.setText(modelo.getPassword());
        jPasswordFieldConfPass.setText(modelo.getPassword());
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    //metodo para criar a tabela
    public void preencherTabela(String sql){
  
    ArrayList dados = new ArrayList();

    String[] colunas = new String[]{"id","Nome","Tipo","Senha"};
    liga.ligarBD();
    liga.executaSql(sql);
   // liga.executaSql("select * from divisao inner join dispositivo on"
                  //  + "divisao.id_dispositivo = dispositivo.id_dispositivo");

  
                     
   try{
       liga.rs.first();  //vamos buscar o primeiro resultado da pesquisa
       do{                 //enquanto houver dados
 
              dados.add(new Object[]{ liga.rs.getInt("id"),liga.rs.getString("Nome"), liga.rs.getString("Tipo"),liga.rs.getString("Senha")});     
        }while (liga.rs.next());    //vai percorrendo as posicoes
    }catch(SQLException ex){
      JOptionPane.showMessageDialog(null,"procure outra divisao");
    }


 
   ModeloTabela modTab = new ModeloTabela(dados, colunas);
    
    jTableUser.setModel(modTab);
    jTableUser.getColumnModel().getColumn(0).setPreferredWidth(127); //nome
    jTableUser.getColumnModel().getColumn(0).setResizable(false); //nome
    jTableUser.getColumnModel().getColumn(1).setPreferredWidth(153);
    jTableUser.getColumnModel().getColumn(1).setResizable(false);
    jTableUser.getColumnModel().getColumn(2).setPreferredWidth(153);
    jTableUser.getColumnModel().getColumn(2).setResizable(false);
    //jTableDivisao.getColumnModel().getColumn(3).setPreferredWidth(80);
    //jTableDivisao.getColumnModel().getColumn(3).setResizable(false);
    jTableUser.getTableHeader().setReorderingAllowed(false);
    jTableUser.setAutoResizeMode(jTableUser.AUTO_RESIZE_OFF);
    jTableUser.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//seleciona um dado de cada vez

    liga.desligarBD();
    
            
    }
    
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
            java.util.logging.Logger.getLogger(FormCriarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCriarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCriarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCriarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCriarUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxTipoUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordFieldConfPass;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUser;
    private javax.swing.JTextField jTextFieldIDuser;
    private javax.swing.JTextField jTextFieldNomeUser;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
