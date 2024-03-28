package com.techspine.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;
    private String mobile;
    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Address> address = new ArrayList<>();
    @Embedded
    @ElementCollection
    @CollectionTable(name = "payment_information" , joinColumns = @JoinColumn(name = "user_id"))
    private List<PaymentInformation> paymentInformation = new ArrayList<>();
    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Rating> ratings = new ArrayList<>();
    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Reviews> reviews = new ArrayList<>();
    private LocalDateTime createdAt;

    public User(){}





}
