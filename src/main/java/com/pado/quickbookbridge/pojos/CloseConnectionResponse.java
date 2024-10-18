
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
 *         &lt;element name="closeConnectionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "closeConnectionResult"
})
@XmlRootElement(name = "closeConnectionResponse")
public class CloseConnectionResponse {

    protected String closeConnectionResult;

    /**
     * Gets the value of the closeConnectionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseConnectionResult() {
        return closeConnectionResult;
    }

    /**
     * Sets the value of the closeConnectionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseConnectionResult(String value) {
        this.closeConnectionResult = value;
    }

}
