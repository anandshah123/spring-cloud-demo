package org.test.shop.edge.middleware;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.test.dto.Product;
import org.test.dto.Promo;
import org.test.shop.edge.service.ProductService;
import org.test.shop.edge.service.PromoService;

import java.util.Collections;
import java.util.List;

/**
 * Created by anandshah on 03/06/15.
 */
@Component
public class ServiceProvider {

    @Autowired
    private ProductService productService;

    @Autowired
    private PromoService promoService;

    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    @HystrixCommand(fallbackMethod = "defaultPromo")
    public List<Promo> findPromos(String date) {
        return promoService.fetchPromos(date);
    }

    public List<Promo> defaultPromo(String date) {
        return Collections.singletonList(new Promo("1", "The default Promo", 100, 50000));
    }
}
