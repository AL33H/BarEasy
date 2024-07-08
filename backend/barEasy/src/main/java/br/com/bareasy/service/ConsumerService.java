package br.com.bareasy.service;

import br.com.bareasy.model.BarConsumer;

import java.util.List;

public interface ConsumerService {
    List<BarConsumer> findAll();

    BarConsumer insert(BarConsumer barConsumer);

    BarConsumer update(BarConsumer barConsumer);

    void delete(BarConsumer barConsumer);

}
