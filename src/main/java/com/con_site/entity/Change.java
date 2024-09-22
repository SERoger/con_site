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
@Table(name = "t_changes")
public class Change {
    @Id
    private String idChange;
    private LocalDate dateApprovalChange;
    private String urlDocChange;
    private String description;
    @ManyToOne
    @JoinColumn(name = "idJobTitle")
    private JobTitle jobTitle;
    @ManyToOne
    @JoinColumn(name = "idPlannedTask")
    private PlannedTask plannedTask;
    @OneToMany(mappedBy = "change")
    private List<ChangeTaskItem> changeTaskItems;
    @OneToMany(mappedBy = "change")
    private List<ChangeWorkForce> changeWorkForces;

}
