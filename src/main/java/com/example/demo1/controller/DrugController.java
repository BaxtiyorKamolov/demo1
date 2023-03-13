package com.example.demo1.controller;

import com.example.demo1.domain.Drug;
import com.example.demo1.dto.DrugDTO;
import com.example.demo1.service.DrugService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drugs")
public class DrugController {
    private final DrugService drugService;

    public DrugController(DrugService drugService) {
        this.drugService = drugService;
    }

    @PostMapping()
    public ResponseEntity<?> addDrug(
            @RequestBody DrugDTO drug
            ){
        return ResponseEntity
                .status(201)
                .body(drugService.addDrug(drug));

    }
    @GetMapping
    public ResponseEntity<List<Drug>> getAll(){
        return ResponseEntity.ok(drugService.getAllDrugs());
    }
}
