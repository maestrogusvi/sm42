package com.ut.sm42.dto;

import java.util.List;

public class MediaStackDTO {

    MediaStackPaginationDTO mediaStackPaginationDTO;
    List<MediaStackNewsDTO> mediaStackNewsDTOS;

    public MediaStackDTO() {
    }

    public MediaStackPaginationDTO getMediaStackPaginationDTO() {
        return mediaStackPaginationDTO;
    }

    public void setMediaStackPaginationDTO(MediaStackPaginationDTO mediaStackPaginationDTO) {
        this.mediaStackPaginationDTO = mediaStackPaginationDTO;
    }

    public List<MediaStackNewsDTO> getMediaStackNewsDTOS() {
        return mediaStackNewsDTOS;
    }

    public void setMediaStackNewsDTOS(List<MediaStackNewsDTO> mediaStackNewsDTOS) {
        this.mediaStackNewsDTOS = mediaStackNewsDTOS;
    }
}
