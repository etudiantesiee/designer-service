package fr.esiee.pic.designer.design.evaluation;

import fr.esiee.pic.designer.domain.shapes.Point;
import fr.esiee.pic.designer.domain.tools.CreateurDeForme;
import fr.esiee.pic.designer.ui.scene.evaluation.EcranEvaluation;

public class DessinGroupe2 extends CreateurDeForme {
	
	/**
	 * Constructeur avec nom
	 * 
	 * @param nom
	 */
	public DessinGroupe2(String nom) {
		super(nom);
	}
	
	/**
	 * Tous les dessins seront réalisés dans cette méthode.
	 * 
	 */
	@Override
	public void dessiner() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 10, EcranEvaluation.UNITE_VERTICALE_GRILLE * 10);
		Point p3 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 20, EcranEvaluation.UNITE_VERTICALE_GRILLE * 0);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3);
		
	}

}
