package org.test.shop.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.test.shop.store.domain.Product;
import org.test.shop.store.repository.ProductRepository;

import javax.annotation.PostConstruct;

/**
 * Created by anandshah on 31/05/15.
 */
@SpringBootApplication
@EnableEurekaClient
public class ShoppingCartStoreApp {

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    public void loadData(){
        productRepository.deleteAll();
        for (int i = 1; i < 11; i++) {
            productRepository.save(new Product("Product "+i,i+".jpg","The description for product - "+i));
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartStoreApp.class);
    }
}
