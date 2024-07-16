package raihan_heggi.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import raihan_heggi.core.data.Connection;

@Configuration
public class LifeCycleConfiguration {
    
    @Bean
    public Connection connection(){
        return new Connection();
    }

}
