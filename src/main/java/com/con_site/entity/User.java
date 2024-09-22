package com.con_site.entity;

import javax.persistence.*;
import java.util.List;

import com.con_site.enums.EUserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="users")
public class User {
    @Id
    private String idUser;
    private String names;
    private String email;
    private String userName;
    private String phoneNo;
    private String password;
    @Enumerated(EnumType.STRING)
    private EUserRole role;
    @OneToMany
    @JoinColumn(name = "suppliedBy")
    private List<Supply> supplies;
    @OneToMany
    @JoinColumn(name = "receivedBy")
    private List<Supply> receivings;
    @OneToMany(mappedBy = "user")
    private List<Requisition> requisitions;
    @OneToMany(mappedBy = "user")
    private List<UserStatus> userStatuses;
}
