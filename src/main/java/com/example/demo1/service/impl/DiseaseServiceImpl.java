package com.example.demo1.service.impl;


import com.example.demo1.domain.Disease;
import com.example.demo1.dto.DiseaseDTO;
import com.example.demo1.repository.DiseaseRepository;
import com.example.demo1.service.DiseaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseServiceImpl implements DiseaseService {
    private final DiseaseRepository  diseaseRepository;


    public DiseaseServiceImpl(DiseaseRepository diseaseRepository) {
        this.diseaseRepository = diseaseRepository;
    }
    @Override
    public Disease addDisease(DiseaseDTO diseaseDTO){
        return diseaseRepository.save(Disease.builder()
                .name(diseaseDTO.getName())
                .diseaseTypes(diseaseDTO.getDiseaseTypes())
                .diseaseSymptoms(diseaseDTO.getDiseaseSymptoms())
                .build());
    }

    @Override
    public List<Disease> getAllDiseases() {
        return diseaseRepository.findAll();
    }
}
