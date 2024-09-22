package com.con_site.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class JobType {
    @Id
    private  String idJobType;
    private  String type;
    @OneToMany
    private List<JobTitle> jobTitles;

}
