package com.assignment.incidentmanagement.service;


import com.assignment.incidentmanagement.dto.PincodeResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


public class PincodeService {
//
//
//     @Autowired
//    private final RestTemplate restTemplate;
//
//    public PincodeService(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//
//    public PincodeResponse getCountryAndCityByPostalCode(String postalCode) {
//        String apiUrl = "https://api.postalpincode.in/pincode/" + postalCode ;
//
//        ResponseEntity<String> responseEntity = restTemplate.exchange(
//                apiUrl,
//                HttpMethod.GET,
//                null,
//                String.class
//        );
//
//        if (responseEntity.getStatusCode() == HttpStatus.OK) {
//            ObjectMapper objectMapper = new ObjectMapper();
//            try {
//                JsonNode responseJson = objectMapper.readTree(responseEntity.getBody());
//                String country = responseJson.get("results").get(0).get("components").get("country").asText();
//                String city = responseJson.get("results").get(0).get("components").get("city").asText();
//
//                PincodeResponse postalCodeResponse = new PincodeResponse();
//                postalCodeResponse.setCountry(country);
//                postalCodeResponse.setCity(city);
//
//                return postalCodeResponse;
//            } catch (JsonProcessingException e) {
//                e.printStackTrace();
//            }
//        }
//
//        return null;
//
//    }
//
//
//

}