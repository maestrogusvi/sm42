package com.ut.sm42.dto.Twitch;
import java.util.List;

public class TwitchDTO {

    int id;
    String user_id;
    String user_login;
    String user_name;

    List<TwitchGameDTO> twitchGameDTO;

    public TwitchDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public List<TwitchGameDTO> getTwitchGameDTO() {
        return twitchGameDTO;
    }

    public void setTwitchGameDTO(List<TwitchGameDTO> twitchGameDTO) {
        this.twitchGameDTO = twitchGameDTO;
    }
}
