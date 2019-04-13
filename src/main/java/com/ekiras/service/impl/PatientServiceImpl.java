package com.ekiras.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ekiras.domain.Patient;
import com.ekiras.repository.PatientRepository;
import com.ekiras.service.PatientService;

public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepository patientRepo;
	
	@Override
	public List<Patient> getPatientDetails(int patientId) {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
	}

}
