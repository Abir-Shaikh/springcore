package Service.CalculatorApp;

import org.springframework.stereotype.Component;

@Component
public class MultiplicationService {
    public int multiply(int a , int b){
        return a*b;
    }
}
