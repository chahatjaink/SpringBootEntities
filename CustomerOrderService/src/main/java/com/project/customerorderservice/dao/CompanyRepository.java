package com.project.customerorderservice.dao;

import com.project.customerorderservice.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CompanyRepository extends JpaRepository<Company,Long> {
    Company findByCompanyId(Long companyId);
}
