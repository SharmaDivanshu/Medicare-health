package com.cognizant.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.entity.Admin;

public class AdminDaoImpl implements AdminDao{
	@Autowired
	SessionFactory sessionFactory;
	

	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<Admin> adminList=session.createQuery("from Admin").list();
		session.close();
		return adminList;
	}

}
