package com.ut.sm42.dto;

public class YouTubeMainDTO {
    String kind;
    String etag;
    String title;

    public YouTubeMainDTO() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public void setTitle(String title) {
        this.title = "Youtube";
    }
}
