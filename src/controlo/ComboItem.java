/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

import java.awt.Component;

/**
 *
 * @author Celina
 */
public class ComboItem {

    private Integer id;
    private String name;

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
}
