package com.example.prueba.Controller;

import com.example.prueba.Entity.OrderDetail;
import com.example.prueba.Entity.Shipper;
import com.example.prueba.Service.OrderDetailService;
import com.example.prueba.Service.ShipperService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OrderDetailController {
    private final OrderDetailService orderDetailService;
    @PostMapping("/orderdetail")
    void saveOrderDetailRepository(@RequestBody OrderDetail orderDetail) {
        orderDetailService.save(orderDetail);
    }
}
