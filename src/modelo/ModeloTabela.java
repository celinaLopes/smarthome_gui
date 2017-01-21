
package modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Celina
 */
public class ModeloTabela extends AbstractTableModel{
    
        
    private ArrayList linhas = null;
    private String[] colunas = null;
    
//metodo construtor
    public ModeloTabela(ArrayList lin, String[] col){
    setLinhas(lin);
    setColunas(col);
}

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList dados){
        linhas= dados;
    }

    /**
     * @return the colunas  
     */
    public String[] getColunas() {
        return colunas;     
    }
    
    public void setColunas(String[] nomes){
        colunas = nomes;
    }
   
    //metodo que conta a quantidade de colunas
    public int getColumnCount(){
        return colunas.length;
    }
    
    //metodo que vai contar a quantas linhas tem o nosso array
    public int getRowCount(){
        return linhas.size();
    }
    
    //metodo que vai buscar o valor do nome da coluna
    public String getColumnName(int numCol){
        return colunas[numCol];              //depois de ver o nome da coluna devolve a quantidade de colunas
    }
    
    //metodo que adiciona as linhas a tabela, recebe a quantidade de linhas
    public Object getValueAt(int numLin, int numCol){
        
        Object[] linha =(Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
}
