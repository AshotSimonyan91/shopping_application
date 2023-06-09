package com.example.shopping_application.impl;

import com.example.shopping_application.entity.Notification;
import com.example.shopping_application.repository.NotificationRepository;
import com.example.shopping_application.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ashot Simonyan on 21.05.23.
 */
@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;

    @Override
    public List<Notification> findAllCategory() {
        return notificationRepository.findAll();
    }

    @Override
    public void remove(int id) {
        notificationRepository.deleteById(id);
    }

    @Override
    public void save(Notification notification) {
        notificationRepository.save(notification);
    }
}
