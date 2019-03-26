package com.cognizant.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.PatientDetails;

@Repository("PatientDetailDaoImpl")
public class PatientDetailDaoImpl implements PatientDetailsDao{
    @Autowired
    SessionFactory sessionFactory;
	
	public List<PatientDetails> getAllPatients() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<PatientDetails> patientList=session.createQuery("from PatientDetails").list();
		session.close();
		return patientList;
	}

	
	public boolean persistPatient(PatientDetails patientDetails) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(patientDetails);
		tx.commit();
		session.close();
		return true;
	}

}
