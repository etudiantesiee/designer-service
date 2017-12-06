package fr.esiee.pic.designer.ui.scene.evaluation;

import fr.esiee.pic.designer.design.evaluation.DessinGroupeX;
import fr.esiee.pic.designer.ui.scene.common.Ecran;
import fr.esiee.pic.designer.ui.scene.demo.EcranManga;

public class EcranGroupeX extends Ecran {
    
    /**
     * Unite sur l'axe des abscissed
     */
    public static final int UNITE_HORIZONTALE_GRILLE = 80;

    /**
     * Unité sur l'axe des ordonnées
     */
    public static final int UNITE_VERTICALE_GRILLE = 80;
    
    @Override
    public int uniteHorizontaleGrille() {
        // TODO Auto-generated method stub
        return UNITE_HORIZONTALE_GRILLE;
    }
    
    @Override
    public int uniteVerticaleGrille() {
        // TODO Auto-generated method stub
        return UNITE_VERTICALE_GRILLE;
    }
    
    /**
     * Méthod Main
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        Ecran e = new EcranManga();
        
        // Affichage de la démo : personnage manga
        DessinGroupeX demoManga = new DessinGroupeX("Un personnage manga");
        e.addDessin(demoManga);
        
        e.afficher();
    }
}
