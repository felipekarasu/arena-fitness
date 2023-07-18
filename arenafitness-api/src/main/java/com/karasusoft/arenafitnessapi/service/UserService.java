package com.karasusoft.arenafitnessapi.service;

import com.karasusoft.arenafitnessapi.enums.UserStatus;
import com.karasusoft.arenafitnessapi.model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserModel save(UserModel userModel);

    UserModel getUserByUid(String uid);

    List<UserModel> findAll();

    List<UserModel> findAllByStatus(UserStatus userStatus);

    void delete(UserModel userModel);
}
