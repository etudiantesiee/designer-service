package fr.esiee.pic.designer.design.exemple;

import fr.esiee.pic.designer.domain.shapes.Couleur;
import fr.esiee.pic.designer.domain.shapes.Ellipse;
import fr.esiee.pic.designer.domain.shapes.Point;
import fr.esiee.pic.designer.domain.tools.CreateurDeForme;
import fr.esiee.pic.designer.ui.scene.EcranPrincipal;

/**
 * Demo de création d'un personnage de manga
 * 
 * @author etudiant
 *
 */
public class PersonnageManga extends CreateurDeForme {

	public PersonnageManga(String nom) {
        super(nom);
    }

    /**
	 * Pas de dessin horizontale
	 */
	private static final double UNITE_HORIZONTALE = EcranPrincipal.UNITE_HORIZONTALE_GRILLE;
	
	/**
	 * Pas de dessin verticale
	 */
	private static final double UNITE_VERTICALE = EcranPrincipal.UNITE_VERTICALE_GRILLE;
	
	/**
	 * Point exterieure du pied gauche du manga
	 */
	private static final Point PIED_GAUCHE_EXTERIEURE_MANGA = new Point(35 * UNITE_HORIZONTALE, 23 * UNITE_VERTICALE);
	
	/**
	 * Longueure du trait unissantles deux pieds du manga
	 */
	private static final double LONGUEUR_BAS_PIED_MANGA = UNITE_HORIZONTALE * 10;
	
	/**
	 * Longueur des doigts du manga
	 */
	private static final double LARGEUR_DOIGT = 10;
	
	/**
	 * Nombre de doigts, permet de calculer le nombre de traits séparant les doigts
	 */
	private static final double NOMBRE_DE_DOIGT = 4;
	
	/**
	 * Longueur des yeux
	 */
	private static final double LONGUEUR_DES_YEUX = 15;
	
	/**
	 * Largeur des yeux
	 */
	private static final double LARGEUR_DES_YEUX = 20;
	
	/**
	 * Longueur du nez
	 */
	private static final double LONGUEUR_NEZ = UNITE_HORIZONTALE * (0.3);
	
	/**
	 * Longueur du nez
	 */
	private static final double LARGEUR_NEZ = UNITE_VERTICALE * (0.3);
	
	/**
	 * Longueur de la bouche
	 */
	private static final double LONGUEUR_BOUCHE = UNITE_HORIZONTALE * 2;
	
	/**
	 * Longueur du trait du menton
	 */
	private static final double LONGUEUR_TRAIT_MENTON = 12;
	
	@Override
	public void dessiner() {
		dessinerManga();
	}
	
	/**
	 * Exemple de dessin d'un personnage de manga
	 */
	public void dessinerManga() {
		
		// Dessin des pieds du manga
		Point piedBasGaucheManga = PIED_GAUCHE_EXTERIEURE_MANGA;
		Point piedBasDroitManga = new Point(PIED_GAUCHE_EXTERIEURE_MANGA.getX() + LONGUEUR_BAS_PIED_MANGA, PIED_GAUCHE_EXTERIEURE_MANGA.getY());
		Point piedHautDroit1 = new Point(piedBasDroitManga.getX() - UNITE_HORIZONTALE, piedBasDroitManga.getY() - UNITE_VERTICALE);
		Point piedHautDroit2 = new Point(piedHautDroit1.getX() - UNITE_HORIZONTALE, piedHautDroit1.getY());
		Point corpsBasDroit = new Point(piedHautDroit2.getX() + UNITE_HORIZONTALE, piedHautDroit2.getY() - 2 * UNITE_VERTICALE);
		Point corpsBasGauche = new Point(piedBasGaucheManga.getX() + UNITE_HORIZONTALE, piedBasGaucheManga.getY() - 3 * UNITE_VERTICALE);
		Point piedHautGauche1 = new Point(corpsBasGauche.getX() + UNITE_HORIZONTALE, corpsBasGauche.getY() + 2 * UNITE_VERTICALE);
		Point piedHautGauche2 = new Point(piedHautGauche1.getX() - UNITE_HORIZONTALE, piedHautGauche1.getY()); 
		
		demarrerNouveauDessinAvecDesPoints("Pied")
		.ajouter(piedBasGaucheManga)
		.ajouter(piedBasDroitManga)
		.ajouter(piedHautDroit1)
		.ajouter(piedHautDroit2)
		.ajouter(corpsBasDroit)
		.ajouter(corpsBasGauche)
		.ajouter(piedHautGauche1)
		.ajouter(piedHautGauche2);
		
		// Dessin de la limite des pieds
		Point limitePiedBas = new Point(piedBasDroitManga.getX() - LONGUEUR_BAS_PIED_MANGA/2, piedBasDroitManga.getY());
		Point limitePiedHaut = new Point(limitePiedBas.getX(), limitePiedBas.getY() - 2 * UNITE_VERTICALE);
		
		demarrerNouveauDessinAvecDesPoints("Limite pieds")
		.ajouter(limitePiedBas)
		.ajouter(limitePiedHaut);
		
		// Suite du dessin
		dessinerDuCorpsEtDeLaTete(corpsBasDroit,
				corpsBasGauche);
	}

	/**
	 * @param piedBasDroitManga
	 * @param corpsBasDroit
	 * @param corpsBasGauche
	 */
	private void dessinerDuCorpsEtDeLaTete(Point corpsBasDroit, Point corpsBasGauche) {
		
		// Défintion des points du coté droit du corps du manga
		Point corpsCoteHautDroit = new Point(corpsBasDroit.getX(), corpsBasDroit.getY() - UNITE_VERTICALE);
		Point brasDroit1 = new Point(corpsCoteHautDroit.getX() + UNITE_HORIZONTALE, corpsCoteHautDroit.getY() + UNITE_VERTICALE);
		Point brasDroit2 = new Point(brasDroit1.getX(), brasDroit1.getY() + UNITE_VERTICALE);
		Point brasDroit3 = new Point(brasDroit2.getX() + UNITE_VERTICALE, brasDroit2.getY());
		Point brasDroit4 = new Point(brasDroit3.getX(), brasDroit3.getY() - 2 * UNITE_VERTICALE);
		Point epauleDroit1 = new Point(brasDroit4.getX() -2 * UNITE_VERTICALE, brasDroit4.getY() - UNITE_HORIZONTALE * 2);
		Point epauleDroit2 = new Point(epauleDroit1.getX() - UNITE_VERTICALE, epauleDroit1.getY());
		
		// Défintion des points du coté gauche du corps du manga
		Point corpsCoteHautGauche = new Point(corpsBasGauche.getX(), corpsBasGauche.getY() - UNITE_VERTICALE);
		Point brasGauche1 = new Point(corpsCoteHautGauche.getX() - UNITE_HORIZONTALE, corpsCoteHautGauche.getY() + UNITE_VERTICALE);
		Point brasGauche2 = new Point(brasGauche1.getX(), brasGauche1.getY() + UNITE_VERTICALE);
		Point brasGauche3 = new Point(brasGauche2.getX() - UNITE_HORIZONTALE, brasGauche2.getY());
		Point brasGauche4 = new Point(brasGauche3.getX(), brasGauche3.getY() - 2 * UNITE_VERTICALE);
		Point epauleGauche1 = new Point(brasGauche4.getX() + 2 * UNITE_HORIZONTALE, brasGauche4.getY() - UNITE_HORIZONTALE * 2);
		Point epauleGauche2 = new Point(epauleGauche1.getX() + UNITE_HORIZONTALE, epauleGauche1.getY());
		
		// Définition des points du menton
		Point mentonDroit = new Point(epauleDroit2.getX() - 2 * UNITE_HORIZONTALE, epauleDroit2.getY() + 2 * UNITE_VERTICALE);
		Point mentonGauche = new Point(mentonDroit.getX() - 2 * UNITE_HORIZONTALE, mentonDroit.getY());
		
		// Liaison des points formant le menton et le corps du manga
		demarrerNouveauDessinAvecDesPoints("Laison menton et corps")
		.ajouter(corpsBasDroit)
		.ajouter(corpsCoteHautDroit)
		.ajouter(brasDroit1)
		.ajouter(brasDroit2)
		.ajouter(brasDroit3)
		.ajouter(brasDroit4)
		.ajouter(epauleDroit1)
		.ajouter(epauleDroit2)
		.ajouter(mentonDroit)
		.ajouter(mentonGauche)
		.ajouter(epauleGauche2)
		.ajouter(epauleGauche1)
		.ajouter(brasGauche4)
		.ajouter(brasGauche3)
		.ajouter(brasGauche2)
		.ajouter(brasGauche1)
		.ajouter(corpsCoteHautGauche)
		.ajouter(corpsBasGauche)
		.couleurDeFond(Couleur.GRIS);
		
		// Suite du dessin
		dessinDesMainsEtDesDoigts(brasDroit2, brasDroit3, epauleDroit2, brasGauche2,
				brasGauche3, epauleGauche2);
	}

	/**
	 * @param brasDroit2
	 * @param brasDroit3
	 * @param epauleDroit2
	 * @param brasGauche2
	 * @param brasGauche3
	 * @param epauleGauche2
	 */
	private void dessinDesMainsEtDesDoigts(Point brasDroit2, Point brasDroit3,
			Point epauleDroit2, Point brasGauche2, Point brasGauche3,
			Point epauleGauche2) {
		// Dessin des mains côté droit :
		Point mainDroite1 = new Point(brasDroit2.getX(), brasDroit2.getY() + UNITE_VERTICALE);
		Point mainDroite2 = new Point(mainDroite1.getX() + UNITE_HORIZONTALE, mainDroite1.getY());
		
		demarrerNouveauDessinAvecDesPoints("Main droite")
		.ajouter(brasDroit2)
		.ajouter(mainDroite1)
		.ajouter(mainDroite2)
		.ajouter(brasDroit3)
		.nePasRelierLesPointsExtreme();
		
		// Dessin des mains côté gauche :
		Point mainGauche1 = new Point(brasGauche3.getX(), brasGauche3.getY() + UNITE_VERTICALE);
		Point mainGauche2 = new Point(mainGauche1.getX() + UNITE_HORIZONTALE, mainGauche1.getY());
		
		demarrerNouveauDessinAvecDesPoints("Main gauche")
		.ajouter(brasGauche3)
		.ajouter(mainGauche1)
		.ajouter(mainGauche2)
		.ajouter(brasGauche2)
		.nePasRelierLesPointsExtreme();
		
		// Dessin des doigts : On fait une estimation de l'espace entre les doigts
		double longueurDoigt = (brasDroit3.getX() - brasDroit2.getX()) / NOMBRE_DE_DOIGT;
		for (int i = 0; i < NOMBRE_DE_DOIGT; i++) {
			// côté droit
			Point separateurDoigtDroitBas = new Point(mainDroite1.getX() + (longueurDoigt * i), mainDroite1.getY());
			Point separateurDoigtDRoitHaut = new Point(separateurDoigtDroitBas.getX(), separateurDoigtDroitBas.getY() - LARGEUR_DOIGT);
			
			// Dessin du doigt courant droit
			demarrerNouveauDessinAvecDesPoints("Doigt droit " + (i+1))
			.ajouter(separateurDoigtDroitBas)
			.ajouter(separateurDoigtDRoitHaut);
			
			// côté gauche
			Point separateurDoigtGaucheBas = new Point(mainGauche1.getX() + (longueurDoigt * i), mainGauche1.getY());
			Point separateurDoigtGaucheHaut = new Point(separateurDoigtGaucheBas.getX(), separateurDoigtGaucheBas.getY() - LARGEUR_DOIGT);
			
			// Dessin du doigt courant gauche
			demarrerNouveauDessinAvecDesPoints("Doigt gauche " + (i+1))
			.ajouter(separateurDoigtGaucheBas)
			.ajouter(separateurDoigtGaucheHaut);
		}
		
		// Suite du dessin
		dessinDeLaTete(epauleDroit2, epauleGauche2);
	}

	/**
	 * @param epauleDroit2
	 * @param epauleGauche2
	 */
	private void dessinDeLaTete(Point epauleDroit2, Point epauleGauche2) {
		// Dessin côtés tête
		Point coteTeteDroit = new Point(epauleDroit2.getX() + UNITE_HORIZONTALE, epauleDroit2.getY() - 2 * UNITE_VERTICALE);
		Point coteTeteGauche = new Point(epauleGauche2.getX() - UNITE_HORIZONTALE, epauleGauche2.getY() - 2 * UNITE_VERTICALE);
		
		demarrerNouveauDessinAvecDesPoints("Liaison epaule tête droit")
		.ajouter(epauleDroit2)
		.ajouter(coteTeteDroit);
		
		
		demarrerNouveauDessinAvecDesPoints("Liaison epaule tête gauche")
		.ajouter(epauleGauche2)
		.ajouter(coteTeteGauche);
		
		// Dessin chevelure
		Point chev1 = new Point(coteTeteDroit.getX() - UNITE_HORIZONTALE, coteTeteDroit.getY() - 2* UNITE_VERTICALE);
		Point chev2 = new Point(chev1.getX() - UNITE_HORIZONTALE, chev1.getY());
		Point chev3 = new Point(chev2.getX() - UNITE_HORIZONTALE, chev2.getY() - UNITE_VERTICALE);
		Point chev4 = new Point(chev3.getX() - UNITE_HORIZONTALE, chev3.getY() + UNITE_VERTICALE);
		Point chev5 = new Point(chev4.getX() - UNITE_HORIZONTALE, chev4.getY() - UNITE_VERTICALE);
		Point chev6 = new Point(chev5.getX() - UNITE_HORIZONTALE, chev5.getY() + UNITE_VERTICALE);
		Point chev7 = new Point(chev6.getX() - UNITE_HORIZONTALE, chev6.getY());
		Point chev8 = new Point(coteTeteGauche.getX(), coteTeteGauche.getY() - 3 * UNITE_VERTICALE);
		Point chev9 = new Point(chev8.getX() + 2 * UNITE_HORIZONTALE, chev8.getY() - 2 * UNITE_VERTICALE);
		Point chev10 = new Point(chev9.getX() + 4 * UNITE_HORIZONTALE, chev9.getY());
		Point chev11 = new Point(chev10.getX() + 2 * UNITE_HORIZONTALE, chev10.getY() + 2 * UNITE_VERTICALE);
		
		demarrerNouveauDessinAvecDesPoints("Tête cheveux")
		.ajouter(coteTeteDroit)
		.ajouter(chev1)
		.ajouter(chev2)
		.ajouter(chev3)
		.ajouter(chev4)
		.ajouter(chev5)
		.ajouter(chev6)
		.ajouter(chev7)
		.ajouter(coteTeteGauche)
		.ajouter(chev8)
		.ajouter(chev9)
		.ajouter(chev10)
		.ajouter(chev11)
		.couleurDeFond(Couleur.GRIS);
		
		// Suite du dessin
		dessinOeilNezBoucheMenton(epauleDroit2, epauleGauche2);
	}

	/**
	 * @param epauleDroit2
	 * @param epauleGauche2
	 */
	private void dessinOeilNezBoucheMenton(Point epauleDroit2,
			Point epauleGauche2) {
		// Dessin oeil droit
		double abscisseOeilDroit = epauleDroit2.getX() - 2 * UNITE_HORIZONTALE;
		double ordonneOeilDroit = epauleDroit2.getY() - 3 * UNITE_VERTICALE;
		Point centreOeilDroit = new Point(abscisseOeilDroit, ordonneOeilDroit);
		Ellipse oeilDroit = new Ellipse("Oeil droit", centreOeilDroit, LONGUEUR_DES_YEUX, LARGEUR_DES_YEUX, Couleur.NOIR);
		
		ajouterEllipse(oeilDroit);
		
		// Dessin oeil gauche
		double abscisseOeilGauche = epauleGauche2.getX() + 2 * UNITE_HORIZONTALE;
		double ordonneOeilGauche = epauleGauche2.getY() - 3 * UNITE_VERTICALE;
		Point centreOeilGauche = new Point(abscisseOeilGauche, ordonneOeilGauche);
		Ellipse oeilGauche = new Ellipse("Oeil gauche", centreOeilGauche, LONGUEUR_DES_YEUX, LARGEUR_DES_YEUX, Couleur.NOIR);
		
		ajouterEllipse(oeilGauche);
		
		// Dessin du nez
		Point sommetHautDuNez = new Point(centreOeilDroit.getX() - UNITE_HORIZONTALE, centreOeilDroit.getY() + UNITE_VERTICALE);
		Point sommetDroitNez = new Point(sommetHautDuNez.getX() + LONGUEUR_NEZ/2, sommetHautDuNez.getY() + LARGEUR_NEZ);
		Point sommetGaucheNez = new Point(sommetDroitNez.getX() - LONGUEUR_NEZ, sommetDroitNez.getY());
		
		demarrerNouveauDessinAvecDesPoints("Nez")
		.ajouter(sommetGaucheNez)
		.ajouter(sommetHautDuNez)
		.ajouter(sommetDroitNez)
		.nePasRelierLesPointsExtreme();
		
		// Dessin de la bouche
		Point boucheDroit = new Point(sommetHautDuNez.getX() + UNITE_HORIZONTALE, sommetHautDuNez.getY() + UNITE_VERTICALE);
		Point boucheGauche = new Point(boucheDroit.getX() - LONGUEUR_BOUCHE, boucheDroit.getY());
		
		demarrerNouveauDessinAvecDesPoints("Bouche")
		.ajouter(boucheDroit)
		.ajouter(boucheGauche);
		
		// Dessin trait menton
		Point traitMentonDroit = new Point(sommetHautDuNez.getX() + LONGUEUR_TRAIT_MENTON/2, sommetHautDuNez.getY() + 3 * UNITE_VERTICALE);
		Point traitMentonGauche = new Point(traitMentonDroit.getX() - LONGUEUR_TRAIT_MENTON, traitMentonDroit.getY());
		
		demarrerNouveauDessinAvecDesPoints("Menton")
		.ajouter(traitMentonDroit)
		.ajouter(traitMentonGauche);
	}
}
