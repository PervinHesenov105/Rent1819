/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.rent.main.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Perfect
 */
public abstract class AbstractPU {
    
    public static EntityManagerFactory emf=null;
    
    public static EntityManager createEM(){
        if(emf==null){
           emf= Persistence.createEntityManagerFactory("CarRentalJPA");
        }
        return emf.createEntityManager();
    }
    
    
    public static void close(EntityManager em){
        em.close();
    }
}
