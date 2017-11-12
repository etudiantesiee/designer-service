package fr.esiee.pic.designer.ui.tools;

import java.awt.Component;
import java.awt.Dimension;
import java.util.List;

import fr.esiee.pic.designer.awt.engine.ExecutionEngine;
import fr.esiee.pic.designer.awt.factory.ShapesFactory;
import fr.esiee.pic.designer.awt.factory.impl.ShapesFactoryImpl;
import fr.esiee.pic.designer.domain.shapes.CheminDePoints;
import fr.esiee.pic.designer.domain.shapes.Couleur;
import fr.esiee.pic.designer.domain.shapes.ElementGraphique;
import fr.esiee.pic.designer.domain.shapes.Ellipse;
import fr.esiee.pic.designer.domain.shapes.Point;
import fr.esiee.pic.designer.domain.tools.CreateurDeForme;

/**
 * Effectue l'aggregation des composants à afficher
 * Appel la couche graphique
 * 
 * Implémente le pattern Visitor
 * 
 * @author etudiant
 *
 */
public final class AfficheurDeFormes {
	
	/**
	 * Factory de creation des formes graphiques
	 */
	private ShapesFactory shapesFactory;
	
	/**
	 * Moteur d'exécution
	 */
	private ExecutionEngine engine;
	
	/**
	 * Longueur de l'affichage 
	 */
	private final double longueurAffichage;
	
	/**
	 * Largeur de l'affichage
	 */
	private final double largeurAffichage;
	
	/**
	 * Construteur par défaut caché
	 */
	public AfficheurDeFormes() {
		super();
		shapesFactory = ShapesFactoryImpl.getInstance();
		engine = new ExecutionEngine();
		engine.afficher();
		
		// Dimension de l'écran
		Dimension dimEcran = engine.getSize();
		this.longueurAffichage = dimEcran.getWidth();
		this.largeurAffichage = dimEcran.getHeight();
	}
	
	/**
	 * Gère l'affichage passer en paramètre
	 * 
	 * @param forme
	 */
	public void afficher(CreateurDeForme createurDeForme) {
		// Dessin des éléments de la forme
	    createurDeForme.dessiner();
		
		ElementGraphique forme = createurDeForme.getElementGraphique();
		
		// Recupération de la liste des ellipses
		List<Ellipse> ellipses = forme.getEllipses();
		
		// Récupération de la liste des formes de points
		List<CheminDePoints> cheminsDePoints = forme.getFormesAvecPoints();
		
		// Affichage des ellipses
		for (Ellipse currentEllipse : ellipses) {
			Couleur currentCouleur = currentEllipse.getCouleur();
			
			// Appel de la factory
			Component ellipseComp = shapesFactory.produceEllipse(currentEllipse, currentCouleur);
			engine.ajouterFigure(ellipseComp);
		}
		
		// Affichage des chemins de points
		for (CheminDePoints c : cheminsDePoints) {
			Point[] points = c.toArray();
			Couleur couleur = c.getCouleur();
			Couleur couleurDesTraits = c.getCouleurTraitsLaison();
			boolean traitFin = c.getTraitDeLaisonFin();
			boolean relierLesPointsExtreme = c.getRelierLesPointsExtremes();
			
			// Appel de la factory
			Component shapeComp = shapesFactory.produceShapeFromPoints(points, couleur, couleurDesTraits, traitFin, relierLesPointsExtreme);
			engine.ajouterFigure(shapeComp);
		}
	}

	/**
	 * Retourne la longueur de l'écran d'affichage
	 * 
	 * @return
	 */
	public double getLongueurAffichage() {
		return longueurAffichage;
	}

	/**
	 * Retourne la largeur de l'écran d'affichage
	 * 
	 * @return
	 */
	public double getLargeurAffichage() {
		return largeurAffichage;
	}
}
