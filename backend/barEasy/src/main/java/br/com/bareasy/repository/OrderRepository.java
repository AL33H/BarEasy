package br.com.bareasy.repository;

import br.com.bareasy.model.BarOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<BarOrder, Long> {
}
