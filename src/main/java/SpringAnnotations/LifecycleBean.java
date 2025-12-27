package SpringAnnotations;

import SpringAnnotations.Message.NotificationServices;
import org.springframework.stereotype.Component;


public class LifecycleBean {
    private NotificationServices notificationServices;

    //making a instance of the notification Service using Constructor Injection
    public LifecycleBean(NotificationServices notificationServices) {
        System.out.println("Constructor called :  Dependency Injected");
        this.notificationServices = notificationServices;
    }

    //to initialize

    public void init(){
        System.out.println("@init called : Bean Initialized");
        notificationServices.send("Hello from init()");
    }

    public void performTask(){
        System.out.println("Ready to perform ");
    }

    public void cleanUp(){
        System.out.println("Cleaned Up");
    }
}
