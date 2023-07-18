package com.karasusoft.arenafitnessapi.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class CreateAddressDto {

    @NotBlank
    private String addressName;

    @NotBlank
    private String addressNumber;

    @NotBlank
    private String area;

    @NotBlank
    private String city;

    @NotBlank
    private String state;

    @NotBlank
    private String country;

    @NotBlank
    private String postalCode;

    private String complement;

    private String reference;
}
