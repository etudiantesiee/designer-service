package fr.esiee.pic.designer.design.evaluation;

import fr.esiee.pic.designer.domain.shapes.Couleur;
import fr.esiee.pic.designer.domain.shapes.Ellipse;
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
		//Decalage pour le groupe 2
		int decalage = 20* EcranEvaluation.UNITE_HORIZONTALE_GRILLE;
		
		//Points cheveux
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
		
		//Dessin cheveux
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
		.ajouter(p29)
		.couleurDeFond(Couleur.GRIS);
		
		//Points yeux
		Point p30 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 7);
		Point p31 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 4 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		Point p32 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		Point p33 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 7);
		Point p34 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		Point p35 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 10 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		Point p36 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11+ decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 7);
		Point p37 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 10 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p38 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p39 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 7);
		Point p40= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p41= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 4 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		
		//Dessin yeux
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p30)
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
		.couleurDeFond(Couleur.GRIS);
		
		//Points nez
		Point p42 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6.7 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8.3);
		Point p43 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p44 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7.3 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8.3);
		
		//Dessin nez
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p42)
		.ajouter(p43)
		.ajouter(p44)
		.nePasRelierLesPointsExtreme();
		
		//Points bouche
		Point p45 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 11);
		Point p46 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 8 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 11);
		
		//Dessin bouche
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p45)
		.ajouter(p46);
		
		//Points fossette
		Point p47 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6.9 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
		Point p48 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7.1 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
				
		//Dessin fossette
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p47)
		.ajouter(p48);
		
		//Points menton
		Point p49 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 14);
		Point p50 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 8 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 14);
		
		//Dessin menton
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p10)
		.ajouter(p50)
		.ajouter(p49)
		.ajouter(p22)
		.nePasRelierLesPointsExtreme();
		
		//Pupille gauche
		Point p51 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 7);
		
		Ellipse e1 = new Ellipse("gauche", p51, 10, 10, Couleur.NOIR);
		ajouterEllipse(e1);
		
		//Pupille droite
		Point p52 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9 + decalage, EcranEvaluation.UNITE_VERTICALE_GRILLE * 7);
		Ellipse e2 = new Ellipse("droite", p52, 10, 10, Couleur.NOIR);
		ajouterEllipse(e2);
		

		
	}

}
