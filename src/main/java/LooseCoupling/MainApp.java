package LooseCoupling;

public class MainApp {
    public static void main(String[] args) {

        NotificationService emailService = new EmailNotificationService();
        UserService userService = new UserService(emailService);
        userService.notifyUser("ok we gotcha ya!!");
    }
}

//user service needs notification services dependency
