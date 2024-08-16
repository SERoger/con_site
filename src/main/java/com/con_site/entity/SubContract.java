package com.con_site.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "subContructors")
public class SubContract {
    @Id
    private String idSubContructor;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private BigDecimal totalAmount;
    private String description;
    @ManyToOne
    @JoinColumn(name = "idSite")
    private Site site;

    public SubContract() {
    }

    public SubContract(String idSubContructor, LocalDate dateStart, LocalDate dateEnd, BigDecimal totalAmount, String description, Site site) {
        this.idSubContructor = idSubContructor;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.totalAmount = totalAmount;
        this.description = description;
        this.site = site;
    }

    public String getIdSubContructor() {
        return idSubContructor;
    }

    public void setIdSubContructor(String idSubContructor) {
        this.idSubContructor = idSubContructor;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }
}
