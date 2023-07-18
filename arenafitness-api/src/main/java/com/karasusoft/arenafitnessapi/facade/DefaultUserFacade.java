package com.karasusoft.arenafitnessapi.facade;

import com.karasusoft.arenafitnessapi.dto.CreateUserDto;
import com.karasusoft.arenafitnessapi.model.UserModel;
import com.karasusoft.arenafitnessapi.populator.UserReversePopulator;
import com.karasusoft.arenafitnessapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class DefaultUserFacade implements UserFacade {

    @Autowired
    UserReversePopulator userReversePopulator;

    @Autowired
    UserService userService;

    @Override
    public UserModel createUser(CreateUserDto createUserDto) {

        UserModel usermodel = new UserModel();

        userReversePopulator.populate(createUserDto, usermodel);

        userService.save(usermodel);

        return usermodel;
    }

    @Override
    public UserModel getUser(String uid) {

        return userService.getUserByUid(uid);
    }
}
