package com.example.prueba.Entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import org.aspectj.weaver.ast.Or;

@Entity
@Table(
        indexes = {
                @Index(name = "indexProductPkId", columnList = "productId"),
                @Index(name = "indexOrderPkId", columnList = "orderId"),
        }
)
@Data
public class OrderDetail   {
    @EmbeddedId
    private OrderDetailPK id;
    private String unitPrice;
    private String quantity;
    private Integer discount;

    


}
