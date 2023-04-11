package com.karasusoft.arenafitnessapi.repoisitory;

import com.karasusoft.arenafitnessapi.enums.UserStatus;
import com.karasusoft.arenafitnessapi.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

    boolean existsByDocument(String document);

    List<UserModel> findAllByUserStatus(UserStatus userStatus);
}