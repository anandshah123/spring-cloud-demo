package org.test.shop.promo.service.impl;

import org.springframework.stereotype.Service;
import org.test.dto.Promo;
import org.test.shop.promo.service.PromoService;

import java.util.*;

/**
 * Created by anand.shah on 6/1/2015.
 */
@Service
public class PromoServiceImpl implements PromoService {


    @Override
    public Collection<Promo> fetchPromos(Date forDate) {
        System.out.println("Promo service called for - "+forDate);
        List<Promo> promos = new ArrayList<>();
        for (int i = 1; i < new Random().nextInt(20); i++) {
            promos.add(new Promo(UUID.randomUUID().toString(),"Content for "+i,new Random().nextInt(5),new Random().nextInt(50000)));
        }
        return promos;
    }
}
