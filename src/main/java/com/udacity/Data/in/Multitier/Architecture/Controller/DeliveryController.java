package com.udacity.Data.in.Multitier.Architecture.Controller;

import com.udacity.Data.in.Multitier.Architecture.Entity.Delivery;
import com.udacity.Data.in.Multitier.Architecture.Projections.RecipientAndPrice;
import com.udacity.Data.in.Multitier.Architecture.Service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    @Autowired
    DeliveryService deliveryService;

    @PostMapping
    public Long scheduleDelivery(@RequestBody Delivery delivery) {
        return deliveryService.save(delivery);
    }

    @GetMapping("/bill/{deliveryId}")
    public RecipientAndPrice getBill(@PathVariable Long deliveryId) {
        return deliveryService.getBill(deliveryId);
    }
}

