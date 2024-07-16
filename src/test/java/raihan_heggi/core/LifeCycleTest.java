package raihan_heggi.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import raihan_heggi.core.data.Connection;
import raihan_heggi.core.data.server;

public class LifeCycleTest {
    // Jika ingin mengakses destroy
    private ConfigurableApplicationContext applicationContext;

    // private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);

        // otomatis akan di eksekusi
        applicationContext.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        // applicationContext.close();
    }

    @Test
    void testLifeCycle() {
        // idealnya destroy perlu di panggil secara otomatis
        Connection connection = applicationContext.getBean(Connection.class);

        // applicationContext.close();
    }

    @Test
    void testServer(){
        server serverData = applicationContext.getBean(server.class);
    }
}
