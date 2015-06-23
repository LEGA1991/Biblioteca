/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcreteProduct;
import Controlador.libroJpaController;
import javax.persistence.EntityManagerFactory;
/**
 *
 * @author adiseño.2015
 */
public class Libro extends libroJpaController {

    public Libro(EntityManagerFactory emf) {
        super(emf);
    }
    
}
