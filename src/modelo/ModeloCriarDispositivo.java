
package modelo;

/**
 *
 * @author Celina
 */
public class ModeloCriarDispositivo {
    
    private Integer idDispositivo;
    private String nomeDispositivo;
    private Integer idDivisao;
    private Integer idTipoDispositivo;

    public Integer getIdTipoDispositivo() {
        return idTipoDispositivo;
    }

    public void setIdTipoDispositivo(Integer idTipoDispositivo) {
        this.idTipoDispositivo = idTipoDispositivo;
    }
    private String pesquisar;

    public Integer getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(Integer idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getNomeDispositivo() {
        return nomeDispositivo;
    }

    public void setNomeDispositivo(String nomeDispositivo) {
        this.nomeDispositivo = nomeDispositivo;
    }

    public Integer getIdDivisao() {
        return idDivisao;
    }

    public void setIdDivisao(Integer nomeDivisao) {
        this.idDivisao = nomeDivisao;
    }

    public String getPesquisar() {
        return pesquisar;
    }

    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }
    
}
