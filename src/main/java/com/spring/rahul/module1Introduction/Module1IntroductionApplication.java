package com.spring.rahul.module1Introduction;

import com.spring.rahul.module1Introduction.impl.EmailNotificationService;
import com.spring.rahul.module1Introduction.impl.SmsNotificationSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}

//	@Autowired
//	PaymentService paymentService1;

//	@Autowired
//	PaymentService paymentService2;

//	@Autowired
	//final NotificationService notificationService; // field dependency injection

	//constructor dependency injection
//	public Module1IntroductionApplication(@Qualifier("mailNoti") NotificationService notificationService){
//		this.notificationService = notificationService;
//	}

//	public Module1IntroductionApplication(NotificationService notificationService){
//		this.notificationService = notificationService;
//	}

@Autowired
Map<String, NotificationService> notificationServiceMap = new HashMap<>();

	@Override
	public void run(String... args) throws Exception {
//		paymentService1.pay();
//		paymentService2.pay();
//
//		System.out.println("paymentService1 hashcode: " + paymentService1.hashCode());
//		System.out.println("paymentService2 hashcode: " + paymentService2.hashCode());

		// Spring boot dependency injections

		//NotificationService notificationService = new EmailNotificationService();
		//notificationService = new SmsNotificationSystem();
//		notificationService.send("Hello, this is a test notification!");


		for (var notificationService : notificationServiceMap.keySet()) {
			System.out.println("Bean name: " + notificationService + ", Bean instance: " + notificationServiceMap.get(notificationService));
			notificationServiceMap.get(notificationService).send("Hello from " + notificationService);
		}



	}
}
