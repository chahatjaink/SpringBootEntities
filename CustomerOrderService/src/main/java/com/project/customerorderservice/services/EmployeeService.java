package com.project.customerorderservice.services;

import com.project.customerorderservice.dao.EmployeeRepository;
import com.project.customerorderservice.domain.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public Employee saveEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }
    public Page<Employee> getEmployee(Long companyId, Pageable pageable) {
        return this.employeeRepository.findAllByCompanyId(companyId, pageable);
    }

}
