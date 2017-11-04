package fr.esiee.pic.designer.design.shared;

import fr.esiee.pic.designer.domain.shapes.Couleur;
import fr.esiee.pic.designer.domain.shapes.Point;
import fr.esiee.pic.designer.domain.tools.CreateurDeForme;

/**
 * Grille pour faciliter les calculs
 * 
 * La grille est vu comme un repère avec - une origine :
 * POINT_BORDURE_HAUT_DROIT - Une unité de longueur : uniteLongueur - Une unité
 * de largeur : uniteLargeur
 * 
 * On pose que la longueur correspond au côté horizontal (l'axe des abscisse)
 * 
 * @author etudiant
 * 
 */
public class Grille extends CreateurDeForme {

	/**
	 * Point situé en haut à gauche de la brodure supérieure
	 */
	private static final Point POINT_BORDURE_HAUT_DROIT = new Point(0, 0);

	/**
	 * Longeur de l'écran dans lequel sera afficher le cadre
	 */
	private final double longueurEcran;

	/**
	 * Largeur de l'écran dans lequel sera afficher le cadre
	 */
	private final double largeurEcran;

	/**
	 * Longueur de chaque portion formant la grille
	 */
	private final double uniteLongueur;

	/**
	 * Largeur de chaque portion formant la grille
	 */
	private final double uniteLargeur;

	/**
	 * Constructeur
	 * 
	 * @param longueurEcran
	 * @param largeurEcran
	 * @param uniteLongueur
	 * @param uniteLargeur
	 */
	public Grille(double longueurEcran, double largeurEcran,
			double uniteLongueur, double uniteLargeur) {
		this.uniteLongueur = uniteLongueur;
		this.uniteLargeur = uniteLargeur;
		this.longueurEcran = longueurEcran;
		this.largeurEcran = largeurEcran;
	}

	@Override
	public void dessiner() {
		// Dessin des barres verticales de la grille
		dessinerBarresVerticales();
		
		// Dessin des barres horizontales de la grille
		dessinerBarresHorizontales();
	}

	/**
	 * Dessin des barres verticales de la grille
	 */
	private void dessinerBarresVerticales() {
		// Ajout des points sur l'axe des abscisses

		Point pointCourant = POINT_BORDURE_HAUT_DROIT;
		double xPointCourant = pointCourant.getX();
		double yPointCourant = pointCourant.getY();

		// Itération sur la longueur de l'écran
		while (xPointCourant <= longueurEcran) {
			double xSymetriquePointCourant = xPointCourant;
			double ySymetriquePointCourant = yPointCourant + largeurEcran;

			Point symetriquePointCourant = new Point(xSymetriquePointCourant,
					ySymetriquePointCourant);
			
			// Ajout des points
			demarrerNouveauDessinAvecDesPoints()
			.ajouter(pointCourant)
			.ajouter(symetriquePointCourant)
			.couleurDeFond(Couleur.GRIS)
			.couleurDesTrait(Couleur.GRIS)
			.produireTraitDeLiaisonDePetiteTaille();

			// Seule l'abscisse varie
			xPointCourant = xPointCourant + this.uniteLongueur;

			pointCourant = new Point(xPointCourant, yPointCourant);
		}
	}
	
	/**
	 * Dessin des barres horizontales de la grille
	 */
	private void dessinerBarresHorizontales() {
		// Ajout des points sur l'axe des abscisses

		Point pointCourant = POINT_BORDURE_HAUT_DROIT;
		double xPointCourant = pointCourant.getX();
		double yPointCourant = pointCourant.getY();

		// Itération sur la largeur de l'écran
		while (yPointCourant <= largeurEcran) {
			double xSymetriquePointCourant = xPointCourant + longueurEcran;
			double ySymetriquePointCourant = yPointCourant;

			Point symetriquePointCourant = new Point(xSymetriquePointCourant,
					ySymetriquePointCourant);
			demarrerNouveauDessinAvecDesPoints()
			.ajouter(pointCourant)
			.ajouter(symetriquePointCourant)
			.couleurDeFond(Couleur.GRIS)
			.couleurDesTrait(Couleur.GRIS)
			.produireTraitDeLiaisonDePetiteTaille();

			// Seule l'ordonnée varie
			yPointCourant = yPointCourant + this.uniteLargeur;

			pointCourant = new Point(xPointCourant, yPointCourant);
		}
	}
}
