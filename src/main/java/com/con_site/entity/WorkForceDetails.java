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
public class WorkForceDetails {
    @Id
    private String idWorkForceDetails;
    @ManyToOne
    @JoinColumn(name = "idWorkForce")
    private WorkForce workForce;
    @ManyToOne
    @JoinColumn(name = "idJobTitle")
    private JobTitle jobTitle;
    private String name;
    private String phone;
    private String email;
    private BigDecimal agreedAmount;


}
