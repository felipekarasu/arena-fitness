package com.karasusoft.arenafitnessapi.populator;

import com.karasusoft.arenafitnessapi.dto.UserDto;
import com.karasusoft.arenafitnessapi.model.UserModel;

public class UserPopulator implements Populator<UserModel, UserDto>{

    @Override
    public void populate(UserModel userModel, UserDto userDto) {
        userDto.setDocument(userModel.getDocument());
        userDto.setFirstName(userModel.getFirstName());
        userDto.setLastName(userModel.getLastName());
        userDto.setDoB(userModel.getDoB());
        userDto.setGender(userModel.getGender());
        userDto.setEmail(userModel.getEmail());
        userDto.setPhoneNumber(userModel.getPhoneNumber());
    }

    @Override
    public void reversePopulate(UserDto userDto, UserModel userModel) {

        if(userDto.getDocument().isEmpty()){
            userModel.setDocument(userDto.getDocument());
        }

    }
}
