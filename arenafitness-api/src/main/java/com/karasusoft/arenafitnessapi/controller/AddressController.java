package com.karasusoft.arenafitnessapi.controller;

import com.karasusoft.arenafitnessapi.dto.AddressDto;
import com.karasusoft.arenafitnessapi.model.AddressModel;
import com.karasusoft.arenafitnessapi.model.UserModel;
import com.karasusoft.arenafitnessapi.service.AddressService;
import com.karasusoft.arenafitnessapi.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Object> createAddress(@RequestBody @Valid AddressDto addressDto){

        AddressModel addressModel = new AddressModel();
        BeanUtils.copyProperties(addressDto, addressModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(addressService.save(addressModel));
    }

    /*@GetMapping("/user/{userId}")
    public ResponseEntity<List<AddressModel>> getAddressesByUserId(@PathVariable(value = "userId") String userId){

        UserModel userModel = userService.getUserByUid(userId);

        if(userModel.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ArrayList<>());
        }

        return ResponseEntity.status(HttpStatus.OK).body(addressService.getAllByUserId(userId));
    }*/

    /*@PutMapping("{addressId}/associateUser/{userId}")
    public ResponseEntity<Object> associateAddress(@PathVariable(value = "addressId") UUID addressId,
                                                   @PathVariable(value = "userId") String userId){

        Optional<UserModel> optionalUser = userService.findById(userId);
        Optional<AddressModel> optionalAddress = addressService.findById(addressId);

        if(!optionalUser.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not Found!");
        }

        if(!optionalAddress.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Address not Found!");
        }

        optionalUser.get().getAddressModelList().add(optionalAddress.get());
        userService.save(optionalUser.get());

        return ResponseEntity.status(HttpStatus.OK).body(optionalUser.get());
    }*/
}
