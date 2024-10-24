package com.example.prueba.Entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Embeddable
@Data
public class OrderDetailPK {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Order order;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Product product;
}
