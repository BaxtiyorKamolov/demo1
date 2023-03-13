package com.example.demo1.service;

import com.example.demo1.domain.Doctor;
import com.example.demo1.domain.Drug;
import com.example.demo1.dto.DoctorDTO;
import com.example.demo1.dto.DrugDTO;
import com.example.demo1.repository.DrugRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DrugService {
    Drug addDrug(DrugDTO drugDTO);
//    private final DrugRepository drugRepository;
//
//    public DrugService(DrugRepository drugRepository) {
//        this.drugRepository = drugRepository;
//    }
//
//    public Drug addDrug(DrugDTO drug){
//        return drugRepository.save(Drug.builder()
//                .name(drug.getName())
//                .diseaseType(drug.getDiseaseType())
//                .build());
//    }

    List<Drug> getAllDrugs();

}
