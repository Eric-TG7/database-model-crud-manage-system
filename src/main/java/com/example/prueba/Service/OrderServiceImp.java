package com.example.prueba.Service;

import com.example.prueba.Entity.Order;
import com.example.prueba.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImp extends CrudServiceImp<Order,Long> implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    protected JpaRepository<Order, Long> getRepository() {
    return orderRepository;
    }
}
