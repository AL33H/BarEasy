package br.com.bareasy.service.table;

import br.com.bareasy.model.BarTable;
import br.com.bareasy.model.enums.TableStatusEnum;
import br.com.bareasy.repository.TableRepository;
import br.com.bareasy.service.TableService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TableServiceImpl implements TableService {

    TableRepository tableRepository;

    @Override
    public BarTable findByStatusIsEmpty() {
        return tableRepository.findAllByStatus(TableStatusEnum.EMPTY);
    }

    @Override
    public BarTable findByStatusIsOccupied() {
        return tableRepository.findAllByStatus(TableStatusEnum.OCCUPIED);
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
