package fr.esiee.pic.designer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.esiee.pic.designer.domain.shapes.CheminDePoints;
import fr.esiee.pic.designer.domain.shapes.Point;

public interface CheminDePointsRepository extends JpaRepository<CheminDePoints, String> {

}
