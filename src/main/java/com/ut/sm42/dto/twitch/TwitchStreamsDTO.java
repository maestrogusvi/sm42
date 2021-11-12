package com.ut.sm42.dto.twitch;

public class TwitchStreamsDTO {

    String user_name;
    String game_name;
    String viewer_count;

    public TwitchStreamsDTO() {
    }


    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public String getViewer_count() {
        return viewer_count;
    }

    public void setViewer_count(String viewer_count) {
        this.viewer_count = viewer_count;
    }
}
