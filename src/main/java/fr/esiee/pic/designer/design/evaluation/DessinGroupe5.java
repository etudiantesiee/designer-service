package fr.esiee.pic.designer.design.evaluation;

import fr.esiee.pic.designer.domain.shapes.Couleur;
import fr.esiee.pic.designer.domain.shapes.Ellipse;
import fr.esiee.pic.designer.domain.shapes.Point;
import fr.esiee.pic.designer.domain.tools.CreateurDeForme;
import fr.esiee.pic.designer.ui.scene.evaluation.EcranEvaluation;

public class DessinGroupe5 extends CreateurDeForme {
	
	/**
	 * Constructeur avec nom
	 * 
	 * @param nom
	 */
	public DessinGroupe5(String nom) {
		super(nom);
	}
	
	/**
	 * Tous les dessins seront réalisés dans cette méthode.
	 * 
	 */
	@Override
	public void dessiner() {
		
		int dh = 20;
		int dv = 20;
		
		//Cheveux du bonhomme
		Point p1 = new Point((dh+3)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+2)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p2 = new Point((dh+1)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+4)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p3 = new Point((dh+1)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+9)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p4 = new Point((dh+4)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+9)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p5 = new Point((dh+3)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+6)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p6 = new Point((dh+5)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+4)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p7 = new Point((dh+9)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+4)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p8 = new Point((dh+11)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+6)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p9 = new Point((dh+10)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+9)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p10 = new Point((dh+13)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+9)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p11 = new Point((dh+13)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+4)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p12 = new Point((dh+11)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+2)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		
		//Lunettes
		Point p13 = new Point((dh+4)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+5)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p14 = new Point((dh+10)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+5)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p15 = new Point((dh+3.75)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+8)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p16 = new Point((dh+6)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+8)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p17 = new Point((dh+7)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+7)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p18 = new Point((dh+8)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+8)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p19 = new Point((dh+10.25)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+8)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		
		//Yeux
		Point centre_oeild_gauche = new Point((dh+6)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+7)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Ellipse y1 = new Ellipse("oeilg", centre_oeild_gauche, 5, 5, Couleur.NOIR);
		
		Point centre_oeild_droit = new Point((dh+8)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+7)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Ellipse y2 = new Ellipse("oeild", centre_oeild_droit, 5, 5, Couleur.NOIR);
		
		//Nez
		Point p20 = new Point((dh+6.75)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+7.75)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p21 = new Point((dh+7)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+8)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p22 = new Point((dh+7.25)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+7.75)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		
		
//Menton
		Point p23 = new Point((dh+2)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+9)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p24 = new Point((dh+4)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+12)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p25 = new Point((dh+6)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+14)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p26 = new Point((dh+8)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+14)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p27 = new Point((dh+10)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+12)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p28 = new Point((dh+12)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+9)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		
		//Bouche
		Point p29 = new Point((dh+6)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+10)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p30 = new Point((dh+8)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+10)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		Point p31 = new Point((dh+9)*EcranEvaluation.UNITE_HORIZONTALE_GRILLE, (dv+9)*EcranEvaluation.UNITE_VERTICALE_GRILLE);
		
		
		demarrerNouveauDessinAvecDesPoints("Cheveux du bonhomme")
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
		.couleurDeFond(Couleur.GRIS);
		
		demarrerNouveauDessinAvecDesPoints("Lunettes de ski haut")
		.ajouter(p13)
		.ajouter(p14)
		.nePasRelierLesPointsExtreme();
		
		demarrerNouveauDessinAvecDesPoints("Lunettes de ski bas")
		.ajouter(p15)
		.ajouter(p16)
		.ajouter(p17)
		.ajouter(p18)
		.ajouter(p19)
		.nePasRelierLesPointsExtreme();
		
		//ajout des yeux
		ajouterEllipse(y1);
		ajouterEllipse(y2);
		
		demarrerNouveauDessinAvecDesPoints("Nez")
		.ajouter(p20)
		.ajouter(p21)
		.ajouter(p22)
		.nePasRelierLesPointsExtreme();
		
		demarrerNouveauDessinAvecDesPoints("Menton")
		.ajouter(p23)
		.ajouter(p24)
		.ajouter(p25)
		.ajouter(p26)
		.ajouter(p27)
		.ajouter(p28)
		.nePasRelierLesPointsExtreme();
		
		demarrerNouveauDessinAvecDesPoints("Bouche")
		.ajouter(p29)
		.ajouter(p30)
		.ajouter(p31);
	}

}