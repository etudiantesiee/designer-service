package fr.esiee.pic.designer.ui.scene.evaluation;

import fr.esiee.pic.designer.design.evaluation.DessinGroupe0;
import fr.esiee.pic.designer.ui.scene.common.Ecran;

public class EcranEvaluation extends Ecran {
    
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
        
        Ecran e = new EcranEvaluation();
        
        // Affichage de la démo : personnage manga
        DessinGroupe0 demoManga = new DessinGroupe0("Dessin groupe 0");
        e.addDessin(demoManga);
        
        e.afficher();
    }
}
