package br.com.bareasy.service.orderitem;

import br.com.bareasy.model.BarOrderItem;
import br.com.bareasy.model.enums.OrderItemStatusEnum;
import br.com.bareasy.repository.OrderItemRepository;
import br.com.bareasy.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public BarOrderItem insert(BarOrderItem barOrderItem) {
        return orderItemRepository.save(barOrderItem);
    }

    @Override
    public BarOrderItem update(BarOrderItem barOrderItem) {
        return orderItemRepository.save(barOrderItem);
    }

    @Override
    public void delete(BarOrderItem barOrderItem) {
        orderItemRepository.delete(barOrderItem);
    }

    @Override
    public BarOrderItem findById(Long id) {
        return orderItemRepository.findById(id).orElse(null);
    }

    @Override
    public BarOrderItem findByOrderItemId(Long id) {
        return orderItemRepository.findByOrderItemId(id);
    }

    @Override
    public BarOrderItem findByStatusAndOrderItemId(Long id) {
        return orderItemRepository.findByStatusAndOrderItemId(OrderItemStatusEnum.PENDING, id);
    }
}
