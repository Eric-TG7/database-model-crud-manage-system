package com.example.prueba.Entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Entity
@Data
@Table(
        indexes = {
                @Index(name = "indexCompanyNameCustomer", columnList = "companyName"),
                @Index(name = "indexCity", columnList = "city"),
                @Index(name = "indexRegion", columnList = "region"),
                @Index(name = "indexPostalCodeCustomer", columnList = "postalCode"),
        }
)public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private Integer postalCode;
    private String country;
    private String phone;
    private String fax;
}
