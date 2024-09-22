package com.con_site.entity;

import javax.persistence.*;
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
public class PlannedWorkForce {
    @Id
    private String idPlannedWorkForce;
    private String idJobTitle;
    @ManyToOne
    @JoinColumn(name = "plannedTaskId")
    private PlannedTask plannedTask;
    private int number;
    private BigDecimal indivAmount;
    private BigDecimal totalAmount;
    private BigDecimal calculatedAmount;

}
