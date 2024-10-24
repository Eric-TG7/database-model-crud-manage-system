package com.example.prueba.Controller;

import com.example.prueba.Entity.Order;
import com.example.prueba.Entity.OrderDetail;
import com.example.prueba.Service.OrderDetailService;
import com.example.prueba.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class OrderController {
    private final OrderService orderService;
    @PostMapping("/order")
    void saveOrderDetailRepository(@RequestBody Order order) {
        orderService.save(order);
    }
}
