package raihan_heggi.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import raihan_heggi.core.data.Foo;
import raihan_heggi.core.service.FooBeanFactoryPostProcessor;

public class BeanFactoryPostProcessorTest {
    
    @Configuration
    @Import({
        FooBeanFactoryPostProcessor.class
    })
    public static class TestConfiguration {
    
        
    }

    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext =  new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testBeanFactoryProcessor(){
        Foo foo = applicationContext.getBean(Foo.class);
        
        Assertions.assertNotNull(foo);
    }

}
