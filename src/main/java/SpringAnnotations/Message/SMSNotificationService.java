package SpringAnnotations.Message;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SMSNotificationService implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println("SMS : " + message);
    }
}
