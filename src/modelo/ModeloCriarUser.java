
package modelo;

/**
 *
 * @author Celina
 */
public class ModeloCriarUser {
    
    private Integer idUser;
    private String nomeUser;
    private String password;
    private String tipo;
    private String pesquisa;

    /**
     * @return the idUser
     */
    public Integer getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the nomeUser
     */
    public String getNomeUser() {
        return nomeUser;
    }

    /**
     * @param nomeUser the nomeUser to set
     */
    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
}
