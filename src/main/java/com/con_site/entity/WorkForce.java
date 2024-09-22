package com.con_site.entity;

import javax.crypto.Mac;
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
public class WorkForce {
    @Id
    private String idWorkForce;
    private String idJobTitle;
    @ManyToOne
    @JoinColumn(name = "idWorkDone")
    private WorkDone workDone;
    private LocalDate dateWworkForce;
    private int number;
    private float indivAmount;
    private double totalAmount;
    private BigDecimal calculatedAmount;
    @OneToMany(mappedBy = "workForce")
    private List<WorkForceDetails> workForceDetails;

}
