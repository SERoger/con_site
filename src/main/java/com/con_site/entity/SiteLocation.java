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
public class SiteLocation {
    @Id
    private String idSiteLocation;
    private String address;
    private double latitude;
    private double longitude;
    //district
    //sector
    //cell
    //village
    private String plotNumber;
    @OneToOne
    @JoinColumn(name = "idSite")
    private Site site;


}
