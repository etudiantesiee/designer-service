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
		int decalage = 20* EcranEvaluation.UNITE_HORIZONTALE_GRILLE;
		Point p1 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 1);
		Point p2 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 1);
		Point p3 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 13 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 2);
		Point p4 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 14 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 3);
		Point p5 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 14 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p6 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 13 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 12);
		Point p7 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 12+ decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
		Point p8 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 12);
		Point p9 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 10 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
		Point p10 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9.5 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 12);
		Point p11= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 10 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 11);
		Point p12= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p13= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11+ decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		Point p14= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p15= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 8 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p16= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 5);
		Point p17= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p18= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p19= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		Point p20= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p21= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 4 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 11);
		Point p22= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 4.5 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 12);
		Point p23= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 4 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
		Point p24= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 12);
		Point p25= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 2 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
		Point p26= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 1 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 12);
		Point p27= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 0 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p28= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 0 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 3);
		Point p29= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 1 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 2);
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
		.ajouter(p18)
		.ajouter(p19)
		.ajouter(p20)
		.ajouter(p21)
		.ajouter(p22)
		.ajouter(p23)
		.ajouter(p24)
		.ajouter(p25)
		.ajouter(p26)
		.ajouter(p27)
		.ajouter(p28)
		.ajouter(p29);
		
	}

}
