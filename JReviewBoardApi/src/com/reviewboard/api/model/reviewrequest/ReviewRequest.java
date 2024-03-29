//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.26 at 10:05:51 PM BRT 
//


package com.reviewboard.api.model.reviewrequest;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}status"/>
 *         &lt;element ref="{}last_updated"/>
 *         &lt;element ref="{}description"/>
 *         &lt;element ref="{}links"/>
 *         &lt;element ref="{}target_groups"/>
 *         &lt;element ref="{}bugs_closed"/>
 *         &lt;element ref="{}changenum"/>
 *         &lt;element ref="{}target_people"/>
 *         &lt;element ref="{}testing_done"/>
 *         &lt;element ref="{}branch"/>
 *         &lt;element ref="{}id"/>
 *         &lt;element ref="{}time_added"/>
 *         &lt;element ref="{}summary"/>
 *         &lt;element ref="{}public"/>
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
    "status",
    "lastUpdated",
    "description",
    "links",
    "targetGroups",
    "bugsClosed",
    "changenum",
    "targetPeople",
    "testingDone",
    "branch",
    "id",
    "timeAdded",
    "summary",
    "_public"
})
@XmlRootElement(name = "review_request")
public class ReviewRequest {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String status;
    @XmlElement(name = "last_updated", required = true)
    protected String lastUpdated;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected Links links;
    @XmlElement(name = "target_groups", required = true)
    protected Array targetGroups;
    @XmlElement(name = "bugs_closed", required = true)
    protected Array bugsClosed;
    @XmlElement(required = true)
    protected Changenum changenum;
    @XmlElement(name = "target_people", required = true)
    protected Array targetPeople;
    @XmlElement(name = "testing_done", required = true)
    protected TestingDone testingDone;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String branch;
    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(name = "time_added", required = true)
    protected String timeAdded;
    @XmlElement(required = true)
    protected String summary;
    @XmlElement(name = "public", required = true)
    protected BigInteger _public;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdated(String value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * Gets the value of the targetGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Array }
     *     
     */
    public Array getTargetGroups() {
        return targetGroups;
    }

    /**
     * Sets the value of the targetGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Array }
     *     
     */
    public void setTargetGroups(Array value) {
        this.targetGroups = value;
    }

    /**
     * Gets the value of the bugsClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Array }
     *     
     */
    public Array getBugsClosed() {
        return bugsClosed;
    }

    /**
     * Sets the value of the bugsClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Array }
     *     
     */
    public void setBugsClosed(Array value) {
        this.bugsClosed = value;
    }

    /**
     * Gets the value of the changenum property.
     * 
     * @return
     *     possible object is
     *     {@link Changenum }
     *     
     */
    public Changenum getChangenum() {
        return changenum;
    }

    /**
     * Sets the value of the changenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Changenum }
     *     
     */
    public void setChangenum(Changenum value) {
        this.changenum = value;
    }

    /**
     * Gets the value of the targetPeople property.
     * 
     * @return
     *     possible object is
     *     {@link Array }
     *     
     */
    public Array getTargetPeople() {
        return targetPeople;
    }

    /**
     * Sets the value of the targetPeople property.
     * 
     * @param value
     *     allowed object is
     *     {@link Array }
     *     
     */
    public void setTargetPeople(Array value) {
        this.targetPeople = value;
    }

    /**
     * Gets the value of the testingDone property.
     * 
     * @return
     *     possible object is
     *     {@link TestingDone }
     *     
     */
    public TestingDone getTestingDone() {
        return testingDone;
    }

    /**
     * Sets the value of the testingDone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestingDone }
     *     
     */
    public void setTestingDone(TestingDone value) {
        this.testingDone = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the timeAdded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeAdded() {
        return timeAdded;
    }

    /**
     * Sets the value of the timeAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeAdded(String value) {
        this.timeAdded = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the public property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPublic() {
        return _public;
    }

    /**
     * Sets the value of the public property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPublic(BigInteger value) {
        this._public = value;
    }

}
