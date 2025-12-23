package Service.CalculatorApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@ComponentScan("Service.CalculatorApp")
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(MainApp.class);

        MyCalculatorApp myCalculatorApp
                = context.getBean(MyCalculatorApp.class);
        myCalculatorApp.Calculate();
    }
}
