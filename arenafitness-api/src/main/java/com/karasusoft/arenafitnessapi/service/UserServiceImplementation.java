package com.karasusoft.arenafitnessapi.service;

import com.karasusoft.arenafitnessapi.enums.UserStatus;
import com.karasusoft.arenafitnessapi.model.UserModel;
import com.karasusoft.arenafitnessapi.repoisitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserModel save(UserModel userModel) {
        return userRepository.save(userModel);
    }

    @Override
    public boolean existsByDocument(String document) {
        return userRepository.existsByDocument(document);
    }

    @Override
    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<UserModel> findAllByStatus(UserStatus userStatus) {
        return userRepository.findAllByUserStatus(userStatus);
    }

    //TODO refactor id -> document
    @Override
    public Optional<UserModel> findById(String id) {
        return userRepository.findById(id);
    }

    @Override
    @Transactional
    public void delete(UserModel userModel) {
        userRepository.delete(userModel);
    }
}
