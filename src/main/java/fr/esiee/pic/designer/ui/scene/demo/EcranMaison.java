package fr.esiee.pic.designer.ui.scene.demo;

import fr.esiee.pic.designer.design.exemple.MaisonAvecCercleEtEllipse;
import fr.esiee.pic.designer.ui.scene.common.Ecran;

/**
 * Ecran pour afficher le manga de la démo
 * 
 * @author etudiant
 *
 */
public class EcranMaison extends Ecran {
    
    /**
     * Unite sur l'axe des abscissed
     */
    public static final int UNITE_HORIZONTALE_GRILLE = 50;

    /**
     * Unité sur l'axe des ordonnées
     */
    public static final int UNITE_VERTICALE_GRILLE = 50;
    
    @Override
    public int uniteHorizontaleGrille() {
        return UNITE_HORIZONTALE_GRILLE;
    }
    
    @Override
    public int uniteVerticaleGrille() {
        return UNITE_VERTICALE_GRILLE;
    }
    
    /**
     * Méthod Main
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        Ecran e = new EcranMaison();
        e.masquerGrille();
        
        // Affichage de la démo : personnage manga
        MaisonAvecCercleEtEllipse demoMaison = new MaisonAvecCercleEtEllipse("Une maison avec un cercle et une ellipse");
        e.addDessin(demoMaison);
        
        e.afficher();
    }

}
