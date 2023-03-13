package com.example.demo1.dto;


import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DiseaseDTO {
    private String name;
    private String diseaseTypes;
    private String diseaseSymptoms;
}
