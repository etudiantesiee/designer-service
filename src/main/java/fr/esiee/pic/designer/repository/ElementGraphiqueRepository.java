package fr.esiee.pic.designer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.esiee.pic.designer.domain.shapes.ElementGraphique;

public interface ElementGraphiqueRepository extends JpaRepository<ElementGraphique, String> {

}
