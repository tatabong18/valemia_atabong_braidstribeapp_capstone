package cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import product.Product;



@Repository
public interface CartRepository extends JpaRepository<Product, Long> {
}