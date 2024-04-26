package com.assignment.incidentmanagement.dto;


import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {


    private String name;

    private String email;
    private BigInteger phoneNo;
    private String address ;
    private String pincode ;
    private String city ;
    private String  country;
    private String password;

}
