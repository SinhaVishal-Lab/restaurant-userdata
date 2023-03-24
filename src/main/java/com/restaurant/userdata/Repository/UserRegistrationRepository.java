package com.restaurant.userdata.Repository;

import com.restaurant.userdata.Data.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserEntity, Long> {
}
