package fr.esiee.pic.designer.ui.scene.demo;

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
    public static final int UNITE_HORIZONTALE_GRILLE = 40;

    /**
     * Unité sur l'axe des ordonnées
     */
    public static final int UNITE_VERTICALE_GRILLE = 40;
    
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
        
        Ecran e = new EcranManga();
        e.masquerGrille();
        
        // Dessin intial à supprimer
        PersonnageManga manga = new PersonnageManga("Un personnage Manga");
        e.addDessin(manga);
        
        e.afficher();
    }

}
