package com.restaurant.userdata.Data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name="user_address")
@Getter
@Setter
public class AddressEntity {
    @Id
    @Column(nullable=false, unique=true)
    private long id;
    private long userId;
    private List<Address> addressList;
}
