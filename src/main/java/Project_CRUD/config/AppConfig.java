package Project_CRUD.config;


import Project_CRUD.Database.DatabaseConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Project_CRUD")
public class AppConfig {

    @Bean(initMethod = "init" , destroyMethod = "cleanUp")
    public DatabaseConnection databaseConnection(){
        return new DatabaseConnection();
    }
}
