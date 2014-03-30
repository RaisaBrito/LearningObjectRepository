/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
@Table(name = "general", catalog = "lo_repository", schema = "")
@NamedQueries({
    @NamedQuery(name = "General.findAll", query = "SELECT g FROM General g"),
    @NamedQuery(name = "General.findById", query = "SELECT g FROM General g WHERE g.id = :id"),
    @NamedQuery(name = "General.findByLanguage", query = "SELECT g FROM General g WHERE g.language = :language")})
public class General implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @Column(name = "LANGUAGE")
    private String language;
    @Lob
    @Column(name = "DESCRIPTION")
    private String description;
    @Lob
    @Column(name = "KEYWORD")
    private String keyword;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "generalId", fetch = FetchType.LAZY)
    private Collection<Accessibility> accessibilityCollection;

    public General() {
    }

    public General(Integer id) {
        this.id = id;
    }

    public General(Integer id, String title, String language) {
        this.id = id;
        this.title = title;
        this.language = language;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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
        if (!(object instanceof General)) {
            return false;
        }
        General other = (General) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lo.repository.domain.General[ id=" + id + " ]";
    }
    
}
