package br.com.bareasy.service;

import br.com.bareasy.model.BarConsumer;
import br.com.bareasy.model.BarOrder;
import br.com.bareasy.model.BarOrderItem;
import br.com.bareasy.model.BarTable;

import java.util.List;

public interface OrderService {

    BarOrder generateOrder(BarTable barTable, BarConsumer barConsumer);

    void nextStateOrder(BarOrder barOrder);

    List<BarOrderItem> getAllOrderItemByOrder(BarOrder barOrder);

}
