package controlo;

import java.sql.*;  //importa tdo o que java tem sobre sql
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Celina
 */
public class LigacaoBD {
   
    // public vou aceder atraves de outras classes
   public Statement stm;  //reponsavel por realizar a pesquisa na bd
   public ResultSet rs;    //guarda o resultado da pesquisa
  // private String driver = "org.postgresql.Driver";   //identifica o serviço
 //  private String caminho = "jdbc:postgresql://localhost:5433/dbSmartHome";
 //  private String user = "postgres"; //root
   private String driver = "com.mysql.jdbc.Driver";   //identifica o serviço
   private String caminho = "jdbc:mysql://46.19.34.44:9999/smarthome";
   private String user = "smarthome"; //root
   private String pwd = "smarthome";
   public Connection connect;  //variavel que faz a ligação à bd
    
   //metodo responsavel por efetuar a ligação à bd
   public void ligarBD() {
       try {
           Class.forName("com.mysql.jdbc.Driver");
          // System.setProperty("jdbc.Drivers", driver); //inicializa o driver da ligação
           connect = DriverManager.getConnection(caminho,user,pwd); //informao caminho que o user passou
    //   JOptionPane.showMessageDialog(null,"ligação efetuada com sucesso");
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Falhou a ligação à base de dados : \n " + ex.getMessage());  //exibe a msg + a msg do erro
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(LigacaoBD.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   public void executaSql(String sql){
       try {
           stm = connect.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);  //na pesquisa faz a distinção entre maiusculas e minusculas, e percorre aslinhas da bd do inicio para o fim (viceversa), podemos atribuir o valor ao ultimo/primeiro registo na bd
           rs = stm.executeQuery(sql);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"erro executa sql : \n " + ex.getMessage());
       }
   }
  
   //metodo para desligar da base de dados
   public void desligarBD(){
       try {
           connect.close();  //fecha a ligação
       //  JOptionPane.showMessageDialog(null,"base de dados desligada com sucesso");
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"erro ao desligar a base de dados : \n" +ex.getMessage());
        }
}
}