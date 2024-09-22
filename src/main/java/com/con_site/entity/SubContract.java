package com.con_site.entity;

import javax.persistence.*;
import java.math.BigDecimal;
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
    @ManyToOne
    @JoinColumn(name = "constructor_id")
    private Constructor constructor;


}
