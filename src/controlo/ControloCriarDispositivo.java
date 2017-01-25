 
package controlo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ComboItem;
import modelo.ModeloCriarDispositivo;


/**
 *
 * @author Celina
 */  
public class ControloCriarDispositivo {
    ModeloCriarDispositivo mod = new ModeloCriarDispositivo();
    LigacaoBD liga = new LigacaoBD();
    LigacaoBD ligaDivision = new LigacaoBD(); // ligacao para ir buscar o codigodo da divisao
    LigacaoBD ligaTipoDisp = new LigacaoBD();  //ligacao para ir buscar o id do tipo dispositivo
    String nomeDivisao;
    String nomeTipoDispositivo;
    int divisaoID;  //recebe o codigo da divisao referente ao nome da divisao que for selecionada na combo
    int tipoDispositivoID;   //vai guardar o codigo do tipo
    
   
    //metodo para alterar os dados do dispositivo
    public void alterar(ModeloCriarDispositivo mod){
        
        pesquisaDivisaoID(mod.getNomeDivisao());   //chama o metodo pesquisar,enviamos a string
        pesquisaTipoDispositivoID(mod.getNomeTipoDispositivo());
        
        liga.ligarBD();
        
        try {
            PreparedStatement pst = liga.connect.prepareStatement("update device set (name=?, division_id=?, device_type_id=?) where id=?");
            pst.setString(1, mod.getNomeDispositivo());
            pst.setInt(2, divisaoID);
            pst.setInt(3, tipoDispositivoID);
            pst.setInt(4, mod.getIdDispositivo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"dispositivo alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao alterar dispositivo/nErro:" +ex);
        }
        
        liga.desligarBD();
        
    }
    
    //metodo para eliminar dispositivo
    public void eliminar(ModeloCriarDispositivo mod){
            
        liga.ligarBD();
        
        try {
            PreparedStatement pst = liga.connect.prepareStatement("delete from device where id=?");
            pst.setInt(1, mod.getIdDispositivo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"dispositivo eliminado com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao eliminar dispositivo/nErro:" +ex);
        }
        liga.desligarBD();
    }
    
    //metodo para procurar o nome da divisao
    public  void pesquisaNomeDivisao(int idDiv){
        ligaDivision.ligarBD();
        
        
        try {
            ligaDivision.executaSql("select * from division where id="+idDiv);
            ligaDivision.rs.first();
            nomeDivisao = ligaDivision.rs.getString("name");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao procurar nome da divisao/nErro:" +ex);
        }
        ligaDivision.desligarBD();
    }
    
        //metodo para procurar o nome do tipo de dispositivo
    public  void pesquisaNomeTipoDispositivo(int idTipoDisp){
        ligaTipoDisp.ligarBD();
        
        
        try {
            ligaTipoDisp.executaSql("select * from device_type where id="+idTipoDisp);
            ligaTipoDisp.rs.first();
            nomeTipoDispositivo = ligaTipoDisp.rs.getString("name");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao procurar o tipo de dispositivo/nErro:" +ex);
        }
        ligaTipoDisp.desligarBD();
    }
    
    //metodo para procurar o dispositivo na bd pelo nome
     public ModeloCriarDispositivo pesquisaDispositivo(ModeloCriarDispositivo mod){
        liga.ligarBD();
          
        try {
            liga.executaSql("select * from device where name like '%" + mod.getPesquisar()+"%'");
            liga.rs.first();
 
            pesquisaNomeDivisao(liga.rs.getInt("division_id"));
            pesquisaNomeTipoDispositivo(liga.rs.getInt("device_type_id"));
            mod.setIdDispositivo(liga.rs.getInt("id"));
            mod.setNomeDispositivo(liga.rs.getString("name"));
            mod.setNomeDivisao(nomeDivisao);
            mod.setNomeTipoDispositivo(nomeTipoDispositivo);
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"o dispositivo não está registado/nErro:" +ex);
        }
        
        liga.desligarBD();
        return mod;
        
        
    }
    
            //metodo para inserir dispositivo na bd
    public void gravar(ModeloCriarDispositivo mod){  //recebe um obj do tipo mod
        
        pesquisaDivisaoID(mod.getNomeDivisao());   //chama o metodo pesquisar,enviamos a string
        pesquisaTipoDispositivoID(mod.getNomeTipoDispositivo());
        liga.ligarBD();

        
        try {
         
            PreparedStatement pst = liga.connect.prepareStatement("insert into device (name, division_id, device_type_id) values(?, ?, ?)");
            pst.setString(1, mod.getNomeDispositivo());
            pst.setInt(2, divisaoID);
            pst.setInt(3, tipoDispositivoID);
            pst.execute();
            JOptionPane.showMessageDialog(null,"dispositivo inserido com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao inserir dispositivo/nErro:" +ex);
        }
        liga.desligarBD();
    }
    
    
        //metodo para procurar/enviar a divisao na bd pelo id
     public void pesquisaDivisaoID(String nomeDivisao){
        ligaDivision.ligarBD();
            ligaDivision.executaSql("select * from division where name ='"+nomeDivisao+"'");
        try {
            ligaDivision.rs.first();
            divisaoID = ligaDivision.rs.getInt("id");    //divisaoID recebe o codigo da string
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao procurar divisao:" +ex);
        }
        
        ligaDivision.desligarBD();
   
    }
     
    //metodo para procurar/enviar o tipo de dispositivo na bd pelo id
     public void pesquisaTipoDispositivoID(String nomeTipoDispositivo){
        ligaTipoDisp.ligarBD();
            ligaTipoDisp.executaSql("select * from device_type where name ='"+nomeTipoDispositivo+"'");
        try {
            ligaTipoDisp.rs.first(); 
            tipoDispositivoID = ligaTipoDisp.rs.getInt("id");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao procurar o tipo de dispositivo :" +ex);
        }
        
        ligaTipoDisp.desligarBD();
   
    }

}


