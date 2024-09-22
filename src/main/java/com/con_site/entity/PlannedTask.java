package com.con_site.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class PlannedTask {
    @Id
    private String idPlannedTask;
    private String idQuotation;
    private String taskName;
    private String taskDescription;
    private BigDecimal totalAmountPlanned;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    @OneToMany(mappedBy = "plannedTask")
    private List<WorkTodo> workTodos;
    @OneToMany(mappedBy = "plannedTask")
    private List<PlannedTaskItem> plannedTaskItems;
    @OneToMany(mappedBy = "plannedTask")
    private List<PlannedWorkForce> plannedWorkForces;
    @OneToMany(mappedBy = "plannedTask")
    private List<Change> changes;

}
