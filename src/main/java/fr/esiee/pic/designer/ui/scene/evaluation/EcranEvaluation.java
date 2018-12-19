package fr.esiee.pic.designer.ui.scene.evaluation;

import fr.esiee.pic.designer.design.evaluation.DessinGroupe1;
import fr.esiee.pic.designer.design.evaluation.DessinGroupe2;
import fr.esiee.pic.designer.design.evaluation.DessinGroupe3;
import fr.esiee.pic.designer.design.evaluation.DessinGroupe5;
import fr.esiee.pic.designer.design.evaluation.DessinGroupe6;
import fr.esiee.pic.designer.ui.scene.common.Ecran;

public class EcranEvaluation extends Ecran {
    
    /**
     * Unite sur l'axe des abscissed
     */
    public static final int UNITE_HORIZONTALE_GRILLE = 20;

    /**
     * Unité sur l'axe des ordonnées
     */
    public static final int UNITE_VERTICALE_GRILLE = 20;
    
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
        DessinGroupe1 dessinManga1 = new DessinGroupe1("Dessin groupe 1");
        e.addDessin(dessinManga1);
        
        DessinGroupe2 dessinManga2 = new DessinGroupe2("Dessin groupe 2");
        e.addDessin(dessinManga2);
        
        DessinGroupe3 dessinManga3 = new DessinGroupe3("Dessin groupe 3");
        e.addDessin(dessinManga3);
        
        DessinGroupe5 dessinManga5 = new DessinGroupe5("Dessin groupe 5");
        e.addDessin(dessinManga5);
        
        DessinGroupe6 demoManga6 = new DessinGroupe6("Dessin groupe 6");
        e.addDessin(demoManga6);
        
        e.afficher();
        

        
    }
}
