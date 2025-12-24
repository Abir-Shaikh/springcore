package SpringAnnotations.Message;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    //object reference
    NotificationServices notificationService;

    @Autowired
    public UserService(NotificationServices notificationService) {
        this.notificationService = notificationService;
    }

    //TO notify user
    public void notifyUser(String message){
        notificationService.send("Merry Christmas");
    }

    //setter injection
    public void setNotificationService(NotificationServices notificationService) {
        this.notificationService = notificationService;
    }
}
