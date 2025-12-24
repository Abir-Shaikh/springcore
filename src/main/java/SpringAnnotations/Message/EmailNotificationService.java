package SpringAnnotations.Message;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationServices {
    @Override
    public void send(String message){
        System.out.println("Email : " + message);
    }
}
