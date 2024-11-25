package com.example.prueba.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(
        indexes = {
                @Index(name = "indexCategoryName", columnList = "categoryName")
        }
)
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Category implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String categoryName;
    private String description;
    private String picture;
}
