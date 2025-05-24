package com.devsuperior.dslist.dto;


import com.devsuperior.dslist.GameMinProjection;
import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        shortDescription = entity.getShortDescription();
        imgUrl = entity.getImgUrl();
        year = entity.getYear();
        title = entity.getTitle();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        shortDescription = projection.getShortDescription();
        imgUrl = projection.getImgUrl();
        year = projection.getGameYear();
        title = projection.getTitle();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
