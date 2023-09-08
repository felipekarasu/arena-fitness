package com.karasusoft.arenafitnessapi.model;

import com.karasusoft.arenafitnessapi.enums.UserStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "APPLICATION_USER")
public class UserModel {

    @Id
    @Column(unique=true, nullable=false)
    private String uid;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String phoneNumber;

    private String email;

    private String gender;

    private LocalDateTime DoB;

    @Column(nullable = false)
    private LocalDateTime creationDate;


    @OneToMany(mappedBy="user", cascade=CascadeType.ALL)
    @Getter(AccessLevel.NONE)
    private List<AddressModel> addressModelList;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

    public List<AddressModel> getAddressModelList() {

        if( addressModelList == null){
            addressModelList = new ArrayList<>();
        }
        return addressModelList;
    }

    /*@PrePersist
    @PreUpdate
    private void prePersist() {
        if(addressModelList != null){
            addressModelList.stream().forEach(a -> a.setUser(this));
        }
    }*/
}
