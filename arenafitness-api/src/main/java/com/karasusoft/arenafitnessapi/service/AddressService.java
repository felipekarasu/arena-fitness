package com.karasusoft.arenafitnessapi.service;

import com.karasusoft.arenafitnessapi.model.AddressModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AddressService {

    AddressModel save(AddressModel addressModel);

    Optional<AddressModel> findById(UUID addressId);

    List<AddressModel> getAllByUserUid(String userUid);

}
