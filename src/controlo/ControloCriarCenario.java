
package controlo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloCriarCenario;

/**
 *
 * @author Celina
 */
public class ControloCriarCenario {
    
    ModeloCriarCenario mod = new ModeloCriarCenario();
    LigacaoBD liga = new LigacaoBD();
    LigacaoBD ligaDivision = new LigacaoBD(); // ligacao para ir buscar o codigodo da divisao
    String nomeDivisao;    //guarda o nome da divisao
    int divisaoID;  //recebe o codigo da divisao referente ao nome da divisao que for selecionada na combo
   
    
         //metodo para inserir cenario na bd
    public void alterar(ModeloCriarCenario mod){  //recebe um obj do tipo mod
        
        pesquisaDivisaoID(mod.getNomeDivisao());   //chama o metodo pesquisar,enviamos a string
        liga.ligarBD();

        try {
         
            PreparedStatement pst = liga.connect.prepareStatement("update scenario set (name=?, division_id=?) where id=?");
            pst.setString(1, mod.getNomeCenario());
            pst.setInt(2, divisaoID);
            pst.setInt(3, mod.getIdCenario());
            pst.execute();
            JOptionPane.showMessageDialog(null,"cenario alterado com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao alterar cenario/nErro:" +ex);
        }
        liga.desligarBD();
    }

    
    
    
     //metodo para inserir cenario na bd
    public void gravar(ModeloCriarCenario mod){  //recebe um obj do tipo mod
        
        pesquisaDivisaoID(mod.getNomeDivisao());   //chama o metodo pesquisar,enviamos a string
        liga.ligarBD();

        try {
         
            PreparedStatement pst = liga.connect.prepareStatement("insert into scenario (name, division_id) values(?,?)");
            pst.setString(1, mod.getNomeCenario());
            pst.setInt(2, divisaoID);
            pst.execute();
            JOptionPane.showMessageDialog(null,"cenario inserido com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao inserir cenario/nErro:" +ex);
        }
        liga.desligarBD();
    }
    
     //metodo para procurar/enviar a divisao na bd pelo id
     public void pesquisaDivisaoID(String nomeDivisao){
        liga.ligarBD();
        liga.executaSql("select * from division where name ='"+nomeDivisao+"'");
        try {
            liga.rs.first();
            divisaoID = liga.rs.getInt("id");    //divisaoID recebe o codigo da string
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao procurar divisao:" +ex);
        }
        
        liga.desligarBD();
    }
     
         //metodo para procurar o cenario na bd pelo nome
     public ModeloCriarCenario pesquisaCenario(ModeloCriarCenario mod){
        liga.ligarBD();
          
        try {
            liga.executaSql("select * from scenario where name like '%" + mod.getPesquisar()+"%'");
            liga.rs.first();
 
            pesquisaNomeDivisao(liga.rs.getInt("division_id")); //chama o metodo para atribuir o id ao nome
            mod.setNomeDivisao(nomeDivisao);
            mod.setNomeCenario(liga.rs.getString("name"));
            mod.setIdCenario(liga.rs.getInt("id"));
          
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"o cenario não está registado/nErro:" +ex);
        }
        
        liga.desligarBD();
        return mod;
        
        
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
    
        //metodo para eliminar cenario
    public void eliminar(ModeloCriarCenario mod){
            
        liga.ligarBD();
        
        try {
            PreparedStatement pst = liga.connect.prepareStatement("delete from scenario where id=?");
            pst.setInt(1, mod.getIdCenario());
            pst.execute();
            JOptionPane.showMessageDialog(null,"cenario eliminado com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao eliminar cenario/nErro:" +ex);
        }
        liga.desligarBD();
    }

    
}
