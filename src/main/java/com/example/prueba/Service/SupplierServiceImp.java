package com.example.prueba.Service;

import com.example.prueba.Entity.Supplier;
import com.example.prueba.Repository.CategoryRepository;
import com.example.prueba.Repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

@Service
public class SupplierServiceImp extends CrudServiceImp<Supplier,Long> implements SupplierService {// supplier service requires body so crudservice feeds this functions needed
    @Autowired
   private SupplierRepository supplierRepository;
    @Override
    protected JpaRepository<Supplier,Long> getRepository() {

        return supplierRepository;
    }


}
