package com.con_site.entity;

import com.con_site.enums.ESiteOwnerType;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "siteOwners")
public class SiteOwner {
    @Id
    private String idSiteOwner;
    private String ownerName;
    private String email;
    private String phone;
    private String address;
    @Enumerated(EnumType.STRING)
    private ESiteOwnerType type;
    private String description;
    @OneToMany(mappedBy = "owner")
    private List<Site> sites;

    public SiteOwner() {
    }

    public SiteOwner(String idSiteOwner, String ownerName, String email, String phone, String address, ESiteOwnerType type, String description, List<Site> sites) {
        this.idSiteOwner = idSiteOwner;
        this.ownerName = ownerName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.type = type;
        this.description = description;
        this.sites = sites;
    }

    public String getIdSiteOwner() {
        return idSiteOwner;
    }

    public void setIdSiteOwner(String idSiteOwner) {
        this.idSiteOwner = idSiteOwner;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ESiteOwnerType getType() {
        return type;
    }

    public void setType(ESiteOwnerType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }
}
