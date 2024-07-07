package br.com.bareasy.service;

import br.com.bareasy.model.BarTable;
import br.com.bareasy.model.enums.TableStatusEnum;

public interface TableService {

    BarTable findByStatusIsEmpty(TableStatusEnum tableStatusEnum);
    BarTable insert(BarTable barTable);
    BarTable update(BarTable barTable);
    void delete(BarTable barTable);
}
