package org.test.shop.edge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.test.dto.Product;
import org.test.dto.Promo;
import org.test.shop.edge.middleware.ServiceProvider;
import org.test.shop.edge.service.PromoService;

import java.util.List;

/**
 * Created by anandshah on 02/06/15.
 */
@Controller
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class ShoppingCartEdgeApp {
    @Autowired
    private PromoService promoService;

    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartEdgeApp.class);

    }

    @Autowired
    private ServiceProvider serviceProvider;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "dashboard";
    }

    @RequestMapping(value = "/promo", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    List<Promo> getAllPromo(@RequestParam String date) {
        return serviceProvider.findPromos(date);
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody List<Product> getAllProducts() {
        return serviceProvider.getProducts();
    }
}
