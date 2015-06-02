package org.test.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.amqp.EnableTurbineAmqp;

/**
 * Created by anandshah on 02/06/15.
 */
@SpringBootApplication
@EnableTurbineAmqp
public class ShoppingCartTurbineApp {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartTurbineApp.class);
    }
}
