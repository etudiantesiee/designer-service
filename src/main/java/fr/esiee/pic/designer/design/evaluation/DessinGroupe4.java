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
		Point p5 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 12, EcranEvaluation.UNITE_VERTICALE_GRILLE * 22);
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

		//tête
		Point p10 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3, EcranEvaluation.UNITE_VERTICALE_GRILLE * 23);
		Point p11 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);
		Point p12 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5, EcranEvaluation.UNITE_VERTICALE_GRILLE * 27);
		Point p13 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9, EcranEvaluation.UNITE_VERTICALE_GRILLE * 27);
		Point p14 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);
		Point p15= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11, EcranEvaluation.UNITE_VERTICALE_GRILLE * 23);

		demarrerNouveauDessinAvecDesPoints("tete")
		.ajouter(p10)
		.ajouter(p11)
		.ajouter(p12)
		.ajouter(p13)
		.ajouter(p14)
		.ajouter(p15)
		.ajouter(p7)
		.ajouter(p8)
		.ajouter(p9);
		
		Point p16 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 4, EcranEvaluation.UNITE_VERTICALE_GRILLE * 23);
		Point p17 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5, EcranEvaluation.UNITE_VERTICALE_GRILLE * 22);
		Point p18 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6, EcranEvaluation.UNITE_VERTICALE_GRILLE * 22);
		Point p19 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7, EcranEvaluation.UNITE_VERTICALE_GRILLE * 23);
		Point p20 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 8, EcranEvaluation.UNITE_VERTICALE_GRILLE * 22);
		Point p21= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9, EcranEvaluation.UNITE_VERTICALE_GRILLE * 22);
		Point p22 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 10, EcranEvaluation.UNITE_VERTICALE_GRILLE * 23);
		Point p23 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9, EcranEvaluation.UNITE_VERTICALE_GRILLE * 24);
		Point p24 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 8, EcranEvaluation.UNITE_VERTICALE_GRILLE * 24);
		Point p25 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7, EcranEvaluation.UNITE_VERTICALE_GRILLE * 23);
		Point p26 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6, EcranEvaluation.UNITE_VERTICALE_GRILLE * 24);
		Point p27= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5, EcranEvaluation.UNITE_VERTICALE_GRILLE * 24);

		demarrerNouveauDessinAvecDesPoints("yeux")
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
		.ajouter(p27);
		
		
		Point p28 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6, EcranEvaluation.UNITE_VERTICALE_GRILLE * 26);
		Point p29 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7, EcranEvaluation.UNITE_VERTICALE_GRILLE * 26);
		Point p30= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 8, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);

		demarrerNouveauDessinAvecDesPoints("Bouche")
		.ajouter(p28)
		.ajouter(p29)
		.ajouter(p30);
		
		Point p31 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 1, EcranEvaluation.UNITE_VERTICALE_GRILLE * 32);
		Point p32 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 1, EcranEvaluation.UNITE_VERTICALE_GRILLE * 26);
		Point p33 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 2, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);
		Point p34 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);
		Point p35 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5, EcranEvaluation.UNITE_VERTICALE_GRILLE * 27);
		Point p36 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9, EcranEvaluation.UNITE_VERTICALE_GRILLE * 27);
		Point p37 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);		
		Point p38 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 12, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);
		Point p39 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 13, EcranEvaluation.UNITE_VERTICALE_GRILLE * 26);
		Point p40 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 13, EcranEvaluation.UNITE_VERTICALE_GRILLE * 32);
		
		Point p41 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 12, EcranEvaluation.UNITE_VERTICALE_GRILLE * 32);
		
		Point p42 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 12, EcranEvaluation.UNITE_VERTICALE_GRILLE * 28);
		Point p43 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11, EcranEvaluation.UNITE_VERTICALE_GRILLE * 31);
		Point p44 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 10, EcranEvaluation.UNITE_VERTICALE_GRILLE * 33);
		Point p45 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 8, EcranEvaluation.UNITE_VERTICALE_GRILLE * 33);
		Point p46 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7, EcranEvaluation.UNITE_VERTICALE_GRILLE * 32);
		Point p47 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6, EcranEvaluation.UNITE_VERTICALE_GRILLE * 33);
		Point p48 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 4, EcranEvaluation.UNITE_VERTICALE_GRILLE * 33);
		Point p49 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3, EcranEvaluation.UNITE_VERTICALE_GRILLE * 31);
		Point p50 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 2, EcranEvaluation.UNITE_VERTICALE_GRILLE * 27);
		Point p51 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 2, EcranEvaluation.UNITE_VERTICALE_GRILLE * 32);


	
		demarrerNouveauDessinAvecDesPoints("corps")
		.ajouter(p31)
		.ajouter(p32)
		.ajouter(p33)
		.ajouter(p34)
		.ajouter(p35)
		.ajouter(p36)
		.ajouter(p37)
		.ajouter(p38)
		.ajouter(p39)
		.ajouter(p40)
		.ajouter(p41)
		.ajouter(p42)
		.ajouter(p44)
		.ajouter(p45)
		.ajouter(p46)
		.ajouter(p47)
		.ajouter(p48)
		.ajouter(p49)
		.ajouter(p50)
		.ajouter(p51);






		
	}
}