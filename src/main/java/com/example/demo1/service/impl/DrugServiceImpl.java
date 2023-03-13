package com.example.demo1.service.impl;

import com.example.demo1.domain.Drug;
import com.example.demo1.dto.DrugDTO;
import com.example.demo1.repository.DrugRepository;
import com.example.demo1.service.DrugService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugServiceImpl implements DrugService {
    private final DrugRepository drugRepository;

    public DrugServiceImpl(DrugRepository drugRepository) {
        this.drugRepository = drugRepository;
    }


    @Override
    public Drug addDrug(DrugDTO drugDTO){
        return drugRepository.save(Drug.builder()
                .name(drugDTO.getName())
                .diseaseType(drugDTO.getDiseaseType())
                .build());
    }

    public List<Drug> getAllDrugs(){
        return drugRepository.findAll();
    }
}
