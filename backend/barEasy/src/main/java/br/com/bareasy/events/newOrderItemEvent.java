package br.com.bareasy.events;

import br.com.bareasy.model.BarOrder;
import br.com.bareasy.model.BarOrderItem;
import br.com.bareasy.model.BarTable;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class newOrderItemEvent extends ApplicationEvent {
    private final BarOrderItem barOrderItem;
    private final BarOrder barOrder;
    private final BarTable barTable;

    public newOrderItemEvent(Object source, BarOrderItem barOrderItem, BarOrder barOrder, BarTable barTable) {
        super(source);
        this.barOrderItem = barOrderItem;
        this.barOrder = barOrder;
        this.barTable = barTable;
    }
}
