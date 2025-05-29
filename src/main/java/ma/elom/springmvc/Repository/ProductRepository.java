package ma.elom.springmvc.Repository;

import ma.elom.springmvc.entities.product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<product, Long> {
}
