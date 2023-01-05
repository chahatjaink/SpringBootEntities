package com.project.customerorderservice.dao;

import com.project.customerorderservice.domain.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    Page<Employee> findAllByCompanyId(Long companyId, Pageable pageable);
}
