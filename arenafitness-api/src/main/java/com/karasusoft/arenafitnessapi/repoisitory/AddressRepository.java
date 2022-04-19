package com.karasusoft.arenafitnessapi.repoisitory;

import com.karasusoft.arenafitnessapi.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AddressRepository extends JpaRepository<AddressModel, UUID> {

    List<AddressModel> findAllAddressesByUserDocument(String userId);
}