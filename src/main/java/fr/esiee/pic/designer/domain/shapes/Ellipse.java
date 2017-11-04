package fr.esiee.pic.designer.domain.shapes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Réprésente la figure géométrique 2D ellipse
 * 
 * Une ellipse se définit à partir des éléments ci-dessous :
 * 	- Une abscisse : celle du centre de l'ellipe
 *  - Une ordonnée : celle du centre de l'éllipse
 *  - Une largeur
 *  - une hauteur
 *  
 * Si la largeur = hauteur
 * 	- l'éllipse devient un cercle.
 * 	- largeur devient le diametre
 * 	- hauteur : devient le diametre
 * 
 * @author etudiant
 *
 */
@Entity
@Table(name="ellipse")
public class Ellipse {
    
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    @Column(length=36)
    private String id;
	
    /**
     * Centre de l'ellipse
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="centre", nullable=false)
    private Point centre;
	
	/**
	 * La largeur de l'éllipse
	 */
    @Column(name="l", nullable=false)
	private double l;
	
	/**
	 * La hauteur de l'éllipse
	 */
    @Column(name="h", nullable=false)
	private double h;
    

    /**
     * Couleur de l'ellipse
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="couleur", nullable=true)
    private Couleur couleur;
    
    /**
     * Default constructor
     */
    public Ellipse() {
        super();
    }

	/**
	 * Construit une éllipse à partir de :
	 * 	- des corrdonnées de son centre : le point centreEllipse
	 * Si la h = l
	 * 	- l'éllipse devient un cercle.
	 * 	- l devient le diametre
	 * 	- h : devient le diametre
	 * 
	 * @param centreEllipse
	 * @param l
	 * @param h
	 */
	public Ellipse(Point centre, double l, double h) {
		super();
		this.centre = centre;
		this.l = l;
		this.h = h;
		this.couleur = null;
	}
	
	/**
     * Construit une éllipse à partir de :
     *  - des corrdonnées de son centre : le point centreEllipse
     * Si la h = l
     *  - l'éllipse devient un cercle.
     *  - l devient le diametre
     *  - h : devient le diametre
     *  - couleur : la couleur de l'ellipse
     * 
     * @param centreEllipse
     * @param l
     * @param h
     */
    public Ellipse(Point centre, double l, double h, Couleur couleur) {
        super();
        this.centre = centre;
        this.l = l;
        this.h = h;
        this.couleur = couleur;
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the centre
     */
    public Point getCentre() {
        return centre;
    }

    /**
     * @return the l
     */
    public double getL() {
        return l;
    }

    /**
     * @return the h
     */
    public double getH() {
        return h;
    }
    
    /**
     * @return the couleur
     */
    public Couleur getCouleur() {
        return couleur;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((centre == null) ? 0 : centre.hashCode());
        long temp;
        temp = Double.doubleToLongBits(h);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(l);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ellipse other = (Ellipse) obj;
        if (centre == null) {
            if (other.centre != null)
                return false;
        } else if (!centre.equals(other.centre))
            return false;
        if (Double.doubleToLongBits(h) != Double.doubleToLongBits(other.h))
            return false;
        if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Ellipse [id=" + id + ", centre=" + centre + ", l=" + l + ", h="
                + h + "]";
    }
}
