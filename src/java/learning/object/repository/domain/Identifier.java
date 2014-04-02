package learning.object.repository.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Rogério Pimentel <rgercp@mail.com>
 */
@Entity
@Table(name = "identifier", catalog = "lo_repository", schema = "")
@NamedQueries({
    @NamedQuery(name = "Identifier.findAll", query = "SELECT i FROM Identifier i"),
    @NamedQuery(name = "Identifier.findById", query = "SELECT i FROM Identifier i WHERE i.id = :id")})
public class Identifier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Lob
    @Column(name = "CATALOG")
    private String catalog;
    @Lob
    @Column(name = "ENTRY")
    private String entry;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identifierId", fetch = FetchType.LAZY)
    private Collection<Accessibility> accessibilityCollection;

    public Identifier() {
    }

    public Identifier(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public Collection<Accessibility> getAccessibilityCollection() {
        return accessibilityCollection;
    }

    public void setAccessibilityCollection(Collection<Accessibility> accessibilityCollection) {
        this.accessibilityCollection = accessibilityCollection;
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
        if (!(object instanceof Identifier)) {
            return false;
        }
        Identifier other = (Identifier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lo.repository.domain.Identifier[ id=" + id + " ]";
    }
    
}
