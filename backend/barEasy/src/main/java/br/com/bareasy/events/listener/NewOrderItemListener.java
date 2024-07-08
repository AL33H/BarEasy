package br.com.bareasy.events.listener;

import br.com.bareasy.events.newOrderItemEvent;
import br.com.bareasy.model.Notification;
import br.com.bareasy.service.NotificationService;
import lombok.AllArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class NewOrderItemListener {

    private NotificationService notificationService;

    @EventListener
    void onNewOrderItemEvent(newOrderItemEvent event) {
        notificationService.getNotifications().add(new Notification(event.getBarOrder(),
                event.getBarOrderItem(),
                event.getBarTable()));
    }
}
