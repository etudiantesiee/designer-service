package fr.esiee.pic.designer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.esiee.pic.designer.domain.shapes.ElementGraphique;

/**
 * Repo des éléments graphiques
 * 
 * @author etudiant
 *
 */
public interface ElementGraphiqueRepository extends JpaRepository<ElementGraphique, String> {
    
    /**
     * Recherche un élement graphique par son nom
     * 
     * @param nom
     * @return
     */
    public ElementGraphique findByNom(String nom);

}
