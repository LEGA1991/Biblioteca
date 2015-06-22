/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author adiseño.2015
 */

@Entity
public class autor implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Nombre;
    
    public autor(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int AId) {
        this.id = AId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
