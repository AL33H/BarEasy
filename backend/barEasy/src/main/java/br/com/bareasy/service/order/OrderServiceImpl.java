package br.com.bareasy.service.order;

import br.com.bareasy.model.BarConsumer;
import br.com.bareasy.model.BarOrder;
import br.com.bareasy.model.BarOrderItem;
import br.com.bareasy.model.BarTable;
import br.com.bareasy.repository.OrderItemRepository;
import br.com.bareasy.repository.OrderRepository;
import br.com.bareasy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    OrderItemRepository orderItemRepository;

    OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderItemRepository orderItemRepository, OrderRepository orderRepository) {
        this.orderItemRepository = orderItemRepository;
        this.orderRepository = orderRepository;
    }

    /**
     * @param barTable    BarTable
     * @param barConsumer BarConsumer
     * @return BarOrder
     */
    @Override
    public BarOrder generateOrder(BarTable barTable, BarConsumer barConsumer) {
        BarOrder barOrder = BarOrder.initializeOrder(barTable, barConsumer);
        return orderRepository.save(barOrder);
    }

    /**
     * @param barOrder BarOrder
     */
    @Override
    public void nextStateOrder(BarOrder barOrder) {
        barOrder.nextState();
    }

    /**
     * @param barOrder BarOrderItem
     * @return List<BarOrderItem>
     */
    @Override
    public List<BarOrderItem> getAllOrderItemByOrder(BarOrder barOrder) {
        return orderItemRepository.findAllByBarOrderId(barOrder.getId());
    }


}
