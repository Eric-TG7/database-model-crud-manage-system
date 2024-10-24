package com.example.prueba.Service;

import com.example.prueba.Entity.Shipper;
import com.example.prueba.Repository.ShipperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ShipperServiceImp extends CrudServiceImp<Shipper,Long> implements ShipperService {
    @Autowired
    private ShipperRepository repository;
    @Override
    protected JpaRepository<Shipper,Long> getRepository() {
        return repository;
    }
}
