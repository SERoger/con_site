package com.con_site.entity;

import com.con_site.enums.ESiteType;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sites")
public class Site {
    @Id
    private String idSite;
    private String siteName;
    private String siteDescription;
    private String upi;
    private String autoBatir;
    @Enumerated(EnumType.STRING)
    private ESiteType type;
    @ManyToOne
    @JoinColumn(name = "idOwner")
    private SiteOwner owner;
    @OneToOne(mappedBy = "site")
    private SiteLocation location;
    @OneToMany(mappedBy = "site")
    private List<SiteDocument> siteDocuments;
    @OneToMany(mappedBy = "site")
    private List<ConstructorRating> constructorRatings;
    @OneToMany(mappedBy = "site")
    private List<SubContract> subContracts;
    @OneToMany(mappedBy = "site")
    private List<Quotation> quotations;
    @OneToMany(mappedBy = "site")
    private List<SiteStatus> siteStatuses;

    public Site() {
    }

    public Site(String idSite, String siteName, String siteDescription, String upi, String autoBatir, ESiteType type, SiteOwner owner, SiteLocation location, List<SiteDocument> siteDocuments, List<ConstructorRating> constructorRatings, List<SubContract> subContracts, List<Quotation> quotations, List<SiteStatus> siteStatuses) {
        this.idSite = idSite;
        this.siteName = siteName;
        this.siteDescription = siteDescription;
        this.upi = upi;
        this.autoBatir = autoBatir;
        this.type = type;
        this.owner = owner;
        this.location = location;
        this.siteDocuments = siteDocuments;
        this.constructorRatings = constructorRatings;
        this.subContracts = subContracts;
        this.quotations = quotations;
        this.siteStatuses = siteStatuses;
    }

    public String getIdSite() {
        return idSite;
    }

    public void setIdSite(String idSite) {
        this.idSite = idSite;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteDescription() {
        return siteDescription;
    }

    public void setSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription;
    }

    public String getUpi() {
        return upi;
    }

    public void setUpi(String upi) {
        this.upi = upi;
    }

    public String getAutoBatir() {
        return autoBatir;
    }

    public void setAutoBatir(String autoBatir) {
        this.autoBatir = autoBatir;
    }

    public ESiteType getType() {
        return type;
    }

    public void setType(ESiteType type) {
        this.type = type;
    }

    public SiteOwner getOwner() {
        return owner;
    }

    public void setOwner(SiteOwner owner) {
        this.owner = owner;
    }

    public SiteLocation getLocation() {
        return location;
    }

    public void setLocation(SiteLocation location) {
        this.location = location;
    }

    public List<SiteDocument> getSiteDocuments() {
        return siteDocuments;
    }

    public void setSiteDocuments(List<SiteDocument> siteDocuments) {
        this.siteDocuments = siteDocuments;
    }

    public List<ConstructorRating> getConstructorRatings() {
        return constructorRatings;
    }

    public void setConstructorRatings(List<ConstructorRating> constructorRatings) {
        this.constructorRatings = constructorRatings;
    }

    public List<SubContract> getSubContracts() {
        return subContracts;
    }

    public void setSubContracts(List<SubContract> subContracts) {
        this.subContracts = subContracts;
    }

    public List<Quotation> getQuotations() {
        return quotations;
    }

    public void setQuotations(List<Quotation> quotations) {
        this.quotations = quotations;
    }

    public List<SiteStatus> getSiteStatuses() {
        return siteStatuses;
    }

    public void setSiteStatuses(List<SiteStatus> siteStatuses) {
        this.siteStatuses = siteStatuses;
    }
}
