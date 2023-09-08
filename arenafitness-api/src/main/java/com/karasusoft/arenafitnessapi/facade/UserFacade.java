package com.karasusoft.arenafitnessapi.facade;

import com.karasusoft.arenafitnessapi.dto.CreateUserDto;
import com.karasusoft.arenafitnessapi.enums.UserStatus;
import com.karasusoft.arenafitnessapi.model.UserModel;

import java.util.List;

public interface UserFacade {

    public UserModel createUser(CreateUserDto createUserDto);

    public UserModel getUser(String uid);

    public List<UserModel> getAllUsers();

    public List<UserModel> getUsersByStatus(UserStatus status);
}
