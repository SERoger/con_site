package com.con_site.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
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
    @ManyToOne
    @JoinColumn(name = "contructor_id")
    private Constructor constructor;
    @OneToMany(mappedBy = "quotation")
    private List<QStatus> qStatuses;



}
