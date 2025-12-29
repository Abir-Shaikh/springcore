package Project_CRUD.Service;

import Project_CRUD.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    private UserRepository userRepository;
    public void addUser(String name) {
        userRepository.save(name);
    }

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<String> getAllUsers() {
        return userRepository.findAll();
    }
}
