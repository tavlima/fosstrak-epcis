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

public class SubscriptionControls  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.accada.epcis.soapapi.QuerySchedule schedule;

    private org.apache.axis.types.URI trigger;

    private java.util.Calendar initialRecordTime;

    private boolean reportIfEmpty;

    private org.accada.epcis.soapapi.SubscriptionControlsExtensionType extension;

    private org.apache.axis.message.MessageElement [] _any;

    public SubscriptionControls() {
    }

    public SubscriptionControls(
           org.accada.epcis.soapapi.QuerySchedule schedule,
           org.apache.axis.types.URI trigger,
           java.util.Calendar initialRecordTime,
           boolean reportIfEmpty,
           org.accada.epcis.soapapi.SubscriptionControlsExtensionType extension,
           org.apache.axis.message.MessageElement [] _any) {
           this.schedule = schedule;
           this.trigger = trigger;
           this.initialRecordTime = initialRecordTime;
           this.reportIfEmpty = reportIfEmpty;
           this.extension = extension;
           this._any = _any;
    }


    /**
     * Gets the schedule value for this SubscriptionControls.
     * 
     * @return schedule
     */
    public org.accada.epcis.soapapi.QuerySchedule getSchedule() {
        return schedule;
    }


    /**
     * Sets the schedule value for this SubscriptionControls.
     * 
     * @param schedule
     */
    public void setSchedule(org.accada.epcis.soapapi.QuerySchedule schedule) {
        this.schedule = schedule;
    }


    /**
     * Gets the trigger value for this SubscriptionControls.
     * 
     * @return trigger
     */
    public org.apache.axis.types.URI getTrigger() {
        return trigger;
    }


    /**
     * Sets the trigger value for this SubscriptionControls.
     * 
     * @param trigger
     */
    public void setTrigger(org.apache.axis.types.URI trigger) {
        this.trigger = trigger;
    }


    /**
     * Gets the initialRecordTime value for this SubscriptionControls.
     * 
     * @return initialRecordTime
     */
    public java.util.Calendar getInitialRecordTime() {
        return initialRecordTime;
    }


    /**
     * Sets the initialRecordTime value for this SubscriptionControls.
     * 
     * @param initialRecordTime
     */
    public void setInitialRecordTime(java.util.Calendar initialRecordTime) {
        this.initialRecordTime = initialRecordTime;
    }


    /**
     * Gets the reportIfEmpty value for this SubscriptionControls.
     * 
     * @return reportIfEmpty
     */
    public boolean isReportIfEmpty() {
        return reportIfEmpty;
    }


    /**
     * Sets the reportIfEmpty value for this SubscriptionControls.
     * 
     * @param reportIfEmpty
     */
    public void setReportIfEmpty(boolean reportIfEmpty) {
        this.reportIfEmpty = reportIfEmpty;
    }


    /**
     * Gets the extension value for this SubscriptionControls.
     * 
     * @return extension
     */
    public org.accada.epcis.soapapi.SubscriptionControlsExtensionType getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this SubscriptionControls.
     * 
     * @param extension
     */
    public void setExtension(org.accada.epcis.soapapi.SubscriptionControlsExtensionType extension) {
        this.extension = extension;
    }


    /**
     * Gets the _any value for this SubscriptionControls.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this SubscriptionControls.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriptionControls)) return false;
        SubscriptionControls other = (SubscriptionControls) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.schedule==null && other.getSchedule()==null) || 
             (this.schedule!=null &&
              this.schedule.equals(other.getSchedule()))) &&
            ((this.trigger==null && other.getTrigger()==null) || 
             (this.trigger!=null &&
              this.trigger.equals(other.getTrigger()))) &&
            ((this.initialRecordTime==null && other.getInitialRecordTime()==null) || 
             (this.initialRecordTime!=null &&
              this.initialRecordTime.equals(other.getInitialRecordTime()))) &&
            this.reportIfEmpty == other.isReportIfEmpty() &&
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
        int _hashCode = 1;
        if (getSchedule() != null) {
            _hashCode += getSchedule().hashCode();
        }
        if (getTrigger() != null) {
            _hashCode += getTrigger().hashCode();
        }
        if (getInitialRecordTime() != null) {
            _hashCode += getInitialRecordTime().hashCode();
        }
        _hashCode += (isReportIfEmpty() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        new org.apache.axis.description.TypeDesc(SubscriptionControls.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "SubscriptionControls"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "QuerySchedule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trigger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trigger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialRecordTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initialRecordTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportIfEmpty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportIfEmpty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "SubscriptionControlsExtensionType"));
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
