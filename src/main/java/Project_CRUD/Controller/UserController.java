package Project_CRUD.Controller;

import Project_CRUD.Service.UserServices;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    private UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }


    public void createUser(String name){
        System.out.println("Users added : " + name);
        userServices.addUser(name);
    }

    public void listUser() {
        List<String> users = userServices.getAllUsers();
        System.out.println("All users : " + users);
    }
}
