package com.con_site.entity;

import javax.persistence.*;

@Entity
@Table(name = "contructorRatings")
public class ConstructorRating {
    @Id
    private String idContructorRating;
    private int ratings;
    private String ratingComments;
    @ManyToOne
    @JoinColumn(name = "idSite")
    private Site site;

    public ConstructorRating() {
    }

    public ConstructorRating(String idContructorRating, int ratings, String ratingComments, Site site) {
        this.idContructorRating = idContructorRating;
        this.ratings = ratings;
        this.ratingComments = ratingComments;
        this.site = site;
    }

    public String getIdContructorRating() {
        return idContructorRating;
    }

    public void setIdContructorRating(String idContructorRating) {
        this.idContructorRating = idContructorRating;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public String getRatingComments() {
        return ratingComments;
    }

    public void setRatingComments(String ratingComments) {
        this.ratingComments = ratingComments;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }
}
