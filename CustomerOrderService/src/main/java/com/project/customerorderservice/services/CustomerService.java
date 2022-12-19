package com.project.customerorderservice.services;

import com.project.customerorderservice.dao.CustomerRepository;
import com.project.customerorderservice.domain.Customer;
import com.project.customerorderservice.enums.Category;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer saveCustomer(Customer customer) throws Exception {
        if(customer.getOrders()<=0)
            throw new Exception("Invalid Orders");
        if(customer.getOrders()>=10 && customer.getOrders()<20){
            customer.setCategory(Category.GOLD);
            customer.setDiscount("10%");
        } else if (customer.getOrders()>=20) {
            customer.setCategory(Category.PLATINUM);
            customer.setDiscount("20%");
        }
        else {
            if(customer.getOrders()==9 || customer.getOrders()==19)
                sendMail();
            customer.setCategory(Category.REGULAR);
            customer.setDiscount("0%");
        }
        return this.customerRepository.save(customer);
    }

    public void sendMail(){
        System.out.println("Sent mail to Customer");
    }

}
