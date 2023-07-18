package com.karasusoft.arenafitnessapi.populator;

import com.karasusoft.arenafitnessapi.dto.AddressDto;
import com.karasusoft.arenafitnessapi.model.AddressModel;

public class AddressPopulator implements Populator<AddressModel, AddressDto> {

    @Override
    public void populate(AddressModel addressModel, AddressDto addressDto) {
        //TODO validate null objects
        addressDto.setAddressName(addressModel.getAddressName());
        addressDto.setAddressNumber(addressModel.getAddressNumber());
        addressDto.setArea(addressDto.getArea());
        addressDto.setCity(addressDto.getCity());
        addressDto.setState(addressDto.getState());
        addressDto.setCountry(addressDto.getCountry());
        addressDto.setPostalCode(addressDto.getPostalCode());
    }
}
