package com.karasusoft.arenafitnessapi.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CreateUserDto {

    @CPF
    @NotBlank
    String uid;

    @NotBlank
    String firstName;

    @NotBlank
    String lastName;

    String gender;

    @NotBlank
    String phoneNumber;

    @Email
    String email;

    LocalDateTime DoB;

    @Getter(AccessLevel.NONE)
    List<AddressDto> addressDtoList;

    public List<AddressDto> getAddressDtoList() {

        if( addressDtoList == null) {
            addressDtoList = new ArrayList<>();
        }

        return addressDtoList;
    }
}
