package br.com.bareasy.service.table;

import br.com.bareasy.model.BarTable;
import br.com.bareasy.model.enums.TableStatusEnum;
import br.com.bareasy.repository.TableRepository;
import br.com.bareasy.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableServiceImpl implements TableService {


    TableRepository tableRepository;

    @Autowired
    public TableServiceImpl(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    @Override
    public BarTable findByStatusIsEmpty(TableStatusEnum tableStatusEnum) {
        return tableRepository.findAllByStatus(tableStatusEnum);
    }

    @Override
    public BarTable insert(BarTable barTable) {
        return tableRepository.save(barTable);
    }

    @Override
    public BarTable update(BarTable barTable) {
        return tableRepository.save(barTable);
    }

    @Override
    public void delete(BarTable barTable) {
        tableRepository.delete(barTable);
    }
}
