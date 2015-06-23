/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import Controlador.autorJpaController;
import Controlador.libroJpaController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.autor;
import modelo.libro;

/**
 *
 * @author adiseño.2015
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("BibliotecaPU");
        EntityManager em= emf.createEntityManager();
        autorJpaController AU = new autorJpaController(emf);
        libroJpaController LIB = new libroJpaController(emf);
        autor aut= new autor();
        libro li= new libro();
        aut.setNombre("pedro");
       
        li.setEditorial("XXX");
        li.setFecha("febrero");
        li.setISB("IASXS");
        li.setAid(aut);
       
        
        try {
            AU.create(aut);
            LIB.create(li);
            
        } catch (Exception e) {
        }
        
    }
    
}
