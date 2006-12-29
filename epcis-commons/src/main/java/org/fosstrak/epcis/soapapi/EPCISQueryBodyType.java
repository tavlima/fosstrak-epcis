/**
 * EPCISQueryBodyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.accada.epcis.soapapi;

public class EPCISQueryBodyType  implements java.io.Serializable {
    private org.accada.epcis.soapapi.EmptyParms getQueryNames;

    private org.accada.epcis.soapapi.ArrayOfString getQueryNamesResult;

    private org.accada.epcis.soapapi.Subscribe subscribe;

    private org.accada.epcis.soapapi.VoidHolder subscribeResult;

    private org.accada.epcis.soapapi.Unsubscribe unsubscribe;

    private org.accada.epcis.soapapi.VoidHolder unsubscribeResult;

    private org.accada.epcis.soapapi.GetSubscriptionIDs getSubscriptionIDs;

    private org.accada.epcis.soapapi.ArrayOfString getSubscriptionIDsResult;

    private org.accada.epcis.soapapi.Poll poll;

    private org.accada.epcis.soapapi.EmptyParms getStandardVersion;

    private java.lang.String getStandardVersionResult;

    private org.accada.epcis.soapapi.EmptyParms getVendorVersion;

    private java.lang.String getVendorVersionResult;

    private org.accada.epcis.soapapi.DuplicateNameException duplicateNameException;

    private org.accada.epcis.soapapi.InvalidURIException invalidURIException;

    private org.accada.epcis.soapapi.NoSuchNameException noSuchNameException;

    private org.accada.epcis.soapapi.NoSuchSubscriptionException noSuchSubscriptionException;

    private org.accada.epcis.soapapi.DuplicateSubscriptionException duplicateSubscriptionException;

    private org.accada.epcis.soapapi.QueryParameterException queryParameterException;

    private org.accada.epcis.soapapi.QueryTooLargeException queryTooLargeException;

    private org.accada.epcis.soapapi.QueryTooComplexException queryTooComplexException;

    private org.accada.epcis.soapapi.SubscriptionControlsException subscriptionControlsException;

    private org.accada.epcis.soapapi.SubscribeNotPermittedException subscribeNotPermittedException;

    private org.accada.epcis.soapapi.SecurityException securityException;

    private org.accada.epcis.soapapi.ValidationException validationException;

    private org.accada.epcis.soapapi.ImplementationException implementationException;

    private org.accada.epcis.soapapi.QueryResults queryResults;

    public EPCISQueryBodyType() {
    }

    public EPCISQueryBodyType(
           org.accada.epcis.soapapi.EmptyParms getQueryNames,
           org.accada.epcis.soapapi.ArrayOfString getQueryNamesResult,
           org.accada.epcis.soapapi.Subscribe subscribe,
           org.accada.epcis.soapapi.VoidHolder subscribeResult,
           org.accada.epcis.soapapi.Unsubscribe unsubscribe,
           org.accada.epcis.soapapi.VoidHolder unsubscribeResult,
           org.accada.epcis.soapapi.GetSubscriptionIDs getSubscriptionIDs,
           org.accada.epcis.soapapi.ArrayOfString getSubscriptionIDsResult,
           org.accada.epcis.soapapi.Poll poll,
           org.accada.epcis.soapapi.EmptyParms getStandardVersion,
           java.lang.String getStandardVersionResult,
           org.accada.epcis.soapapi.EmptyParms getVendorVersion,
           java.lang.String getVendorVersionResult,
           org.accada.epcis.soapapi.DuplicateNameException duplicateNameException,
           org.accada.epcis.soapapi.InvalidURIException invalidURIException,
           org.accada.epcis.soapapi.NoSuchNameException noSuchNameException,
           org.accada.epcis.soapapi.NoSuchSubscriptionException noSuchSubscriptionException,
           org.accada.epcis.soapapi.DuplicateSubscriptionException duplicateSubscriptionException,
           org.accada.epcis.soapapi.QueryParameterException queryParameterException,
           org.accada.epcis.soapapi.QueryTooLargeException queryTooLargeException,
           org.accada.epcis.soapapi.QueryTooComplexException queryTooComplexException,
           org.accada.epcis.soapapi.SubscriptionControlsException subscriptionControlsException,
           org.accada.epcis.soapapi.SubscribeNotPermittedException subscribeNotPermittedException,
           org.accada.epcis.soapapi.SecurityException securityException,
           org.accada.epcis.soapapi.ValidationException validationException,
           org.accada.epcis.soapapi.ImplementationException implementationException,
           org.accada.epcis.soapapi.QueryResults queryResults) {
           this.getQueryNames = getQueryNames;
           this.getQueryNamesResult = getQueryNamesResult;
           this.subscribe = subscribe;
           this.subscribeResult = subscribeResult;
           this.unsubscribe = unsubscribe;
           this.unsubscribeResult = unsubscribeResult;
           this.getSubscriptionIDs = getSubscriptionIDs;
           this.getSubscriptionIDsResult = getSubscriptionIDsResult;
           this.poll = poll;
           this.getStandardVersion = getStandardVersion;
           this.getStandardVersionResult = getStandardVersionResult;
           this.getVendorVersion = getVendorVersion;
           this.getVendorVersionResult = getVendorVersionResult;
           this.duplicateNameException = duplicateNameException;
           this.invalidURIException = invalidURIException;
           this.noSuchNameException = noSuchNameException;
           this.noSuchSubscriptionException = noSuchSubscriptionException;
           this.duplicateSubscriptionException = duplicateSubscriptionException;
           this.queryParameterException = queryParameterException;
           this.queryTooLargeException = queryTooLargeException;
           this.queryTooComplexException = queryTooComplexException;
           this.subscriptionControlsException = subscriptionControlsException;
           this.subscribeNotPermittedException = subscribeNotPermittedException;
           this.securityException = securityException;
           this.validationException = validationException;
           this.implementationException = implementationException;
           this.queryResults = queryResults;
    }


    /**
     * Gets the getQueryNames value for this EPCISQueryBodyType.
     * 
     * @return getQueryNames
     */
    public org.accada.epcis.soapapi.EmptyParms getGetQueryNames() {
        return getQueryNames;
    }


    /**
     * Sets the getQueryNames value for this EPCISQueryBodyType.
     * 
     * @param getQueryNames
     */
    public void setGetQueryNames(org.accada.epcis.soapapi.EmptyParms getQueryNames) {
        this.getQueryNames = getQueryNames;
    }


    /**
     * Gets the getQueryNamesResult value for this EPCISQueryBodyType.
     * 
     * @return getQueryNamesResult
     */
    public org.accada.epcis.soapapi.ArrayOfString getGetQueryNamesResult() {
        return getQueryNamesResult;
    }


    /**
     * Sets the getQueryNamesResult value for this EPCISQueryBodyType.
     * 
     * @param getQueryNamesResult
     */
    public void setGetQueryNamesResult(org.accada.epcis.soapapi.ArrayOfString getQueryNamesResult) {
        this.getQueryNamesResult = getQueryNamesResult;
    }


    /**
     * Gets the subscribe value for this EPCISQueryBodyType.
     * 
     * @return subscribe
     */
    public org.accada.epcis.soapapi.Subscribe getSubscribe() {
        return subscribe;
    }


    /**
     * Sets the subscribe value for this EPCISQueryBodyType.
     * 
     * @param subscribe
     */
    public void setSubscribe(org.accada.epcis.soapapi.Subscribe subscribe) {
        this.subscribe = subscribe;
    }


    /**
     * Gets the subscribeResult value for this EPCISQueryBodyType.
     * 
     * @return subscribeResult
     */
    public org.accada.epcis.soapapi.VoidHolder getSubscribeResult() {
        return subscribeResult;
    }


    /**
     * Sets the subscribeResult value for this EPCISQueryBodyType.
     * 
     * @param subscribeResult
     */
    public void setSubscribeResult(org.accada.epcis.soapapi.VoidHolder subscribeResult) {
        this.subscribeResult = subscribeResult;
    }


    /**
     * Gets the unsubscribe value for this EPCISQueryBodyType.
     * 
     * @return unsubscribe
     */
    public org.accada.epcis.soapapi.Unsubscribe getUnsubscribe() {
        return unsubscribe;
    }


    /**
     * Sets the unsubscribe value for this EPCISQueryBodyType.
     * 
     * @param unsubscribe
     */
    public void setUnsubscribe(org.accada.epcis.soapapi.Unsubscribe unsubscribe) {
        this.unsubscribe = unsubscribe;
    }


    /**
     * Gets the unsubscribeResult value for this EPCISQueryBodyType.
     * 
     * @return unsubscribeResult
     */
    public org.accada.epcis.soapapi.VoidHolder getUnsubscribeResult() {
        return unsubscribeResult;
    }


    /**
     * Sets the unsubscribeResult value for this EPCISQueryBodyType.
     * 
     * @param unsubscribeResult
     */
    public void setUnsubscribeResult(org.accada.epcis.soapapi.VoidHolder unsubscribeResult) {
        this.unsubscribeResult = unsubscribeResult;
    }


    /**
     * Gets the getSubscriptionIDs value for this EPCISQueryBodyType.
     * 
     * @return getSubscriptionIDs
     */
    public org.accada.epcis.soapapi.GetSubscriptionIDs getGetSubscriptionIDs() {
        return getSubscriptionIDs;
    }


    /**
     * Sets the getSubscriptionIDs value for this EPCISQueryBodyType.
     * 
     * @param getSubscriptionIDs
     */
    public void setGetSubscriptionIDs(org.accada.epcis.soapapi.GetSubscriptionIDs getSubscriptionIDs) {
        this.getSubscriptionIDs = getSubscriptionIDs;
    }


    /**
     * Gets the getSubscriptionIDsResult value for this EPCISQueryBodyType.
     * 
     * @return getSubscriptionIDsResult
     */
    public org.accada.epcis.soapapi.ArrayOfString getGetSubscriptionIDsResult() {
        return getSubscriptionIDsResult;
    }


    /**
     * Sets the getSubscriptionIDsResult value for this EPCISQueryBodyType.
     * 
     * @param getSubscriptionIDsResult
     */
    public void setGetSubscriptionIDsResult(org.accada.epcis.soapapi.ArrayOfString getSubscriptionIDsResult) {
        this.getSubscriptionIDsResult = getSubscriptionIDsResult;
    }


    /**
     * Gets the poll value for this EPCISQueryBodyType.
     * 
     * @return poll
     */
    public org.accada.epcis.soapapi.Poll getPoll() {
        return poll;
    }


    /**
     * Sets the poll value for this EPCISQueryBodyType.
     * 
     * @param poll
     */
    public void setPoll(org.accada.epcis.soapapi.Poll poll) {
        this.poll = poll;
    }


    /**
     * Gets the getStandardVersion value for this EPCISQueryBodyType.
     * 
     * @return getStandardVersion
     */
    public org.accada.epcis.soapapi.EmptyParms getGetStandardVersion() {
        return getStandardVersion;
    }


    /**
     * Sets the getStandardVersion value for this EPCISQueryBodyType.
     * 
     * @param getStandardVersion
     */
    public void setGetStandardVersion(org.accada.epcis.soapapi.EmptyParms getStandardVersion) {
        this.getStandardVersion = getStandardVersion;
    }


    /**
     * Gets the getStandardVersionResult value for this EPCISQueryBodyType.
     * 
     * @return getStandardVersionResult
     */
    public java.lang.String getGetStandardVersionResult() {
        return getStandardVersionResult;
    }


    /**
     * Sets the getStandardVersionResult value for this EPCISQueryBodyType.
     * 
     * @param getStandardVersionResult
     */
    public void setGetStandardVersionResult(java.lang.String getStandardVersionResult) {
        this.getStandardVersionResult = getStandardVersionResult;
    }


    /**
     * Gets the getVendorVersion value for this EPCISQueryBodyType.
     * 
     * @return getVendorVersion
     */
    public org.accada.epcis.soapapi.EmptyParms getGetVendorVersion() {
        return getVendorVersion;
    }


    /**
     * Sets the getVendorVersion value for this EPCISQueryBodyType.
     * 
     * @param getVendorVersion
     */
    public void setGetVendorVersion(org.accada.epcis.soapapi.EmptyParms getVendorVersion) {
        this.getVendorVersion = getVendorVersion;
    }


    /**
     * Gets the getVendorVersionResult value for this EPCISQueryBodyType.
     * 
     * @return getVendorVersionResult
     */
    public java.lang.String getGetVendorVersionResult() {
        return getVendorVersionResult;
    }


    /**
     * Sets the getVendorVersionResult value for this EPCISQueryBodyType.
     * 
     * @param getVendorVersionResult
     */
    public void setGetVendorVersionResult(java.lang.String getVendorVersionResult) {
        this.getVendorVersionResult = getVendorVersionResult;
    }


    /**
     * Gets the duplicateNameException value for this EPCISQueryBodyType.
     * 
     * @return duplicateNameException
     */
    public org.accada.epcis.soapapi.DuplicateNameException getDuplicateNameException() {
        return duplicateNameException;
    }


    /**
     * Sets the duplicateNameException value for this EPCISQueryBodyType.
     * 
     * @param duplicateNameException
     */
    public void setDuplicateNameException(org.accada.epcis.soapapi.DuplicateNameException duplicateNameException) {
        this.duplicateNameException = duplicateNameException;
    }


    /**
     * Gets the invalidURIException value for this EPCISQueryBodyType.
     * 
     * @return invalidURIException
     */
    public org.accada.epcis.soapapi.InvalidURIException getInvalidURIException() {
        return invalidURIException;
    }


    /**
     * Sets the invalidURIException value for this EPCISQueryBodyType.
     * 
     * @param invalidURIException
     */
    public void setInvalidURIException(org.accada.epcis.soapapi.InvalidURIException invalidURIException) {
        this.invalidURIException = invalidURIException;
    }


    /**
     * Gets the noSuchNameException value for this EPCISQueryBodyType.
     * 
     * @return noSuchNameException
     */
    public org.accada.epcis.soapapi.NoSuchNameException getNoSuchNameException() {
        return noSuchNameException;
    }


    /**
     * Sets the noSuchNameException value for this EPCISQueryBodyType.
     * 
     * @param noSuchNameException
     */
    public void setNoSuchNameException(org.accada.epcis.soapapi.NoSuchNameException noSuchNameException) {
        this.noSuchNameException = noSuchNameException;
    }


    /**
     * Gets the noSuchSubscriptionException value for this EPCISQueryBodyType.
     * 
     * @return noSuchSubscriptionException
     */
    public org.accada.epcis.soapapi.NoSuchSubscriptionException getNoSuchSubscriptionException() {
        return noSuchSubscriptionException;
    }


    /**
     * Sets the noSuchSubscriptionException value for this EPCISQueryBodyType.
     * 
     * @param noSuchSubscriptionException
     */
    public void setNoSuchSubscriptionException(org.accada.epcis.soapapi.NoSuchSubscriptionException noSuchSubscriptionException) {
        this.noSuchSubscriptionException = noSuchSubscriptionException;
    }


    /**
     * Gets the duplicateSubscriptionException value for this EPCISQueryBodyType.
     * 
     * @return duplicateSubscriptionException
     */
    public org.accada.epcis.soapapi.DuplicateSubscriptionException getDuplicateSubscriptionException() {
        return duplicateSubscriptionException;
    }


    /**
     * Sets the duplicateSubscriptionException value for this EPCISQueryBodyType.
     * 
     * @param duplicateSubscriptionException
     */
    public void setDuplicateSubscriptionException(org.accada.epcis.soapapi.DuplicateSubscriptionException duplicateSubscriptionException) {
        this.duplicateSubscriptionException = duplicateSubscriptionException;
    }


    /**
     * Gets the queryParameterException value for this EPCISQueryBodyType.
     * 
     * @return queryParameterException
     */
    public org.accada.epcis.soapapi.QueryParameterException getQueryParameterException() {
        return queryParameterException;
    }


    /**
     * Sets the queryParameterException value for this EPCISQueryBodyType.
     * 
     * @param queryParameterException
     */
    public void setQueryParameterException(org.accada.epcis.soapapi.QueryParameterException queryParameterException) {
        this.queryParameterException = queryParameterException;
    }


    /**
     * Gets the queryTooLargeException value for this EPCISQueryBodyType.
     * 
     * @return queryTooLargeException
     */
    public org.accada.epcis.soapapi.QueryTooLargeException getQueryTooLargeException() {
        return queryTooLargeException;
    }


    /**
     * Sets the queryTooLargeException value for this EPCISQueryBodyType.
     * 
     * @param queryTooLargeException
     */
    public void setQueryTooLargeException(org.accada.epcis.soapapi.QueryTooLargeException queryTooLargeException) {
        this.queryTooLargeException = queryTooLargeException;
    }


    /**
     * Gets the queryTooComplexException value for this EPCISQueryBodyType.
     * 
     * @return queryTooComplexException
     */
    public org.accada.epcis.soapapi.QueryTooComplexException getQueryTooComplexException() {
        return queryTooComplexException;
    }


    /**
     * Sets the queryTooComplexException value for this EPCISQueryBodyType.
     * 
     * @param queryTooComplexException
     */
    public void setQueryTooComplexException(org.accada.epcis.soapapi.QueryTooComplexException queryTooComplexException) {
        this.queryTooComplexException = queryTooComplexException;
    }


    /**
     * Gets the subscriptionControlsException value for this EPCISQueryBodyType.
     * 
     * @return subscriptionControlsException
     */
    public org.accada.epcis.soapapi.SubscriptionControlsException getSubscriptionControlsException() {
        return subscriptionControlsException;
    }


    /**
     * Sets the subscriptionControlsException value for this EPCISQueryBodyType.
     * 
     * @param subscriptionControlsException
     */
    public void setSubscriptionControlsException(org.accada.epcis.soapapi.SubscriptionControlsException subscriptionControlsException) {
        this.subscriptionControlsException = subscriptionControlsException;
    }


    /**
     * Gets the subscribeNotPermittedException value for this EPCISQueryBodyType.
     * 
     * @return subscribeNotPermittedException
     */
    public org.accada.epcis.soapapi.SubscribeNotPermittedException getSubscribeNotPermittedException() {
        return subscribeNotPermittedException;
    }


    /**
     * Sets the subscribeNotPermittedException value for this EPCISQueryBodyType.
     * 
     * @param subscribeNotPermittedException
     */
    public void setSubscribeNotPermittedException(org.accada.epcis.soapapi.SubscribeNotPermittedException subscribeNotPermittedException) {
        this.subscribeNotPermittedException = subscribeNotPermittedException;
    }


    /**
     * Gets the securityException value for this EPCISQueryBodyType.
     * 
     * @return securityException
     */
    public org.accada.epcis.soapapi.SecurityException getSecurityException() {
        return securityException;
    }


    /**
     * Sets the securityException value for this EPCISQueryBodyType.
     * 
     * @param securityException
     */
    public void setSecurityException(org.accada.epcis.soapapi.SecurityException securityException) {
        this.securityException = securityException;
    }


    /**
     * Gets the validationException value for this EPCISQueryBodyType.
     * 
     * @return validationException
     */
    public org.accada.epcis.soapapi.ValidationException getValidationException() {
        return validationException;
    }


    /**
     * Sets the validationException value for this EPCISQueryBodyType.
     * 
     * @param validationException
     */
    public void setValidationException(org.accada.epcis.soapapi.ValidationException validationException) {
        this.validationException = validationException;
    }


    /**
     * Gets the implementationException value for this EPCISQueryBodyType.
     * 
     * @return implementationException
     */
    public org.accada.epcis.soapapi.ImplementationException getImplementationException() {
        return implementationException;
    }


    /**
     * Sets the implementationException value for this EPCISQueryBodyType.
     * 
     * @param implementationException
     */
    public void setImplementationException(org.accada.epcis.soapapi.ImplementationException implementationException) {
        this.implementationException = implementationException;
    }


    /**
     * Gets the queryResults value for this EPCISQueryBodyType.
     * 
     * @return queryResults
     */
    public org.accada.epcis.soapapi.QueryResults getQueryResults() {
        return queryResults;
    }


    /**
     * Sets the queryResults value for this EPCISQueryBodyType.
     * 
     * @param queryResults
     */
    public void setQueryResults(org.accada.epcis.soapapi.QueryResults queryResults) {
        this.queryResults = queryResults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EPCISQueryBodyType)) return false;
        EPCISQueryBodyType other = (EPCISQueryBodyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getQueryNames==null && other.getGetQueryNames()==null) || 
             (this.getQueryNames!=null &&
              this.getQueryNames.equals(other.getGetQueryNames()))) &&
            ((this.getQueryNamesResult==null && other.getGetQueryNamesResult()==null) || 
             (this.getQueryNamesResult!=null &&
              this.getQueryNamesResult.equals(other.getGetQueryNamesResult()))) &&
            ((this.subscribe==null && other.getSubscribe()==null) || 
             (this.subscribe!=null &&
              this.subscribe.equals(other.getSubscribe()))) &&
            ((this.subscribeResult==null && other.getSubscribeResult()==null) || 
             (this.subscribeResult!=null &&
              this.subscribeResult.equals(other.getSubscribeResult()))) &&
            ((this.unsubscribe==null && other.getUnsubscribe()==null) || 
             (this.unsubscribe!=null &&
              this.unsubscribe.equals(other.getUnsubscribe()))) &&
            ((this.unsubscribeResult==null && other.getUnsubscribeResult()==null) || 
             (this.unsubscribeResult!=null &&
              this.unsubscribeResult.equals(other.getUnsubscribeResult()))) &&
            ((this.getSubscriptionIDs==null && other.getGetSubscriptionIDs()==null) || 
             (this.getSubscriptionIDs!=null &&
              this.getSubscriptionIDs.equals(other.getGetSubscriptionIDs()))) &&
            ((this.getSubscriptionIDsResult==null && other.getGetSubscriptionIDsResult()==null) || 
             (this.getSubscriptionIDsResult!=null &&
              this.getSubscriptionIDsResult.equals(other.getGetSubscriptionIDsResult()))) &&
            ((this.poll==null && other.getPoll()==null) || 
             (this.poll!=null &&
              this.poll.equals(other.getPoll()))) &&
            ((this.getStandardVersion==null && other.getGetStandardVersion()==null) || 
             (this.getStandardVersion!=null &&
              this.getStandardVersion.equals(other.getGetStandardVersion()))) &&
            ((this.getStandardVersionResult==null && other.getGetStandardVersionResult()==null) || 
             (this.getStandardVersionResult!=null &&
              this.getStandardVersionResult.equals(other.getGetStandardVersionResult()))) &&
            ((this.getVendorVersion==null && other.getGetVendorVersion()==null) || 
             (this.getVendorVersion!=null &&
              this.getVendorVersion.equals(other.getGetVendorVersion()))) &&
            ((this.getVendorVersionResult==null && other.getGetVendorVersionResult()==null) || 
             (this.getVendorVersionResult!=null &&
              this.getVendorVersionResult.equals(other.getGetVendorVersionResult()))) &&
            ((this.duplicateNameException==null && other.getDuplicateNameException()==null) || 
             (this.duplicateNameException!=null &&
              this.duplicateNameException.equals(other.getDuplicateNameException()))) &&
            ((this.invalidURIException==null && other.getInvalidURIException()==null) || 
             (this.invalidURIException!=null &&
              this.invalidURIException.equals(other.getInvalidURIException()))) &&
            ((this.noSuchNameException==null && other.getNoSuchNameException()==null) || 
             (this.noSuchNameException!=null &&
              this.noSuchNameException.equals(other.getNoSuchNameException()))) &&
            ((this.noSuchSubscriptionException==null && other.getNoSuchSubscriptionException()==null) || 
             (this.noSuchSubscriptionException!=null &&
              this.noSuchSubscriptionException.equals(other.getNoSuchSubscriptionException()))) &&
            ((this.duplicateSubscriptionException==null && other.getDuplicateSubscriptionException()==null) || 
             (this.duplicateSubscriptionException!=null &&
              this.duplicateSubscriptionException.equals(other.getDuplicateSubscriptionException()))) &&
            ((this.queryParameterException==null && other.getQueryParameterException()==null) || 
             (this.queryParameterException!=null &&
              this.queryParameterException.equals(other.getQueryParameterException()))) &&
            ((this.queryTooLargeException==null && other.getQueryTooLargeException()==null) || 
             (this.queryTooLargeException!=null &&
              this.queryTooLargeException.equals(other.getQueryTooLargeException()))) &&
            ((this.queryTooComplexException==null && other.getQueryTooComplexException()==null) || 
             (this.queryTooComplexException!=null &&
              this.queryTooComplexException.equals(other.getQueryTooComplexException()))) &&
            ((this.subscriptionControlsException==null && other.getSubscriptionControlsException()==null) || 
             (this.subscriptionControlsException!=null &&
              this.subscriptionControlsException.equals(other.getSubscriptionControlsException()))) &&
            ((this.subscribeNotPermittedException==null && other.getSubscribeNotPermittedException()==null) || 
             (this.subscribeNotPermittedException!=null &&
              this.subscribeNotPermittedException.equals(other.getSubscribeNotPermittedException()))) &&
            ((this.securityException==null && other.getSecurityException()==null) || 
             (this.securityException!=null &&
              this.securityException.equals(other.getSecurityException()))) &&
            ((this.validationException==null && other.getValidationException()==null) || 
             (this.validationException!=null &&
              this.validationException.equals(other.getValidationException()))) &&
            ((this.implementationException==null && other.getImplementationException()==null) || 
             (this.implementationException!=null &&
              this.implementationException.equals(other.getImplementationException()))) &&
            ((this.queryResults==null && other.getQueryResults()==null) || 
             (this.queryResults!=null &&
              this.queryResults.equals(other.getQueryResults())));
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
        if (getGetQueryNames() != null) {
            _hashCode += getGetQueryNames().hashCode();
        }
        if (getGetQueryNamesResult() != null) {
            _hashCode += getGetQueryNamesResult().hashCode();
        }
        if (getSubscribe() != null) {
            _hashCode += getSubscribe().hashCode();
        }
        if (getSubscribeResult() != null) {
            _hashCode += getSubscribeResult().hashCode();
        }
        if (getUnsubscribe() != null) {
            _hashCode += getUnsubscribe().hashCode();
        }
        if (getUnsubscribeResult() != null) {
            _hashCode += getUnsubscribeResult().hashCode();
        }
        if (getGetSubscriptionIDs() != null) {
            _hashCode += getGetSubscriptionIDs().hashCode();
        }
        if (getGetSubscriptionIDsResult() != null) {
            _hashCode += getGetSubscriptionIDsResult().hashCode();
        }
        if (getPoll() != null) {
            _hashCode += getPoll().hashCode();
        }
        if (getGetStandardVersion() != null) {
            _hashCode += getGetStandardVersion().hashCode();
        }
        if (getGetStandardVersionResult() != null) {
            _hashCode += getGetStandardVersionResult().hashCode();
        }
        if (getGetVendorVersion() != null) {
            _hashCode += getGetVendorVersion().hashCode();
        }
        if (getGetVendorVersionResult() != null) {
            _hashCode += getGetVendorVersionResult().hashCode();
        }
        if (getDuplicateNameException() != null) {
            _hashCode += getDuplicateNameException().hashCode();
        }
        if (getInvalidURIException() != null) {
            _hashCode += getInvalidURIException().hashCode();
        }
        if (getNoSuchNameException() != null) {
            _hashCode += getNoSuchNameException().hashCode();
        }
        if (getNoSuchSubscriptionException() != null) {
            _hashCode += getNoSuchSubscriptionException().hashCode();
        }
        if (getDuplicateSubscriptionException() != null) {
            _hashCode += getDuplicateSubscriptionException().hashCode();
        }
        if (getQueryParameterException() != null) {
            _hashCode += getQueryParameterException().hashCode();
        }
        if (getQueryTooLargeException() != null) {
            _hashCode += getQueryTooLargeException().hashCode();
        }
        if (getQueryTooComplexException() != null) {
            _hashCode += getQueryTooComplexException().hashCode();
        }
        if (getSubscriptionControlsException() != null) {
            _hashCode += getSubscriptionControlsException().hashCode();
        }
        if (getSubscribeNotPermittedException() != null) {
            _hashCode += getSubscribeNotPermittedException().hashCode();
        }
        if (getSecurityException() != null) {
            _hashCode += getSecurityException().hashCode();
        }
        if (getValidationException() != null) {
            _hashCode += getValidationException().hashCode();
        }
        if (getImplementationException() != null) {
            _hashCode += getImplementationException().hashCode();
        }
        if (getQueryResults() != null) {
            _hashCode += getQueryResults().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EPCISQueryBodyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "EPCISQueryBodyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getQueryNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "GetQueryNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "EmptyParms"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getQueryNamesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "GetQueryNamesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribe");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "Subscribe"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "Subscribe"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "SubscribeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "VoidHolder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsubscribe");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "Unsubscribe"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "Unsubscribe"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsubscribeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "UnsubscribeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "VoidHolder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSubscriptionIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "GetSubscriptionIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "GetSubscriptionIDs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSubscriptionIDsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "GetSubscriptionIDsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "Poll"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "Poll"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStandardVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "GetStandardVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "EmptyParms"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStandardVersionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "GetStandardVersionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getVendorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "GetVendorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "EmptyParms"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getVendorVersionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "GetVendorVersionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateNameException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "DuplicateNameException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "DuplicateNameException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidURIException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "InvalidURIException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "InvalidURIException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noSuchNameException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "NoSuchNameException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "NoSuchNameException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noSuchSubscriptionException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "NoSuchSubscriptionException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "NoSuchSubscriptionException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateSubscriptionException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "DuplicateSubscriptionException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "DuplicateSubscriptionException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryParameterException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "QueryParameterException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "QueryParameterException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryTooLargeException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "QueryTooLargeException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "QueryTooLargeException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryTooComplexException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "QueryTooComplexException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "QueryTooComplexException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionControlsException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "SubscriptionControlsException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "SubscriptionControlsException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribeNotPermittedException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "SubscribeNotPermittedException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "SubscribeNotPermittedException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "SecurityException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "SecurityException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "ValidationException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "ValidationException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implementationException");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "ImplementationException"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "ImplementationException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "QueryResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epcglobal:epcis-query:xsd:1", "QueryResults"));
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
