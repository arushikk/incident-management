package com.assignment.incidentmanagement.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder

public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id ;
    private String name;

    private String email;
    private BigInteger phoneNo;
   private String address ;
   private String pincode ;
    private String city ;
    private String  country;
    private String password ;

   @OneToMany(cascade = CascadeType.ALL)
    private List<Incident> incidents;




}
