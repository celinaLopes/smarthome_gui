
package vistas;

import controlo.ControloCriarDispositivo;
import controlo.LigacaoBD;
import controlo.ComboItem;
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
    
    ModeloCriarDispositivo mod = new ModeloCriarDispositivo();
    ControloCriarDispositivo controlo = new ControloCriarDispositivo();
    LigacaoBD liga = new LigacaoBD();
    Vector<ComboItem> divisoes = new Vector<ComboItem>();
    Vector<ComboItem> tiposDispositivos = new Vector<ComboItem>();
    int flag = 0;

    public FormCriarDispositivo() {
        initComponents();
        preencherTabela("select * from device order by name");
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

        jLabel1.setText("ID");

        jTextFieldIDdispositivo.setEnabled(false);

        jButtonNovo.setText("novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonGravar.setText("gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonSair.setText("sair");

        jButtonPesquisar.setText("pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

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

        jTextFieldNomeDispositivo.setEnabled(false);

        jComboBoxNomeDivisao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "quarto" }));
        jComboBoxNomeDivisao.setEnabled(false);

        jLabel2.setText("Divisão");

        jLabel3.setText("Nome");

        jButtonCancelar.setText("cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jComboBoxTipoDispositivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "interruptor" }));

        jLabel4.setText("tipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIDdispositivo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisar)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(54, 54, 54)
                                        .addComponent(jComboBoxTipoDispositivo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldNomeDispositivo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxNomeDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCancelar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIDdispositivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNovo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGravar)
                    .addComponent(jComboBoxNomeDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeDispositivo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAlterar)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxTipoDispositivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(166, 166, 166))
        );

        setSize(new java.awt.Dimension(784, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void preencherDivisao(){
        
        liga.ligarBD();
        liga.executaSql("select * from division order by name");
        jComboBoxNomeDivisao.removeAllItems();
        
        try {
            liga.rs.first();
            
            do{
                //jComboBoxNomeDivisao.addItem(liga.rs.getString("name"));
                
                divisoes.add(
                    new ComboItem(liga.rs.getInt("id"), liga.rs.getString("name"))
                );

            }while(liga.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"erro aoa preencher lista dos dispositivos"+ex);
        }
        
        jComboBoxNomeDivisao.setModel(new DefaultComboBoxModel(divisoes));
    }
    
    public void preencherTipoDispositivo(){
        
        liga.ligarBD();
        liga.executaSql("select * from device_type order by name");
        jComboBoxTipoDispositivo.removeAllItems();
        
        try {
            liga.rs.first();
            
            do{
                tiposDispositivos.add(
                    new ComboItem(liga.rs.getInt("id"), liga.rs.getString("name"))
                );
            }while(liga.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"erro aoa preencher lista dos dispositivos"+ex);
        }
        
        jComboBoxTipoDispositivo.setModel(new DefaultComboBoxModel(tiposDispositivos));
        
    }
    
    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        ComboItem divisao = (ComboItem)jComboBoxNomeDivisao.getSelectedItem();
        ComboItem dispositivo = (ComboItem)jComboBoxTipoDispositivo.getSelectedItem();
        
        //para não gravar dados em branco
        if(jTextFieldNomeDispositivo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"digite o nome");
            jTextFieldNomeDispositivo.requestFocus();
        }else 
        
        if(flag == 1){
            mod.setNomeDispositivo(jTextFieldNomeDispositivo.getText());
            mod.setIdDivisao(divisao.getId());
            mod.setIdTipoDispositivo(dispositivo.getId());
            //mod.setIdDivisao((Integer.get)jComboBoxNomeDivisao.getSelectedItem());


            //chama o metodo para gravaros dados
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
            preencherTabela("select * from device order by name");
        
        
        }else{
             mod.setIdDispositivo(Integer.parseInt(jTextFieldIDdispositivo.getText()));
             mod.setNomeDispositivo(jTextFieldNomeDispositivo.getText());
             mod.setIdDivisao(divisao.getId());
            
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
            preencherTabela("select * from device order by name");
        }
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        
        flag = 1;
        jTextFieldNomeDispositivo.setEnabled(true);
        jComboBoxNomeDivisao.setEnabled(true);
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
        
        mod.setPesquisar(jTextFieldPesquisar.getText());
        ModeloCriarDispositivo modelo = controlo.pesquisaDispositivo(mod);
        
        jTextFieldIDdispositivo.setText(String.valueOf(modelo.getIdDispositivo()));
        jTextFieldNomeDispositivo.setText(modelo.getNomeDispositivo());
        jComboBoxNomeDivisao.setSelectedItem(modelo.getIdDivisao());

        //limpa os campos
        jTextFieldIDdispositivo.setText("");
        jTextFieldNomeDispositivo.setText("");
        jTextFieldPesquisar.setText("");
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
        jTextFieldNomeDispositivo.setEnabled(!true);
        jTextFieldPesquisar.setEnabled(true);
        jComboBoxNomeDivisao.setEnabled(!true);
        jButtonPesquisar.setEnabled(true);
        jButtonGravar.setEnabled(!true);
        jButtonAlterar.setEnabled(!true);
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonEliminar.setEnabled(false);
        //limpar os campos
        jTextFieldIDdispositivo.setText("");
        jTextFieldNomeDispositivo.setText("");
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
       
        flag = 2;
        jTextFieldNomeDispositivo.setEnabled(true);
        jComboBoxNomeDivisao.setEnabled(true);
        jButtonGravar.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

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
        preencherTabela("select * from device order by name");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTableDispositivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDispositivoMouseClicked
        
        String nome_dispositivo = ""+jTableDispositivo.getValueAt(jTableDispositivo.getSelectedRow(), 1);
        liga.ligarBD();
        liga.executaSql("select * from device where name ='"+nome_dispositivo+"'");
        try {
            liga.rs.first();
            jTextFieldIDdispositivo.setText(String.valueOf(liga.rs.getInt("id")));
            jTextFieldNomeDispositivo.setText(liga.rs.getString("name"));
            jComboBoxNomeDivisao.setSelectedItem(liga.rs.getInt("division_id"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar os dados" +ex);
        }
        liga.desligarBD();
    }//GEN-LAST:event_jTableDispositivoMouseClicked

        //metodo para criar a tabela
    public void preencherTabela(String sql){
   
    ArrayList dados = new ArrayList();

    String[] colunas = new String[]{"id", "dispositivo", "divisao", "tipo"};
    liga.ligarBD();
    //liga.executaSql(sql);
    
    liga.executaSql("select * from division i inner join device e on i.id = e.division_id inner join device_type t on t.id = e.device_type_id");
   
   try{
       liga.rs.first();  //vamos buscar o primeiro resultado da pesquisa
       do{                 //enquanto houver dados
//            
              dados.add(new Object[]{ liga.rs.getInt("e.id"),liga.rs.getString("e.name")
              , liga.rs.getString("i.name"), liga.rs.getString("t.name")});     
        }while (liga.rs.next());    //vai percorrendo as posicoes
    }catch(SQLException ex){
      JOptionPane.showMessageDialog(null,"procure outra dispositivo"+ex);
    }


 
  ModeloTabela modTab = new ModeloTabela(dados, colunas);
  
    
    jTableDispositivo.setModel(modTab);
    jTableDispositivo.getColumnModel().getColumn(0).setPreferredWidth(127); //nome
    jTableDispositivo.getColumnModel().getColumn(0).setResizable(false); //nome
    jTableDispositivo.getColumnModel().getColumn(1).setPreferredWidth(153);
    jTableDispositivo.getColumnModel().getColumn(1).setResizable(false);
    jTableDispositivo.getColumnModel().getColumn(2).setPreferredWidth(153);
    jTableDispositivo.getColumnModel().getColumn(2).setResizable(false);
    jTableDispositivo.getColumnModel().getColumn(3).setPreferredWidth(80);
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
