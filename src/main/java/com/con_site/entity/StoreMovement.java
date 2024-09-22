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
public class StoreMovement {
    @Id
    private String idStoreMovement;
    //Site Store
    private String inOut;
    //Item
    private  float quantity;
    private String idUnit;
    private String idUser;
    private String dateMovement;
}
