package com.BraidsTribeApplication.cart;

import com.BraidsTribeApplication.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CartRepository extends JpaRepository<Cart, Cart> {

}
