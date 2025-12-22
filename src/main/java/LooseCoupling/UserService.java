package LooseCoupling;

public class UserService {

    //object reference
    NotificationService notificationService;


    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    //TO notify user
    public void notifyUser(String message){
        notificationService.send("This is elo ma");
    }

    //setter injection
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
