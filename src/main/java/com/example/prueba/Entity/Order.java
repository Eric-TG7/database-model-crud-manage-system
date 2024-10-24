package com.example.prueba.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "orders",
        indexes = {
                @Index(name = "indexCustomerId", columnList = "customerId"),
                @Index(name = "indexEmployeeId", columnList = "employeeId"),
                @Index(name = "indexOrderDate", columnList = "orderDate"),
                @Index(name = "indexShippedDate", columnList = "shippedDate"),
                @Index(name = "indexShipVia", columnList = "shipperId"),
                @Index(name = "indexShipPostalCode", columnList = "shipPostalCode")
        }
)
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="customer_id")
    private Customer customerId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="employee_id")
    private Employee employeeId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="shipper_id")
    private Shipper shipVia;
    private Integer freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;
    private String orderDate;
    private String requiredDate;
    private String shippedDate;
}
