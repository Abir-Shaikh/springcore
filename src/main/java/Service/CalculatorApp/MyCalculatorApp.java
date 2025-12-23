package Service.CalculatorApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//it does mean that a java project is converted to spring or springboot
@Component
public class MyCalculatorApp {

//Autowired does dependency injection via spring so we dont have to do it manually

    @Autowired
    private AdditionService additionService;

    @Autowired
    private SubtractionService subtractionService;

    @Autowired
    private MultiplicationService multiplicationService;

    @Autowired
    private DivisionService divisionService;

    public void Calculate(){
        System.out.println("Addition : " + additionService.add(10 , 3));
        System.out.println("Subtract : " + subtractionService.subtract(12 , 7));
        System.out.println("Multiply : " + multiplicationService.multiply(10 , 4));
        System.out.println("Divide : " + divisionService.divide(12 , 2));
    }

}
