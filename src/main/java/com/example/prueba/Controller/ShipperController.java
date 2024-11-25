package com.example.prueba.Controller;

import com.example.prueba.Entity.Category;
import com.example.prueba.Entity.Shipper;
import com.example.prueba.Service.ShipperService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ShipperController {
    private final ShipperService shipperService;
    @PostMapping("/shipper")
    void saveShipperRepository(@RequestBody Shipper shipper) {
        shipperService.save(shipper);
    }
    @GetMapping("/shipper2")
    public ResponseEntity<List<Shipper>> returnCategoryRepository(){
        return new ResponseEntity<List<Shipper>>(shipperService.findAll(),null, HttpStatus.CREATED);
    }

}
