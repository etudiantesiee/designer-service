package fr.esiee.pic.designer.ui.scene.common;

import java.util.ArrayList;
import java.util.List;

import fr.esiee.pic.designer.design.shared.Grille;
import fr.esiee.pic.designer.domain.tools.CreateurDeForme;
import fr.esiee.pic.designer.ui.tools.AfficheurDeFormes;

/**
 * Classe mère de tous les écrans
 * Définit les éléments de configuration d'un écran
 * 
 * @author etudiant
 * 
 */
public abstract class Ecran {

    /**
     * Liste des dessin à afficher sur l'écran
     */
    private List<CreateurDeForme> listDeDessins;

    /**
     * Utilitaire d'affichage de formes
     */
    private AfficheurDeFormes afficheur;

    /**
     * Affichage de la grille
     */
    private boolean afficherGrille;

    /**
     * Construteur avec param afficher grille
     */
    public Ecran(boolean afficherGrille) {
        super();
        listDeDessins = new ArrayList<>();
        this.afficheur = new AfficheurDeFormes();
        this.afficherGrille = afficherGrille;
    }

    /**
     * Construteur par défaut La grille sera affichée
     */
    public Ecran() {
        this(true);
    }
    
    /**
     * Unite horizontale de la grille
     * 
     * @return
     */
    public abstract int uniteHorizontaleGrille();
    
    /**
     * Unite verticale de la grille
     * 
     * @return
     */
    public abstract int uniteVerticaleGrille();

    /**
     * Ajoute la grille aux éléments à afficher
     */
    private void ajouterGrille() {
        // Affichage de la grille
        double longueurEcran = this.afficheur.getLongueurAffichage();
        double largeurEcran = this.afficheur.getLargeurAffichage();
        Grille grille = new Grille("Grille", longueurEcran, largeurEcran,
                this.uniteHorizontaleGrille(), this.uniteVerticaleGrille());
        this.listDeDessins.add(grille);
    }

    /**
     * Ajoute un nouveau dessin à l'écran
     * 
     * @param dessin
     */
    public void addDessin(CreateurDeForme dessin) {
        this.listDeDessins.add(dessin);
    }

    /**
     * Affichage des dessins
     */
    public void afficher() {
        // Initialisation des formes à afficher
        if (this.afficherGrille) {
            ajouterGrille();
        }

        // Itération sur la liste des dessins
        for (CreateurDeForme dessin : this.listDeDessins) {
            afficheur.afficher(dessin);
        }
    }

    /**
     * @param afficherGrille the afficherGrille to set
     */
    public void masquerGrille() {
        this.afficherGrille = false;
    }
    
    
}
