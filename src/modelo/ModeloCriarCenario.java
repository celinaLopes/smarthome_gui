
package modelo;

/**
 *
 * @author Celina
 */
public class ModeloCriarCenario {
    
    private Integer idCenario;
    private String nomeDivisao;
    private String nomeCenario;
    private String pesquisar;


    public String getNomeCenario() {
        return nomeCenario;
    }

    public void setNomeCenario(String nomeCenario) {
        this.nomeCenario = nomeCenario;
    }

    public Integer getIdCenario() {
        return idCenario;
    }

    public void setIdCenario(Integer idCenario) {
        this.idCenario = idCenario;
    }

    public String getPesquisar() {
        return pesquisar;
    }

    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }

    public String getNomeDivisao() {
        return nomeDivisao;
    }

    public void setNomeDivisao(String nomeDivisao) {
        this.nomeDivisao = nomeDivisao;
    }
}
