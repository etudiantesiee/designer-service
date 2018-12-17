package fr.esiee.pic.designer.ui.scene.demo;

import fr.esiee.pic.designer.design.evaluation.DessinGroupe0;
import fr.esiee.pic.designer.design.exemple.PersonnageManga;
import fr.esiee.pic.designer.ui.scene.common.Ecran;

/**
 * Ecran pour afficher le manga de la démo
 * 
 * @author etudiant
 *
 */
public class EcranManga extends Ecran {
    
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
        e.masquerGrille();
        
        // Dessin intial à supprimer
        DessinGroupe0 grp0 = new DessinGroupe0("Dessin groupe 0");
        e.addDessin(grp0);
        
        e.afficher();
    }

}
