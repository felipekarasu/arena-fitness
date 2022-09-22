package com.karasusoft.arenafitnessapi.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UserDto {

    @CPF
    @NotBlank
    String document;

    @NotBlank
    String firstName;

    @NotBlank
    String lastName;

    String gender;

    String phoneNumber;

    @Email
    String email;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate DoB;

    @Getter(AccessLevel.NONE)
    List<AddressDto> addressDtoList;

    public List<AddressDto> getAddressDtoList() {

        if( addressDtoList == null) {
            addressDtoList = new ArrayList<>();
        }

        return addressDtoList;
    }
}
