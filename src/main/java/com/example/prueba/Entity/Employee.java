package com.example.prueba.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(
        indexes = {
                @Index(name = "indexLastName", columnList = "lastName"),
                @Index(name = "indexPostalCodeEmployee", columnList = "postalCode"),
        }
)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String lastName;
    private String firstName;
    private String title;
    private String titleOfCourtesy;//
    private String birthDate;
    private String hireDate;
    private String address;
    private String city;
    private String region;
    private Integer postalCode;
    private String country;
    private String homePhone;
    private String extension;
    private String photo;
    private String notes;
    private String reportsTo;
}
