package com.con_site.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class QuotationDocument {
    @Id
    private String idQuotation;
    private String documentTitle;
    private String documentDescription;
    @ManyToOne
    @JoinColumn(name = "site_id")
    private Site site;
    private String filePath;
    private LocalDate dateIssued;
}
