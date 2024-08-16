package com.con_site.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "siteDocuments")
public class SiteDocument {
    @Id
    private String idDocument;
    private String documentTitle;
    private String documentDescription;
    @ManyToOne
    @JoinColumn(name = "idSite")
    private Site site;
    private String filePath;
    private LocalDate dateIssued;

    public SiteDocument() {
    }

    public SiteDocument(String idDocument, String documentTitle, String documentDescription, Site site, String filePath, LocalDate dateIssued) {
        this.idDocument = idDocument;
        this.documentTitle = documentTitle;
        this.documentDescription = documentDescription;
        this.site = site;
        this.filePath = filePath;
        this.dateIssued = dateIssued;
    }

    public String getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(String idDocument) {
        this.idDocument = idDocument;
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    public String getDocumentDescription() {
        return documentDescription;
    }

    public void setDocumentDescription(String documentDescription) {
        this.documentDescription = documentDescription;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(LocalDate dateIssued) {
        this.dateIssued = dateIssued;
    }
}
