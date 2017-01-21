
package controlo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ModeloCriarDispositivo;
import modelo.ModeloCriarUser;



/**
 *
 * @author Celina
 */
public class ControloCriarUser {
    
    LigacaoBD liga = new LigacaoBD();
    ModeloCriarUser mod = new ModeloCriarUser();
    
    public void gravar(ModeloCriarUser mod){
        liga.ligarBD();
        
        try {
            PreparedStatement pst = liga.connect.prepareStatement("insert into utilizador(username,tipo,senha) values(?,?,?)");
            pst.setString(1, mod.getNomeUser());
            pst.setString(2,mod.getTipo());
            pst.setString(3,mod.getPassword());
            pst.execute();
            JOptionPane.showMessageDialog(null,"utilizador inserido");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao inserir os dados" +ex);
        }
        
        liga.desligarBD();
    }
    
    public void eliminar(ModeloCriarUser mod){
        liga.ligarBD();
        
        try {
            PreparedStatement pst = liga.connect.prepareStatement("delete * from utilizador where id=?");
            pst.setInt(1, mod.getIdUser());
            pst.execute();
            JOptionPane.showMessageDialog(null,"utilizador eliminado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao eliminar dados" +ex);
        }
        liga.desligarBD();
    }
    
    public void alterar(ModeloCriarUser mod){
        liga.ligarBD();
        
        try {
            PreparedStatement pst = liga.connect.prepareStatement("update * from utilizador set username=?, tipo=?, senha=? where id=?");
            pst.setString(1, mod.getNomeUser());
            pst.setString(2, mod.getTipo());
            pst.setString(3, mod.getPassword());
            pst.setInt(4, mod.getIdUser());
            pst.execute();
            JOptionPane.showMessageDialog(null," dados alterados");       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao alterar dados" +ex);
        }
        liga.desligarBD();
        
    }
    
    //metodo para procurar o dispositivo na bd pelo nome
     public ModeloCriarUser pesquisaUser(ModeloCriarUser mod){
        liga.ligarBD();
            liga.executaSql("select * from utilizador where username like '%" + mod.getPesquisa()+"%'");
        try {
            liga.rs.first();
            mod.setNomeUser(liga.rs.getString("username"));
            mod.setIdUser(liga.rs.getInt("id"));
            mod.setTipo(liga.rs.getString("tipo"));
            mod.setPassword(liga.rs.getString("senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao procurar dispositivo/nErro:" +ex);
        }
        
        liga.desligarBD();
        return mod;
        
        
    }
        
}


