package com.karasusoft.arenafitnessapi.controller;

import com.karasusoft.arenafitnessapi.dto.UserDto;
import com.karasusoft.arenafitnessapi.model.UserModel;
import com.karasusoft.arenafitnessapi.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Object> createUser(@RequestBody @Valid UserDto userDto) {

        var  userModel = new UserModel();
        BeanUtils.copyProperties(userDto, userModel);
        userModel.setCreationDate(LocalDateTime.now(ZoneId.of("UTC")));

        if(userService.existsByDocument(userDto.getDocument())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("This user is already registered.");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userModel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUser(@PathVariable(value = "id") String id) {

        Optional<UserModel> optionalUser = userService.findById(id);

        if(!optionalUser.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("This user doesn't exists.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(optionalUser.get());
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> getAllUsers() {

        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
    }

    @PutMapping
    public ResponseEntity<Object> updateUser(@PathVariable(value = "id") String id,
                                             @RequestBody @Valid UserDto userDto) {

        Optional<UserModel> optionalUser = userService.findById(id);

        if(!optionalUser.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("This user doesn't exists.");
        }

        var userModel = optionalUser.get();

        return ResponseEntity.status(HttpStatus.OK).body(userService.save(userModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable(value = "id") String id) {

        Optional<UserModel> optionalUser = userService.findById(id);

        if(!optionalUser.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("This user doesn't exists.");
        }

        userService.delete(optionalUser.get());

        return ResponseEntity.status(HttpStatus.OK).body("User removed successfully.");
    }
}
