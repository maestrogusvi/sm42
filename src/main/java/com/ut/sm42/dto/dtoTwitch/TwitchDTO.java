package com.ut.sm42.dto.dtoTwitch;

public class TwitchDTO {

    String client_id;
    String client_secret;
    String grant_type;
    String type;

    public TwitchDTO() {
    }

    public String getClient_id() { return client_id;}

    public void setClient_id(String client_id) {this.client_id = client_id;}

    public String getClient_secret() {return client_secret;}

    public void setClient_secret(String client_secret) {this.client_secret = client_secret;}

    public String getGrant_type() {return grant_type;}

    public void setGrant_type(String grant_type) {this.grant_type = grant_type;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

}
