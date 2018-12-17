package fr.esiee.pic.designer.domain.shapes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * Représente un point 2D en terme de figure gémétrique
 * 
 * Un poin possède un abscisse X et une ordonnée Y.
 * 
 * @author etudiant
 *
 */
@Entity
@Table(name="point")
public class Point {
    
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    @Column(length=36)
    private String id;
    
    /**
     * Abscisse du point
     */
    @Column(name="x", nullable=false)
    private double x;

    /**
     * Ordonnée du point
     */
    @Column(name="y", nullable=false)
    private double y;
    
    /**
     * Default constructor
     */
    public Point() {
        super();
    }

    /**
     * Constructeur
     * 
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp1;
        long temp2;
        temp1 = Double.doubleToLongBits(x);
        result = prime * result + (int) (temp1 ^ (temp1 >>> 32));
        temp2 = Double.doubleToLongBits(y);
        result = prime * result + (int) (temp2 ^ (temp2 >>> 32));
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
        Point other = (Point) obj;
        
        return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x) 
        		&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
    }

    /**
     * toString() method
     */
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}
