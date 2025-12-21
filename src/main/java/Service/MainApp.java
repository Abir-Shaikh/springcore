package Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        GreetingService greetingService
                = (GreetingService) context.getBean("mybean");
        greetingService.sayHello();


        MeetingService meetingService = (MeetingService) context.getBean("mybean1");
        meetingService.meetingService();
    }
}
