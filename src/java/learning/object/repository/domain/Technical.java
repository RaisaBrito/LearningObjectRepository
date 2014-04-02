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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Rogério Pimentel <rgercp@mail.com>
 */
@Entity
@Table(name = "technical", catalog = "lo_repository", schema = "")
@NamedQueries({
    @NamedQuery(name = "Technical.findAll", query = "SELECT t FROM Technical t"),
    @NamedQuery(name = "Technical.findById", query = "SELECT t FROM Technical t WHERE t.id = :id"),
    @NamedQuery(name = "Technical.findByEssential", query = "SELECT t FROM Technical t WHERE t.essential = :essential"),
    @NamedQuery(name = "Technical.findByPlatformType", query = "SELECT t FROM Technical t WHERE t.platformType = :platformType")})
public class Technical implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ESSENTIAL")
    private short essential;
    @Basic(optional = false)
    @Column(name = "PLATFORM_TYPE")
    private String platformType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "technicalId", fetch = FetchType.LAZY)
    private Collection<Accessibility> accessibilityCollection;

    public Technical() {
    }

    public Technical(Integer id) {
        this.id = id;
    }

    public Technical(Integer id, short essential, String platformType) {
        this.id = id;
        this.essential = essential;
        this.platformType = platformType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public short getEssential() {
        return essential;
    }

    public void setEssential(short essential) {
        this.essential = essential;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
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
        if (!(object instanceof Technical)) {
            return false;
        }
        Technical other = (Technical) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lo.repository.domain.Technical[ id=" + id + " ]";
    }
    
}
