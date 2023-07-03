package cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import product.Product;

import java.util.List;


@Repository
public interface CartRepository extends JpaRepository<Product, Long> {
    List<Cart> findByUser_id(Long id);
    void save();
}
