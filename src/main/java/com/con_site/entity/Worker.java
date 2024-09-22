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
public class Worker {
    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
    @OneToMany(mappedBy = "worker")
    private List<WorkAgrement> workAgrements;
}
