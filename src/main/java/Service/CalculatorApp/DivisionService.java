package Service.CalculatorApp;

import org.springframework.stereotype.Component;

@Component
public class DivisionService {
    public int divide(int a , int b){
        return a/b;
    }
}
