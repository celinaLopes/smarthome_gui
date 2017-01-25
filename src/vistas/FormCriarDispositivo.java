
package vistas;

import controlo.ControloCriarDispositivo;
import controlo.LigacaoBD;
import modelo.ComboItem;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import modelo.ModeloCriarDispositivo;
import modelo.ModeloTabela;

/**
 *
 * @author Celina
 */
public class FormCriarDispositivo extends javax.swing.JFrame {
    
    LigacaoBD liga = new LigacaoBD();
    ModeloCriarDispositivo mod = new ModeloCriarDispositivo();
    ControloCriarDispositivo controlo = new ControloCriarDispositivo();

    int flag = 0;

    public FormCriarDispositivo() {
        initComponents();

        preencherTabela("select * from device i inner join division e on i.id = e.division_id "
            + "inner join device_type t on t.id = e.device_type_id");

//        preencherTabela("select id, name, name, name from device inner join division on"
//                + "id = id inner join device_type on id=id ");
        preencherDivisao();
        preencherTipoDispositivo();


      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldIDdispositivo = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDispositivo = new javax.swing.JTable();
        jTextFieldNomeDispositivo = new javax.swing.JTextField();
        jComboBoxNomeDivisao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jComboBoxTipoDispositivo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Dispositivo");
        setEnabled(false);
        getContentPane().setLayout(null);

        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 61, 37, 23);

        jTextFieldIDdispositivo.setEnabled(false);
        getContentPane().add(jTextFieldIDdispositivo);
        jTextFieldIDdispositivo.setBounds(71, 52, 40, 30);

        jButtonNovo.setText("novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(660, 140, 80, 23);

        jButtonGravar.setText("gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGravar);
        jButtonGravar.setBounds(660, 180, 80, 23);

        jButtonAlterar.setText("alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlterar);
        jButtonAlterar.setBounds(660, 220, 80, 23);

        jButtonEliminar.setText("eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar);
        jButtonEliminar.setBounds(660, 300, 80, 23);

        jButtonSair.setText("sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(660, 340, 80, 23);

        jButtonPesquisar.setText("pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(320, 230, 120, 23);
        getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(40, 230, 250, 29);

        jTableDispositivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableDispositivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDispositivoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDispositivo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 270, 452, 128);

        jTextFieldNomeDispositivo.setEnabled(false);
        getContentPane().add(jTextFieldNomeDispositivo);
        jTextFieldNomeDispositivo.setBounds(230, 60, 217, 28);

        jComboBoxNomeDivisao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "quarto" }));
        jComboBoxNomeDivisao.setEnabled(false);
        getContentPane().add(jComboBoxNomeDivisao);
        jComboBoxNomeDivisao.setBounds(100, 130, 117, 28);

        jLabel2.setText("Divisão");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 61, 28);

        jLabel3.setText("Nome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 60, 52, 28);

        jButtonCancelar.setText("cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(660, 260, 80, 23);

        jComboBoxTipoDispositivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "interruptor" }));
        jComboBoxTipoDispositivo.setEnabled(false);
        getContentPane().add(jComboBoxTipoDispositivo);
        jComboBoxTipoDispositivo.setBounds(370, 130, 120, 30);

        jLabel4.setText("tipo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 130, 40, 30);

        setSize(new java.awt.Dimension(784, 462));
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
    
  //metodo para preencher a combobox com o nome do tipo de dispositivo
            public void preencherTipoDispositivo(){
        
        liga.ligarBD();
        liga.executaSql("select * from device_type order by name");
      
        
        try {
            liga.rs.first();
              jComboBoxTipoDispositivo.removeAllItems();
            do{
                jComboBoxTipoDispositivo.addItem(liga.rs.getString("name"));
 
            }while(liga.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"erro ao preencher lista dos dispositivos"+ex);
        }
        
    
        
    }
    
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        
        flag = 1;
        jTextFieldNomeDispositivo.setEnabled(true);
        jComboBoxNomeDivisao.setEnabled(true);
        jComboBoxTipoDispositivo.setEnabled(true);
        jButtonGravar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        //limpa os campos
        jTextFieldIDdispositivo.setText("");
        jTextFieldNomeDispositivo.setText("");
        jTextFieldPesquisar.setText("");
        //alterar estadodos botoes
        jButtonAlterar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        jTextFieldPesquisar.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        
        mod.setPesquisar(jTextFieldPesquisar.getText());   //atribui a string da pesquisa ao objeto
        ModeloCriarDispositivo modelo = controlo.pesquisaDispositivo(mod); //chama o metodo para pesquisar o dispositivo

        
        jTextFieldIDdispositivo.setText(String.valueOf(modelo.getIdDispositivo()));
        jTextFieldNomeDispositivo.setText(modelo.getNomeDispositivo());
        jComboBoxNomeDivisao.setSelectedItem(modelo.getNomeDivisao());
        jComboBoxTipoDispositivo.setSelectedItem(modelo.getNomeTipoDispositivo());
     
//        //limpa os campos
//        jTextFieldIDdispositivo.setText("");
//        jTextFieldNomeDispositivo.setText("");
//        jTextFieldPesquisar.setText("");
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableDispositivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDispositivoMouseClicked

        
        String nome_dispositivo = ""+jTableDispositivo.getValueAt(jTableDispositivo.getSelectedRow(), 1);
        liga.ligarBD();
        
        liga.executaSql("select * from device where name ='"+nome_dispositivo+"'");
        try {
            liga.rs.first();
                       
            jTextFieldIDdispositivo.setText(String.valueOf(liga.rs.getInt("id")));
            jTextFieldNomeDispositivo.setText(liga.rs.getString("name"));
            
            LigacaoBD ligaPesqDiv = new LigacaoBD();
            ligaPesqDiv.ligarBD(); 
            ligaPesqDiv.executaSql("select * from division where id ="+liga.rs.getInt("division_id"));
            ligaPesqDiv.rs.first();
            jComboBoxNomeDivisao.setSelectedItem(ligaPesqDiv.rs.getString("name"));
            
            LigacaoBD ligaPesqTipo = new LigacaoBD();
            ligaPesqTipo.ligarBD();
            ligaPesqTipo.executaSql("select * from device_type where id ="+liga.rs.getInt("device_type_id"));
            ligaPesqTipo.rs.first();
            jComboBoxTipoDispositivo.setSelectedItem(liga.rs.getString("name"));
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar os dados" +ex);
        }
        liga.desligarBD();
    }//GEN-LAST:event_jTableDispositivoMouseClicked

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        
        FormPrincipal principal = new FormPrincipal();
        principal.setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed

        //para não gravar dados em branco
        if(jTextFieldNomeDispositivo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"digite o nome");
            jTextFieldNomeDispositivo.requestFocus();
        }else

        if(flag == 1){
            mod.setNomeDispositivo(jTextFieldNomeDispositivo.getText());
            mod.setNomeDivisao((String)jComboBoxNomeDivisao.getSelectedItem());
            mod.setNomeTipoDispositivo((String) jComboBoxTipoDispositivo.getSelectedItem());

            //chama o metodo para gravar os dados
            controlo.gravar(mod);

            //limpa os campos
            jTextFieldIDdispositivo.setText("");
            jTextFieldNomeDispositivo.setText("");
            jTextFieldPesquisar.setText("");
            //muda estado dos campos e botoes
            jComboBoxNomeDivisao.setEnabled(false);
            jButtonGravar.setEnabled(false);
            jButtonCancelar.setEnabled(false);

            // atualiza a tabela
            preencherTabela("select * from division i inner join device e on i.id = e.division_id "
                + "inner join device_type t on t.id = e.device_type_id");

        }else{
            mod.setIdDispositivo(Integer.parseInt(jTextFieldIDdispositivo.getText()));
            mod.setNomeDispositivo(jTextFieldNomeDispositivo.getText());
            mod.setNomeDivisao((String)jComboBoxNomeDivisao.getSelectedItem());
            mod.setNomeTipoDispositivo((String) jComboBoxTipoDispositivo.getSelectedItem());
            //chama o metodo para alterar os dados
            controlo.alterar(mod);

            //limpa os campos
            jTextFieldIDdispositivo.setText("");
            jTextFieldNomeDispositivo.setText("");
            jTextFieldPesquisar.setText("");

            //muda estado dos campos e botoes
            jComboBoxNomeDivisao.setEnabled(false);
            jButtonGravar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);

            //atualiza a tabela
            preencherTabela("select * from division i inner join device e on i.id = e.division_id "
                + "inner join device_type t on t.id = e.device_type_id");
        }
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        flag = 2;
        jTextFieldNomeDispositivo.setEnabled(true);
        jComboBoxNomeDivisao.setEnabled(true);
        jComboBoxTipoDispositivo.setEnabled(true);
        jButtonGravar.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonEliminar.setEnabled(false);

    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        jTextFieldNomeDispositivo.setEnabled(!true);
        jTextFieldPesquisar.setEnabled(true);
        jComboBoxNomeDivisao.setEnabled(!true);
        jComboBoxTipoDispositivo.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        jButtonGravar.setEnabled(!true);
        jButtonAlterar.setEnabled(!true);
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonEliminar.setEnabled(false);

        //limpar os campos
        jTextFieldNomeDispositivo.setText("");
        jTextFieldIDdispositivo.setText("");

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        int resposta = 0;

        resposta = JOptionPane.showConfirmDialog(rootPane,"deseja mesmo eliminar o dispositivo?");
        if(resposta == JOptionPane.YES_OPTION){

            mod.setIdDispositivo(Integer.parseInt(jTextFieldIDdispositivo.getText()));

            //chama o metodo excluir
            controlo.eliminar(mod);

            //limpa os campos
            jTextFieldIDdispositivo.setText("");
            jTextFieldNomeDispositivo.setText("");
            jTextFieldPesquisar.setText("");

            //muda estado dos campos e botoes
            jComboBoxNomeDivisao.setEnabled(false);
            jButtonGravar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonEliminar.setEnabled(false);

            //atualiza a tabela
            preencherTabela("select * from division i inner join device e on i.id = e.division_id "
                + "inner join device_type t on t.id = e.device_type_id");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    //metodo para criar a tabela
    public void preencherTabela(String sql){
   
    ArrayList dados = new ArrayList();

    String[] colunas = new String[]{"id", "dispositivo", "divisao", "tipo"};
   liga.ligarBD();
     // liga.executaSql(sql);
//      
    liga.executaSql("select * from division i inner join device e on i.id = e.division_id "
            + "inner join device_type t on t.id = e.device_type_id");
//              preencherTabela("select id,name,namename from device i inner join division e on i.id = e.id "
//            + "inner join device_type t on t.id = e.id");

   
   try{
       liga.rs.first();  //vamos buscar o primeiro resultado da pesquisa
       do{                 //enquanto houver dados
//            
              dados.add(new Object[]{ liga.rs.getInt("e.id"),liga.rs.getString("e.name")
              , liga.rs.getString("i.name"), liga.rs.getString("t.name")}); 
//      dados.add(new Object[]{ liga.rs.getInt("id"),liga.rs.getString("name")
//              , liga.rs.getString("name"), liga.rs.getString("name")}); 
        }while (liga.rs.next());    //vai percorrendo as posicoes
    }catch(SQLException ex){
      JOptionPane.showMessageDialog(null,"procure outro dispositivo"+ex);
    }


 
  ModeloTabela modTab = new ModeloTabela(dados, colunas);
  
    
    jTableDispositivo.setModel(modTab);
    jTableDispositivo.getColumnModel().getColumn(0).setPreferredWidth(80); //nome
    jTableDispositivo.getColumnModel().getColumn(0).setResizable(false); //nome
    jTableDispositivo.getColumnModel().getColumn(1).setPreferredWidth(120);
    jTableDispositivo.getColumnModel().getColumn(1).setResizable(false);
    jTableDispositivo.getColumnModel().getColumn(2).setPreferredWidth(125);
    jTableDispositivo.getColumnModel().getColumn(2).setResizable(false);
    jTableDispositivo.getColumnModel().getColumn(3).setPreferredWidth(120);
    jTableDispositivo.getColumnModel().getColumn(3).setResizable(false);
    jTableDispositivo.getTableHeader().setReorderingAllowed(false);
    jTableDispositivo.setAutoResizeMode(jTableDispositivo.AUTO_RESIZE_OFF);
    jTableDispositivo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//seleciona um dado de cada vez

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
            java.util.logging.Logger.getLogger(FormCriarDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCriarDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCriarDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCriarDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCriarDispositivo().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBoxNomeDivisao;
    private javax.swing.JComboBox<String> jComboBoxTipoDispositivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDispositivo;
    private javax.swing.JTextField jTextFieldIDdispositivo;
    private javax.swing.JTextField jTextFieldNomeDispositivo;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
