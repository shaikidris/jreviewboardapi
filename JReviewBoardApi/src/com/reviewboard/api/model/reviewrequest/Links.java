//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.26 at 10:05:51 PM BRT 
//


package com.reviewboard.api.model.reviewrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}diffs"/>
 *         &lt;element ref="{}repository"/>
 *         &lt;element ref="{}screenshots"/>
 *         &lt;element ref="{}self"/>
 *         &lt;element ref="{}update"/>
 *         &lt;element ref="{}last_update"/>
 *         &lt;element ref="{}reviews"/>
 *         &lt;element ref="{}draft"/>
 *         &lt;element ref="{}file_attachments"/>
 *         &lt;element ref="{}submitter"/>
 *         &lt;element ref="{}changes"/>
 *         &lt;element ref="{}delete"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "diffs",
    "repository",
    "screenshots",
    "self",
    "update",
    "lastUpdate",
    "reviews",
    "draft",
    "fileAttachments",
    "submitter",
    "changes",
    "delete"
})
@XmlRootElement(name = "links")
public class Links {

    @XmlElement(required = true)
    protected Diffs diffs;
    @XmlElement(required = true)
    protected Repository repository;
    @XmlElement(required = true)
    protected Screenshots screenshots;
    @XmlElement(required = true)
    protected Self self;
    @XmlElement(required = true)
    protected Update update;
    @XmlElement(name = "last_update", required = true)
    protected LastUpdate lastUpdate;
    @XmlElement(required = true)
    protected Reviews reviews;
    @XmlElement(required = true)
    protected Draft draft;
    @XmlElement(name = "file_attachments", required = true)
    protected FileAttachments fileAttachments;
    @XmlElement(required = true)
    protected Submitter submitter;
    @XmlElement(required = true)
    protected Changes changes;
    @XmlElement(required = true)
    protected Delete delete;

    /**
     * Gets the value of the diffs property.
     * 
     * @return
     *     possible object is
     *     {@link Diffs }
     *     
     */
    public Diffs getDiffs() {
        return diffs;
    }

    /**
     * Sets the value of the diffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diffs }
     *     
     */
    public void setDiffs(Diffs value) {
        this.diffs = value;
    }

    /**
     * Gets the value of the repository property.
     * 
     * @return
     *     possible object is
     *     {@link Repository }
     *     
     */
    public Repository getRepository() {
        return repository;
    }

    /**
     * Sets the value of the repository property.
     * 
     * @param value
     *     allowed object is
     *     {@link Repository }
     *     
     */
    public void setRepository(Repository value) {
        this.repository = value;
    }

    /**
     * Gets the value of the screenshots property.
     * 
     * @return
     *     possible object is
     *     {@link Screenshots }
     *     
     */
    public Screenshots getScreenshots() {
        return screenshots;
    }

    /**
     * Sets the value of the screenshots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Screenshots }
     *     
     */
    public void setScreenshots(Screenshots value) {
        this.screenshots = value;
    }

    /**
     * Gets the value of the self property.
     * 
     * @return
     *     possible object is
     *     {@link Self }
     *     
     */
    public Self getSelf() {
        return self;
    }

    /**
     * Sets the value of the self property.
     * 
     * @param value
     *     allowed object is
     *     {@link Self }
     *     
     */
    public void setSelf(Self value) {
        this.self = value;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link Update }
     *     
     */
    public Update getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link Update }
     *     
     */
    public void setUpdate(Update value) {
        this.update = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link LastUpdate }
     *     
     */
    public LastUpdate getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastUpdate }
     *     
     */
    public void setLastUpdate(LastUpdate value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the reviews property.
     * 
     * @return
     *     possible object is
     *     {@link Reviews }
     *     
     */
    public Reviews getReviews() {
        return reviews;
    }

    /**
     * Sets the value of the reviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reviews }
     *     
     */
    public void setReviews(Reviews value) {
        this.reviews = value;
    }

    /**
     * Gets the value of the draft property.
     * 
     * @return
     *     possible object is
     *     {@link Draft }
     *     
     */
    public Draft getDraft() {
        return draft;
    }

    /**
     * Sets the value of the draft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Draft }
     *     
     */
    public void setDraft(Draft value) {
        this.draft = value;
    }

    /**
     * Gets the value of the fileAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link FileAttachments }
     *     
     */
    public FileAttachments getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Sets the value of the fileAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileAttachments }
     *     
     */
    public void setFileAttachments(FileAttachments value) {
        this.fileAttachments = value;
    }

    /**
     * Gets the value of the submitter property.
     * 
     * @return
     *     possible object is
     *     {@link Submitter }
     *     
     */
    public Submitter getSubmitter() {
        return submitter;
    }

    /**
     * Sets the value of the submitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Submitter }
     *     
     */
    public void setSubmitter(Submitter value) {
        this.submitter = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     * @return
     *     possible object is
     *     {@link Changes }
     *     
     */
    public Changes getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Changes }
     *     
     */
    public void setChanges(Changes value) {
        this.changes = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Delete }
     *     
     */
    public Delete getDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delete }
     *     
     */
    public void setDelete(Delete value) {
        this.delete = value;
    }

}
