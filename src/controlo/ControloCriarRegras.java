
package controlo;

import modelo.ModeloCriarRegras;

/**
 *
 * @author Celina
 */
public class ControloCriarRegras {
    
        ModeloCriarRegras mod = new ModeloCriarRegras();
    LigacaoBD liga = new LigacaoBD();
    LigacaoBD ligaDivision = new LigacaoBD(); // ligacao para ir buscar o codigodo da divisao
    String nomeDivisao;    //guarda o nome da divisao
    int divisaoID;  //recebe o codigo da divisao referente ao nome da divisao que for selecionada na combo
    LigacaoBD ligaDispositivo = new LigacaoBD(); // ligacao para ir buscar o codigodo da divisao
    String nomeDispositivo;    //guarda o nome da divisao
    int dispositivoID;  //recebe o codigo da divisao referente ao nome da divisao que for selecionada na combo
    LigacaoBD ligaCenario = new LigacaoBD(); // ligacao para ir buscar o codigodo da divisao
    String nomeCenario;    //guarda o nome da divisao
    int cenarioID;  //recebe o codigo da divisao referente ao nome da divisao que for selecionada na combo
    
}
