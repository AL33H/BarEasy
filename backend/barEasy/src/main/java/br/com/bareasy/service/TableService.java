package br.com.bareasy.service;

import br.com.bareasy.model.BarTable;

public interface TableService {

    BarTable findByStatusIsEmpty();

    BarTable findByStatusIsOccupied();

    BarTable insert(BarTable barTable);

    BarTable update(BarTable barTable);

    void delete(BarTable barTable);
}
