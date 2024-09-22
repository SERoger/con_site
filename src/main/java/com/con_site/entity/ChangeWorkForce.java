package com.con_site.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ChangeWorkForce {
    @Id
    private String idPlannedWorkForce;
    private String idJobTitle;
    @ManyToOne
    @JoinColumn(name = "idChange")
    private Change change;
    private int number;
    private float indivAmount;
    private double totalAmount;
    private BigDecimal calculatedAmount;
}
