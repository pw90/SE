package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Adam Szaraniec
 */
@Entity
@Table(name = "ROUTE")
@NamedQueries({
    @NamedQuery(name = "Route.findAll", query = "SELECT r FROM Route r"),
    @NamedQuery(name = "Route.findById", query = "SELECT r FROM Route r WHERE r.id = :id"),
    @NamedQuery(name = "Route.findByData", query = "SELECT r FROM Route r WHERE r.data = :data"),})
public class Route implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DATA")
    private String data;

    @JoinColumn(name = "SOLUTION_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Solution solution;

    @Transient
    private int customer;

    @Transient
    private int x;

    @Transient
    private int y;

    @Transient
    private int demand;

    @Transient
    private int readyTime;

    @Transient
    private int dueDate;

    @Transient
    private int serviceTime;

    public Route() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(data);
        ArrayList numbers = new ArrayList();
        
        while (m.find()) {
          numbers.add(m.group());
        }
        
        this.customer    = Integer.parseInt(numbers.get(0).toString());
        this.x           = Integer.parseInt(numbers.get(1).toString());
        this.y           = Integer.parseInt(numbers.get(2).toString());
        this.demand      = Integer.parseInt(numbers.get(3).toString());
        this.readyTime   = Integer.parseInt(numbers.get(4).toString());
        this.dueDate     = Integer.parseInt(numbers.get(5).toString());
        this.serviceTime = Integer.parseInt(numbers.get(6).toString());
    }

    public Solution getSolution() {
        return solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
        if (!solution.getRouteCollection().contains(this)) {
            solution.getRouteCollection().add(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Route)) {
            return false;
        }
        Route other = (Route) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Route[ routePK]";
    }

    /**
     * @return the customer
     */
    public int getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(int customer) {
        this.customer = customer;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the demand
     */
    public int getDemand() {
        return demand;
    }

    /**
     * @param demand the demand to set
     */
    public void setDemand(int demand) {
        this.demand = demand;
    }

    /**
     * @return the readyTime
     */
    public int getReadyTime() {
        return readyTime;
    }

    /**
     * @param readyTime the readyTime to set
     */
    public void setReadyTime(int readyTime) {
        this.readyTime = readyTime;
    }

    /**
     * @return the dueDate
     */
    public int getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the serviceTime
     */
    public int getServiceTime() {
        return serviceTime;
    }

    /**
     * @param serviceTime the serviceTime to set
     */
    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }

}
