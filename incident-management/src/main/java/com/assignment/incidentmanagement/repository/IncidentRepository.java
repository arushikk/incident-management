package com.assignment.incidentmanagement.repository;


import com.assignment.incidentmanagement.model.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentRepository extends JpaRepository<Incident , Long> {

//    Incident findByReporter(String email);
}
