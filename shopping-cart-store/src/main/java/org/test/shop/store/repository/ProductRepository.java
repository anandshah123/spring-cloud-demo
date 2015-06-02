package org.test.shop.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.test.shop.store.domain.Product;

/**
 * Created by anandshah on 31/05/15.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
