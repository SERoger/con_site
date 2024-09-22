package com.con_site.entity;

import com.con_site.enums.ESiteType;
import javax.persistence.*;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
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
    @OneToMany(mappedBy = "site")
    private List<QuotationDocument> quotationDocuments;

}
