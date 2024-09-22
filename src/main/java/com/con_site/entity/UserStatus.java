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
public class UserStatus {
    @Id
    private String idUserStatus;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    private String idQuotation;
    private String idRole;
    private String idStatusChanger;
    private String status;
    private LocalDate dateStatus;
    private String comment;
}
