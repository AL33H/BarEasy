package br.com.bareasy.repository;

import br.com.bareasy.model.BarConsumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<BarConsumer, Long> {
}
