//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.26 at 09:58:04 PM BRT 
//


package com.reviewboard.api.model.reviewrequests;

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
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}diffs"/>
 *           &lt;element ref="{}repository"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}self"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{}create"/>
 *             &lt;element ref="{}next"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{}update"/>
 *             &lt;element ref="{}last_update"/>
 *             &lt;element ref="{}reviews"/>
 *             &lt;element ref="{}draft"/>
 *             &lt;element ref="{}submitter"/>
 *             &lt;element ref="{}screenshots"/>
 *             &lt;element ref="{}delete"/>
 *           &lt;/sequence>
 *         &lt;/choice>
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
    "self",
    "create",
    "next",
    "update",
    "lastUpdate",
    "reviews",
    "draft",
    "submitter",
    "screenshots",
    "delete"
})
@XmlRootElement(name = "links")
public class Links {

    protected Diffs diffs;
    protected Repository repository;
    @XmlElement(required = true)
    protected Self self;
    protected Create create;
    protected Next next;
    protected Update update;
    @XmlElement(name = "last_update")
    protected LastUpdate lastUpdate;
    protected Reviews reviews;
    protected Draft draft;
    protected Submitter submitter;
    protected Screenshots screenshots;
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
     * Gets the value of the create property.
     * 
     * @return
     *     possible object is
     *     {@link Create }
     *     
     */
    public Create getCreate() {
        return create;
    }

    /**
     * Sets the value of the create property.
     * 
     * @param value
     *     allowed object is
     *     {@link Create }
     *     
     */
    public void setCreate(Create value) {
        this.create = value;
    }

    /**
     * Gets the value of the next property.
     * 
     * @return
     *     possible object is
     *     {@link Next }
     *     
     */
    public Next getNext() {
        return next;
    }

    /**
     * Sets the value of the next property.
     * 
     * @param value
     *     allowed object is
     *     {@link Next }
     *     
     */
    public void setNext(Next value) {
        this.next = value;
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
