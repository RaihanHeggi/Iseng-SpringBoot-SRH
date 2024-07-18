package raihan_heggi.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import raihan_heggi.core.service.AuthService;

public class AuthServiceTest {
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(AuthConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testAwareBean(){
        AuthService authService = applicationContext.getBean(AuthService.class);

        Assertions.assertEquals(AuthService.class.getName(), authService.getBeanName());
        Assertions.assertSame(applicationContext, authService.getApplicationContext());
    }

}
