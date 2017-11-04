package fr.esiee.pic.designer.awt.factory;

import java.awt.Component;

import fr.esiee.pic.designer.domain.shapes.Couleur;
import fr.esiee.pic.designer.domain.shapes.Ellipse;
import fr.esiee.pic.designer.domain.shapes.Point;

/**
 * 
 * Factory de production des figures à dessinner via le moteur d'exécution
 * 
 * @author etudiant
 *
 */
public interface ShapesFactory {
	
	/**
	 * Construit une ellipse AWT 2D
	 * 
	 * @param ellipse
	 * @return
	 */
	Component produceEllipse(Ellipse ellipse);
	
	/**
	 * Construit une ellipse AWT 2D
	 * 
	 * @param ellipse
	 * @return
	 */
	Component produceEllipse(Ellipse ellipse, Couleur couleur);
	
	/**
	 * Construit une figure géométrique à partir de points
	 * 
	 * @param points
	 * @return
	 */
	Component produceShapeFromPoints(Point[] points);
	
	/**
	 * Construit une figure géométrique à partir de points
	 * 
	 * @param points
	 * @return
	 */
	Component produceShapeFromPoints(Point[] points, Couleur couleur);
	
	/**
	 * Construit une figure géométrique à partir de points.
	 * closePath précise si le dernier et le premier point doivent être reliés
	 * 
	 * @param points
	 * @param closePath
	 * 
	 * @return
	 */
	Component produceShapeFromPoints(Point[] points, Couleur couleur, boolean closePath);
	
	/**
	 * Construit une figure géométrique à partir de points.
	 * On fournit également des informations sur le style de traits (couleur, épaisseur...)
	 * 
	 * @param points
	 * @return
	 */
	Component produceShapeFromPoints(Point[] points, Couleur couleur, Couleur couleurTrait, boolean traitFin);
	
	/**
	 * Construit une figure géométrique à partir de points.
	 * On fournit également des informations sur le style de traits (couleur, épaisseur...)
	 * closePath précise si le dernier et le premier point doivent être reliés
	 * 
	 * @param points
	 * @param closePath
	 * 
	 * @return
	 */
	Component produceShapeFromPoints(Point[] points, Couleur couleur, Couleur couleurTrait, boolean traitFin, boolean closePath);
}
