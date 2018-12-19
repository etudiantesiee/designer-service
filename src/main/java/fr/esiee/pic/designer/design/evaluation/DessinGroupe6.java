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
		
		//tete
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
		//corps
		Point p18 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 43, EcranEvaluation.UNITE_VERTICALE_GRILLE * 28);
		Point p19 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 42, EcranEvaluation.UNITE_VERTICALE_GRILLE * 30);
		Point p20 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 41, EcranEvaluation.UNITE_VERTICALE_GRILLE * 31);
		Point p21 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 42, EcranEvaluation.UNITE_VERTICALE_GRILLE * 32);
		Point p22 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 43, EcranEvaluation.UNITE_VERTICALE_GRILLE * 31);
		Point p23 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 43, EcranEvaluation.UNITE_VERTICALE_GRILLE * 33);
		Point p24 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 42, EcranEvaluation.UNITE_VERTICALE_GRILLE * 34);
		Point p25 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 44, EcranEvaluation.UNITE_VERTICALE_GRILLE * 34);
		Point p26 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 44, EcranEvaluation.UNITE_VERTICALE_GRILLE * 33);
		Point p27 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 50, EcranEvaluation.UNITE_VERTICALE_GRILLE * 33);
		Point p28 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 50, EcranEvaluation.UNITE_VERTICALE_GRILLE * 34);
		Point p29 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 52, EcranEvaluation.UNITE_VERTICALE_GRILLE * 34);
		Point p30 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 51, EcranEvaluation.UNITE_VERTICALE_GRILLE * 33);
		Point p31 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 51, EcranEvaluation.UNITE_VERTICALE_GRILLE * 31);
		Point p32 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 52, EcranEvaluation.UNITE_VERTICALE_GRILLE * 32);
		Point p33 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 53, EcranEvaluation.UNITE_VERTICALE_GRILLE * 31);
		Point p34 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 52, EcranEvaluation.UNITE_VERTICALE_GRILLE * 30);
		Point p35 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 51, EcranEvaluation.UNITE_VERTICALE_GRILLE * 28);
		//ceinture
		Point p36 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 43, EcranEvaluation.UNITE_VERTICALE_GRILLE * 32);
		Point p37 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 51, EcranEvaluation.UNITE_VERTICALE_GRILLE * 32);
		//bouche
		Point p38 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 45, EcranEvaluation.UNITE_VERTICALE_GRILLE * 28);
		Point p39 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 49, EcranEvaluation.UNITE_VERTICALE_GRILLE * 28);
		//poche
		Point p40 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 49, EcranEvaluation.UNITE_VERTICALE_GRILLE * 30.6);
		Point p41 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 49, EcranEvaluation.UNITE_VERTICALE_GRILLE * 31);
		Point p42 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 50, EcranEvaluation.UNITE_VERTICALE_GRILLE * 31);
		Point p43 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 50, EcranEvaluation.UNITE_VERTICALE_GRILLE * 30.6);
		
		//oeil G
		Point p44 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 47, EcranEvaluation.UNITE_VERTICALE_GRILLE * 24);
		Point p45 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 47, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);
		Point p46 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 46, EcranEvaluation.UNITE_VERTICALE_GRILLE * 26);
		Point p47 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 43, EcranEvaluation.UNITE_VERTICALE_GRILLE * 26);
		Point p48 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 42, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);
		Point p49 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 42, EcranEvaluation.UNITE_VERTICALE_GRILLE * 23);
		Point p50 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 43, EcranEvaluation.UNITE_VERTICALE_GRILLE * 22);
		Point p51 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 46, EcranEvaluation.UNITE_VERTICALE_GRILLE * 22);
		Point p52 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 47, EcranEvaluation.UNITE_VERTICALE_GRILLE * 23);
		Point p53 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 47, EcranEvaluation.UNITE_VERTICALE_GRILLE * 24);
		
		//oeil G
		Point p54 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 52, EcranEvaluation.UNITE_VERTICALE_GRILLE * 24);
		Point p55 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 52, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);
		Point p56 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 51, EcranEvaluation.UNITE_VERTICALE_GRILLE * 26);
		Point p57 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 48, EcranEvaluation.UNITE_VERTICALE_GRILLE * 26);
		Point p58 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 47, EcranEvaluation.UNITE_VERTICALE_GRILLE * 25);
		Point p59 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 47, EcranEvaluation.UNITE_VERTICALE_GRILLE * 23);
		Point p60 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 48, EcranEvaluation.UNITE_VERTICALE_GRILLE * 22);
		Point p61 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 51, EcranEvaluation.UNITE_VERTICALE_GRILLE * 22);
		Point p62 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 52, EcranEvaluation.UNITE_VERTICALE_GRILLE * 23);
		Point p63 = new Point(EcranEvaluation.UNITE_HORIZONTALE_GRILLE * 52, EcranEvaluation.UNITE_VERTICALE_GRILLE * 24);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1).nePasRelierLesPointsExtreme()
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
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p18).nePasRelierLesPointsExtreme()
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
		.ajouter(p30)
		.ajouter(p31)
		.ajouter(p32)
		.ajouter(p33)
		.ajouter(p34)
		.ajouter(p35).nePasRelierLesPointsExtreme();
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p36).nePasRelierLesPointsExtreme()
		.ajouter(p37).nePasRelierLesPointsExtreme();
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p38).nePasRelierLesPointsExtreme()
		.ajouter(p39).nePasRelierLesPointsExtreme();
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p40).nePasRelierLesPointsExtreme()
		.ajouter(p41)
		.ajouter(p42)
		.ajouter(p43).nePasRelierLesPointsExtreme();
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p44).nePasRelierLesPointsExtreme()
		.ajouter(p45)
		.ajouter(p46)
		.ajouter(p47)
		.ajouter(p48)
		.ajouter(p49)
		.ajouter(p50)
		.ajouter(p51)
		.ajouter(p52)
		.ajouter(p53).nePasRelierLesPointsExtreme();
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p54).nePasRelierLesPointsExtreme()
		.ajouter(p55)
		.ajouter(p56)
		.ajouter(p57)
		.ajouter(p58)
		.ajouter(p59)
		.ajouter(p60)
		.ajouter(p61)
		.ajouter(p62)
		.ajouter(p63).nePasRelierLesPointsExtreme();
	}

}
