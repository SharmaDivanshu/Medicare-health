package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cognizant.dao.AdminDao;
import com.cognizant.entity.Admin;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired@Qualifier("AdminDaoImpl")
    private AdminDao adminDao;
	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return adminDao.getAllAdmin();
	}

}
