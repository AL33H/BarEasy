package br.com.bareasy.model;


import lombok.Data;

@Data
public class Notification {

    private BarOrder barOrder;
    private BarOrderItem barOrderItem;
    private BarTable barTable;

    public Notification(BarOrder barOrder) {
        this.barOrder = barOrder;
    }

    public Notification(BarOrder barOrder, BarOrderItem barOrderItem, BarTable barTable) {
        this.barOrder = barOrder;
        this.barOrderItem = barOrderItem;
        this.barTable = barTable;
    }
}
