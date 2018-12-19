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
		
		//point corne2
		Point p6 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (12 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 0);
		Point p7 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (12 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 2);
		Point p8 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (11 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 3);
		Point p9 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (12 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p10 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (13 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 3);
		
		//dessin
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p6)
		.ajouter(p7)
		.ajouter(p8)
		.ajouter(p9)
		.ajouter(p10);
		
		//frange
		Point p11 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (2 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		Point p12 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (2 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p13 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (3 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 3);
		Point p14 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (5 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 2);
		Point p15 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (9 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 2);
		Point p16 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (11 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 3);
		Point p17 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (12 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p18 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (12 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		
		//dessin
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p11)
		.ajouter(p12)
		.ajouter(p13)
		.ajouter(p14)
		.ajouter(p15)
		.ajouter(p16)
		.ajouter(p17)
		.ajouter(p18);
		
		//visage
		Point p19 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (2 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		Point p20 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (2 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 11);
		Point p21 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (5 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 14);
		Point p22 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (9 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 14);
		Point p23 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (12 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 11);
		Point p24 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (12 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p19)
		.ajouter(p20)
		.ajouter(p21)
		.ajouter(p22)
		.ajouter(p23)
		.ajouter(p24);
		
		//lunette
		Point p25 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (3 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 7);
		Point p26 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (5 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 10);
		Point p27 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (9 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 10);
		Point p28 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (11 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 7);

		//dessin
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p25)
		.ajouter(p26)
		.ajouter(p27)
		.ajouter(p28);
		
		//bouche
		Point p29 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (5 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 12);
		Point p30 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * (9 + i), EcranEvaluation.UNITE_VERTICALE_GRILLE * 12);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p29)
		.ajouter(p30);
		
	}

}
