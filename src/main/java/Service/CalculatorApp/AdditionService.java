package Service.CalculatorApp;

import org.springframework.stereotype.Component;

@Component
public class AdditionService {
    public int add(int a , int b){
        return a + b;
    }
}
