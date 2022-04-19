package com.karasusoft.arenafitnessapi.service;

import com.karasusoft.arenafitnessapi.model.AddressModel;
import com.karasusoft.arenafitnessapi.repoisitory.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AddressServiceImplementation implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    @Transactional
    public AddressModel save(AddressModel addressModel) {
        return addressRepository.save(addressModel);
    }

    @Override
    public List<AddressModel> getAllByUserId(String userId) {
        return addressRepository.findAllAddressesByUserDocument(userId);
    }
}
