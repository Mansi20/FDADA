package com.ekiras.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.ekiras.domain.Patient;
@Service
public interface PatientService {
  
  

public List<Patient> getPatientDetails(int patientId);



}
