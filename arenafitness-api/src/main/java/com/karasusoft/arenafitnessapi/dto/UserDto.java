package com.karasusoft.arenafitnessapi.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

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

    LocalDateTime DoB;
}
