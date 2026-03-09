package dao;

import java.util.List;

/**
 * Interface générique pour le DAO
 * @param <T> type de l'entité
 */
public interface IDao<T> {

    boolean create(T o);        // Ajouter un objet
    boolean delete(T o);        // Supprimer un objet
    boolean update(T o);        // Mettre à jour un objet
    T findById(int id);         // Rechercher par ID
    List<T> findAll();          // Récupérer tous les objets
}