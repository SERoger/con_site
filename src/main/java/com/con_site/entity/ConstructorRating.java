package com.con_site.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ConstructorRating {
    @Id
    private String idContructorRating;
    private int ratings;
    private String ratingComments;
    @ManyToOne
    @JoinColumn(name = "idSite")
    private Site site;
    @ManyToOne
    @JoinColumn(name = "constructor_id")
    private Constructor constructor;

}
