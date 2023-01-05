package com.project.customerorderservice.controller;

import com.project.customerorderservice.config.APIController;
import com.project.customerorderservice.domain.Employee;
import com.project.customerorderservice.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping(path = APIController.SAVE_EMPLOYEE)
    @ResponseBody
    public Employee saveEmployee(@RequestBody Employee employee) throws Exception{
        return employeeService.saveEmployee(employee);
    }
}
