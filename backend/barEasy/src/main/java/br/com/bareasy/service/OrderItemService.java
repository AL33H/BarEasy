package br.com.bareasy.service;

import br.com.bareasy.model.BarOrderItem;

public interface OrderItemService {

    BarOrderItem insert(BarOrderItem barOrderItem);

    BarOrderItem update(BarOrderItem barOrderItem);

    void delete(BarOrderItem barOrderItem);

    BarOrderItem findById(Long id);

    BarOrderItem findByOrderItemId(Long id);

    BarOrderItem findByStatusAndOrderItemId(Long id);
}
