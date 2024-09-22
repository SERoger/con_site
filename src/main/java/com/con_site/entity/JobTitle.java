package com.con_site.entity;

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
public class JobTitle {
    @Id
    private String idJobTitle;
    @ManyToOne
    @JoinColumn(name = "jobType")
    private JobType jobType;
    private String type;
    @OneToMany(mappedBy = "jobTitle")
    private List<JobTitleRate> jobTitleRates;
    @OneToMany(mappedBy = "jobTitle")
    private List<WorkForceDetails> workForceDetails;
    @OneToMany(mappedBy = "jobTitle")
    private List<Change> changes;
}
