package com.example.prueba.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(
        indexes = {
                @Index(name = "indexCategoryName", columnList = "categoryName")
        }
)
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String categoryName;
    private String description;
    private String picture;
}
