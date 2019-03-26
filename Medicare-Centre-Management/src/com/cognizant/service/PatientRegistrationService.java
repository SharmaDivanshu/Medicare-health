package com.cognizant.service;

import java.util.List;


import com.cognizant.entity.PatientDetails;

public interface PatientRegistrationService {
	List<PatientDetails>getAllPatients();
	boolean patientPersist(PatientDetails patientDetails);
}
