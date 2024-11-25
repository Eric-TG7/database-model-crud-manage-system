package com.example.prueba.Controller;

import com.example.prueba.Entity.Category;
import com.example.prueba.Entity.OrderDetail;
import com.example.prueba.Entity.Shipper;
import com.example.prueba.Service.OrderDetailService;
import com.example.prueba.Service.ShipperService;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OrderDetailController {
    private final OrderDetailService orderDetailService;
    @PostMapping("/orderdetail")
    void saveOrderDetailRepository(@RequestBody OrderDetail orderDetail) {
        orderDetailService.save(orderDetail);
    }
    @GetMapping("/orderdetail2")
    public ResponseEntity<List<OrderDetail>> returnCategoryRepository(){
        return new ResponseEntity<List<OrderDetail>>(orderDetailService.findAll(),null, HttpStatus.CREATED);
    }
}
