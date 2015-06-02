package org.test.shop.promo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.test.shop.promo.dto.Promo;
import org.test.shop.promo.service.PromoService;

import java.util.Collection;
import java.util.Date;

/**
 * Created by anand.shah on 6/1/2015.
 */
@Controller
@SpringBootApplication
@EnableEurekaClient
public class ShoppingCartPromoApp {

    @Autowired
    private PromoService promoService;

    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartPromoApp.class);
    }

    @RequestMapping(value = "/promos",method = RequestMethod.GET,produces = "application/json")
    public @ResponseBody Collection<Promo> loadPromos(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
        return promoService.fetchPromos(date);
    }
}
