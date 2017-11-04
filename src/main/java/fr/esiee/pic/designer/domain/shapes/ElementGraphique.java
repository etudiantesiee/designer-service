package fr.esiee.pic.designer.domain.shapes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Encapsule tous les élements d'un grahique
 * 
 * @author etudiant
 *
 */
@Entity
@Table(name="element_graphique")
public class ElementGraphique {
    
    /**
     * Liste des ellipses composant le dessin
     */
    private final List<Ellipse> ellipses;
    
    /**
     * Liste des figures faites à partir de points
     */
    private final List<CheminDePoints> formesAvecPoints;
    
    /**
     * Constructeur par défaut
     */
    public ElementGraphique() {
        super();
        ellipses = new ArrayList<>();
        formesAvecPoints = new ArrayList<>();
    }
    
    /**
     * Ajout d'un nouveau chemin
     * 
     * @param nouveauChemin
     */
    public void ajoutNouveauChemin(CheminDePoints nouveauChemin) {
       this.formesAvecPoints.add(nouveauChemin); 
    }
    
    /**
     * Ajout d'une nouvelle ellipse
     * @param ellipse
     */
    public void ajoutEllipse(Ellipse ellipse) {
        this.ellipses.add(ellipse);
    }

    /**
     * Getter de la liste des ellipses
     * 
     * @return
     */
    public List<Ellipse> getEllipses() {
        return ellipses;
    }

    /**
     * Getter de la liste des formes faites à partir de points
     * @return
     */
    public List<CheminDePoints> getFormesAvecPoints() {
        return formesAvecPoints;
    }

}
