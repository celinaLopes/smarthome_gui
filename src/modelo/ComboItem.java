
package modelo;

import java.awt.Component;

/**
 *
 * @author Celina
 */
public class ComboItem {

    private Integer id;
    private String name;
    private String pesquisar;

    public ComboItem(Integer value, String label) {
        this.id = value;
        this.name = label;
    }

    public String getName() {
        return this.name;
    }
    
    public Integer getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return getName();
    }
    
    /**
     * @param id the value to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @param name the label to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getPesquisar() {
        return pesquisar;
    }

    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }
}
