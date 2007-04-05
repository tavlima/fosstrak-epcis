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
 * Aggregation Event captures an event that applies to objects that
 * 			have a physical association with one another.
 */
public class AggregationEventType  extends org.accada.epcis.soapapi.EPCISEventType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.apache.axis.types.URI parentID;

    private org.accada.epcis.soapapi.EPC[] childEPCs;

    private org.accada.epcis.soapapi.ActionType action;

    private org.apache.axis.types.URI bizStep;

    private org.apache.axis.types.URI disposition;

    private org.accada.epcis.soapapi.ReadPointType readPoint;

    private org.accada.epcis.soapapi.BusinessLocationType bizLocation;

    private org.accada.epcis.soapapi.BusinessTransactionType[] bizTransactionList;

    private org.accada.epcis.soapapi.AggregationEventExtensionType extension;

    private org.apache.axis.message.MessageElement [] _any;

    public AggregationEventType() {
    }

    public AggregationEventType(
           java.util.Calendar eventTime,
           java.util.Calendar recordTime,
           java.lang.String eventTimeZoneOffset,
           org.accada.epcis.soapapi.EPCISEventExtensionType baseExtension,
           org.apache.axis.types.URI parentID,
           org.accada.epcis.soapapi.EPC[] childEPCs,
           org.accada.epcis.soapapi.ActionType action,
           org.apache.axis.types.URI bizStep,
           org.apache.axis.types.URI disposition,
           org.accada.epcis.soapapi.ReadPointType readPoint,
           org.accada.epcis.soapapi.BusinessLocationType bizLocation,
           org.accada.epcis.soapapi.BusinessTransactionType[] bizTransactionList,
           org.accada.epcis.soapapi.AggregationEventExtensionType extension,
           org.apache.axis.message.MessageElement [] _any) {
        super(
            eventTime,
            recordTime,
            eventTimeZoneOffset,
            baseExtension);
        this.parentID = parentID;
        this.childEPCs = childEPCs;
        this.action = action;
        this.bizStep = bizStep;
        this.disposition = disposition;
        this.readPoint = readPoint;
        this.bizLocation = bizLocation;
        this.bizTransactionList = bizTransactionList;
        this.extension = extension;
        this._any = _any;
    }


    /**
     * Gets the parentID value for this AggregationEventType.
     * 
     * @return parentID
     */
    public org.apache.axis.types.URI getParentID() {
        return parentID;
    }


    /**
     * Sets the parentID value for this AggregationEventType.
     * 
     * @param parentID
     */
    public void setParentID(org.apache.axis.types.URI parentID) {
        this.parentID = parentID;
    }


    /**
     * Gets the childEPCs value for this AggregationEventType.
     * 
     * @return childEPCs
     */
    public org.accada.epcis.soapapi.EPC[] getChildEPCs() {
        return childEPCs;
    }


    /**
     * Sets the childEPCs value for this AggregationEventType.
     * 
     * @param childEPCs
     */
    public void setChildEPCs(org.accada.epcis.soapapi.EPC[] childEPCs) {
        this.childEPCs = childEPCs;
    }


    /**
     * Gets the action value for this AggregationEventType.
     * 
     * @return action
     */
    public org.accada.epcis.soapapi.ActionType getAction() {
        return action;
    }


    /**
     * Sets the action value for this AggregationEventType.
     * 
     * @param action
     */
    public void setAction(org.accada.epcis.soapapi.ActionType action) {
        this.action = action;
    }


    /**
     * Gets the bizStep value for this AggregationEventType.
     * 
     * @return bizStep
     */
    public org.apache.axis.types.URI getBizStep() {
        return bizStep;
    }


    /**
     * Sets the bizStep value for this AggregationEventType.
     * 
     * @param bizStep
     */
    public void setBizStep(org.apache.axis.types.URI bizStep) {
        this.bizStep = bizStep;
    }


    /**
     * Gets the disposition value for this AggregationEventType.
     * 
     * @return disposition
     */
    public org.apache.axis.types.URI getDisposition() {
        return disposition;
    }


    /**
     * Sets the disposition value for this AggregationEventType.
     * 
     * @param disposition
     */
    public void setDisposition(org.apache.axis.types.URI disposition) {
        this.disposition = disposition;
    }


    /**
     * Gets the readPoint value for this AggregationEventType.
     * 
     * @return readPoint
     */
    public org.accada.epcis.soapapi.ReadPointType getReadPoint() {
        return readPoint;
    }


    /**
     * Sets the readPoint value for this AggregationEventType.
     * 
     * @param readPoint
     */
    public void setReadPoint(org.accada.epcis.soapapi.ReadPointType readPoint) {
        this.readPoint = readPoint;
    }


    /**
     * Gets the bizLocation value for this AggregationEventType.
     * 
     * @return bizLocation
     */
    public org.accada.epcis.soapapi.BusinessLocationType getBizLocation() {
        return bizLocation;
    }


    /**
     * Sets the bizLocation value for this AggregationEventType.
     * 
     * @param bizLocation
     */
    public void setBizLocation(org.accada.epcis.soapapi.BusinessLocationType bizLocation) {
        this.bizLocation = bizLocation;
    }


    /**
     * Gets the bizTransactionList value for this AggregationEventType.
     * 
     * @return bizTransactionList
     */
    public org.accada.epcis.soapapi.BusinessTransactionType[] getBizTransactionList() {
        return bizTransactionList;
    }


    /**
     * Sets the bizTransactionList value for this AggregationEventType.
     * 
     * @param bizTransactionList
     */
    public void setBizTransactionList(org.accada.epcis.soapapi.BusinessTransactionType[] bizTransactionList) {
        this.bizTransactionList = bizTransactionList;
    }


    /**
     * Gets the extension value for this AggregationEventType.
     * 
     * @return extension
     */
    public org.accada.epcis.soapapi.AggregationEventExtensionType getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this AggregationEventType.
     * 
     * @param extension
     */
    public void setExtension(org.accada.epcis.soapapi.AggregationEventExtensionType extension) {
        this.extension = extension;
    }


    /**
     * Gets the _any value for this AggregationEventType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AggregationEventType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AggregationEventType)) return false;
        AggregationEventType other = (AggregationEventType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parentID==null && other.getParentID()==null) || 
             (this.parentID!=null &&
              this.parentID.equals(other.getParentID()))) &&
            ((this.childEPCs==null && other.getChildEPCs()==null) || 
             (this.childEPCs!=null &&
              java.util.Arrays.equals(this.childEPCs, other.getChildEPCs()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
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
        if (getParentID() != null) {
            _hashCode += getParentID().hashCode();
        }
        if (getChildEPCs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildEPCs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildEPCs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(AggregationEventType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis:xsd:1", "AggregationEventType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childEPCs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "childEPCs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:xsd:1", "EPC"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "epc"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis:xsd:1", "ActionType"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis:xsd:1", "AggregationEventExtensionType"));
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
