package fr.esiee.pic.designer.design.evaluation;

import fr.esiee.pic.designer.domain.shapes.Point;
import fr.esiee.pic.designer.domain.tools.CreateurDeForme;
import fr.esiee.pic.designer.ui.scene.evaluation.EcranEvaluation;

public class DessinGroupe6 extends CreateurDeForme {
	
	/**
	 * Constructeur avec nom
	 * 
	 * @param nom
	 */
	public DessinGroupe6(String nom) {
		super(nom);
	}
	
	/**
	 * Tous les dessins seront réalisés dans cette méthode.
	 * 
	 */
	@Override
	public void dessiner() {
		Point p1 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 45, EcranEvaluation.UNITE_VERTICALE_GRILLE * 20);
		Point p2 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 47, EcranEvaluation.UNITE_VERTICALE_GRILLE * 20);
		Point p3 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 46, EcranEvaluation.UNITE_VERTICALE_GRILLE * 21);
		Point p4 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 48, EcranEvaluation.UNITE_VERTICALE_GRILLE * 20);
		Point p5 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 47, EcranEvaluation.UNITE_VERTICALE_GRILLE * 22);
		Point p6 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 49, EcranEvaluation.UNITE_VERTICALE_GRILLE * 20);
		Point p7 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 52, EcranEvaluation.UNITE_VERTICALE_GRILLE * 21);
		Point p8 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 53, EcranEvaluation.UNITE_VERTICALE_GRILLE * 23);
		Point p9 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 53, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);
		Point p10 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 52, EcranEvaluation.UNITE_VERTICALE_GRILLE * 27);
		Point p11 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 49, EcranEvaluation.UNITE_VERTICALE_GRILLE * 30);
		Point p12 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 45, EcranEvaluation.UNITE_VERTICALE_GRILLE * 30);
		Point p13 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 42, EcranEvaluation.UNITE_VERTICALE_GRILLE * 27);
		Point p14 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 41, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);
		Point p15 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 41, EcranEvaluation.UNITE_VERTICALE_GRILLE * 23);
		Point p16 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 42, EcranEvaluation.UNITE_VERTICALE_GRILLE * 21);
		Point p17 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 45, EcranEvaluation.UNITE_VERTICALE_GRILLE * 20);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4)
		.ajouter(p5)
		.ajouter(p6)
		.ajouter(p7)
		.ajouter(p8)
		.ajouter(p9)
		.ajouter(p10)
		.ajouter(p11)
		.ajouter(p12)
		.ajouter(p13)
		.ajouter(p14)
		.ajouter(p15)
		.ajouter(p16)
		.ajouter(p17);
		
	}

}
