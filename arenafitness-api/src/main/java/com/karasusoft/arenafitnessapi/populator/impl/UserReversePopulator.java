package com.karasusoft.arenafitnessapi.populator.impl;

import com.karasusoft.arenafitnessapi.dto.CreateUserDto;
import com.karasusoft.arenafitnessapi.enums.UserStatus;
import com.karasusoft.arenafitnessapi.model.UserModel;
import com.karasusoft.arenafitnessapi.populator.Populator;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Slf4j
public class UserReversePopulator implements Populator<CreateUserDto, UserModel> {

    @Override
    public void populate(CreateUserDto source, UserModel target) {

        log.info("Starting to populate the userModel. ");

        if( StringUtils.isNotEmpty(source.getUid())) {
            target.setUid(source.getUid());
        }

        if( StringUtils.isNotEmpty(source.getFirstName())) {
            target.setFirstName(source.getFirstName());
        }

        if( StringUtils.isNotEmpty(source.getLastName())) {
            target.setLastName(source.getLastName());
        }

        if( source.getDoB() != null && source.getDoB().isBefore(LocalDateTime.now())) {
            target.setDoB(source.getDoB());
        }

        if( StringUtils.isNotEmpty(source.getGender())) {
            target.setGender(source.getGender());
        }

        if( StringUtils.isNotEmpty(source.getEmail())) {
            target.setEmail(source.getEmail());
        }

        if( StringUtils.isNotEmpty(source.getPhoneNumber())) {
            target.setPhoneNumber(source.getPhoneNumber());
        }

        target.setCreationDate(LocalDateTime.now(ZoneId.of("UTC")));
        target.setUserStatus(UserStatus.CREATED);

        log.info("usermodel populating finished. ");
    }
}
