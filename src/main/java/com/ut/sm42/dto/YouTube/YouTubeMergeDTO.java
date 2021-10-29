package com.ut.sm42.dto.YouTube;
import java.util.List;

public class YouTubeMergeDTO {
    YouTubeitemsDTO youtubeitemDTO1;
    List<YouTubeitemsSnippet> youtubeintemsinppet1;

    public YouTubeMergeDTO() {
    }

    public YouTubeitemsDTO getYoutubeitemDTO1() {
        return youtubeitemDTO1;
    }

    public void setYoutubeitemDTO1(YouTubeitemsDTO youtubeitemDTO1) {
        this.youtubeitemDTO1 = youtubeitemDTO1;
    }

    public List<YouTubeitemsSnippet> getYoutubeintemsinppet1() {
        return youtubeintemsinppet1;
    }

    public void setYoutubeintemsinppet1(List<YouTubeitemsSnippet> youtubeintemsinppet1) {
        this.youtubeintemsinppet1 = youtubeintemsinppet1;
    }
}
