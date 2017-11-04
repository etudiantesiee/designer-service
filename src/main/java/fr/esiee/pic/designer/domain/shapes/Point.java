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
    @Column(name="x", nullable=false, updatable=false)
    private final double x;

    /**
     * Ordonnée du point
     */
    @Column(name="y", nullable=false, updatable=false)
    private final double y;

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
        long temp;
        temp = Double.doubleToLongBits(x);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
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
        Point other = (Point) obj;
        if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
            return false;
        if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
            return false;
        return true;
    }

    /**
     * toString() method
     */
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}
