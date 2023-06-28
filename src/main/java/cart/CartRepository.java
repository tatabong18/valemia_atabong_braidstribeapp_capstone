package cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.Order;

@Repository
public interface CartRepository extends JpaRepository<Order, Long> {
}