package Project_CRUD.repository;

import Project_CRUD.Database.DatabaseConnection;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    private DatabaseConnection db;

    public UserRepository(DatabaseConnection db) {
        this.db = db;
    }

    //To find all users
    public List<String> findAll(){
        return db.getUsers();
    }

    public void save(String user){
        db.addUsers(user);
    }
}
