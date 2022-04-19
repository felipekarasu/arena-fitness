package com.karasusoft.arenafitnessapi.service;

import com.karasusoft.arenafitnessapi.model.AddressModel;

import java.util.List;

public interface AddressService {

    AddressModel save(AddressModel addressModel);

    List<AddressModel> getAllByUserId(String userId);

}
