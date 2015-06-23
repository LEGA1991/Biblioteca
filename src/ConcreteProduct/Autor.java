/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcreteProduct;
import Controlador.autorJpaController;
import Controlador.libroJpaController;
import javax.persistence.EntityManagerFactory;
/**
 *
 * @author adiseño.2015
 */
public class Autor extends autorJpaController{

    public Autor(EntityManagerFactory emf) {
        super(emf);
    }
    
}
