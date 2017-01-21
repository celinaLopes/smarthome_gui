
package controlo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloCriarDivisao;

/**
 *
 * @author Celina
 */
public class ControloCriarDivisao {
    
    LigacaoBD liga = new LigacaoBD();
    ModeloCriarDivisao mod = new ModeloCriarDivisao();
    
   //metodo para inserir dispositivo na bd
    public void gravar(ModeloCriarDivisao mod){
        liga.ligarBD();
        
        try {
         
            PreparedStatement pst = liga.connect.prepareStatement("insert into divisao (nome_divisao,dispositvo) values(?,?)");
            pst.setString(1,mod.getNomeDivisao());
            pst.setString(2, mod.getNomeDivisao());
            pst.execute();
            JOptionPane.showMessageDialog(null,"divisao inserido com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao inserir divisao/nErro:" +ex);
        }
        liga.desligarBD();
    }
    
    //metodo para alterar os dados do dispositivo
    public void alterar(ModeloCriarDivisao mod){
        liga.ligarBD();
        
        try {
            PreparedStatement pst = liga.connect.prepareStatement("update divisao set nome_divisao=?, dispositivo=? where id_divisao=?");
            pst.setString(1,mod.getNomeDivisao());
            pst.setString(2, mod.getNomeDispositivo());
            pst.setInt(3,mod.getIdDivisao());
            pst.execute();
            JOptionPane.showMessageDialog(null,"divisao alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao alterar divisao/nErro:" +ex);
        }
        
        liga.desligarBD();
        
    }
    
    //metodo para eliminar dispositivo
    public void eliminar(ModeloCriarDivisao mod){
            
        liga.ligarBD();
        
        try {
            PreparedStatement pst = liga.connect.prepareStatement(" delete  from divisao where id_divisao=?");
            pst.setInt(1, mod.getIdDivisao());
            pst.execute();
            JOptionPane.showMessageDialog(null,"divisao eliminado com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao eliminar divisao/nErro:" +ex);
        }
        liga.desligarBD();
    }
    
    //metodo para procurar o dispositivo na bd pelo nome
     public ModeloCriarDivisao pesquisaDispositivo(ModeloCriarDivisao mod){
        liga.ligarBD();
            liga.executaSql("select * from divisao where nome_divisao like '%" + mod.getPesquisar()+"%'");
        try {
            liga.rs.first();
            mod.setIdDivisao(liga.rs.getInt("id_divisao"));
            mod.setNomeDivisao(liga.rs.getString("nome_divisao"));
            mod.setNomeDispositivo(liga.rs.getString("dispositivo"));
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"a divisao não está registado/nErro:" +ex);
        }
        
        liga.desligarBD();
        return mod;
        
        
    }
    
}
