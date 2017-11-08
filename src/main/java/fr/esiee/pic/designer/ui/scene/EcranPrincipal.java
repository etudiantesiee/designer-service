package fr.esiee.pic.designer.ui.scene;

import java.util.ArrayList;
import java.util.List;

import fr.esiee.pic.designer.domain.tools.CreateurDeForme;
import fr.esiee.pic.designer.design.exemple.MaisonAvecCercleEtEllipse;
import fr.esiee.pic.designer.design.exemple.PersonnageManga;
import fr.esiee.pic.designer.design.shared.Grille;
import fr.esiee.pic.designer.design.tp2.DessinsGroupe1;
import fr.esiee.pic.designer.design.tp2.DessinsGroupe2;
import fr.esiee.pic.designer.design.tp2.DessinsGroupe3;
import fr.esiee.pic.designer.ui.tools.AfficheurDeFormes;

/**
 * Interface graphique principale du programme
 * Affiche les élements crées précédemment
 * 
 * @author etudiant
 *
 */
public final class EcranPrincipal {
	
	/**
	 * Unite sur l'axe des abscissed
	 */
	public static final int UNITE_HORIZONTALE_GRILLE = 25;
	
	/**
	 * Unité sur l'axe des ordonnées
	 */
	public static final int UNITE_VERTIACLE_GRILLE = 25;
	
	/**
	 * Liste des dessin à afficher sur l'écran
	 */
	private final List<CreateurDeForme> listDeDessins;
	
	/**
	 *  Utilitaire d'affichage de formes
	 */
	private final AfficheurDeFormes afficheur;
	
	/**
	 * Construteur par défaut masqué
	 */
	private EcranPrincipal(AfficheurDeFormes afficheur, boolean afficherGrille) {
		super();
		listDeDessins = new ArrayList<>();
		this.afficheur = afficheur;
		
		// Initialisation des formes à dessiner
		init();
		
		// Initialisation des formes à afficher
		if (afficherGrille) {
			afficherGrille();
		}
		
	}
	
	/**
	 * Ajoute la grille aux éléments à afficher
	 */
	private void afficherGrille() {
		// Affichage de la grille
		double longueurEcran = this.afficheur.getLongueurAffichage();
		double largeurEcran = this.afficheur.getLargeurAffichage();
		Grille grille = new Grille("Grille", longueurEcran, largeurEcran, UNITE_HORIZONTALE_GRILLE, UNITE_VERTIACLE_GRILLE);
		listDeDessins.add(grille);
	}
	
	/**
	 * Initialisation des formes à dessiner
	 */
	private void init() {
		 initDemo();
		
		// Affichage des dessins du groupe 1
		DessinsGroupe1 grp1 = new DessinsGroupe1("Groupe 1");
		listDeDessins.add(grp1);
		
		// Affichage des dessins du groupe 2
		DessinsGroupe2 grp2 = new DessinsGroupe2("Groupe 2");
		listDeDessins.add(grp2);
		
		// Affichage des dessins du groupe 2
		DessinsGroupe3 grp3 = new DessinsGroupe3("Groupe 3");
		listDeDessins.add(grp3);
	}

	/**
	 * 
	 */
	public void initDemo() {
		// Affichage de la démo : maison, soleil, lune...
		MaisonAvecCercleEtEllipse demoMaison = new MaisonAvecCercleEtEllipse("Une maison avec une ellipse");
		listDeDessins.add(demoMaison);
		
		// Affichage de la démo : personnage manga
		PersonnageManga demoManga = new PersonnageManga("Un personnage manga");
		listDeDessins.add(demoManga);
	}
	
	/**
	 * Affichage des dessins
	 */
	public void afficherDessin() {
		
		// Itération sur la liste des dessins
		for (CreateurDeForme dessin : this.listDeDessins) {
			afficheur.afficher(dessin);
		}
	}

	/**
	 * Méthod Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Afficheur
		AfficheurDeFormes afficheur = AfficheurDeFormes.getInstance();
		
		// Affichage de la grille ?
		boolean afficherGrille = true;
		
		EcranPrincipal e = new EcranPrincipal(afficheur, afficherGrille);
		e.afficherDessin();
	}

}
