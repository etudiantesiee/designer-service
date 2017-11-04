package fr.esiee.pic.designer.awt.shapes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import fr.esiee.pic.designer.awt.shared.Constants;

/**
 * Figure géométrique Ellipse avec JAVA 2D
 * 
 * @author etudiant
 *
 */
public final class EllipseAWT extends Component {

	/**
	 * Serial version ID
	 */
	private static final long serialVersionUID = 7763441664778118431L;
	
	/**
	 * Abscisse de l'ellipse
	 */
	private final float x;
	
	/**
	 * Ordonnée de l'ellipse
	 */
	private final float y;
	
	/**
	 * Largeur de l'ellipse
	 */
	private final float w;
	
	/**
	 * Hauteur de l'ellipse
	 */
	private final float h;
	
	/**
	 * Couleur de l'ellipse
	 */
	private final Color color;
	
	/**
	 * (x, y) : définit les coordonnées du centre de l'éllipse
	 * 
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 * @param color
	 */
	public EllipseAWT(float x, float y, float w, float h, Color color) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.color = color;
	}
	
	/**
	 * Paint method
	 */
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		// Adaptation des coordonnées
		// Dans une ellipse AWT x et y correspondent 
		// aux coordonnées du point supérieur gauche d'un rectangle (ou carré) 
		// dans lequel l'éllipse est contenue 
		double newX = this.x - this.w/2;
		double newY = this.y - this.h/2;
		
		// Construction de l'ellipse
		Ellipse2D ellipse = new Ellipse2D.Double(newX, newY, this.w, this.h);

		if (this.color != null) {
			// Couleur définit
			g2d.setPaint(this.color);
			g2d.fill(ellipse);
		}
		
		// Modif paint
		g2d.setPaint(Constants.LINE_DEFAULT_COLOR);
		g2d.draw(ellipse);
	}
}
