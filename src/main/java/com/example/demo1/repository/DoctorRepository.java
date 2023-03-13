package com.example.demo1.repository;

import com.example.demo1.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.print.Doc;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
