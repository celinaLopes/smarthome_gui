
package controlo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ModeloCriarDispositivo;


/**
 *
 * @author Celina
 */
public class ControloCriarDispositivo {
    
    LigacaoBD liga = new LigacaoBD();
    ModeloCriarDispositivo mod = new ModeloCriarDispositivo();
    
   //metodo para inserir dispositivo na bd
    public void gravar(ModeloCriarDispositivo mod){
        liga.ligarBD();
        
        try {
         
            PreparedStatement pst = liga.connect.prepareStatement("insert into device (name, division_id, device_type_id) values(?, ?, ?)");
            pst.setString(1,mod.getNomeDispositivo());
            pst.setInt(2, mod.getIdDivisao());
            pst.setInt(3, mod.getIdTipoDispositivo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"dispositivo inserido com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao inserir dispositivo/nErro:" +ex);
        }
        liga.desligarBD();
    }
    
    //metodo para alterar os dados do dispositivo
    public void alterar(ModeloCriarDispositivo mod){
        liga.ligarBD();
        
        try {
            PreparedStatement pst = liga.connect.prepareStatement("update device set name=? where id=?");
            pst.setString(1,mod.getNomeDispositivo());
            pst.setInt(2,mod.getIdDispositivo());
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
            PreparedStatement pst = liga.connect.prepareStatement(" delete from device where id=?");
            pst.setInt(1, mod.getIdDispositivo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"dispositivo eliminado com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao eliminar dispositivo/nErro:" +ex);
        }
        liga.desligarBD();
    }
    
    //metodo para procurar o dispositivo na bd pelo nome
     public ModeloCriarDispositivo pesquisaDispositivo(ModeloCriarDispositivo mod){
        liga.ligarBD();
            liga.executaSql("select * from device where name like '%" + mod.getPesquisar()+"%'");
        try {
            liga.rs.first();
            mod.setIdDispositivo(liga.rs.getInt("id"));
            mod.setNomeDispositivo(liga.rs.getString("name"));
            mod.setIdDivisao(liga.rs.getInt("division_id"));
            mod.setIdTipoDispositivo(liga.rs.getInt("device_type_id"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"o dispositivo não está registado/nErro:" +ex);
        }
        
        liga.desligarBD();
        return mod;
        
        
    }
}
