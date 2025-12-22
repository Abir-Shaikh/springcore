package Service.GrandPay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GaanPay {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        OrderService orderServiceCard
                = (OrderService) context.getBean("OrderServiceCard");

        System.out.println(orderServiceCard.placeOrder(1000));


        OrderService orderServiceUPI
                = (OrderService) context.getBean("OrderServiceUPI");

        System.out.println(orderServiceUPI.placeOrder(5000));
    }
}
