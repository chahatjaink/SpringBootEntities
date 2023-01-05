package com.project.customerorderservice.controller;

import com.project.customerorderservice.config.APIController;
import com.project.customerorderservice.domain.Company;
import com.project.customerorderservice.services.CompanyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping(path = APIController.SAVE_COMPANY)
    @ResponseBody
    public Company saveCompany(@RequestBody Company company) throws Exception {
        return companyService.saveCompany(company);
    }

    @GetMapping(path = APIController.GET_COMPANY)
    @ResponseBody
    public Company getCompany(@PathVariable Long companyId) throws Exception {
        return companyService.getCompany(companyId);
    }

    @PutMapping(path = APIController.UPDATE_COMPANY)
    @ResponseBody
    public Company updateCompany(@RequestBody Company company) throws Exception{
        return companyService.updateCompany(company);
    }

    @DeleteMapping(path = APIController.DELETE_COMPANY)
    @ResponseBody
    public Boolean deleteCompany(@PathVariable Long companyId) throws Exception{
        return companyService.deleteCompany(companyId);
    }



}
