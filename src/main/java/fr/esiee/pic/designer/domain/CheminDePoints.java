package fr.esiee.pic.designer.domain;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

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
	 * List de points ordonnés
	 */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name="chemin_de_points_point_mapping",
        joinColumns=@JoinColumn(name="chemin_de_point_id", referencedColumnName="id", nullable = false),
        inverseJoinColumns=@JoinColumn(name="point_id", referencedColumnName="id", nullable = false),
        uniqueConstraints = @UniqueConstraint(columnNames = {"chemin_de_point_id", "point_id"}))
    @Fetch(value = FetchMode.SUBSELECT)
	private final List<Point> points;
	
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
	public CheminDePoints() {
		points = new LinkedList<>();
		traitDeLaisonFin = false;
		relierLesPointsExtremes = true;
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
		this.couleurTraitsLaison = couleur;
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
	 * Getter de la couleur
	 * 
	 * @return
	 */
	public Couleur getCouleurDeFond() {
		return couleur;
	}
	
	/**
	 * Getter de la couleur des traits
	 * 
	 * @return
	 */
	public Couleur getCouleurTraits() {
		return couleurTraitsLaison;
	}
	
	/**
	 * Retourne true si les traits de laison entre les points sont fin.
	 * 
	 * @return
	 */
	public boolean aDesTraitsFin() {
		return traitDeLaisonFin;
	}
	
	/**
	 * Retoure vraie si les points extremes doivent être reliés.
	 * 
	 * @return
	 */
	public boolean relierLesPointsExtremes() {
		return relierLesPointsExtremes;
	}
	
	@Override
	public String toString() {
		return "CheminDePoints [points=" + points + ", couleur=" + couleur
				+ ", couleurTraitsLaison=" + couleurTraitsLaison
				+ ", traitDeLaisonFin=" + traitDeLaisonFin + "]";
	}
}
