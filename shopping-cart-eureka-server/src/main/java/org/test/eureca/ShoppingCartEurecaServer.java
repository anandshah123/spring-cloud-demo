package org.test.eureca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by anandshah on 31/05/15.
 */
@SpringBootApplication
@EnableEurekaServer
public class ShoppingCartEurecaServer {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartEurecaServer.class);
    }
}
