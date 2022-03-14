package com.karasusoft.arenafitnessapi.reoisitory;

import com.karasusoft.arenafitnessapi.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

    boolean existsByDocument(String document);
}