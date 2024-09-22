package com.con_site.entity;

import com.con_site.enums.ESiteStatus;
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


}
