package fr.esiee.pic.designer.awt.engine;

import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

/**
 * Fenetre contenant les composants à afficher
 * 
 * @author etudiant
 *
 */
public class MainFrameComponent extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2359696097105731809L;
	
	/**
	 * All component to print
	 */
	private final List<Component> components;
	
	/**
	 * Default constructor
	 * 
	 */
	public MainFrameComponent() {
		super();
		this.components = new ArrayList<>();
	}

	@Override
	public void paint(Graphics g) {
		// Dessin
		super.paintComponents(g);
	}
	
	@Override
	public Component add(Component c) {
		super.add(c);
		
		// Définition de la taille de l'écran 
		// nécessaire pour le dessin de la grille par exemple
		c.setSize(getSize());
		
		// Ajout du composant pour un usage ultérieure
		this.components.add(c);
		return c;
	}

}
