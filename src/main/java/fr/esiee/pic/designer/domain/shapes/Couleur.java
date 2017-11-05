package fr.esiee.pic.designer.domain.shapes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Réprésente une couleur RGB à ajouter dans une figure géométrique
 * 
 * @author etudiant
 *
 */
@Entity
@Table(name="couleur")
public class Couleur {
	
	/**
	 * Couleur noir
	 */
    public static final Couleur NOIR = new Couleur(0f, 0f, 0f, 0.8f);
	
	/**
	 * Couleur Blanche
	 */
    public static final Couleur BLANC = new Couleur(1f, 1f, 1f, 0.8f);
	
	/**
	 * Couleur Grise
	 */
    public static final Couleur GRIS = new Couleur(0.5f, 0.5f, 0.5f, 0.8f);

	/**
	 * Couleur Jaune
	 */
    public static final Couleur JAUNE = new Couleur(1f, 1f, 0f, 0.8f);
	
	@Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    @Column(length=36)
    private String id;
	
	private float r, g, b, a;
	
	/**
	 * Default constructor
	 */
	public Couleur() {
        super();
    }
	
	/**
	 * Construct a color from another color
	 */
	public Couleur(Couleur c) {
        this(c.r, c.g, c.b, c.a);
        
    }
	
	/**
	 * Construit une couleur RGB à partir des valeurs de Rouge, Vert et bleu précisées. 
	 * La valeur a correspond à la transparence.
	 * 
	 * Ces valeurs sont comprises entre 0.0 et 1.0 (inclu)
	 * 
	 * @param r
	 * @param g
	 * @param b
	 * @param a
	 */
	private Couleur(float r, float g, float b, float a) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
	}
	

	/**
     * @return the id
     */
    public String getId() {
        return id;
    }
    
    

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param r the r to set
     */
    public void setR(float r) {
        this.r = r;
    }

    /**
     * @param g the g to set
     */
    public void setG(float g) {
        this.g = g;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @param a the a to set
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
	 * Getter de Rouge
	 * 
	 * @return
	 */
	public float getR() {
		return r;
	}

	/**
	 * Getter de Vert
	 * 
	 * @return
	 */
	public float getG() {
		return g;
	}

	/**
	 * Getter de Bleue
	 * 
	 * @return
	 */
	public float getB() {
		return b;
	}

	/**
	 * Getter de transparence
	 * 
	 * @return
	 */
	public float getA() {
		return a;
	}

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Float.floatToIntBits(a);
        result = prime * result + Float.floatToIntBits(b);
        result = prime * result + Float.floatToIntBits(g);
        result = prime * result + Float.floatToIntBits(r);
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
        Couleur other = (Couleur) obj;
        if (Float.floatToIntBits(a) != Float.floatToIntBits(other.a))
            return false;
        if (Float.floatToIntBits(b) != Float.floatToIntBits(other.b))
            return false;
        if (Float.floatToIntBits(g) != Float.floatToIntBits(other.g))
            return false;
        if (Float.floatToIntBits(r) != Float.floatToIntBits(other.r))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Couleur [r=" + r + ", g=" + g + ", b=" + b + ", a=" + a + "]";
    }
	
	
}
