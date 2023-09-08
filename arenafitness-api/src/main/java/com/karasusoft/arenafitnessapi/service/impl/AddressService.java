package com.karasusoft.arenafitnessapi.service.impl;

import com.karasusoft.arenafitnessapi.model.AddressModel;
import com.karasusoft.arenafitnessapi.repoisitory.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AddressService implements com.karasusoft.arenafitnessapi.service.AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    @Transactional
    public AddressModel save(AddressModel addressModel) {
        return addressRepository.save(addressModel);
    }

    @Override
    public Optional<AddressModel> findById(UUID addressId) {
        return addressRepository.findById(addressId);
    }

    //TODO refactor remove address from name
    @Override
    public List<AddressModel> getAllByUserUid(String userUid) {
        return addressRepository.findAllAddressesByUserUid(userUid);
    }
}
