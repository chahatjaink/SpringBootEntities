package com.project.customerorderservice.services;

import com.project.customerorderservice.dao.CompanyRepository;
import com.project.customerorderservice.domain.Company;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company saveCompany(Company company) throws Exception {
        if(company.getOrders()<=0)
            throw new Exception("Invalid Orders");
        return this.companyRepository.save(company);
    }
    public Company getCompany(Long companyId) throws Exception {
        Company company=this.companyRepository.findByCompanyId(companyId);
        if(company==null){
            throw new Exception("Company not found");
        }
        return company;
    }

    public Company updateCompany(Company company) throws Exception {
        Company companyFromDb =this.companyRepository.findByCompanyId(company.getCompanyId());
        if(companyFromDb ==null){
            throw new Exception("Company not found");
        }
        if(company.getOrders()!=null){
            companyFromDb.setOrders(company.getOrders());
        }
        if(company.getName()!=null){
            companyFromDb.setName(company.getName());
        }
        if(company.getCategory()!=null){
            companyFromDb.setCategory(company.getCategory());
        }
        return this.companyRepository.save(companyFromDb);
    }


    public Boolean deleteCompany(Long companyId) throws Exception {
        Company company =this.companyRepository.findByCompanyId(companyId);
        if(company ==null){
            throw new Exception("Company not found");
        }
        this.companyRepository.delete(company);
        return true;
    }

}
