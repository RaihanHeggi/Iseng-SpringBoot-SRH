package raihan_heggi.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import raihan_heggi.core.data.Connection;

public class LifeCycleTest {
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(Connection.class);
    }

    @Test
    void testLifeCycle(){
        // idealnya destroy perlu di panggil secara otomatis
        Connection connection = applicationContext.getBean(Connection.class);

        applicationContext.close();
    }
}
