package com.express.pocs.jerseyrest.dto;

/**
 * Use Code Templates to update the text.
 *
 * @author Jun Wang 
 * @since  Mar 20, 2016
 * 
 */
public class Welcome {

    private String domain;
    private String message;
    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{Welcom: {domain: " + domain + ", message: " + message + "} }";
    }

}

