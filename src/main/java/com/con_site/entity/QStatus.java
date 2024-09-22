package com.con_site.entity;

import javax.persistence.*;
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
public class QStatus {
    @Id
    private String idQStatus;
    private String status;
    private LocalDate dateStatus;
    private String description;
    @ManyToOne
    @JoinColumn(name = "quotationId")
    private Quotation quotation;
}
