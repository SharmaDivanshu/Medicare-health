package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.dao.PatientDetailsDao;
import com.cognizant.entity.PatientDetails;

public class PatientRegistrationServiceImpl implements PatientRegistrationService{
    @Autowired
    PatientDetailsDao patientDao;

	@Override
	public List<PatientDetails> getAllPatients() {
		// TODO Auto-generated method stub
		return patientDao.getAllPatients();
	}


	public boolean patientPersist(PatientDetails patientDetails) {
		// TODO Auto-generated method stub
		return patientDao.persistPatient(patientDetails);
	}

	
}
