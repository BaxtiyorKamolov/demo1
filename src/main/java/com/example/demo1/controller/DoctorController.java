package com.example.demo1.controller;

import com.example.demo1.domain.Doctor;
import com.example.demo1.dto.DoctorDTO;
import com.example.demo1.service.impl.DoctorServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    private final DoctorServiceImpl doctorService;

    public DoctorController(DoctorServiceImpl doctorService){
        this.doctorService = doctorService;
    }
    @PostMapping()
    public ResponseEntity<?> addDoctor(
            @RequestBody DoctorDTO doctorDTO
            ){
        return ResponseEntity
                .status(201)
                .body(doctorService.addDoctor(doctorDTO));
    }

    @GetMapping
    public ResponseEntity<List<Doctor>> getAll(){
        return ResponseEntity.ok(doctorService.getAllDoctors());
    }
}
