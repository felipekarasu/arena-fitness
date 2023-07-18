package com.karasusoft.arenafitnessapi.populator;

import com.karasusoft.arenafitnessapi.dto.CreateUserDto;
import com.karasusoft.arenafitnessapi.enums.UserStatus;
import com.karasusoft.arenafitnessapi.model.UserModel;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class UserReversePopulator implements Populator<CreateUserDto, UserModel>{

    @Override
    public void populate(CreateUserDto createUserDto, UserModel userModel) {

        if( StringUtils.isNotEmpty(createUserDto.getUid())) {
            userModel.setUid(createUserDto.getUid());
        }

        if( StringUtils.isNotEmpty(createUserDto.getFirstName())) {
            userModel.setFirstName(createUserDto.getFirstName());
        }

        if( StringUtils.isNotEmpty(createUserDto.getLastName())) {
            userModel.setLastName(createUserDto.getLastName());
        }

        if( createUserDto.getDoB() != null && createUserDto.getDoB().isBefore(LocalDateTime.now())) {
            userModel.setDoB(createUserDto.getDoB());
        }

        if( StringUtils.isNotEmpty(createUserDto.getGender())) {
            userModel.setGender(createUserDto.getGender());
        }

        if( StringUtils.isNotEmpty(createUserDto.getEmail())) {
            userModel.setEmail(createUserDto.getEmail());
        }

        if( StringUtils.isNotEmpty(createUserDto.getPhoneNumber())) {
            userModel.setPhoneNumber(createUserDto.getPhoneNumber());
        }

        userModel.setCreationDate(LocalDateTime.now(ZoneId.of("UTC")));
        userModel.setUserStatus(UserStatus.CREATED);
    }
}
