package com.assignment.incidentmanagement.controller;


import com.assignment.incidentmanagement.dto.UserLoginRequest;
import com.assignment.incidentmanagement.dto.UserRequest;
import com.assignment.incidentmanagement.model.User;
import com.assignment.incidentmanagement.service.IMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IMService imService;


    @PostMapping ("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserRequest userRequest){
        if (imService.findByEmail(userRequest.getEmail()) != null) {
            return ResponseEntity.badRequest().body("User already exists!");
        }

        imService.registerUser(userRequest);
        return ResponseEntity.ok("User registered successfully!");


    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody UserLoginRequest userLoginrequest) {
        User existingUser = imService.findByEmail(userLoginrequest.getEmail());

        if (existingUser != null && existingUser.getPassword().equals(userLoginrequest.getPassword())) {
            return ResponseEntity.ok("Login successful!");
        } else {
            return ResponseEntity.badRequest().body("Invalid username or password!");
        }
    }


    @GetMapping ("/getUser/{email}")
    public User getUser(@PathVariable String emailID){
        return imService.getUser(emailID);
    }

}
