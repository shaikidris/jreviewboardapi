//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.26 at 08:02:07 PM BRT 
//


package com.reviewboard.api.model.diffcomment;

import java.math.BigInteger;
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
 *         &lt;element ref="{}interfilediff"/>
 *         &lt;element ref="{}num_lines"/>
 *         &lt;element ref="{}links"/>
 *         &lt;element ref="{}timestamp"/>
 *         &lt;element ref="{}id"/>
 *         &lt;element ref="{}text"/>
 *         &lt;element ref="{}first_line"/>
 *         &lt;element ref="{}public"/>
 *         &lt;element ref="{}issue_status"/>
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
    "interfilediff",
    "numLines",
    "links",
    "timestamp",
    "id",
    "text",
    "firstLine",
    "_public",
    "issueStatus"
})
@XmlRootElement(name = "item")
public class Item {

    @XmlElement(required = true)
    protected Interfilediff interfilediff;
    @XmlElement(name = "num_lines", required = true)
    protected BigInteger numLines;
    @XmlElement(required = true)
    protected Links links;
    @XmlElement(required = true)
    protected String timestamp;
    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected String text;
    @XmlElement(name = "first_line", required = true)
    protected BigInteger firstLine;
    @XmlElement(name = "public", required = true)
    protected BigInteger _public;
    
    @XmlElement(name = "issue_status", required = true)
	private String issueStatus;
   

    /**
     * Gets the value of the interfilediff property.
     * 
     * @return
     *     possible object is
     *     {@link Interfilediff }
     *     
     */
    public Interfilediff getInterfilediff() {
        return interfilediff;
    }

    /**
     * Sets the value of the interfilediff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interfilediff }
     *     
     */
    public void setInterfilediff(Interfilediff value) {
        this.interfilediff = value;
    }

    /**
     * Gets the value of the numLines property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumLines() {
        return numLines;
    }

    /**
     * Sets the value of the numLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumLines(BigInteger value) {
        this.numLines = value;
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
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
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
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the firstLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstLine() {
        return firstLine;
    }

    /**
     * Sets the value of the firstLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstLine(BigInteger value) {
        this.firstLine = value;
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

	public String getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}

}
