package fr.esiee.pic.designer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.esiee.pic.designer.domain.shapes.Couleur;

/**
 * Point repository
 * 
 * @author etudiant
 *
 */
public interface CouleurRepository extends JpaRepository<Couleur, String> {

}
