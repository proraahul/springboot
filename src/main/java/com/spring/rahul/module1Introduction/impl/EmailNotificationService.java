package com.spring.rahul.module1Introduction.impl;

import com.spring.rahul.module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
@Qualifier("mailNoti")
//@ConditionalOnProperty(name = "notification.type", havingValue = "email")
//@ConditionalOnProperty(name = "deploy.env, havingValue = "production")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email Notification sent with message: " + message);
    }
}
