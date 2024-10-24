package com.example.prueba.Service;

import com.example.prueba.Entity.OrderDetail;
import com.example.prueba.Repository.OrderDetailRepository;
import com.example.prueba.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailImp extends CrudServiceImp<OrderDetail,Long> implements OrderDetailService {

   @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    protected JpaRepository<OrderDetail, Long> getRepository() {
        return orderDetailRepository;
    }
}
