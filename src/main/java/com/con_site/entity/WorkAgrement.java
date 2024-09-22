package com.con_site.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class WorkAgrement {
    @Id
    private String idWorkAgrement;
    @ManyToOne
    @JoinColumn(name = "workerId")
    private Worker worker;
    @ManyToOne
    @JoinColumn(name = "workDoneId")
    private WorkDone workDone;
    private String taskName;
    private float quantity;
    private int taskUnit;
    private String taskDescription;
    private LocalDate startTime;
    private int duration;
    private int durationUnit;
    private float amount;
}
