/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learning.object.repository.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Rogério Pimentel <rgercp@mail.com>
 */
@Entity
@Table(name = "accessibility", catalog = "lo_repository", schema = "")
@NamedQueries({
    @NamedQuery(name = "Accessibility.findAll", query = "SELECT a FROM Accessibility a"),
    @NamedQuery(name = "Accessibility.findById", query = "SELECT a FROM Accessibility a WHERE a.id = :id"),
    @NamedQuery(name = "Accessibility.findByHasVisual", query = "SELECT a FROM Accessibility a WHERE a.hasVisual = :hasVisual"),
    @NamedQuery(name = "Accessibility.findByHasAuditory", query = "SELECT a FROM Accessibility a WHERE a.hasAuditory = :hasAuditory"),
    @NamedQuery(name = "Accessibility.findByHasText", query = "SELECT a FROM Accessibility a WHERE a.hasText = :hasText"),
    @NamedQuery(name = "Accessibility.findByAlternativesToAuditory", query = "SELECT a FROM Accessibility a WHERE a.alternativesToAuditory = :alternativesToAuditory"),
    @NamedQuery(name = "Accessibility.findByAlternativesToText", query = "SELECT a FROM Accessibility a WHERE a.alternativesToText = :alternativesToText"),
    @NamedQuery(name = "Accessibility.findByAudioDescription", query = "SELECT a FROM Accessibility a WHERE a.audioDescription = :audioDescription"),
    @NamedQuery(name = "Accessibility.findByAvoidBlueYellow", query = "SELECT a FROM Accessibility a WHERE a.avoidBlueYellow = :avoidBlueYellow"),
    @NamedQuery(name = "Accessibility.findByAvoidGreenYellow", query = "SELECT a FROM Accessibility a WHERE a.avoidGreenYellow = :avoidGreenYellow"),
    @NamedQuery(name = "Accessibility.findByAvoidOrange", query = "SELECT a FROM Accessibility a WHERE a.avoidOrange = :avoidOrange"),
    @NamedQuery(name = "Accessibility.findByAvoidPurpleGrey", query = "SELECT a FROM Accessibility a WHERE a.avoidPurpleGrey = :avoidPurpleGrey"),
    @NamedQuery(name = "Accessibility.findByAvoidRed", query = "SELECT a FROM Accessibility a WHERE a.avoidRed = :avoidRed"),
    @NamedQuery(name = "Accessibility.findByAvoidRedBlack", query = "SELECT a FROM Accessibility a WHERE a.avoidRedBlack = :avoidRedBlack"),
    @NamedQuery(name = "Accessibility.findByAvoidRedGreen", query = "SELECT a FROM Accessibility a WHERE a.avoidRedGreen = :avoidRedGreen"),
    @NamedQuery(name = "Accessibility.findByCaptionRate", query = "SELECT a FROM Accessibility a WHERE a.captionRate = :captionRate"),
    @NamedQuery(name = "Accessibility.findByColorAvoidance", query = "SELECT a FROM Accessibility a WHERE a.colorAvoidance = :colorAvoidance"),
    @NamedQuery(name = "Accessibility.findByAnhancedCaption", query = "SELECT a FROM Accessibility a WHERE a.anhancedCaption = :anhancedCaption"),
    @NamedQuery(name = "Accessibility.findByGraphicAlternative", query = "SELECT a FROM Accessibility a WHERE a.graphicAlternative = :graphicAlternative"),
    @NamedQuery(name = "Accessibility.findByReducedReadingLevel", query = "SELECT a FROM Accessibility a WHERE a.reducedReadingLevel = :reducedReadingLevel"),
    @NamedQuery(name = "Accessibility.findByReducedSpeed", query = "SELECT a FROM Accessibility a WHERE a.reducedSpeed = :reducedSpeed"),
    @NamedQuery(name = "Accessibility.findByUseMaximumContrastMonochrome", query = "SELECT a FROM Accessibility a WHERE a.useMaximumContrastMonochrome = :useMaximumContrastMonochrome"),
    @NamedQuery(name = "Accessibility.findByVerbatim", query = "SELECT a FROM Accessibility a WHERE a.verbatim = :verbatim"),
    @NamedQuery(name = "Accessibility.findByAccessibilitycol", query = "SELECT a FROM Accessibility a WHERE a.accessibilitycol = :accessibilitycol")})
public class Accessibility implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "HAS_VISUAL")
    private short hasVisual;
    @Basic(optional = false)
    @Column(name = "HAS_AUDITORY")
    private short hasAuditory;
    @Basic(optional = false)
    @Column(name = "HAS_TEXT")
    private short hasText;
    @Basic(optional = false)
    @Column(name = "ALTERNATIVES_TO_AUDITORY")
    private short alternativesToAuditory;
    @Basic(optional = false)
    @Column(name = "ALTERNATIVES_TO_TEXT")
    private short alternativesToText;
    @Basic(optional = false)
    @Column(name = "AUDIO_DESCRIPTION")
    private short audioDescription;
    @Basic(optional = false)
    @Column(name = "AVOID_BLUE_YELLOW")
    private short avoidBlueYellow;
    @Basic(optional = false)
    @Column(name = "AVOID_GREEN_YELLOW")
    private short avoidGreenYellow;
    @Basic(optional = false)
    @Column(name = "AVOID_ORANGE")
    private short avoidOrange;
    @Basic(optional = false)
    @Column(name = "AVOID_PURPLE_GREY")
    private short avoidPurpleGrey;
    @Basic(optional = false)
    @Column(name = "AVOID_RED")
    private short avoidRed;
    @Basic(optional = false)
    @Column(name = "AVOID_RED_BLACK")
    private short avoidRedBlack;
    @Basic(optional = false)
    @Column(name = "AVOID_RED_GREEN")
    private short avoidRedGreen;
    @Basic(optional = false)
    @Column(name = "CAPTION_RATE")
    private short captionRate;
    @Basic(optional = false)
    @Column(name = "COLOR_AVOIDANCE")
    private short colorAvoidance;
    @Basic(optional = false)
    @Column(name = "ANHANCED_CAPTION")
    private short anhancedCaption;
    @Basic(optional = false)
    @Column(name = "GRAPHIC_ALTERNATIVE")
    private short graphicAlternative;
    @Basic(optional = false)
    @Column(name = "REDUCED_READING_LEVEL")
    private short reducedReadingLevel;
    @Basic(optional = false)
    @Column(name = "REDUCED_SPEED")
    private short reducedSpeed;
    @Basic(optional = false)
    @Column(name = "USE_MAXIMUM_CONTRAST_MONOCHROME")
    private short useMaximumContrastMonochrome;
    @Basic(optional = false)
    @Column(name = "VERBATIM")
    private short verbatim;
    @Column(name = "accessibilitycol")
    private String accessibilitycol;
    @JoinColumn(name = "IDENTIFIER_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Identifier identifierId;
    @JoinColumn(name = "GENERAL_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private General generalId;
    @JoinColumn(name = "TECHNICAL_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Technical technicalId;

    public Accessibility() {
    }

    public Accessibility(Integer id) {
        this.id = id;
    }

    public Accessibility(Integer id, short hasVisual, short hasAuditory, short hasText, short alternativesToAuditory, short alternativesToText, short audioDescription, short avoidBlueYellow, short avoidGreenYellow, short avoidOrange, short avoidPurpleGrey, short avoidRed, short avoidRedBlack, short avoidRedGreen, short captionRate, short colorAvoidance, short anhancedCaption, short graphicAlternative, short reducedReadingLevel, short reducedSpeed, short useMaximumContrastMonochrome, short verbatim) {
        this.id = id;
        this.hasVisual = hasVisual;
        this.hasAuditory = hasAuditory;
        this.hasText = hasText;
        this.alternativesToAuditory = alternativesToAuditory;
        this.alternativesToText = alternativesToText;
        this.audioDescription = audioDescription;
        this.avoidBlueYellow = avoidBlueYellow;
        this.avoidGreenYellow = avoidGreenYellow;
        this.avoidOrange = avoidOrange;
        this.avoidPurpleGrey = avoidPurpleGrey;
        this.avoidRed = avoidRed;
        this.avoidRedBlack = avoidRedBlack;
        this.avoidRedGreen = avoidRedGreen;
        this.captionRate = captionRate;
        this.colorAvoidance = colorAvoidance;
        this.anhancedCaption = anhancedCaption;
        this.graphicAlternative = graphicAlternative;
        this.reducedReadingLevel = reducedReadingLevel;
        this.reducedSpeed = reducedSpeed;
        this.useMaximumContrastMonochrome = useMaximumContrastMonochrome;
        this.verbatim = verbatim;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public short getHasVisual() {
        return hasVisual;
    }

    public void setHasVisual(short hasVisual) {
        this.hasVisual = hasVisual;
    }

    public short getHasAuditory() {
        return hasAuditory;
    }

    public void setHasAuditory(short hasAuditory) {
        this.hasAuditory = hasAuditory;
    }

    public short getHasText() {
        return hasText;
    }

    public void setHasText(short hasText) {
        this.hasText = hasText;
    }

    public short getAlternativesToAuditory() {
        return alternativesToAuditory;
    }

    public void setAlternativesToAuditory(short alternativesToAuditory) {
        this.alternativesToAuditory = alternativesToAuditory;
    }

    public short getAlternativesToText() {
        return alternativesToText;
    }

    public void setAlternativesToText(short alternativesToText) {
        this.alternativesToText = alternativesToText;
    }

    public short getAudioDescription() {
        return audioDescription;
    }

    public void setAudioDescription(short audioDescription) {
        this.audioDescription = audioDescription;
    }

    public short getAvoidBlueYellow() {
        return avoidBlueYellow;
    }

    public void setAvoidBlueYellow(short avoidBlueYellow) {
        this.avoidBlueYellow = avoidBlueYellow;
    }

    public short getAvoidGreenYellow() {
        return avoidGreenYellow;
    }

    public void setAvoidGreenYellow(short avoidGreenYellow) {
        this.avoidGreenYellow = avoidGreenYellow;
    }

    public short getAvoidOrange() {
        return avoidOrange;
    }

    public void setAvoidOrange(short avoidOrange) {
        this.avoidOrange = avoidOrange;
    }

    public short getAvoidPurpleGrey() {
        return avoidPurpleGrey;
    }

    public void setAvoidPurpleGrey(short avoidPurpleGrey) {
        this.avoidPurpleGrey = avoidPurpleGrey;
    }

    public short getAvoidRed() {
        return avoidRed;
    }

    public void setAvoidRed(short avoidRed) {
        this.avoidRed = avoidRed;
    }

    public short getAvoidRedBlack() {
        return avoidRedBlack;
    }

    public void setAvoidRedBlack(short avoidRedBlack) {
        this.avoidRedBlack = avoidRedBlack;
    }

    public short getAvoidRedGreen() {
        return avoidRedGreen;
    }

    public void setAvoidRedGreen(short avoidRedGreen) {
        this.avoidRedGreen = avoidRedGreen;
    }

    public short getCaptionRate() {
        return captionRate;
    }

    public void setCaptionRate(short captionRate) {
        this.captionRate = captionRate;
    }

    public short getColorAvoidance() {
        return colorAvoidance;
    }

    public void setColorAvoidance(short colorAvoidance) {
        this.colorAvoidance = colorAvoidance;
    }

    public short getAnhancedCaption() {
        return anhancedCaption;
    }

    public void setAnhancedCaption(short anhancedCaption) {
        this.anhancedCaption = anhancedCaption;
    }

    public short getGraphicAlternative() {
        return graphicAlternative;
    }

    public void setGraphicAlternative(short graphicAlternative) {
        this.graphicAlternative = graphicAlternative;
    }

    public short getReducedReadingLevel() {
        return reducedReadingLevel;
    }

    public void setReducedReadingLevel(short reducedReadingLevel) {
        this.reducedReadingLevel = reducedReadingLevel;
    }

    public short getReducedSpeed() {
        return reducedSpeed;
    }

    public void setReducedSpeed(short reducedSpeed) {
        this.reducedSpeed = reducedSpeed;
    }

    public short getUseMaximumContrastMonochrome() {
        return useMaximumContrastMonochrome;
    }

    public void setUseMaximumContrastMonochrome(short useMaximumContrastMonochrome) {
        this.useMaximumContrastMonochrome = useMaximumContrastMonochrome;
    }

    public short getVerbatim() {
        return verbatim;
    }

    public void setVerbatim(short verbatim) {
        this.verbatim = verbatim;
    }

    public String getAccessibilitycol() {
        return accessibilitycol;
    }

    public void setAccessibilitycol(String accessibilitycol) {
        this.accessibilitycol = accessibilitycol;
    }

    public Identifier getIdentifierId() {
        return identifierId;
    }

    public void setIdentifierId(Identifier identifierId) {
        this.identifierId = identifierId;
    }

    public General getGeneralId() {
        return generalId;
    }

    public void setGeneralId(General generalId) {
        this.generalId = generalId;
    }

    public Technical getTechnicalId() {
        return technicalId;
    }

    public void setTechnicalId(Technical technicalId) {
        this.technicalId = technicalId;
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
        if (!(object instanceof Accessibility)) {
            return false;
        }
        Accessibility other = (Accessibility) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lo.repository.domain.Accessibility[ id=" + id + " ]";
    }
    
}
