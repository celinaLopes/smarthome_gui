
package controlo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
            PreparedStatement pst = liga.connect.prepareStatement("insert into user(username,password) values(?,?)");
            pst.setString(1, mod.getNomeUser());
            pst.setString(2,mod.getPassword());
           // pst.setString(3,mod.getTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"utilizador inserido");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao inserir utilizador" +ex);
        }
        
        liga.desligarBD();
    }
    
    public void eliminar(ModeloCriarUser mod){
        liga.ligarBD();
        
        try {
            PreparedStatement pst = liga.connect.prepareStatement("delete  from user where id=?");
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
            PreparedStatement pst = liga.connect.prepareStatement(" update user "
                    + "set username=?, password=?, tipo=? where id=?");
            
            pst.setString(1, mod.getNomeUser());
            pst.setString(2, mod.getPassword());
            pst.setString(3, mod.getTipo());
            pst.setInt(4, mod.getIdUser());
            pst.execute();
            JOptionPane.showMessageDialog(null," dados alterados");       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao alterar dados" +ex);
        }
        liga.desligarBD();
        
    }
    
   // metodo para procurar o utilizador na bd pelo nome
     public ModeloCriarUser pesquisaUser(ModeloCriarUser mod){
        liga.ligarBD();
        liga.executaSql("select *from  user where username like '%" + mod.getPesquisa()+"%'");
        
            try {
           
            liga.rs.first();
            mod.setIdUser(liga.rs.getInt("id"));
            mod.setNomeUser(liga.rs.getString("username"));
            mod.setPassword(liga.rs.getString("password"));
            mod.setTipo(liga.rs.getString("tipo"));
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," o utilizador não está registado/nErro:" +ex);
        }
        
        liga.desligarBD(); 
        return mod;
  }
        
}


