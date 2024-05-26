package org.newshop.userservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ContactInformation")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ContactInformation {
    @Id
    @Column(name = "AddressId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;

    @Column(name = "Street")
    private String streey;

    @Column(name = "City")
    private String city;

    @Column(name = "State")
    private String state;

    @Column(name = "ZipCode")
    private int zipCode;

    @Column(name = "Country")
    private String country;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "UserId", referencedColumnName = "userId")
    private Users user;
}
