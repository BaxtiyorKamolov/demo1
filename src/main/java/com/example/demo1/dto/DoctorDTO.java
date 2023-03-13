package com.example.demo1.dto;

import lombok.*;

@Getter
@Data
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDTO {
    private String firstname;
    private String lastname;
    private String specialty;
    private String diagnosis;
    private String treatmentMethods;
    private String methods;
}
