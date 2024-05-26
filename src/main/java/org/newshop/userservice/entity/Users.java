package org.newshop.userservice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.newshop.userservice.entity.enums.Role;

import java.sql.Timestamp;

@Entity
@Table(name = "Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @Column(name = "UserId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Email")
    private String email;

    @Column(name = "PasswordHash")
    private String passwordHash;

    @Column(name = "Role")
    private Role role;

    @Column(name = "CreatedAt")
    private Timestamp createdAt;

    @Column(name = "UpdatedAt")
    private Timestamp updatedAt;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    private ContactInformation contactInformation;

}