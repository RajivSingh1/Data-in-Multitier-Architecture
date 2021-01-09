package com.udacity.Data.in.Multitier.Architecture.Service;

import com.udacity.Data.in.Multitier.Architecture.Entity.Delivery;
import com.udacity.Data.in.Multitier.Architecture.Entity.Plant;
import com.udacity.Data.in.Multitier.Architecture.Projections.RecipientAndPrice;
import com.udacity.Data.in.Multitier.Architecture.Repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
    @Autowired
    DeliveryRepository deliveryRepository;


    public RecipientAndPrice getBill(Long deliveryId){
        return deliveryRepository.getBill(deliveryId);
    }

    public Long save(Delivery delivery) {
        delivery.getPlants().forEach(plant -> plant.setDelivery(delivery));
        deliveryRepository.persist(delivery);
        return delivery.getId();
    }
    }

