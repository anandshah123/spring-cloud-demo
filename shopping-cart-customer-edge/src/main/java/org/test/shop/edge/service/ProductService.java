package org.test.shop.edge.service;

import feign.Body;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.test.dto.Product;

import java.util.List;

/**
 * Created by anandshah on 02/06/15.
 */
@FeignClient("store")
@Service
public interface ProductService {


    @RequestMapping(method = RequestMethod.GET, value = "/products")
    List<Product> getAllProducts();

}
