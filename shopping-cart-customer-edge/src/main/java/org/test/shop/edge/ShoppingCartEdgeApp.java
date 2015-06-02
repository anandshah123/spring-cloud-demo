package org.test.shop.edge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.test.shop.edge.service.PromoService;

/**
 * Created by anandshah on 02/06/15.
 */
@Controller
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableFeignClients
public class ShoppingCartEdgeApp {
    @Autowired
    private PromoService promoService;

    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartEdgeApp.class);

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "dashboard";
    }


}
