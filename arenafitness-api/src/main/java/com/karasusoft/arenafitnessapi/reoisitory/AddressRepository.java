package com.karasusoft.arenafitnessapi.reoisitory;

import com.karasusoft.arenafitnessapi.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<AddressModel, UUID> {

}