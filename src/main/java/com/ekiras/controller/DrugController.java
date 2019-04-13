package com.ekiras.controller;

import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekiras.domain.Patient;
import com.ekiras.domain.Results;
import com.ekiras.repository.PatientRepository;
import com.ekiras.repository.ResultsRepo;
import com.lattice.constants.ApiConstants;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "FDADAO" + "drugs")
@Api(tags = ApiConstants.PATIENT)
public class DrugController {

  private static final Logger logger = LoggerFactory.getLogger(DrugController.class);
  @Autowired
  ResultsRepo repo;

  @Autowired
  PatientRepository patientrepo;
  
  @GetMapping( produces = ApiConstants.REST_JSON_CONTENT_TYPE)
  @ApiOperation(value = "Get all the patient details and their reaction's")
  public ResponseEntity<?> getPatientDetails() {
    List<Patient> fetchedPatient = patientrepo.findAll();
    if (fetchedPatient != null) {
      logger.info("getPatientDetails, ID: {}, STATUS: {}", HttpStatus.OK);
      return ResponseEntity.ok(fetchedPatient);
    } else {
      JSONObject jsonResponse = new JSONObject().put(ApiConstants.MESSAGE, ApiConstants.PATIENT_NOT_FOUND);
      logger.info("getPatientDetails, ID: {}, STATUS: {}, {}", HttpStatus.NOT_FOUND,
          jsonResponse.toString());
      return new ResponseEntity<String>(jsonResponse.toString(), HttpStatus.NOT_FOUND);
    }
  }
  
  @PostMapping( produces = ApiConstants.REST_JSON_CONTENT_TYPE)
  @ApiOperation(value = "Saves all the patient details and their reaction's")
  public ResponseEntity<?> savePatientDetails(@RequestBody Results pat) {
    Results fetchedPatient = repo.save(pat);
    if (fetchedPatient != null) {
      logger.info("getPatientDetails, ID: {}, STATUS: {}", HttpStatus.OK);
      return ResponseEntity.ok(fetchedPatient);
    } else {
      JSONObject jsonResponse = new JSONObject().put(ApiConstants.MESSAGE, ApiConstants.PATIENT_NOT_FOUND);
      logger.info("getPatientDetails, ID: {}, STATUS: {}, {}", HttpStatus.NOT_FOUND,
          jsonResponse.toString());
      return new ResponseEntity<String>(jsonResponse.toString(), HttpStatus.NOT_FOUND);
    }
  }
  
}