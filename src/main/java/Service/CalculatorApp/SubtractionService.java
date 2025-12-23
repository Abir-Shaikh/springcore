package Service.CalculatorApp;

import org.springframework.stereotype.Component;

@Component
public class SubtractionService {
    public int subtract(int a , int b){
        return a - b;
    }
}
