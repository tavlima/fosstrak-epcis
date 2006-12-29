/**
 * TransactionEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.accada.epcis.soapapi;


/**
 * Transaction Event describes the association or disassociation of
 * physical objects to one or more business
 * 			transactions.
 */
public class TransactionEventType  extends org.accada.epcis.soapapi.EPCISEventType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.accada.epcis.soapapi.BusinessTransactionType[] bizTransactionList;

    private org.apache.axis.types.URI parentID;

    private org.accada.epcis.soapapi.EPC[] epcList;

    private org.accada.epcis.soapapi.ActionType action;

    private org.apache.axis.types.URI bizStep;

    private org.apache.axis.types.URI disposition;

    private org.accada.epcis.soapapi.ReadPointType readPoint;

    private org.accada.epcis.soapapi.BusinessLocationType bizLocation;

    private org.accada.epcis.soapapi.TransactionEventExtensionType extension;

    private org.apache.axis.message.MessageElement [] _any;

    public TransactionEventType() {
    }

    public TransactionEventType(
           java.util.Calendar eventTime,
           java.util.Calendar recordTime,
           java.lang.String eventTimeZoneOffset,
           org.accada.epcis.soapapi.EPCISEventExtensionType baseExtension,
           org.accada.epcis.soapapi.BusinessTransactionType[] bizTransactionList,
           org.apache.axis.types.URI parentID,
           org.accada.epcis.soapapi.EPC[] epcList,
           org.accada.epcis.soapapi.ActionType action,
           org.apache.axis.types.URI bizStep,
           org.apache.axis.types.URI disposition,
           org.accada.epcis.soapapi.ReadPointType readPoint,
           org.accada.epcis.soapapi.BusinessLocationType bizLocation,
           org.accada.epcis.soapapi.TransactionEventExtensionType extension,
           org.apache.axis.message.MessageElement [] _any) {
        super(
            eventTime,
            recordTime,
            eventTimeZoneOffset,
            baseExtension);
        this.bizTransactionList = bizTransactionList;
        this.parentID = parentID;
        this.epcList = epcList;
        this.action = action;
        this.bizStep = bizStep;
        this.disposition = disposition;
        this.readPoint = readPoint;
        this.bizLocation = bizLocation;
        this.extension = extension;
        this._any = _any;
    }


    /**
     * Gets the bizTransactionList value for this TransactionEventType.
     * 
     * @return bizTransactionList
     */
    public org.accada.epcis.soapapi.BusinessTransactionType[] getBizTransactionList() {
        return bizTransactionList;
    }


    /**
     * Sets the bizTransactionList value for this TransactionEventType.
     * 
     * @param bizTransactionList
     */
    public void setBizTransactionList(org.accada.epcis.soapapi.BusinessTransactionType[] bizTransactionList) {
        this.bizTransactionList = bizTransactionList;
    }


    /**
     * Gets the parentID value for this TransactionEventType.
     * 
     * @return parentID
     */
    public org.apache.axis.types.URI getParentID() {
        return parentID;
    }


    /**
     * Sets the parentID value for this TransactionEventType.
     * 
     * @param parentID
     */
    public void setParentID(org.apache.axis.types.URI parentID) {
        this.parentID = parentID;
    }


    /**
     * Gets the epcList value for this TransactionEventType.
     * 
     * @return epcList
     */
    public org.accada.epcis.soapapi.EPC[] getEpcList() {
        return epcList;
    }


    /**
     * Sets the epcList value for this TransactionEventType.
     * 
     * @param epcList
     */
    public void setEpcList(org.accada.epcis.soapapi.EPC[] epcList) {
        this.epcList = epcList;
    }


    /**
     * Gets the action value for this TransactionEventType.
     * 
     * @return action
     */
    public org.accada.epcis.soapapi.ActionType getAction() {
        return action;
    }


    /**
     * Sets the action value for this TransactionEventType.
     * 
     * @param action
     */
    public void setAction(org.accada.epcis.soapapi.ActionType action) {
        this.action = action;
    }


    /**
     * Gets the bizStep value for this TransactionEventType.
     * 
     * @return bizStep
     */
    public org.apache.axis.types.URI getBizStep() {
        return bizStep;
    }


    /**
     * Sets the bizStep value for this TransactionEventType.
     * 
     * @param bizStep
     */
    public void setBizStep(org.apache.axis.types.URI bizStep) {
        this.bizStep = bizStep;
    }


    /**
     * Gets the disposition value for this TransactionEventType.
     * 
     * @return disposition
     */
    public org.apache.axis.types.URI getDisposition() {
        return disposition;
    }


    /**
     * Sets the disposition value for this TransactionEventType.
     * 
     * @param disposition
     */
    public void setDisposition(org.apache.axis.types.URI disposition) {
        this.disposition = disposition;
    }


    /**
     * Gets the readPoint value for this TransactionEventType.
     * 
     * @return readPoint
     */
    public org.accada.epcis.soapapi.ReadPointType getReadPoint() {
        return readPoint;
    }


    /**
     * Sets the readPoint value for this TransactionEventType.
     * 
     * @param readPoint
     */
    public void setReadPoint(org.accada.epcis.soapapi.ReadPointType readPoint) {
        this.readPoint = readPoint;
    }


    /**
     * Gets the bizLocation value for this TransactionEventType.
     * 
     * @return bizLocation
     */
    public org.accada.epcis.soapapi.BusinessLocationType getBizLocation() {
        return bizLocation;
    }


    /**
     * Sets the bizLocation value for this TransactionEventType.
     * 
     * @param bizLocation
     */
    public void setBizLocation(org.accada.epcis.soapapi.BusinessLocationType bizLocation) {
        this.bizLocation = bizLocation;
    }


    /**
     * Gets the extension value for this TransactionEventType.
     * 
     * @return extension
     */
    public org.accada.epcis.soapapi.TransactionEventExtensionType getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this TransactionEventType.
     * 
     * @param extension
     */
    public void setExtension(org.accada.epcis.soapapi.TransactionEventExtensionType extension) {
        this.extension = extension;
    }


    /**
     * Gets the _any value for this TransactionEventType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this TransactionEventType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionEventType)) return false;
        TransactionEventType other = (TransactionEventType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bizTransactionList==null && other.getBizTransactionList()==null) || 
             (this.bizTransactionList!=null &&
              java.util.Arrays.equals(this.bizTransactionList, other.getBizTransactionList()))) &&
            ((this.parentID==null && other.getParentID()==null) || 
             (this.parentID!=null &&
              this.parentID.equals(other.getParentID()))) &&
            ((this.epcList==null && other.getEpcList()==null) || 
             (this.epcList!=null &&
              java.util.Arrays.equals(this.epcList, other.getEpcList()))) &&
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
        if (getParentID() != null) {
            _hashCode += getParentID().hashCode();
        }
        if (getEpcList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEpcList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEpcList(), i);
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
        new org.apache.axis.description.TypeDesc(TransactionEventType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis:xsd:1", "TransactionEventType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bizTransactionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bizTransactionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis:xsd:1", "BusinessTransactionType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "bizTransaction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("epcList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "epcList"));
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
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis:xsd:1", "TransactionEventExtensionType"));
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
