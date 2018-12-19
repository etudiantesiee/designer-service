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
		Point p12= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p13 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 8, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p14= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7, EcranEvaluation.UNITE_VERTICALE_GRILLE * 3);
		Point p15= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p16= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p17 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		Point p18 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 2, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
	
		
		
		
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
		.ajouter(p17)
		.ajouter(p18);
		
		
	}

}
