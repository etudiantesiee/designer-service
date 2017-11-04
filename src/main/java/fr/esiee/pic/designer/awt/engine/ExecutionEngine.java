package fr.esiee.pic.designer.awt.engine;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Contient le moteur d'exécution unique de toute l'application.
 * 
 * Ce moteur d'exécution étant unique, toutes les figures s'afficheront dans une
 * seule et unique fenêtre.
 * 
 * @author etudiant
 * 
 */
public final class ExecutionEngine {

	/**
	 * Serial version UID
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 2759668095433251868L;

	/**
	 * Unique instance du moteur d'exécution
	 */
	private static ExecutionEngine instance;

	/**
	 * Frame à afficher
	 */
	private MainFrameComponent engineFrame;

	/**
	 * Constructeur privé du singleton
	 */
	private ExecutionEngine() {
		super();
		engineFrame = new MainFrameComponent();
		initUI();
	}

	/**
	 * Retourne l'unique instance du moteur d'exécution
	 * 
	 * @return
	 */
	public static ExecutionEngine getInstance() {
		if (instance == null) {
			instance = new ExecutionEngine();
		}

		return instance;
	}

	/**
	 * Ajout d'une figure au moteur d'exécution
	 * 
	 * @param figure
	 */
	public void ajouterFigure(Component figure) {
		engineFrame.add(figure);
	}

	/**
	 * Supprime une figure au moteur d'exécution
	 * 
	 * @param figure
	 */
	public void supprimerFigure(JPanel figure) {
		engineFrame.remove(figure);
	}

	/**
	 * Initialisation du moteur d'exécution
	 */
	private void initUI() {
		
		// Titre de la fenetre
		engineFrame.setTitle("Esiee Designer Engine");
		
		// Taille de la fenetre
		engineFrame.setSize(this.getSize());
		
		// Positionnement de l'écran au centre
		engineFrame.setLocationRelativeTo(null);
		
		// Méthode de fermeture
		engineFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * Dimension de l'écran
	 * 
	 * @return
	 */
	public Dimension getSize() {
		// Fenetre plein écran
		return Toolkit.getDefaultToolkit().getScreenSize();
	}

	/**
	 * Rend le moteur d'exécution visible
	 * 
	 * @param avecGrille
	 */
	public void afficher() {
		engineFrame.setVisible(true);
	}

	/**
	 * Masque l'affichage du moteur d'exécution
	 */
	public void masquer() {
		engineFrame.setVisible(false);
	}
}
