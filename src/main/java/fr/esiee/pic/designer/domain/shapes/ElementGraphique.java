package fr.esiee.pic.designer.domain.shapes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;

/**
 * Encapsule tous les élements d'un grahique
 * 
 * @author etudiant
 *
 */
@Entity
@Table(name="element_graphique")
public class ElementGraphique {
    
    @Id
    @GeneratedValue(generator="system-uuid")
    @Column(length=36)
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    private String id;
    
    /**
     * Nom de l'élément graphique
     */
    @Column(name="nom", nullable=false)
    private String nom;
    
    /**
     * Liste des ellipses composant le dessin
     */
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
        name="element_graphique_ellipse_mapping",
        joinColumns=@JoinColumn(name="element_graphique_id", referencedColumnName="id", nullable = false),
        inverseJoinColumns=@JoinColumn(name="ellipse_id", referencedColumnName="id", nullable = false),
        uniqueConstraints = @UniqueConstraint(columnNames = {"element_graphique_id", "ellipse_id"}))
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Ellipse> ellipses;
    
    /**
     * Liste des figures faites à partir de points
     */
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
        name="element_graphique_chemin_de_point_mapping",
        joinColumns=@JoinColumn(name="element_graphique_id", referencedColumnName="id", nullable = false),
        inverseJoinColumns=@JoinColumn(name="chemin_de_point_id", referencedColumnName="id", nullable = false),
        uniqueConstraints = @UniqueConstraint(columnNames = {"element_graphique_id", "chemin_de_point_id"}))
    @Fetch(value = FetchMode.SUBSELECT)
    private List<CheminDePoints> formesAvecPoints;
    
    /**
     * Default constructor
     */
    public ElementGraphique() {
        super();
    }
    
    /**
     * Constructeur par défaut
     */
    public ElementGraphique(String nom) {
        super();
        ellipses = new ArrayList<>();
        formesAvecPoints = new ArrayList<>();
        this.nom = nom;
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
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
    
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param ellipses the ellipses to set
     */
    public void setEllipses(List<Ellipse> ellipses) {
        this.ellipses = ellipses;
    }

    /**
     * @param formesAvecPoints the formesAvecPoints to set
     */
    public void setFormesAvecPoints(List<CheminDePoints> formesAvecPoints) {
        this.formesAvecPoints = formesAvecPoints;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ElementGraphique [id=" + id + ", nom=" + nom + ", ellipses="
                + ellipses + ", formesAvecPoints=" + formesAvecPoints + "]";
    }
}
