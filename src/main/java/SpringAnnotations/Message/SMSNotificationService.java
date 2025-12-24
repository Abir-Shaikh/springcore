package SpringAnnotations.Message;

import org.springframework.stereotype.Component;

@Component
public class SMSNotificationService implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println("SMS : " + message);
    }
}
