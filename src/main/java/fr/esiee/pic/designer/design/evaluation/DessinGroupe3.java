package fr.esiee.pic.designer.design.evaluation;

import fr.esiee.pic.designer.domain.shapes.Point;
import fr.esiee.pic.designer.domain.tools.CreateurDeForme;
import fr.esiee.pic.designer.ui.scene.evaluation.EcranEvaluation;

public class DessinGroupe3 extends CreateurDeForme {
	
	/**
	 * Constructeur avec nom
	 * 
	 * @param nom
	 */
	public DessinGroupe3(String nom) {
		super(nom);
	}
	
	/**
	 * Tous les dessins seront réalisés dans cette méthode.
	 * 
	 */
	@Override
	public void dessiner() {
		
		//point corne1
		int i=40;
		Point p1 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (2 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 0);
		Point p2 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (1 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 3);
		Point p3 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (2 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p4 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (3 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 3);
		Point p5 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (2 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 2);
		
		//dessin
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4)
		.ajouter(p5);
	}

}
