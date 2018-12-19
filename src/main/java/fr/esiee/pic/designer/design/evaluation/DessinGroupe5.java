package fr.esiee.pic.designer.design.evaluation;

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
		.ajouter(p12);
	}

}