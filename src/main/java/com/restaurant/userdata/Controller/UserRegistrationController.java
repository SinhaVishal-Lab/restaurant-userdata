package com.restaurant.userdata.Controller;

import com.restaurant.userdata.Data.UserEntity;
import com.restaurant.userdata.Data.UserResponse;
import com.restaurant.userdata.Service.UserRegistrationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/user-def")
@Slf4j
@RequiredArgsConstructor
public class UserRegistrationController {

    @Autowired
    UserRegistrationService service;

    @PostMapping("/user-registration")
    public ResponseEntity userRegistration(@RequestBody UserEntity entity){
        service.saveUserData(entity);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/user-details/{userId}")
    public void getUserDetails(@PathVariable(name="userId") long userId){
        UserResponse user = service.findUserData(userId);
    }
}
