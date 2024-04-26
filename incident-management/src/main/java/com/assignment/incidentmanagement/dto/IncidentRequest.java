package com.assignment.incidentmanagement.dto;


import com.assignment.incidentmanagement.model.Field;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IncidentRequest {





    private String type; // Enterprise or Government

    private String reporterName;

    private String details;

    private LocalDateTime reportedDateTime;

    private String priority;

    private String status;

    private Field field ;
}
