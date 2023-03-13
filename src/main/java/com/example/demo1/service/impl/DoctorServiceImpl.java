package com.example.demo1.service.impl;

import com.example.demo1.domain.Doctor;
import com.example.demo1.dto.DoctorDTO;
import com.example.demo1.repository.DoctorRepository;
import com.example.demo1.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Doctor addDoctor(DoctorDTO doctorDTO) {
        return doctorRepository.save(
                Doctor.builder()
                .firstname(doctorDTO.getFirstname())
                .lastname(doctorDTO.getLastname())
                .specialty(doctorDTO.getSpecialty())
                .diagnosis(doctorDTO.getDiagnosis())
                .treatmentMethods(doctorDTO.getTreatmentMethods())
                .build());
    }

    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }
}
