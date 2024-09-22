package com.con_site.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Unit {
    @Id
    private String idUnit;
    private String unitName;
    private String unitDescription;
    private String unitAcronym;
}
