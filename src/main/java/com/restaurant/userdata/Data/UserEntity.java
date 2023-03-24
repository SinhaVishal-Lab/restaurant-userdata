package com.restaurant.userdata.Data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name="user_data" , indexes = {@Index(columnList = "email", name="email")})
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue
    @Column(nullable=false, unique=true)
    private long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String passwordHash;
    private String status;
    private String privacy;
}

