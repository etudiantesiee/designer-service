package fr.esiee.pic.designer.design.evaluation;

import fr.esiee.pic.designer.domain.shapes.Couleur;
import fr.esiee.pic.designer.domain.shapes.Ellipse;
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
		.ajouter(p18)
		.couleurDeFond(Couleur.GRIS);
		
		
		
		//visage 
		Point p19 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		Point p20= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p21= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p222 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7, EcranEvaluation.UNITE_VERTICALE_GRILLE * 3);
		Point p22= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 8, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p23 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9, EcranEvaluation.UNITE_VERTICALE_GRILLE * 4);
		Point p244= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
		Point p24= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 10, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p25 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 8, EcranEvaluation.UNITE_VERTICALE_GRILLE * 10);
		Point p26 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6, EcranEvaluation.UNITE_VERTICALE_GRILLE * 10);
		Point p27= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 4, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p19)
		.ajouter(p20)
		.ajouter(p21)
		.ajouter(p222)
		.ajouter(p22)
		.ajouter(p23)
		.ajouter(p244)
		.ajouter(p24)
		.ajouter(p25)
		.ajouter(p26)
		.ajouter(p27);
	
		//corps
		Point p28 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 0, EcranEvaluation.UNITE_VERTICALE_GRILLE * 9);
		Point p29= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p30= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 4, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p31 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6, EcranEvaluation.UNITE_VERTICALE_GRILLE * 10);
		Point p32= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 8, EcranEvaluation.UNITE_VERTICALE_GRILLE * 10);
		Point p33 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 10, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p34= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11, EcranEvaluation.UNITE_VERTICALE_GRILLE * 8);
		Point p35= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 14, EcranEvaluation.UNITE_VERTICALE_GRILLE * 9);
		Point p36 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 14, EcranEvaluation.UNITE_VERTICALE_GRILLE * 11);
		Point p37 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11, EcranEvaluation.UNITE_VERTICALE_GRILLE * 10);
		Point p38= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11, EcranEvaluation.UNITE_VERTICALE_GRILLE * 11);
		
		Point p39 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 13, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
		Point p40= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
		Point p41= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7, EcranEvaluation.UNITE_VERTICALE_GRILLE * 12);
		Point p42 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
		Point p43= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 1, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
		Point p44 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3, EcranEvaluation.UNITE_VERTICALE_GRILLE * 11);
		Point p45= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3, EcranEvaluation.UNITE_VERTICALE_GRILLE * 10);
		Point p46= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 0, EcranEvaluation.UNITE_VERTICALE_GRILLE * 11);

		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p28)
		.ajouter(p29)
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
		.ajouter(p42)
		.ajouter(p43)
		.ajouter(p44)
		.ajouter(p45)
		.ajouter(p46)
		.couleurDeFond(Couleur.GRIS);
		
		//pied gauche 
		Point p47 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 1, EcranEvaluation.UNITE_VERTICALE_GRILLE * 14);
		Point p48= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 3, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
		Point p49= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
		Point p50 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5, EcranEvaluation.UNITE_VERTICALE_GRILLE * 14);

		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p47)
		.ajouter(p48)
		.ajouter(p49)
		.ajouter(p50);
		
		//pied droit 
				Point p51 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9, EcranEvaluation.UNITE_VERTICALE_GRILLE * 14);
				Point p52= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
				Point p53= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 11, EcranEvaluation.UNITE_VERTICALE_GRILLE * 13);
				Point p54 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 13, EcranEvaluation.UNITE_VERTICALE_GRILLE * 14);

				demarrerNouveauDessinAvecDesPoints()
				.ajouter(p51)
				.ajouter(p52)
				.ajouter(p53)
				.ajouter(p54);
				
	 //trait visage
				Point p55 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 4, EcranEvaluation.UNITE_VERTICALE_GRILLE * 7);
				Point p56= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 5, EcranEvaluation.UNITE_VERTICALE_GRILLE * 7);
				Point p57= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
				Point p58 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 9, EcranEvaluation.UNITE_VERTICALE_GRILLE * 7);
				Point p59 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 10, EcranEvaluation.UNITE_VERTICALE_GRILLE * 7);

				demarrerNouveauDessinAvecDesPoints()
				.ajouter(p55)
				.ajouter(p56)
				.ajouter(p57)
				.ajouter(p58)
				.ajouter(p59)
				.nePasRelierLesPointsExtreme();
				
				//nez 
				Point p60 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6.9, EcranEvaluation.UNITE_VERTICALE_GRILLE * 7.1);
				Point p61= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7, EcranEvaluation.UNITE_VERTICALE_GRILLE * 7);
				Point p62= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 7.1, EcranEvaluation.UNITE_VERTICALE_GRILLE * 7.1);
				
				demarrerNouveauDessinAvecDesPoints()
				.ajouter(p60)
				.ajouter(p61)
				.ajouter(p62)
				.nePasRelierLesPointsExtreme();
				
				//bouche
				Point p63 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6, EcranEvaluation.UNITE_VERTICALE_GRILLE * 9);
				Point p64= new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 8, EcranEvaluation.UNITE_VERTICALE_GRILLE * 9);
			
				
				demarrerNouveauDessinAvecDesPoints()
				.ajouter(p63)
				.ajouter(p64);
				
				
				//yeux
				Point pe1 =new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 6, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
				Point pe2=new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 8, EcranEvaluation.UNITE_VERTICALE_GRILLE * 6);
				Ellipse e1 = new Ellipse(pe1,EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 0.1, EcranEvaluation.UNITE_VERTICALE_GRILLE * 0.2);
				Ellipse e2 = new Ellipse(pe2,EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 0.1, EcranEvaluation.UNITE_VERTICALE_GRILLE * 0.2);
				
				ajouterEllipse(e1);
				ajouterEllipse(e2);
	}

}
