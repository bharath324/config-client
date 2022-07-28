package com.config.client;

import java.io.Serializable;


@SuppressWarnings("serial")
public class EmailAvailabilityRequest implements Serializable {

    private String sessionKey;

   
    private String ecrID;

    
    private String emailId;

    private String partnerID;

    private String labelID;

    private String agentName;

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getEcrID() {
        return ecrID;
    }

    public void setEcrID(String ecrID) {
        this.ecrID = ecrID;
    }

    public String getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(String partnerID) {
        this.partnerID = partnerID;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getLabelID() {
        return labelID;
    }

    public void setLabelID(String labelID) {
        this.labelID = labelID;
    }

    @Override
    public String toString() {
        return "EmailAvailabilityRequest [sessionKey=" + sessionKey + ", ecrID=" + ecrID + ", emailId=" + emailId
                + ", partnerID=" + partnerID + ", labelID=" + labelID + ", agentName=" + agentName + "]";
    }

}
