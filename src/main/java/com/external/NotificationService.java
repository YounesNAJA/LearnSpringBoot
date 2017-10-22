package com.external;

import org.springframework.stereotype.Service;

@Service("zUserNotification")
public class NotificationService {
    public NotificationService() {
    }

    public void send(){
        // Do something
    }

    public void sendAsync(){
        // Do something
    }

    @Override
    public String toString() {
        return "NotificationService{}";
    }
}
