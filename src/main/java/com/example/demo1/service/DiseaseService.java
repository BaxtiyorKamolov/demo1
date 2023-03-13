package com.example.demo1.service;


import com.example.demo1.domain.Disease;
import com.example.demo1.domain.Doctor;
import com.example.demo1.dto.DiseaseDTO;
import com.example.demo1.dto.DoctorDTO;
import com.example.demo1.repository.DiseaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DiseaseService {

    Disease addDisease(DiseaseDTO diseaseDTO);
//    private final DiseaseRepository  diseaseRepository;
//
//
//    public DiseaseService(DiseaseRepository diseaseRepository) {
//        this.diseaseRepository = diseaseRepository;
//    }
//    public Disease addDisease(DiseaseDTO diseaseDTO){
//        return diseaseRepository.save(Disease.builder()
//                .name(diseaseDTO.getName())
//                .diseaseTypes(diseaseDTO.getDiseaseTypes())
//                .diseaseSymptoms(diseaseDTO.getDiseaseSymptoms())
//                .build());
//    }

    //Get all
    List<Disease> getAllDiseases();
}
