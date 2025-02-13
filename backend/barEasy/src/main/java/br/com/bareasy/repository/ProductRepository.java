package br.com.bareasy.repository;

import br.com.bareasy.model.BarProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<BarProduct, Long> {
}
