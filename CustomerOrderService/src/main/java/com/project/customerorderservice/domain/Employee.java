package com.project.customerorderservice.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;

    private String name;

    private Integer duration;
    private Integer stipend;

    private String profile;
    private Boolean wfh;

    @Column(name = "company_id")
    private Long companyId;


}
