package com.cognizant.dao;

import java.util.List;


import com.cognizant.entity.PatientDetails;

public interface PatientDetailsDao {
	List<PatientDetails>getAllPatients();
	boolean persistPatient(PatientDetails patientDetails);
	
}
