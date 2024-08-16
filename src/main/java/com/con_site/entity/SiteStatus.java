package com.con_site.entity;

import com.con_site.enums.ESiteStatus;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "siteStatuses")
public class SiteStatus {
    @Id
    private String idSiteStatus;
    @Enumerated(EnumType.STRING)
    private ESiteStatus status;
    private LocalDate dateStatus;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "idSite")
    private Site site;

    public SiteStatus() {
    }

    public SiteStatus(String idSiteStatus, ESiteStatus status, LocalDate dateStatus, String comment, Site site) {
        this.idSiteStatus = idSiteStatus;
        this.status = status;
        this.dateStatus = dateStatus;
        this.comment = comment;
        this.site = site;
    }

    public String getIdSiteStatus() {
        return idSiteStatus;
    }

    public void setIdSiteStatus(String idSiteStatus) {
        this.idSiteStatus = idSiteStatus;
    }

    public ESiteStatus getStatus() {
        return status;
    }

    public void setStatus(ESiteStatus status) {
        this.status = status;
    }

    public LocalDate getDateStatus() {
        return dateStatus;
    }

    public void setDateStatus(LocalDate dateStatus) {
        this.dateStatus = dateStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }
}
