package SpringAnnotations.Message;

import SpringAnnotations.LifecycleBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("SpringAnnotations.Message")
public class ApplicationConfiguration {


    //we are using @Bean to call LifeCycleBean class where we have declared all Component
    //instead of using @Component in LifeCycleBean we are using @Bean in this class

    @Bean(initMethod = "init" , destroyMethod = "cleanUp")
    //what is this class returning?
    //This is returning instance of LifeCycleBean
    public LifecycleBean lifecycleBean(NotificationServices notificationServices){
        return new LifecycleBean(notificationServices);
    }
}
