package com.naja.younes.app28;

import com.external.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @Value("${pageController.message}")
    private String pageControllerMsg;

    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/")
    public String home(){
        return pageControllerMsg;
    }
}
