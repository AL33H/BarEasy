package br.com.bareasy.service.consumer;

import br.com.bareasy.model.BarConsumer;
import br.com.bareasy.repository.ConsumerRepository;
import br.com.bareasy.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    ConsumerRepository consumerRepository;

    @Autowired
    public ConsumerServiceImpl(ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }

    @Override
    public List<BarConsumer> findAll() {
        return consumerRepository.findAll();
    }

    @Override
    public BarConsumer insert(BarConsumer barConsumer) {
        return consumerRepository.save(barConsumer);
    }

    @Override
    public BarConsumer update(BarConsumer barConsumer) {
        return consumerRepository.save(barConsumer);
    }

    @Override
    public void delete(BarConsumer barConsumer) {
        consumerRepository.delete(barConsumer);
    }
}
