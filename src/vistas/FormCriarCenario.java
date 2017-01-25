
package vistas;

import controlo.ControloCriarCenario;
import controlo.LigacaoBD;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

import modelo.ModeloCriarCenario;
import modelo.ModeloTabela;


/**
 *
 * @author Celina
 */
public class FormCriarCenario extends javax.swing.JFrame {

        
    LigacaoBD liga = new LigacaoBD();
    ModeloCriarCenario mod = new ModeloCriarCenario();
    ControloCriarCenario controlo = new ControloCriarCenario();

    int flag = 0;
    int resposta = 0;

    public FormCriarCenario() {
        initComponents();
        preencherDivisao();
        //preencherTabela("select id,name, name from scenario  inner join division  on   division_id = division.id  " );
         // preencherTabela("select * from division  inner join  scenario on scenario.divison_id = divison.id order by id " );
          preencherTabela("select * from division i inner join scenario s on i.id = s.division_id ");
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonGravar = new javax.swing.JButton();
        jTextFieldNomeCenario = new javax.swing.JTextField();
        jComboBoxNomeDivisao = new javax.swing.JComboBox<>();
        jButtonSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIDcenario = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisaCenario = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePesquisar = new javax.swing.JTable();
        jButtonCancelar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Cenário");
        setEnabled(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(29, 142, 35, 20);

        jButtonGravar.setText("gravar");
        jButtonGravar.setEnabled(false);
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGravar);
        jButtonGravar.setBounds(560, 180, 80, 23);

        jTextFieldNomeCenario.setEnabled(false);
        jTextFieldNomeCenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCenarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCenario);
        jTextFieldNomeCenario.setBounds(82, 138, 157, 28);

        jComboBoxNomeDivisao.setEnabled(false);
        getContentPane().add(jComboBoxNomeDivisao);
        jComboBoxNomeDivisao.setBounds(412, 141, 96, 23);

        jButtonSair.setText("sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(560, 320, 80, 23);

        jLabel2.setText("selecione a divisão");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(284, 142, 110, 20);

        jLabel3.setText("ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(29, 62, 19, 20);

        jTextFieldIDcenario.setEnabled(false);
        getContentPane().add(jTextFieldIDcenario);
        jTextFieldIDcenario.setBounds(52, 54, 33, 28);

        jButtonEliminar.setText("eliminar");
        jButtonEliminar.setEnabled(false);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar);
        jButtonEliminar.setBounds(560, 280, 80, 23);
        getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(171, 48, 185, 30);

        jButtonPesquisaCenario.setText("pesquisar cenario");
        jButtonPesquisaCenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaCenarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisaCenario);
        jButtonPesquisaCenario.setBounds(435, 57, 153, 23);

        jButtonNovo.setText("novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(560, 140, 80, 23);

        jButtonAlterar.setText("alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlterar);
        jButtonAlterar.setBounds(560, 210, 80, 23);

        jTablePesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePesquisar);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 190, 452, 100);

        jButtonCancelar.setText("cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(560, 240, 80, 23);

        setSize(new java.awt.Dimension(683, 412));
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
    private void jTextFieldNomeCenarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCenarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCenarioActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        
        //para não gravar dados em branco
        if(jTextFieldNomeCenario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"digite o nome");
            jTextFieldNomeCenario.requestFocus();
        }else 
        
        if(flag == 1){
            mod.setNomeCenario(jTextFieldNomeCenario.getText());
            mod.setNomeDivisao((String)jComboBoxNomeDivisao.getSelectedItem());
                   
           // chama o metodo para gravar os dados
            controlo.gravar(mod);
            
             // preencherTabela(sql);

            jTextFieldNomeCenario.setEnabled(!true);
            jComboBoxNomeDivisao.setEnabled(!true);

            jButtonGravar.setEnabled(!true);
            jButtonCancelar.setEnabled(!true);
            jButtonNovo.setEnabled(true);
            jButtonAlterar.setEnabled(false);
            jButtonEliminar.setEnabled(false);
            
            //limpa os campos
            jTextFieldIDcenario.setText("");
            jTextFieldNomeCenario.setText("");
            jTextFieldPesquisar.setText("");
        }else{
            
            mod.setIdCenario(Integer.parseInt(jTextFieldIDcenario.getText()));
            mod.setNomeCenario(jTextFieldNomeCenario.getText());
            mod.setNomeDivisao((String)jComboBoxNomeDivisao.getSelectedItem());
               
           // chama o metodo para gravar os dados
            controlo.alterar(mod);
            
           // preencherTabela(sql);
            
            
            jTextFieldNomeCenario.setEnabled(!true);
            jComboBoxNomeDivisao.setEnabled(!true);

            jButtonGravar.setEnabled(!true);
            jButtonCancelar.setEnabled(!true);
            jButtonNovo.setEnabled(true);
            jButtonAlterar.setEnabled(false);
            jButtonEliminar.setEnabled(false);
            
            //limpa os campos
            jTextFieldIDcenario.setText("");
            jTextFieldNomeCenario.setText("");
            jTextFieldPesquisar.setText("");
        }
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        
        FormPrincipal principal = new FormPrincipal();
        principal.setVisible(true);
                
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag=1;
        jTextFieldNomeCenario.setEnabled(true);
        jComboBoxNomeDivisao.setEnabled(true);
       
        jButtonGravar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
       jButtonNovo.setEnabled(false);
       jButtonAlterar.setEnabled(false);
       jButtonEliminar.setEnabled(false);
//        //limpa os campos
//        jTextFieldIDdispositivo.setText("");
//        jTextFieldNomeDispositivo.setText("");
//        jTextFieldPesquisar.setText("");
//        //alterar estadodos botoes
//        jButtonAlterar.setEnabled(false);
//        
//        jTextFieldPesquisar.setEnabled(false);
//        jButtonPesquisar.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
       flag =2;
       
            jTextFieldNomeCenario.setEnabled(true);
            jComboBoxNomeDivisao.setEnabled(true);

            jButtonGravar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtonNovo.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonEliminar.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonPesquisaCenarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaCenarioActionPerformed
        
            jTextFieldNomeCenario.setEnabled(!true);
            jComboBoxNomeDivisao.setEnabled(!true);

            jButtonGravar.setEnabled(!true);
            jButtonCancelar.setEnabled(true);
            jButtonNovo.setEnabled(false);
            jButtonAlterar.setEnabled(!false);
            jButtonEliminar.setEnabled(!false);
        
        mod.setPesquisar(jTextFieldPesquisar.getText());
        ModeloCriarCenario modelo = controlo.pesquisaCenario(mod);
        
        jTextFieldIDcenario.setText(String.valueOf(modelo.getIdCenario()));
        jTextFieldNomeCenario.setText(modelo.getNomeCenario());
        jComboBoxNomeDivisao.setSelectedItem(modelo.getNomeDivisao());
    }//GEN-LAST:event_jButtonPesquisaCenarioActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
      
        resposta = JOptionPane.showConfirmDialog(rootPane,"deseja mesmo eliminar o cenario?");
        if(resposta == JOptionPane.YES_OPTION){
           
            mod.setIdCenario(Integer.parseInt(jTextFieldIDcenario.getText()));
            
            //chama o metodo excluir
            controlo.eliminar(mod);
            
             // preencherTabela(sql);
            
            
            //limpa os campos
            jTextFieldIDcenario.setText("");
            jTextFieldNomeCenario.setText("");
            jTextFieldPesquisar.setText("");
                   
            jTextFieldNomeCenario.setEnabled(!true);
            jComboBoxNomeDivisao.setEnabled(!true);

            jButtonGravar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtonNovo.setEnabled(false);
            jButtonAlterar.setEnabled(!false);
            jButtonEliminar.setEnabled(!false);
          }  

    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTablePesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisarMouseClicked
        
        String nome_cenario = ""+jTablePesquisar.getValueAt(jTablePesquisar.getSelectedRow(), 1);
        liga.ligarBD();
        
        liga.executaSql("select * from scenario where name ='"+nome_cenario+"'");
        try {
            liga.rs.first();
                       
            jTextFieldIDcenario.setText(String.valueOf(liga.rs.getInt("id")));
            jTextFieldNomeCenario.setText(liga.rs.getString("name"));
            
            LigacaoBD ligaPesqDiv = new LigacaoBD();
            ligaPesqDiv.ligarBD(); 
            ligaPesqDiv.executaSql("select * from division where id ="+liga.rs.getInt("division_id"));
            ligaPesqDiv.rs.first();
            jComboBoxNomeDivisao.setSelectedItem(ligaPesqDiv.rs.getString("name"));
              ligaPesqDiv.desligarBD();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar os dados" +ex);
        }
       // liga.desligarBD();
    }//GEN-LAST:event_jTablePesquisarMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
            //limpa os campos
            jTextFieldIDcenario.setText("");
            jTextFieldNomeCenario.setText("");
            jTextFieldPesquisar.setText("");
            jTextFieldNomeCenario.setEnabled(!true);
            jComboBoxNomeDivisao.setEnabled(!true);

            jButtonGravar.setEnabled(!true);
            jButtonCancelar.setEnabled(!true);
            jButtonNovo.setEnabled(true);
            jButtonAlterar.setEnabled(false);
            jButtonEliminar.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

     //metodo para criar a tabela
    public void preencherTabela(String sql){
   
    ArrayList dados = new ArrayList();

    String[] colunas = new String[]{"id", "cenario", "divisao"};
   liga.ligarBD();
     liga.executaSql(sql);
//      
   // liga.executaSql("select * from scenario  inner join divison  on scenario.divison_id = divison.id order by id " );
//              preencherTabela("select id,name,namename from device i inner join division e on i.id = e.id "
//            + "inner join device_type t on t.id = e.id");

   
   try{
       liga.rs.first();  //vamos buscar o primeiro resultado da pesquisa
       do{                 //enquanto houver dados
         
              dados.add(new Object[]{ liga.rs.getInt("id"),liga.rs.getString("s.name")
              , liga.rs.getString("i.name")}); 
 
        }while (liga.rs.next());    //vai percorrendo as posicoes
    }catch(SQLException ex){
      JOptionPane.showMessageDialog(null,"procure outro cenario"+ex);
    }


 
  ModeloTabela modTab = new ModeloTabela(dados, colunas);
  
    
    jTablePesquisar.setModel(modTab);
    jTablePesquisar.getColumnModel().getColumn(0).setPreferredWidth(80); //nome
    jTablePesquisar.getColumnModel().getColumn(0).setResizable(false); //nome
    jTablePesquisar.getColumnModel().getColumn(1).setPreferredWidth(120);
    jTablePesquisar.getColumnModel().getColumn(1).setResizable(false);
    jTablePesquisar.getColumnModel().getColumn(2).setPreferredWidth(125);
    jTablePesquisar.getColumnModel().getColumn(2).setResizable(false);
//    jTablePesquisar.getColumnModel().getColumn(3).setPreferredWidth(120);
//    jTablePesquisar.getColumnModel().getColumn(3).setResizable(false);
    jTablePesquisar.getTableHeader().setReorderingAllowed(false);
    jTablePesquisar.setAutoResizeMode(jTablePesquisar.AUTO_RESIZE_OFF);
    jTablePesquisar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//seleciona um dado de cada vez

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
            java.util.logging.Logger.getLogger(FormCriarCenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCriarCenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCriarCenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCriarCenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCriarCenario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisaCenario;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxNomeDivisao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTablePesquisar;
    private javax.swing.JTextField jTextFieldIDcenario;
    private javax.swing.JTextField jTextFieldNomeCenario;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
