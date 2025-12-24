package SpringAnnotations.Service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//configuration is a class where all the configuration of a project is defined
//ComponentScan is annotation where it will scan all spring based components or scan all spring classes

@Configuration
@ComponentScan("SpringAnnotations.Service")
public class AppConfig {
}
