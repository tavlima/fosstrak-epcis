package org.fosstrak.epcis.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * specific body that contains EPCIS related Events.
 * <p>
 * Java class for EPCISBodyType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EPCISBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventList" type="{urn:epcglobal:epcis:xsd:1}EventListType" minOccurs="0"/>
 *         &lt;element name="extension" type="{urn:epcglobal:epcis:xsd:1}EPCISBodyExtensionType" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EPCISBodyType", namespace = "urn:epcglobal:epcis:xsd:1", propOrder = { "eventList", "extension", "any" })
public class EPCISBodyType {

    @XmlElement(name = "EventList")
    protected EventListType eventList;
    protected EPCISBodyExtensionType extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the eventList property.
     * 
     * @return possible object is {@link EventListType }
     */
    public EventListType getEventList() {
        return eventList;
    }

    /**
     * Sets the value of the eventList property.
     * 
     * @param value
     *            allowed object is {@link EventListType }
     */
    public void setEventList(EventListType value) {
        this.eventList = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return possible object is {@link EPCISBodyExtensionType }
     */
    public EPCISBodyExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *            allowed object is {@link EPCISBodyExtensionType }
     */
    public void setExtension(EPCISBodyExtensionType value) {
        this.extension = value;
    }

    /**
     * Gets the value of the any property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the any property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Element }
     * {@link Object }
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed
     * property on this class.
     * <p>
     * the map is keyed by the name of the attribute and the value is the string
     * value of the attribute. the map returned by this method is live, and you
     * can add new attribute by updating the map directly. Because of this
     * design, there's no setter.
     * 
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
