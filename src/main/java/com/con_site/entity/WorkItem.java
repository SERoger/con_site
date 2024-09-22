package com.con_site.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class WorkItem {
    @Id
    private String idWorkItem;
    @ManyToOne
    @JoinColumn(name = "idWorkDone")
    private WorkDone workDone;
    private LocalDate dateWorkItem;
    private String itemName;
    private String itemDescription;
    private float quantity;
    private float unit;
    private float unitAmount;
    private double totalAmount;
    private BigDecimal calculatedAmount;

}
