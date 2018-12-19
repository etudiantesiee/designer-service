package fr.esiee.pic.designer.design.evaluation;

import fr.esiee.pic.designer.domain.shapes.Point;
import fr.esiee.pic.designer.domain.tools.CreateurDeForme;
import fr.esiee.pic.designer.ui.scene.evaluation.EcranEvaluation;

public class DessinGroupe1 extends CreateurDeForme {
	
	/**
	 * Constructeur avec nom
	 * 
	 * @param nom
	 */
	public DessinGroupe1(String nom) {
		super(nom);
	}
	
	/**
	 * Tous les dessins seront réalisés dans cette méthode.
	 * 
	 */
	@Override
	public void dessiner() {
		//cheveux
		
		Point p1 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 0, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p2 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 0, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		Point p3 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 1, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p4 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3, EcranEvaluation.UNITE_VERTICALE_GRILLE * 2);
		Point p5 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7, EcranEvaluation.UNITE_VERTICALE_GRILLE * 1);
		Point p6 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11, EcranEvaluation.UNITE_VERTICALE_GRILLE * 2);
		Point p7 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 13, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p8 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 14, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		Point p9 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 14, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p10 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 12, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p11 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4)
		.ajouter(p5)
		.ajouter(p7)
		.ajouter(p8)
		.ajouter(p9)
		.ajouter(p10)
		.ajouter(p11);
		
		
	}

}
