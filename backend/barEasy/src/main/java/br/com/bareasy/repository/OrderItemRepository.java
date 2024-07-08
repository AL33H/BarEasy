package br.com.bareasy.repository;

import br.com.bareasy.model.BarOrderItem;
import br.com.bareasy.model.enums.OrderItemStatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<BarOrderItem, Long> {
    BarOrderItem findByOrderItemId(Long id);

    BarOrderItem findByStatusAndOrderItemId(OrderItemStatusEnum statusEnum, Long id);

    List<BarOrderItem> findAllByBarOrderId(Long id);

}
