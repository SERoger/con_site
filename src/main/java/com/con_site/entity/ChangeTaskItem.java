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
public class ChangeTaskItem {
    @Id
    private String idPlannedTaskItem;
    @ManyToOne
    @JoinColumn(name = "idChange")
    private Change change;
    private String itemName;
    private String itemDescription;
    private float quantity;
    private int unit;
    private float unitAmount;
    private double totalAmount;
    private BigDecimal calculatedTotalAmount;


}
