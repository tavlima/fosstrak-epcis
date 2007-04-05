/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Accada (www.accada.org).
 *
 * Accada is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Accada is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Accada; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.accada.epcis.soapapi;


/**
 * Quantity Event captures an event that takes place with respect
 * to a specified quantity of
 * 			object class.
 */
public class QuantityEventType  extends org.accada.epcis.soapapi.EPCISEventType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.apache.axis.types.URI epcClass;

    private int quantity;

    private org.apache.axis.types.URI bizStep;

    private org.apache.axis.types.URI disposition;

    private org.accada.epcis.soapapi.ReadPointType readPoint;

    private org.accada.epcis.soapapi.BusinessLocationType bizLocation;

    private org.accada.epcis.soapapi.BusinessTransactionType[] bizTransactionList;

    private org.accada.epcis.soapapi.QuantityEventExtensionType extension;

    private org.apache.axis.message.MessageElement [] _any;

    public QuantityEventType() {
    }

    public QuantityEventType(
           java.util.Calendar eventTime,
           java.util.Calendar recordTime,
           java.lang.String eventTimeZoneOffset,
           org.accada.epcis.soapapi.EPCISEventExtensionType baseExtension,
           org.apache.axis.types.URI epcClass,
           int quantity,
           org.apache.axis.types.URI bizStep,
           org.apache.axis.types.URI disposition,
           org.accada.epcis.soapapi.ReadPointType readPoint,
           org.accada.epcis.soapapi.BusinessLocationType bizLocation,
           org.accada.epcis.soapapi.BusinessTransactionType[] bizTransactionList,
           org.accada.epcis.soapapi.QuantityEventExtensionType extension,
           org.apache.axis.message.MessageElement [] _any) {
        super(
            eventTime,
            recordTime,
            eventTimeZoneOffset,
            baseExtension);
        this.epcClass = epcClass;
        this.quantity = quantity;
        this.bizStep = bizStep;
        this.disposition = disposition;
        this.readPoint = readPoint;
        this.bizLocation = bizLocation;
        this.bizTransactionList = bizTransactionList;
        this.extension = extension;
        this._any = _any;
    }


    /**
     * Gets the epcClass value for this QuantityEventType.
     * 
     * @return epcClass
     */
    public org.apache.axis.types.URI getEpcClass() {
        return epcClass;
    }


    /**
     * Sets the epcClass value for this QuantityEventType.
     * 
     * @param epcClass
     */
    public void setEpcClass(org.apache.axis.types.URI epcClass) {
        this.epcClass = epcClass;
    }


    /**
     * Gets the quantity value for this QuantityEventType.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this QuantityEventType.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the bizStep value for this QuantityEventType.
     * 
     * @return bizStep
     */
    public org.apache.axis.types.URI getBizStep() {
        return bizStep;
    }


    /**
     * Sets the bizStep value for this QuantityEventType.
     * 
     * @param bizStep
     */
    public void setBizStep(org.apache.axis.types.URI bizStep) {
        this.bizStep = bizStep;
    }


    /**
     * Gets the disposition value for this QuantityEventType.
     * 
     * @return disposition
     */
    public org.apache.axis.types.URI getDisposition() {
        return disposition;
    }


    /**
     * Sets the disposition value for this QuantityEventType.
     * 
     * @param disposition
     */
    public void setDisposition(org.apache.axis.types.URI disposition) {
        this.disposition = disposition;
    }


    /**
     * Gets the readPoint value for this QuantityEventType.
     * 
     * @return readPoint
     */
    public org.accada.epcis.soapapi.ReadPointType getReadPoint() {
        return readPoint;
    }


    /**
     * Sets the readPoint value for this QuantityEventType.
     * 
     * @param readPoint
     */
    public void setReadPoint(org.accada.epcis.soapapi.ReadPointType readPoint) {
        this.readPoint = readPoint;
    }


    /**
     * Gets the bizLocation value for this QuantityEventType.
     * 
     * @return bizLocation
     */
    public org.accada.epcis.soapapi.BusinessLocationType getBizLocation() {
        return bizLocation;
    }


    /**
     * Sets the bizLocation value for this QuantityEventType.
     * 
     * @param bizLocation
     */
    public void setBizLocation(org.accada.epcis.soapapi.BusinessLocationType bizLocation) {
        this.bizLocation = bizLocation;
    }


    /**
     * Gets the bizTransactionList value for this QuantityEventType.
     * 
     * @return bizTransactionList
     */
    public org.accada.epcis.soapapi.BusinessTransactionType[] getBizTransactionList() {
        return bizTransactionList;
    }


    /**
     * Sets the bizTransactionList value for this QuantityEventType.
     * 
     * @param bizTransactionList
     */
    public void setBizTransactionList(org.accada.epcis.soapapi.BusinessTransactionType[] bizTransactionList) {
        this.bizTransactionList = bizTransactionList;
    }


    /**
     * Gets the extension value for this QuantityEventType.
     * 
     * @return extension
     */
    public org.accada.epcis.soapapi.QuantityEventExtensionType getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this QuantityEventType.
     * 
     * @param extension
     */
    public void setExtension(org.accada.epcis.soapapi.QuantityEventExtensionType extension) {
        this.extension = extension;
    }


    /**
     * Gets the _any value for this QuantityEventType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this QuantityEventType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuantityEventType)) return false;
        QuantityEventType other = (QuantityEventType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.epcClass==null && other.getEpcClass()==null) || 
             (this.epcClass!=null &&
              this.epcClass.equals(other.getEpcClass()))) &&
            this.quantity == other.getQuantity() &&
            ((this.bizStep==null && other.getBizStep()==null) || 
             (this.bizStep!=null &&
              this.bizStep.equals(other.getBizStep()))) &&
            ((this.disposition==null && other.getDisposition()==null) || 
             (this.disposition!=null &&
              this.disposition.equals(other.getDisposition()))) &&
            ((this.readPoint==null && other.getReadPoint()==null) || 
             (this.readPoint!=null &&
              this.readPoint.equals(other.getReadPoint()))) &&
            ((this.bizLocation==null && other.getBizLocation()==null) || 
             (this.bizLocation!=null &&
              this.bizLocation.equals(other.getBizLocation()))) &&
            ((this.bizTransactionList==null && other.getBizTransactionList()==null) || 
             (this.bizTransactionList!=null &&
              java.util.Arrays.equals(this.bizTransactionList, other.getBizTransactionList()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEpcClass() != null) {
            _hashCode += getEpcClass().hashCode();
        }
        _hashCode += getQuantity();
        if (getBizStep() != null) {
            _hashCode += getBizStep().hashCode();
        }
        if (getDisposition() != null) {
            _hashCode += getDisposition().hashCode();
        }
        if (getReadPoint() != null) {
            _hashCode += getReadPoint().hashCode();
        }
        if (getBizLocation() != null) {
            _hashCode += getBizLocation().hashCode();
        }
        if (getBizTransactionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBizTransactionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBizTransactionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuantityEventType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis:xsd:1", "QuantityEventType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("epcClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "epcClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bizStep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bizStep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disposition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disposition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis:xsd:1", "ReadPointType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bizLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bizLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis:xsd:1", "BusinessLocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bizTransactionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bizTransactionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis:xsd:1", "BusinessTransactionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "bizTransaction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis:xsd:1", "QuantityEventExtensionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
