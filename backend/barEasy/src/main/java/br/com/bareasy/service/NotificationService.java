package br.com.bareasy.service;

import br.com.bareasy.model.Notification;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class NotificationService {

    List<Notification> notifications;

    public NotificationService() {
        this.notifications = new ArrayList<>();
    }
}
