package com.karasusoft.arenafitnessapi.dto;

import com.karasusoft.arenafitnessapi.enums.UserStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UserDto {

    String uid;
    String firstName;
    String lastName;
    String gender;
    String phoneNumber;
    String email;
    LocalDateTime DoB;
    LocalDateTime creationDate;
    UserStatus userStatus;

    //TODO change name and fix mapper
    @Getter(AccessLevel.NONE)
    List<AddressDto> addressModelList;

    public List<AddressDto> getAddressDtoList() {

        if( addressModelList == null) {
            addressModelList = new ArrayList<>();
        }

        return addressModelList;
    }
}
