package com.ut.sm42.dto;
import com.ut.sm42.dto.YouTube.*;

import java.util.List;

public class YouTubeMainDTO {
    YouTubeDTO youtubeDTO1;
    List<YouTubeMergeDTO> youtubemergeDTO2;

    public YouTubeMainDTO() {
    }

    public YouTubeDTO getYoutubeDTO1() {
        return youtubeDTO1;
    }

    public void setYoutubeDTO1(YouTubeDTO youtubeDTO1) {
        this.youtubeDTO1 = youtubeDTO1;
    }

    public List<YouTubeMergeDTO> getYoutubemergeDTO2() {
        return youtubemergeDTO2;
    }

    public void setYoutubemergeDTO2(List<YouTubeMergeDTO> youtubemergeDTO2) {
        this.youtubemergeDTO2 = youtubemergeDTO2;
    }
}
