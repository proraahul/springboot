package com.spring.rahul.module1Introduction.impl;

import com.spring.rahul.module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsNoti")
//@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
public class SmsNotificationSystem implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS Notification sent with message: " + message);
    }
}
