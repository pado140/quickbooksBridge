
package com.pado.quickbookbridge.pojos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strHCPResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strCompanyFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qbXMLCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qbXMLMajorVers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="qbXMLMinorVers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticket",
    "strHCPResponse",
    "strCompanyFileName",
    "qbXMLCountry",
    "qbXMLMajorVers",
    "qbXMLMinorVers"
})
@XmlRootElement(name = "sendRequestXML")
public class SendRequestXML {

    protected String ticket;
    protected String strHCPResponse;
    protected String strCompanyFileName;
    protected String qbXMLCountry;
    protected int qbXMLMajorVers;
    protected int qbXMLMinorVers;

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the strHCPResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrHCPResponse() {
        return strHCPResponse;
    }

    /**
     * Sets the value of the strHCPResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrHCPResponse(String value) {
        this.strHCPResponse = value;
    }

    /**
     * Gets the value of the strCompanyFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCompanyFileName() {
        return strCompanyFileName;
    }

    /**
     * Sets the value of the strCompanyFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCompanyFileName(String value) {
        this.strCompanyFileName = value;
    }

    /**
     * Gets the value of the qbXMLCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQbXMLCountry() {
        return qbXMLCountry;
    }

    /**
     * Sets the value of the qbXMLCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQbXMLCountry(String value) {
        this.qbXMLCountry = value;
    }

    /**
     * Gets the value of the qbXMLMajorVers property.
     * 
     */
    public int getQbXMLMajorVers() {
        return qbXMLMajorVers;
    }

    /**
     * Sets the value of the qbXMLMajorVers property.
     * 
     */
    public void setQbXMLMajorVers(int value) {
        this.qbXMLMajorVers = value;
    }

    /**
     * Gets the value of the qbXMLMinorVers property.
     * 
     */
    public int getQbXMLMinorVers() {
        return qbXMLMinorVers;
    }

    /**
     * Sets the value of the qbXMLMinorVers property.
     * 
     */
    public void setQbXMLMinorVers(int value) {
        this.qbXMLMinorVers = value;
    }

}
