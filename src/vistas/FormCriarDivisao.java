
package vistas;


import controlo.ControloCriarDivisao;
import controlo.LigacaoBD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ModeloCriarDivisao;
import modelo.ModeloTabela;

/**
 *
 * @author Celina
 */
public class FormCriarDivisao extends javax.swing.JFrame {
    
    ModeloCriarDivisao mod = new ModeloCriarDivisao();
    ControloCriarDivisao controlo = new ControloCriarDivisao();
    LigacaoBD liga = new LigacaoBD();

    int flag = 0;
    
  
    public FormCriarDivisao() {
        initComponents();
      
        preencherTabelaPesquisar("select * from division order by id");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldIDdivisao = new javax.swing.JTextField();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMostraDispositivo = new javax.swing.JTable();
        jButtonGravar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelNomeDivisao = new javax.swing.JLabel();
        jTextFieldNomeDivisao = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePesquisar = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMostraCenario = new javax.swing.JTable();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("criar Divisao");
        getContentPane().setLayout(null);

        jLabelID.setText("ID");
        getContentPane().add(jLabelID);
        jLabelID.setBounds(20, 60, 37, 23);

        jTextFieldIDdivisao.setEnabled(false);
        getContentPane().add(jTextFieldIDdivisao);
        jTextFieldIDdivisao.setBounds(50, 50, 45, 30);
        getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(50, 110, 200, 30);

        jButtonPesquisar.setText("pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(290, 110, 100, 23);

        jTableMostraDispositivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableMostraDispositivo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 280, 180, 92);

        jButtonGravar.setText("gravar");
        jButtonGravar.setEnabled(false);
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGravar);
        jButtonGravar.setBounds(620, 120, 80, 23);

        jButtonAlterar.setText("alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlterar);
        jButtonAlterar.setBounds(620, 230, 80, 23);

        jButtonEliminar.setText("eliminar");
        jButtonEliminar.setEnabled(false);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar);
        jButtonEliminar.setBounds(620, 290, 80, 23);

        jButtonSair.setText("sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(620, 340, 80, 23);

        jLabelNomeDivisao.setText("nome");
        getContentPane().add(jLabelNomeDivisao);
        jLabelNomeDivisao.setBounds(230, 50, 48, 25);

        jTextFieldNomeDivisao.setEnabled(false);
        jTextFieldNomeDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeDivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeDivisao);
        jTextFieldNomeDivisao.setBounds(290, 50, 160, 30);

        jButtonNovo.setText("novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(620, 60, 80, 23);

        jButtonCancelar.setText("cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(620, 170, 80, 23);

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
        jScrollPane2.setBounds(40, 160, 452, 92);

        jTableMostraCenario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMostraCenario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMostraCenarioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableMostraCenario);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(40, 280, 200, 92);

        setSize(new java.awt.Dimension(748, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeDivisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeDivisaoActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        
        //para não gravar dados em branco
        if(jTextFieldNomeDivisao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"digite o nome da divisao");
            jTextFieldNomeDivisao.requestFocus();
        }else 
            
        if(flag == 1){
           
            mod.setNomeDivisao(jTextFieldNomeDivisao.getText());

            //chama o metodo para gravar  dados
            controlo.gravar(mod);

            //limpa os campos
            jTextFieldIDdivisao.setText("");
            jTextFieldNomeDivisao.setText("");
            jTextFieldPesquisar.setText("");

            //muda estado dos campos e botoes
            jTextFieldNomeDivisao.setEnabled(false);
            jButtonGravar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
        
            //atualiza a tabela
            preencherTabelaPesquisar("select * from division order by id");

        }else{
             mod.setIdDivisao(Integer.parseInt(jTextFieldIDdivisao.getText()));
             mod.setNomeDivisao(jTextFieldNomeDivisao.getText());
                         
             //chama o metodo para alterar os dados
             controlo.alterar(mod);
         
             //limpa os campos
             jTextFieldIDdivisao.setText("");
             jTextFieldNomeDivisao.setText("");
             jTextFieldPesquisar.setText("");
            
             //muda estado dos campos e botoes
             jTextFieldNomeDivisao.setEnabled(false);
             jButtonGravar.setEnabled(false);
             jButtonNovo.setEnabled(true);
             jButtonCancelar.setEnabled(false);

            //atualiza a tabela
            preencherTabelaPesquisar("select * from division order by id");
        }
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
       
        FormPrincipal principal = new FormPrincipal();
        principal.setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       
        flag = 1;        //quando se clica no botao novo a flag fica com o valor 1 e
                         //ativa os campos
        jTextFieldNomeDivisao.setEnabled(true);
        jButtonGravar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        //limpar campos
        jTextFieldNomeDivisao.setText("");
        jTextFieldIDdivisao.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldPesquisar.setEnabled(false);
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTablePesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisarMouseClicked
        
        String nome_divisao = ""+jTablePesquisar.getValueAt(jTablePesquisar.getSelectedRow(), 1);
        liga.ligarBD();
        
        liga.executaSql("select * from division where name ='"+nome_divisao+"'");
        try {
          
            liga.rs.first();
            jTextFieldIDdivisao.setText(String.valueOf(liga.rs.getInt("id")));
            jTextFieldNomeDivisao.setText(liga.rs.getString("name"));
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar os dados" +ex);
        }
        liga.desligarBD();
        
        //mudar estado dos botoes
        jButtonAlterar.setEnabled(true);
        jButtonEliminar.setEnabled(true);
        
        String id = String.format("%d", jTablePesquisar.getValueAt(jTablePesquisar.getSelectedRow(), 0));
        preencherTabelaCenarios("select id, name from scenario where division_id = "+id);
        preencherTabelaDivisoes("select id, name from device where division_id = "+id);
    }//GEN-LAST:event_jTablePesquisarMouseClicked

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
       
        mod.setPesquisar(jTextFieldPesquisar.getText());
        ModeloCriarDivisao modelo = controlo.pesquisaDivisao(mod);
        
        jTextFieldIDdivisao.setText(String.valueOf(modelo.getIdDivisao()));
        jTextFieldNomeDivisao.setText(modelo.getNomeDivisao());
        
         preencherTabelaPesquisar("select * from division where name like '%"
                                    + mod.getPesquisar()+"%'");
          
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
            
        //ativa os campos
        jTextFieldNomeDivisao.setEnabled(!true);
        jButtonGravar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        jTextFieldPesquisar.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        //limpar campos
        jTextFieldIDdivisao.setText("");
        jTextFieldNomeDivisao.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        
        flag = 2;
        //ativa os campos
        jTextFieldNomeDivisao.setEnabled(true);
        jButtonGravar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonEliminar.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"deseja mesmo eliminar a divisao?");
        if(resposta == JOptionPane.YES_OPTION){
            mod.setIdDivisao(Integer.parseInt(jTextFieldIDdivisao.getText()));
            //chama metodo para excluir
            controlo.eliminar(mod);
            
         //limpa os campos
         jTextFieldIDdivisao.setText("");
         jTextFieldNomeDivisao.setText("");
         jTextFieldPesquisar.setText("");

         //muda estado dos campos e botoes
         jTextFieldNomeDivisao.setEnabled(false);
         jButtonGravar.setEnabled(false);
         jButtonNovo.setEnabled(true);
         jButtonCancelar.setEnabled(false);
         jButtonAlterar.setEnabled(false);
         jButtonEliminar.setEnabled(false);
         
            //atualiza a tabela
            preencherTabelaPesquisar("select * from division order by id");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTableMostraCenarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMostraCenarioMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTableMostraCenarioMouseClicked

    
    //metodo para popular a tabela
    public void preencherTabelaPesquisar(String sql){
   
    ArrayList dados = new ArrayList();
    String[] colunas = new String[]{"id","divisao"};
    liga.ligarBD();
    liga.executaSql(sql);
                  
   try{
       liga.rs.first();  //vamos buscar o primeiro resultado da pesquisa
       do{                 //enquanto houver dados
       
              dados.add(new Object[]{ liga.rs.getInt("id"),liga.rs.getString("name")}); 
       
       }while (liga.rs.next());    //vai percorrendo as posicoes
    
   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null,"procure outra divisao");
    }

  ModeloTabela modTab = new ModeloTabela(dados, colunas);   //cria instancia do modelo tabela
  
    jTablePesquisar.setModel(modTab);
    jTablePesquisar.getColumnModel().getColumn(0).setPreferredWidth(50); //nome
    jTablePesquisar.getColumnModel().getColumn(0).setResizable(false); //nome
    jTablePesquisar.getColumnModel().getColumn(1).setPreferredWidth(153);
    jTablePesquisar.getColumnModel().getColumn(1).setResizable(false);
//    jTablePesquisar.getColumnModel().getColumn(2).setPreferredWidth(153);
//    jTablePesquisar.getColumnModel().getColumn(2).setResizable(false);
    //jTablePesquisar.getColumnModel().getColumn(3).setPreferredWidth(80);
   // jTablePesquisar.getColumnModel().getColumn(3).setResizable(false);
    jTablePesquisar.getTableHeader().setReorderingAllowed(false);
    jTablePesquisar.setAutoResizeMode(jTablePesquisar.AUTO_RESIZE_OFF);
    jTablePesquisar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//seleciona um dado de cada vez

    liga.desligarBD();
    
            
    }
    
    
    public void preencherTabelaCenarios(String sql){
   
    ArrayList dados = new ArrayList();
    String[] colunas = new String[]{"id","cenario"};
    liga.ligarBD();
    liga.executaSql(sql);
                  
   try{
       liga.rs.first();  //vamos buscar o primeiro resultado da pesquisa
       do{                 //enquanto houver dados
       
              dados.add(new Object[]{ liga.rs.getInt("id"),liga.rs.getString("name")}); 
       
       }while (liga.rs.next());    //vai percorrendo as posicoes
    
   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null,"procure outro cenario");
    }

  ModeloTabela modTab = new ModeloTabela(dados, colunas);   //cria instancia do modelo tabela
  
    jTableMostraCenario.setModel(modTab);
    jTableMostraCenario.getColumnModel().getColumn(0).setPreferredWidth(50); //nome
    jTableMostraCenario.getColumnModel().getColumn(0).setResizable(false); //nome
    jTableMostraCenario.getColumnModel().getColumn(1).setPreferredWidth(100);
    jTableMostraCenario.getColumnModel().getColumn(1).setResizable(false);
//    jTableMostraCenario.getColumnModel().getColumn(2).setPreferredWidth(153);
//    jTableMostraCenario.getColumnModel().getColumn(2).setResizable(false);
    //jTableMostraCenario.getColumnModel().getColumn(3).setPreferredWidth(80);
   // jTableMostraCenario.getColumnModel().getColumn(3).setResizable(false);
    jTableMostraCenario.getTableHeader().setReorderingAllowed(false);
    jTableMostraCenario.setAutoResizeMode(jTableMostraCenario.AUTO_RESIZE_OFF);
    jTableMostraCenario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//seleciona um dado de cada vez

    liga.desligarBD();
    
            
    }
    
    
    public void preencherTabelaDivisoes(String sql){
   
    ArrayList dados = new ArrayList();
    String[] colunas = new String[]{"id","dispositivo"};
    liga.ligarBD();
    liga.executaSql(sql);
                  
   try{
       liga.rs.first();  //vamos buscar o primeiro resultado da pesquisa
       do{                 //enquanto houver dados
       
              dados.add(new Object[]{ liga.rs.getInt("id"),liga.rs.getString("name")}); 
       
       }while (liga.rs.next());    //vai percorrendo as posicoes
    
   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null,"procure outro cenario");
    }

  ModeloTabela modTab = new ModeloTabela(dados, colunas);   //cria instancia do modelo tabela
  
    jTableMostraDispositivo.setModel(modTab);
    jTableMostraDispositivo.getColumnModel().getColumn(0).setPreferredWidth(50); //nome
    jTableMostraDispositivo.getColumnModel().getColumn(0).setResizable(false); //nome
    jTableMostraDispositivo.getColumnModel().getColumn(1).setPreferredWidth(100);
    jTableMostraDispositivo.getColumnModel().getColumn(1).setResizable(false);
//    jTableMostraDispositivo.getColumnModel().getColumn(2).setPreferredWidth(153);
//    jTableMostraDispositivo.getColumnModel().getColumn(2).setResizable(false);
    //jTableMostraDispositivo.getColumnModel().getColumn(3).setPreferredWidth(80);
   // jTableMostraDispositivo.getColumnModel().getColumn(3).setResizable(false);
    jTableMostraDispositivo.getTableHeader().setReorderingAllowed(false);
    jTableMostraDispositivo.setAutoResizeMode(jTableMostraDispositivo.AUTO_RESIZE_OFF);
    jTableMostraDispositivo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//seleciona um dado de cada vez

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
            java.util.logging.Logger.getLogger(FormCriarDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCriarDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCriarDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCriarDivisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCriarDivisao().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNomeDivisao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableMostraCenario;
    private javax.swing.JTable jTableMostraDispositivo;
    private javax.swing.JTable jTablePesquisar;
    private javax.swing.JTextField jTextFieldIDdivisao;
    private javax.swing.JTextField jTextFieldNomeDivisao;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
