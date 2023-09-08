package com.karasusoft.arenafitnessapi.facade.impl;

import com.karasusoft.arenafitnessapi.converter.Converter;
import com.karasusoft.arenafitnessapi.dto.CreateUserDto;
import com.karasusoft.arenafitnessapi.enums.UserStatus;
import com.karasusoft.arenafitnessapi.facade.UserFacade;
import com.karasusoft.arenafitnessapi.model.UserModel;
import com.karasusoft.arenafitnessapi.populator.impl.UserAddressReversePopulator;
import com.karasusoft.arenafitnessapi.populator.impl.UserReversePopulator;
import com.karasusoft.arenafitnessapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DefaultUserFacade implements UserFacade {

    @Autowired
    UserReversePopulator userReversePopulator;
    @Autowired
    UserAddressReversePopulator userAddressReversePopulator;
    @Autowired
    UserService userService;

    Converter<CreateUserDto, UserModel> userConverter;

    @Override
    public UserModel createUser(CreateUserDto createUserDto) {

        UserModel usermodel;

        userConverter = userConverter.of(UserModel.class)
                .withPopulator(userReversePopulator)
                .withPopulator(userAddressReversePopulator);

        usermodel = userConverter.convert(createUserDto);

        userService.save(usermodel);

        return usermodel;
    }

    @Override
    public UserModel getUser(String uid) {

        return userService.getUserByUid(uid);
    }

    @Override
    public List<UserModel> getAllUsers() {
        return userService.findAll();
    }

    @Override
    public List<UserModel> getUsersByStatus(UserStatus status) {
        return userService.findAllByStatus(status);
    }
}
