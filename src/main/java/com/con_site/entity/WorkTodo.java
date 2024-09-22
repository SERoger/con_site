package com.con_site.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
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
public class WorkTodo {
    @Id
    private String idWorkTodo;
    private LocalDate startDate;
    private int duration;
    private int durationUnit;
    private LocalDate workDoneDate;
    @ManyToOne
    @JoinColumn(name = "subContractId")
    private SubContract subContract;
    @ManyToOne
    @JoinColumn(name = "contractId")
    private Constructor constructor;
    private String workDescription;
    //private String[] pictures;
    @ManyToOne
    @JoinColumn(name = "idPlannedTask")
    private PlannedTask plannedTask;
    private BigDecimal totalAmount;
    @OneToMany(mappedBy = "workTodo")
    private List<WorkDone> workTodos;
}
