package com.example.prueba.Controller;

import com.example.prueba.Entity.Shipper;
import com.example.prueba.Service.ShipperService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ShipperController {
    private final ShipperService shipperService;
    @PostMapping("/shipper")
    void saveShipperRepository(@RequestBody Shipper shipper) {
        shipperService.save(shipper);
    }
}
