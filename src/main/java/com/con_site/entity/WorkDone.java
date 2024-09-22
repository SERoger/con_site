package com.con_site.entity;

import javax.persistence.*;
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
public class WorkDone {
    @Id
    private String idWorkDone;
    @ManyToOne
    @JoinColumn(name = "workTodoId")
    private WorkTodo workTodo;
    private LocalDate workDoneDate;
    private String workDescription;
    @OneToMany(mappedBy = "workDone")
    private List<WorkAgrement> workAgrements;
    @OneToMany(mappedBy = "workDone")
    private List<WorkForce> workForces;
    @OneToMany(mappedBy = "workDone")
    private List<WorkItem> workItems;
}
