package com.naja.younes.app28;

import com.external.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
    @Value("${spring.profiles.active}")
    private String environment;

    @Value("${pageController.message}")
    private String pageControllerMsg;

    private NotificationService notificationService;

    public NotificationService getNotificationService() {
        return notificationService;
    }

    @Autowired
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @RequestMapping("/")
    public String home(){
        return pageControllerMsg + "\nThe application is running on " + environment + " mode.";
//        return pageControllerMsg;
    }
}
