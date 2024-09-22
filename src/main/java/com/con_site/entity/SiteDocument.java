package com.con_site.entity;

import javax.persistence.*;
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
}
