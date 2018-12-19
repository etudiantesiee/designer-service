package fr.esiee.pic.designer.design.evaluation;

import fr.esiee.pic.designer.domain.shapes.Couleur;
import fr.esiee.pic.designer.domain.shapes.Ellipse;
import fr.esiee.pic.designer.domain.shapes.Point;
import fr.esiee.pic.designer.domain.tools.CreateurDeForme;
import fr.esiee.pic.designer.ui.scene.evaluation.EcranEvaluation;

public class DessinGroupe4 extends CreateurDeForme {
	
	/**
	 * Constructeur avec nom
	 * 
	 * @param nom
	 */
	public DessinGroupe4(String nom) {
		super(nom);
	}
	
	/**
	 * Tous les dessins seront réalisés dans cette méthode.
	 * 
	 */
	@Override
	public void dessiner() {
		
		Point p1 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 1, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);
		Point p2 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 2, EcranEvaluation.UNITE_VERTICALE_GRILLE * 22);
		Point p3 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 4, EcranEvaluation.UNITE_VERTICALE_GRILLE * 20);
		Point p4 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 10, EcranEvaluation.UNITE_VERTICALE_GRILLE * 20);
		Point p5 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 12, EcranEvaluation.UNITE_VERTICALE_GRILLE * 12);
		Point p6 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 13, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);
		Point p7 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9, EcranEvaluation.UNITE_VERTICALE_GRILLE * 21);
		Point p8 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7, EcranEvaluation.UNITE_VERTICALE_GRILLE * 22);
		Point p9 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5, EcranEvaluation.UNITE_VERTICALE_GRILLE * 21);

		demarrerNouveauDessinAvecDesPoints("cheveux")
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4)
		.ajouter(p5)
		.ajouter(p6)
		.ajouter(p7)
		.ajouter(p8)
		.ajouter(p9);


	}
}