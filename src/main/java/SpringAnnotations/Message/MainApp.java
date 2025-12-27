package SpringAnnotations.Message;

import SpringAnnotations.LifecycleBean;
import SpringAnnotations.Service.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

//        NotificationServices emailService = new EmailNotificationService();
//        UserService userService = new UserService(emailService);
//        userService.notifyUser("ok we gotcha ya!!");
        //        UserService userService1
//                = new UserService(emailService);
//        userService1.notifyUser("ok ser");

        System.out.println("Starting Spring Application Context......");
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        System.out.println("Retrieving LifeCycle Bean.......");

        LifecycleBean lifecycleBean = context.getBean(LifecycleBean.class);

        lifecycleBean.performTask();
        lifecycleBean.cleanUp();
        System.out.println("Closing Spring Context ");

    }
}


