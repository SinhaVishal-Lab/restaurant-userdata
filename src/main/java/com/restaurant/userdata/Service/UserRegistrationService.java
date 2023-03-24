package com.restaurant.userdata.Service;

import com.restaurant.userdata.Data.UserEntity;
import com.restaurant.userdata.Data.UserResponse;
import com.restaurant.userdata.Repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRegistrationService {

    @Autowired
    UserRegistrationRepository repository;

    public void saveUserData(UserEntity entity) {
        repository.save(entity);
    }

    public UserResponse findUserData(long userId){
        UserResponse response = UserResponse.builder().build();
        Optional<UserEntity> entity = repository.findById(userId);

        return response;
    }
}
