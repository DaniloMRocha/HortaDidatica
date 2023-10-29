
package br.com.senac.hortadidatica.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    private static final String PERSISTENCE_UNIT = "Horta";
 
    private static EntityManager em;    
    private static EntityManagerFactory fabrica;
    
    public static EntityManager getEntityManager(){
        if(fabrica == null || !fabrica.isOpen()){
            fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }if(em == null || !em.isOpen()) {
            em = fabrica.createEntityManager();
        }//cria se em nulo ou se o entity manager foi fechado          
        return em;
    }
    public static void closeEtityManager(){
        if(em.isOpen() && em != null){
            em.close();
            fabrica.close();
            }
    }
}
