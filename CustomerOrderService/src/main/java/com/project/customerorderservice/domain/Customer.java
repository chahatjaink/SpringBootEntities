package com.project.customerorderservice.domain;

import com.project.customerorderservice.enums.Category;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long orders;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String discount;

}

