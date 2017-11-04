package fr.esiee.pic.designer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.esiee.pic.designer.domain.shapes.Point;

/**
 * Point repository
 * 
 * @author etudiant
 *
 */
public interface PointRepository extends JpaRepository<Point, String> {

}
