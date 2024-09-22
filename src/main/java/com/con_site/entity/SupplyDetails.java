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
public class SupplyDetails {
    @Id
    private String idSupplyDetail;
    @ManyToOne
    @JoinColumn(name = "supplyId")
    private Supply supply;
    private String itemName;
    private String itemDescription;
    private double quantity;
    private int unit;
    private double unitAmount;
    private float totalAmount;
    private BigDecimal calculatedAmount;

}
