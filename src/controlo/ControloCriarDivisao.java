
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
    
   //metodo para inserir divisao na bd
    public void gravar(ModeloCriarDivisao mod){
        liga.ligarBD();
        
        try {
         
            PreparedStatement pst = liga.connect.prepareStatement("insert into division (name) values(?)");
            pst.setString(1, mod.getNomeDivisao());
            pst.execute();
            JOptionPane.showMessageDialog(null,"divisao inserida com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao inserir divisao/nErro:" +ex);
        }
        liga.desligarBD();
    }
    
    //metodo para alterar os dados da divisao
    public void alterar(ModeloCriarDivisao mod){
        liga.ligarBD();
        
        try {
            PreparedStatement pst = liga.connect.prepareStatement("update division set name=? where id=?");
            pst.setString(1,mod.getNomeDivisao());
            pst.setInt(2,mod.getIdDivisao());
            pst.execute();
            JOptionPane.showMessageDialog(null,"divisao alterada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao alterar divisao/nErro:" +ex);
        }
        
        liga.desligarBD();
        
    }
    
    //metodo para eliminar divisao
    public void eliminar(ModeloCriarDivisao mod){
            
        liga.ligarBD();
        
        try {
            PreparedStatement pst = liga.connect.prepareStatement(" delete from division where id=?");
            pst.setInt(1, mod.getIdDivisao());
            pst.execute();
            JOptionPane.showMessageDialog(null,"divisao eliminada com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao eliminar divisao/nErro:" +ex);
        }
        liga.desligarBD();
    }
    
   // metodo para procurar a divisao na bd pelo nome
     public ModeloCriarDivisao pesquisaDivisao(ModeloCriarDivisao mod){
        liga.ligarBD();
        liga.executaSql("select * from division where name like '%" + mod.getPesquisar()+"%'");
        
            try {
           
            liga.rs.first();
            mod.setIdDivisao(liga.rs.getInt("id"));
            mod.setNomeDivisao(liga.rs.getString("name"));
            
            } catch (SQLException ex) {
           // JOptionPane.showMessageDialog(null,"a divisao não está registada/nErro:" +ex);
        }
        
        liga.desligarBD();
        return mod;
  }
    
}
