package br.com.bareasy.repository;

import br.com.bareasy.model.BarTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<BarTable, Long> {
}
