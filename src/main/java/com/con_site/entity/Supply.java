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
public class Supply {
    @Id
    private String idSupply;
    private LocalDate dateSupply;
    @ManyToOne
    @JoinColumn(name = "quotationId")
    private Quotation quotation;
    @ManyToOne
    @JoinColumn(name = "suppliedById")
    private User suppliedBy;
    @ManyToOne
    @JoinColumn(name = "receivedById")
    private User receivedBy;
    private BigDecimal totalAmount;
    @OneToMany(mappedBy = "supply")
    private List<SupplyDetails> supplyDetails;
}
