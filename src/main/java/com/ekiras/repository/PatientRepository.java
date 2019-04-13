package com.ekiras.repository;

import com.ekiras.domain.Patient;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

/**
 * Created by ekansh on 14/7/15.
 */
@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

}
