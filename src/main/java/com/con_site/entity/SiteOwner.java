package com.con_site.entity;

import com.con_site.enums.ESiteOwnerType;
import javax.persistence.*;
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
public class SiteOwner {
    @Id
    private String idSiteOwner;
    private String ownerName;
    private String email;
    private String phone;
    private String address;
    @Enumerated(EnumType.STRING)
    private ESiteOwnerType type;
    private String description;
    @OneToMany(mappedBy = "owner")
    private List<Site> sites;

}
