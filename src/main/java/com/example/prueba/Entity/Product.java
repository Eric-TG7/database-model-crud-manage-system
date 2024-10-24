package com.example.prueba.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(
        indexes = {
                @Index(name = "indexProductName", columnList = "productName"),
                @Index(name = "indexSupplierId", columnList = "supplierId"),
                @Index(name = "indexCategoryId", columnList = "categoryId"),
        }
)
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String productName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id")
    private Supplier supplierId;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categoryId;
    private String quantityPerUnit;
    private String unitPrice;
    private String unitsInStock;
    private String unitsOnOrder;
    private String reOrderLevel;
    private String discontinued;
}
