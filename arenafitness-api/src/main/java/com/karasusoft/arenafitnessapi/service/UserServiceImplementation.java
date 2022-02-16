package com.karasusoft.arenafitnessapi.service;

import com.karasusoft.arenafitnessapi.model.UserModel;
import com.karasusoft.arenafitnessapi.reoisitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserModel save(UserModel userModel) {
        return userRepository.save(userModel);
    }
}
