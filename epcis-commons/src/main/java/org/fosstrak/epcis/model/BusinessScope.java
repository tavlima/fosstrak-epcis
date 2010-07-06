package org.fosstrak.epcis.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for BusinessScope complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessScope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Scope" type="{http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader}Scope" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessScope", namespace = "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader", propOrder = { "scope" })
public class BusinessScope {

    @XmlElement(name = "Scope", namespace = "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader")
    protected List<Scope> scope;

    /**
     * Gets the value of the scope property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the scope property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getScope().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Scope }
     */
    public List<Scope> getScope() {
        if (scope == null) {
            scope = new ArrayList<Scope>();
        }
        return this.scope;
    }

}
