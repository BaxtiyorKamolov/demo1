package com.example.demo1.service;

import com.example.demo1.domain.Doctor;
import com.example.demo1.dto.DoctorDTO;

import java.util.List;

public interface DoctorService {

    Doctor addDoctor(DoctorDTO doctorDTO);

    List<Doctor> getAllDoctors();
}
