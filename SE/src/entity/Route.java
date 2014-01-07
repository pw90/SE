package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DATA")
    private String data;

    @JoinColumn(name = "SOLUTION_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Solution solution;

    public Route() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    public List getCustomers() {
        List list = new ArrayList();
        
        String[] parts = data.split(":");
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(parts[1]);
        
        while (m.find()) {
          list.add(Integer.parseInt(m.group()));
        }
        
        
        return list;
        
    }
    
    @Override
    public String toString() {
        return "entity.Route[ routePK]";
    }
}
