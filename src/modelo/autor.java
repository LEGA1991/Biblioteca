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
public class autor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int AId;
    private String Nombre;

    public int getAId() {
        return AId;
    }

    public void setAId(int AId) {
        this.AId = AId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
