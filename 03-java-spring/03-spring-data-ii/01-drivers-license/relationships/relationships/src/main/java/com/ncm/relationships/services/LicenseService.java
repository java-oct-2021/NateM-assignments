package com.ncm.relationships.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncm.relationships.models.License; 
import com.ncm.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	
	@Autowired
	private LicenseRepository licenseRepo;
	
	public LicenseService(LicenseRepository licenseRepo) {
		this.licenseRepo = licenseRepo;
	}
	//List all
	
	public List<License> allLicenses(){
		return licenseRepo.findAll();
	}
	
	//create new license
	
	public License createLicense(License newLicense) {
		return this.licenseRepo.save(newLicense);
	}
}
