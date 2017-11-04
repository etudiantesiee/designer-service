package fr.esiee.pic.designer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.esiee.pic.designer.domain.shapes.Ellipse;

/**
 * Ellipse repository
 * 
 * @author etudiant
 *
 */
public interface EllipseRepository extends JpaRepository<Ellipse, String> {

}
