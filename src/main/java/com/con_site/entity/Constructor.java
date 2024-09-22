package com.con_site.entity;

import com.con_site.enums.EConstructorType;
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
public class Constructor {
    @Id
    private String idConstructor;
    private String constructorName;
    private String email;
    private String phoneNo;
    private String address;
    @Enumerated(EnumType.STRING)
    private EConstructorType type;
    private String description;
    @OneToMany(mappedBy = "constructor")
    private List<ConstructorRating> ratings;
    @OneToMany(mappedBy = "constructor")
    private List<Quotation> quotations;
    @OneToMany(mappedBy = "constructor")
    private List<Requisition> requisitions;
    @OneToMany(mappedBy = "constructor")
    private List<JobTitleRate> jobTitleRates;
    @OneToMany(mappedBy = "constructor")
    private List<WorkTodo> workTodos;
}
