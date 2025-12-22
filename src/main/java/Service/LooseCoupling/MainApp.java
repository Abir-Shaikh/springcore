package Service.LooseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {


        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        //gives SMS notification
        UserService userService
                = (UserService) context.getBean("UserServiceSMS");
        userService.notifyUser("Whats up Nigga!!");

        UserService userServiceEmail
                = (UserService) context.getBean("UserServiceEmail");
        userServiceEmail.notifyUser("Heelo Bruda!! Es tu porte");

    }
}

//user service needs notification services dependency
