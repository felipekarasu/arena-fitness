package com.karasusoft.arenafitnessapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "ADDRESS")
public class AddressModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID addressId;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="user_uid", nullable=false)
    private UserModel user;

    //TODO use table annotations
    //@NotBlank
    private String addressName;

    private String addressNumber;

    //@NotBlank
    private String area;

    private String complement;

    private String reference;

    //@NotBlank
    private String city;

    //@NotBlank
    private String State;

    //@NotBlank
    private String country;

    //@NotBlank
    private String postalCode;
}
