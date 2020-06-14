package com.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Company;
import com.challenge.repository.CompanyRepository;
import com.challenge.service.interfaces.CompanyServiceInterface;

@Service("companyService")
public class CompanyService implements CompanyServiceInterface{

	@Autowired
	private CompanyRepository companyRepository;


	@Override
	public Company save(Company company) {
		// TODO Auto-generated  stub
		return companyRepository.save(company);
	}

	@Override
	public Optional<Company> findById(Long id) {
		return companyRepository.findById(id);
	}

	@Override
	public List<Company> findByAccelerationId(Long accelerationId) {
		return this.companyRepository.findDistinctCompanyByCandidatesIdAccelerationId(accelerationId);

	}

	@Override
	public List<Company> findByUserId(Long userId) {
		return this.companyRepository.findCompanyByCandidatesIdUserId(userId);
	}

}
