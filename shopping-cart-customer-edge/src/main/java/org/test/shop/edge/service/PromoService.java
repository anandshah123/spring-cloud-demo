package org.test.shop.edge.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.test.dto.Promo;


import java.util.List;

/**
 * Created by anand.shah on 6/2/2015.
 */
@FeignClient("promo")
@Service
public interface PromoService {

     @RequestMapping(method = RequestMethod.GET, value = "/promos?date={date}")
     List<Promo> fetchPromos(@RequestParam("date") String date);
}
