package com.assignment.incidentmanagement.controller;


import com.assignment.incidentmanagement.dto.IncidentRequest;
import com.assignment.incidentmanagement.model.Incident;
import com.assignment.incidentmanagement.model.User;
import com.assignment.incidentmanagement.service.IMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/incident")
public class IncidentController {

    @Autowired
    private IMService imService;

    @PostMapping("/create")
    public Incident createIncident(@RequestBody IncidentRequest incidentRequest){
        return imService.createIncident(incidentRequest);

    }

    @GetMapping("/getIncident/{id}")
    public Optional<Incident> getIncident(@PathVariable Long ID){
        return imService.getIncident(ID);
    }
}
