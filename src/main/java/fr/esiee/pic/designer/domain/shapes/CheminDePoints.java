package fr.esiee.pic.designer.domain.shapes;

import java.util.LinkedList;
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
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;

/**
 * Définit un chemin formé à partir de points.
 * 
 * Tous les points de la liste sont ordonnés et reliés entre eux du premier au dernier.
 * 
 * @author etudiant
 *
 */
@Entity
@Table(name="chemin_de_points")
public final class CheminDePoints {
    
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    @Column(length=36)
    private String id;
    
    /**
     * Nom du chemin de points
     */
    @Column(name="nom", nullable=false)
    private String nom;
	
	/**
	 * List de points ordonnés
	 */
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
        name="chemin_de_points_point_mapping",
        joinColumns=@JoinColumn(name="chemin_de_point_id", referencedColumnName="id", nullable = false),
        inverseJoinColumns=@JoinColumn(name="point_id", referencedColumnName="id", nullable = false),
        uniqueConstraints = @UniqueConstraint(columnNames = {"chemin_de_point_id", "point_id"}))
    @Fetch(value = FetchMode.SUBSELECT)
    @OrderColumn
	private List<Point> points;
	
	/**
	 * Coloriage de fond
	 */
	@ManyToOne
    @JoinColumn(name="couleur", nullable=true)
	private Couleur couleur;
	
	/**
	 * Coloriage des traits
	 */
	@ManyToOne
    @JoinColumn(name="couleur_traits_laison", nullable=true)
	private Couleur couleurTraitsLaison;
	
	/**
	 * Indique si l'épaisseur des traits de laison doit être minimal
	 */
	@Column(name="trait_de_laison_fin", nullable=false)
	private Boolean traitDeLaisonFin;
	
	/**
	 * Précise si le dernier et le premier point doivent être reliés
	 */
	@Column(name="relier_les_points_extremes", nullable=false)
	private boolean relierLesPointsExtremes;
	
	/**
	 * Constructeur par défaut
	 */
	public CheminDePoints(String nom) {
	    super();
	    this.nom = nom;
		points = new LinkedList<>();
		traitDeLaisonFin = false;
		relierLesPointsExtremes = true;
	}
    
    /**
     * Constructeur par défaut
     */
    public CheminDePoints() {
        this(null);
    }
	
	/**
	 * Ajout d'un nouveau point à relier au précédent.
	 * 
	 * @param point
	 * @return
	 */
	public CheminDePoints ajouter(Point point) {
		this.points.add(point);
		return this;
	}
	
	/**
	 * Couleur de fond de la forme
	 * 
	 * @param couleur
	 * @return
	 */
	public CheminDePoints couleurDeFond(Couleur couleur) {
		this.couleur = couleur;
		return this;
	}
	
	/**
	 * Couleur des traits de laisons
	 * 
	 * @param couleur
	 * @return
	 */
	public CheminDePoints couleurDesTrait(Couleur couleurDesTrait) {
		this.couleurTraitsLaison = couleurDesTrait;
		return this;
	}
	
	/**
	 * Si cette méthode est appelée, 
	 * les traits qui relie les points seront de petites tailles
	 * 
	 * @return
	 */
	public CheminDePoints produireTraitDeLiaisonDePetiteTaille() {
		this.traitDeLaisonFin = true;
		return this;
	}
	
	/**
	 * Précise si le dernier et le premier point doivent être reliés
	 * 
	 * @return
	 */
	public CheminDePoints nePasRelierLesPointsExtreme() {
		this.relierLesPointsExtremes = false;
		return this;
	}
	
	/**
	 * Retourne la liste de point actuelle sous forme de tableau
	 * 
	 * @return
	 */
	public Point[] toArray() {
		int nbPoint = this.points.size();
		Point[] pointsArray = new Point[nbPoint];
		return this.points.toArray(pointsArray).clone();
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
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(List<Point> points) {
        this.points = points;
    }

    /**
     * @param traitDeLaisonFin the traitDeLaisonFin to set
     */
    public void setTraitDeLaisonFin(Boolean traitDeLaisonFin) {
        this.traitDeLaisonFin = traitDeLaisonFin;
    }

    /**
     * @param relierLesPointsExtremes the relierLesPointsExtremes to set
     */
    public void setRelierLesPointsExtremes(boolean relierLesPointsExtremes) {
        this.relierLesPointsExtremes = relierLesPointsExtremes;
    }

    /**
     * @return the points
     */
    public List<Point> getPoints() {
        return points;
    }

    /**
     * @return the couleur
     */
    public Couleur getCouleur() {
        return couleur;
    }

    /**
     * @return the couleurTraitsLaison
     */
    public Couleur getCouleurTraitsLaison() {
        return couleurTraitsLaison;
    }

    /**
     * @return the traitDeLaisonFin
     */
    public Boolean getTraitDeLaisonFin() {
        return traitDeLaisonFin;
    }

    /**
     * @return the relierLesPointsExtremes
     */
    public boolean getRelierLesPointsExtremes() {
        return relierLesPointsExtremes;
    }
	
	@Override
	public String toString() {
		return "CheminDePoints [points=" + points + ", couleur=" + couleur
				+ ", couleurTraitsLaison=" + couleurTraitsLaison
				+ ", traitDeLaisonFin=" + traitDeLaisonFin + "]";
	}
}
