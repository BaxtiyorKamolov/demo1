package com.example.demo1.controller;

import com.example.demo1.domain.Disease;
import com.example.demo1.dto.DiseaseDTO;
import com.example.demo1.service.DiseaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diseases")
public class DiseaseController {
    private final DiseaseService diseaseService;

    public DiseaseController(DiseaseService diseaseService) {
        this.diseaseService = diseaseService;
    }
    @PostMapping("")
    public ResponseEntity<?> addDisease(
            @RequestBody DiseaseDTO diseaseDTO
            ){
        return ResponseEntity
                .status(201)
                .body(diseaseService.addDisease(diseaseDTO));
    }

    @GetMapping
    public ResponseEntity<List<Disease>> getAll(){
        return ResponseEntity.ok(diseaseService.getAllDiseases());
    }
}
