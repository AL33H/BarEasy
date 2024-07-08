package br.com.bareasy.events.listener;

import br.com.bareasy.events.OnOrderItemCreatedEvent;
import br.com.bareasy.model.Notification;
import br.com.bareasy.service.NotificationService;
import lombok.AllArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrderItemListener {

    private NotificationService notificationService;

    @EventListener
    void onOrderItemCreatedEvent(OnOrderItemCreatedEvent event) {
        notificationService.getNotifications().add(new Notification(event.getBarOrder(),
                event.getBarOrderItem(),
                event.getBarTable()));
    }

    @EventListener
    void onOrderItemIsCompletedEvent(OnOrderItemCreatedEvent event) {
        notificationService.getNotifications().remove(new Notification(event.getBarOrder()));
    }

}
