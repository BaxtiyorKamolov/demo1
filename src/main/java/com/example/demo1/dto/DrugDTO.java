package com.example.demo1.dto;


import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DrugDTO {
    private String name;
    private String diseaseType;
}
