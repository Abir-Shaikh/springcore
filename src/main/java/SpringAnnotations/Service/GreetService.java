package SpringAnnotations.Service;

import org.springframework.stereotype.Component;

//java class to spring class
@Component
public class GreetService {
    public void sayHello(){
        System.out.println("Hello from none but Abir");
    }
}
