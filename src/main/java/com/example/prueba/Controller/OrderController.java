package com.example.prueba.Controller;

import com.example.prueba.Entity.Category;
import com.example.prueba.Entity.Order;
import com.example.prueba.Entity.OrderDetail;
import com.example.prueba.Service.OrderDetailService;
import com.example.prueba.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class OrderController {
    private final OrderService orderService;
    @PostMapping("/order")
    void saveOrderDetailRepository(@RequestBody Order order) {
        orderService.save(order);
    }
    @GetMapping("/order2")
    public ResponseEntity<List<Order>> returnCategoryRepository(){
        return new ResponseEntity<List<Order>>(orderService.findAll(),null, HttpStatus.CREATED);
    }
}
