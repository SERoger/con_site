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
public class Requisition {
    @Id
    private String idRequisition;
    private LocalDate dateRequisition;
    private BigDecimal amount;
    private String currency;
    private String receivedBy;
    private String givenBy;
    private String idQuotation;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    @ManyToOne
    @JoinColumn(name = "constructor_id")
    private Constructor constructor;
    private String idSiteOwnerEnvoy;
}
