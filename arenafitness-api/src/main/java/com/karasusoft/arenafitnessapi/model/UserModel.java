package com.karasusoft.arenafitnessapi.model;

import com.karasusoft.arenafitnessapi.enums.ClientStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "APPLICATION_USER")
public class UserModel {

    @Id
    private String document;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private String gender;

    private String phoneNumber;

    private String email;

    private LocalDateTime DoB;

    private LocalDateTime creationDate;

    @OneToMany
    private List<AddressModel> addressModel;

    @Enumerated(EnumType.STRING)
    private ClientStatus clientStatus;
}
