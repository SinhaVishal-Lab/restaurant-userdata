package com.restaurant.userdata.Data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address{
    private String zipcode;
    private String country;
    private String city;
    private String addressLine;
}