package br.com.bareasy.repository;

import br.com.bareasy.model.BarOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<BarOrderItem, Long> {
}
