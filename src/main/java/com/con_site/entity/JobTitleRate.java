package com.con_site.entity;

import javax.persistence.*;
import java.math.BigDecimal;
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
public class JobTitleRate {
    @Id
    private String idJobTitleRate;
    @ManyToOne
    @JoinColumn(name = "jobTitleId")
    private JobTitle jobTitle;
    @ManyToOne
    @JoinColumn(name = "constructor_id")
    private Constructor constructor;
    private LocalDate dateRate;
    private BigDecimal amountRate;
    private int timeUnit;

}
