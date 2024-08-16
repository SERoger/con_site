package com.con_site.entity;

import javax.persistence.*;

@Entity
@Table(name = "siteLocations")
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

    public SiteLocation() {
    }

    public SiteLocation(String idSiteLocation, String address, double latitude, double longitude, String plotNumber, Site site) {
        this.idSiteLocation = idSiteLocation;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.plotNumber = plotNumber;
        this.site = site;
    }

    public String getIdSiteLocation() {
        return idSiteLocation;
    }

    public void setIdSiteLocation(String idSiteLocation) {
        this.idSiteLocation = idSiteLocation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPlotNumber() {
        return plotNumber;
    }

    public void setPlotNumber(String plotNumber) {
        this.plotNumber = plotNumber;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }
}
