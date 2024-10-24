package com.example.prueba.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Shipper {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String companyName;
    private String phone;
}
