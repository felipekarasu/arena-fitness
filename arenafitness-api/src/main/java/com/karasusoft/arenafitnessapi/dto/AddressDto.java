package com.karasusoft.arenafitnessapi.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class AddressDto {

    private String addressName;
    private String addressNumber;
    private String area;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String complement;
    private String reference;
}
