
package br.com.senac.hortadidatica.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class DAO {
    public static <T> void cadastrar(T objeto) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }//chamar método: OutroTipoDeObjeto outroObjeto = new OutroTipoDeObjeto();, GenericDao.cadastrar(outroObjeto);
    
    public static <T> void atualizar(T objeto) {
    EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
}
    
    public static <T> void excluir(Class<T> entityType, String id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            T entity = em.find(entityType, id);
            if (entity != null) {
                em.getTransaction().begin();
                em.remove(entity);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }//chamar método:GenericDao.excluir(OutroTipoDeObjeto.class, 5);
    
    public static <T> boolean existemRegistros(Class<T> entityType) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            String jpql = "SELECT COUNT(e) FROM " + entityType.getSimpleName() + " e";
            TypedQuery<Long> query = em.createQuery(jpql, Long.class);
            Long count = query.getSingleResult();

            return count > 0;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }
    
    public static <T> List<T> listar(Class<T> entityType) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            String textoQuery = "SELECT e FROM " + entityType.getSimpleName() + " e";
            TypedQuery<T> query = em.createQuery(textoQuery, entityType);
            return query.getResultList();
        } catch (Exception e) {
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }//chamar método: List<OutroTipoDeObjeto> listaOutrosObjetos = GenericDao.listar(OutroTipoDeObjeto.class);
    public static <T> T obterPorId(Class<T> entityType, String idString) {
    EntityManager em = JPAUtil.getEntityManager();
    try {
        int id = Integer.parseInt(idString); // Converte a String para int
        T objeto = em.find(entityType, id);
        return objeto;
    } catch (Exception e) {
        throw e;
    } finally {
        em.close();
    }
}


}
