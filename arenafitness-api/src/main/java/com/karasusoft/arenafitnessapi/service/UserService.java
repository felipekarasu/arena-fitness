package com.karasusoft.arenafitnessapi.service;

import com.karasusoft.arenafitnessapi.enums.UserStatus;
import com.karasusoft.arenafitnessapi.model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserModel save(UserModel userModel);

    boolean existsByDocument (String document);

    List<UserModel> findAll();

    Optional<UserModel> findById(String id);

    void delete(UserModel userModel);

    List<UserModel> findAllByStatus(UserStatus userStatus);
}
