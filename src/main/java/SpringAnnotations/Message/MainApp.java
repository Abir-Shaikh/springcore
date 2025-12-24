package SpringAnnotations.Message;

import SpringAnnotations.Service.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        NotificationServices emailService = new EmailNotificationService();
//        UserService userService = new UserService(emailService);
//        userService.notifyUser("ok we gotcha ya!!");
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        UserService userService1
                = new UserService(emailService);
        userService1.notifyUser("ok ser");
    }
}

//user service needs notification services dependency
