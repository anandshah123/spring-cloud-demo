package org.test.shop.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.test.shop.store.domain.Product;

/**
 * Created by anandshah on 31/05/15.
 */
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

}
