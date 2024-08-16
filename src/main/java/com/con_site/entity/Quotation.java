package com.con_site.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "quotations")
public class Quotation {
    @Id
    private String idQuotation;
    private String title;
    private LocalDate dateQuotation;
    private BigDecimal totalAmount;
    private String description;
    //arrays of pictures
    @ManyToOne
    @JoinColumn(name = "idSite")
    private Site site;

    public Quotation() {
    }

    public Quotation(String idQuotation, String title, LocalDate dateQuotation, BigDecimal totalAmount, String description, Site site) {
        this.idQuotation = idQuotation;
        this.title = title;
        this.dateQuotation = dateQuotation;
        this.totalAmount = totalAmount;
        this.description = description;
        this.site = site;
    }

    public String getIdQuotation() {
        return idQuotation;
    }

    public void setIdQuotation(String idQuotation) {
        this.idQuotation = idQuotation;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateQuotation() {
        return dateQuotation;
    }

    public void setDateQuotation(LocalDate dateQuotation) {
        this.dateQuotation = dateQuotation;
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
