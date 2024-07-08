package br.com.bareasy.service.orderitem;

import br.com.bareasy.events.OnOrderItemCreatedEvent;
import br.com.bareasy.events.OnOrderItemIsCompletedEvent;
import br.com.bareasy.model.BarOrderItem;
import br.com.bareasy.model.enums.OrderItemStatusEnum;
import br.com.bareasy.repository.OrderItemRepository;
import br.com.bareasy.service.OrderItemService;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemRepository orderItemRepository;

    private final ApplicationEventPublisher applicationEventPublisher;

    @Override
    public BarOrderItem insert(BarOrderItem barOrderItem) {
        BarOrderItem saved = orderItemRepository.save(barOrderItem);
        applicationEventPublisher.publishEvent(new OnOrderItemCreatedEvent(this, saved, saved.getBarOrder(), saved.getBarOrder().getBarTable()));
        return saved;
    }

    @Override
    public BarOrderItem update(BarOrderItem barOrderItem) {
        BarOrderItem updated = orderItemRepository.save(barOrderItem);
        if (updated.getStatus().equals(OrderItemStatusEnum.COMPLETED)) {
            applicationEventPublisher.publishEvent(new OnOrderItemIsCompletedEvent(this, updated, updated.getBarOrder(), updated.getBarOrder().getBarTable()));
        }
        return updated;
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
