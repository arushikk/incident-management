package com.assignment.incidentmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Incident {




        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String incidentId;

        private String type; // Enterprise or Government

        private String reporterName;

        private String details;

        private LocalDateTime reportedDateTime;

        private String priority;

        private String status;

        private Field field ;



        // Auto-generate unique Incident ID in the format RMG + Random 5-digit number + Current year (2022)
        private String generateIncidentId() {
            String prefix = "RMG";
            String randomDigits = String.format("%05d", (int) (Math.random() * 100000)); // Generate random 5-digit number
            int year = 2022;
            return prefix + randomDigits + year;
        }

       @ManyToOne
        @JoinColumn(name = "reporter")
       private User reporter;


    }

