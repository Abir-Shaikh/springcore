package SpringAnnotations.Message;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Primary
@Service
public class EmailNotificationService implements NotificationServices {
    @Override
    public void send(String message){
        System.out.println("Email : " + message);
    }
}
