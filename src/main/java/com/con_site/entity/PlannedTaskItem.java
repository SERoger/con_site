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
public class PlannedTaskItem {
    @Id
    private String idPlannedTaskItem;
    @ManyToOne
    @JoinColumn(name = "plannedTaskId")
    private PlannedTask plannedTask;
    private String itemName;
    private String itemDescription;
    private float quantity;
    private int unit;
    private float unitAmount;
    private double totalAmount;
    private BigDecimal calculatedTotalAmount;

}
