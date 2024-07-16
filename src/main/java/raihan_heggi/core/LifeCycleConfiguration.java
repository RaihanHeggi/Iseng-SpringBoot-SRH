package raihan_heggi.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import raihan_heggi.core.data.Connection;
import raihan_heggi.core.data.server;

@Configuration
public class LifeCycleConfiguration {
    
    @Bean
    public Connection connection(){
        return new Connection();
    }

    // @Bean(initMethod="start", destroyMethod = "stop")
    @Bean
    public server Server(){
        return new server();
    }

}
