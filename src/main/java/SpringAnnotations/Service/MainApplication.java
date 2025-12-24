package SpringAnnotations.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        GreetService greetService
                = context.getBean(GreetService.class);
        greetService.sayHello();

        MeetService meetService
                = context.getBean(MeetService.class);
        meetService.meetingService();

    }
}
