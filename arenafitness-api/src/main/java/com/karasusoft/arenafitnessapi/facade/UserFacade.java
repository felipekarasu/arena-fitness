package com.karasusoft.arenafitnessapi.facade;

import com.karasusoft.arenafitnessapi.dto.CreateUserDto;
import com.karasusoft.arenafitnessapi.model.UserModel;

public interface UserFacade {

    public UserModel createUser(CreateUserDto createUserDto);

    public UserModel getUser(String uid);
}
