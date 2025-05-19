package com.formation_mosh.user_register.service.notification;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationServiceInterface {

    @Value("${email.host}")
    private String host;

    @Value("${email.port}")
    private String port;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("host : " + host + ":" + port);
        System.out.println("Réceptionnaire : " + recipientEmail);
        System.out.println("Message : " + message);
    }
}
