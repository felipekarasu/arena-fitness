package com.karasusoft.arenafitnessapi.service.impl;

import com.karasusoft.arenafitnessapi.enums.UserStatus;
import com.karasusoft.arenafitnessapi.model.UserModel;
import com.karasusoft.arenafitnessapi.repoisitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService implements com.karasusoft.arenafitnessapi.service.UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserModel save(UserModel userModel) {
        return userRepository.save(userModel);
    }

    @Override
    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<UserModel> findAllByStatus(UserStatus userStatus) {
        return userRepository.findAllByUserStatus(userStatus);
    }

    @Override
    public UserModel getUserByUid(String uid) {
        return userRepository.findByUid(uid);
    }

    @Override
    @Transactional
    public void delete(UserModel userModel) {
        userRepository.delete(userModel);
    }
}
