package com.assignment.incidentmanagement.service;


import com.assignment.incidentmanagement.dto.IncidentRequest;
import com.assignment.incidentmanagement.dto.PincodeResponse;
import com.assignment.incidentmanagement.dto.UserRequest;
import com.assignment.incidentmanagement.model.Incident;
import com.assignment.incidentmanagement.model.User;
import com.assignment.incidentmanagement.repository.IncidentRepository;
import com.assignment.incidentmanagement.repository.UserRepository;
import jakarta.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class IMService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private IncidentRepository incidentRepository;



    public  User getUser(String emailID) {
        return userRepository.findByEmail(emailID);

    }

    public  void registerUser(UserRequest userRequest) {



         userRepository.save(mapToUser(userRequest));

    }



    public User mapToUser(UserRequest userRequest){

     //  PincodeResponse response = pincodeService.getCountryAndCityByPostalCode(userRequest.getPincode());

        User user = User.builder().
                name(userRequest.getName())
                .email(userRequest.getEmail())
                .phoneNo(userRequest.getPhoneNo())
                .address(userRequest.getAddress())
                .pincode(userRequest.getPincode())
                .city(userRequest.getCity())
                .country(userRequest.getCountry())
                .password(userRequest.getPassword())
                .build();
                return user;
    }

    public Incident mapToIncident(IncidentRequest incidentRequest){



        Incident incident = Incident.builder()
                .type(incidentRequest.getType())
                .reporterName(incidentRequest.getReporterName())
                .details(incidentRequest.getDetails())
                .reportedDateTime(incidentRequest.getReportedDateTime())
                .priority(incidentRequest.getPriority())
                .status(incidentRequest.getStatus())
                .field(incidentRequest.getField()).build();

               return incident;
    }

    public User findByEmail(String email) {

        return userRepository.findByEmail(email);
    }

    public Incident createIncident(IncidentRequest incidentRequest) {

         return incidentRepository.save(mapToIncident(incidentRequest));
    }


    public Optional<Incident> getIncident(Long id) {
        return incidentRepository.findById(id);
    }
}
