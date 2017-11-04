package fr.esiee.pic.designer.domain.tools;

import fr.esiee.pic.designer.domain.shapes.CheminDePoints;
import fr.esiee.pic.designer.domain.shapes.ElementGraphique;
import fr.esiee.pic.designer.domain.shapes.Ellipse;

/**
 * Classe utilitaire principale pour la création des formes
 * 
 * @author etudiant
 *
 */
public abstract class CreateurDeForme {

    /**
     * Encapsule tous les élements du grahique
     */
    private final ElementGraphique elementGraphique;
    
    /**
     * Default hidden constructeur 
     */
    private CreateurDeForme() {
        this("");
    }
	
	/**
	 * Constructeur par defaut
	 */
	public CreateurDeForme(String nom) {
		super();
		elementGraphique = new ElementGraphique(nom);
	}
	
	/**
	 * Initialise une nouvelle phase de création d'un dessin à partir de points.
	 * 
	 * @return
	 */
	protected CheminDePoints demarrerNouveauDessinAvecDesPoints() {
		CheminDePoints nouveauChemin = new CheminDePoints();
		this.elementGraphique.ajoutNouveauChemin(nouveauChemin);
		
		return nouveauChemin;
	}
	
	/**
	 * Ajoute une nouvelle ellipse à la figure en cours de construction.
	 * 
	 * @param ellipse
	 * @return
	 */
	protected CreateurDeForme ajouterEllipse(Ellipse ellipse) {
		this.elementGraphique.ajoutEllipse(ellipse);
		return this;
	}
	
	/**
	 * Méthode à implémenter pour créer un dessiner.
	 */
	public abstract void dessiner();

    /**
     * @return the elementGraphique
     */
    public ElementGraphique getElementGraphique() {
        return elementGraphique;
    }
}
