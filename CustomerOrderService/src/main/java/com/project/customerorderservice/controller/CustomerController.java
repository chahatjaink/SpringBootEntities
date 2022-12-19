package com.project.customerorderservice.controller;

import com.project.customerorderservice.config.APIController;
import com.project.customerorderservice.domain.Customer;
import com.project.customerorderservice.services.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(path = APIController.SAVE_CUSTOMER)
    @ResponseBody
    public Customer saveCustomer(@RequestBody Customer customer) throws Exception {
        return customerService.saveCustomer(customer);
    }
}
