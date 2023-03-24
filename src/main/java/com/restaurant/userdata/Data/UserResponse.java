package com.restaurant.userdata.Data;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserResponse {
    private long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String status;
    private String privacy;
}
