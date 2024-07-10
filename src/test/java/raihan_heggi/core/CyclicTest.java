package raihan_heggi.core;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicTest {
    
    @Test  
    void TestCyclic(){

        ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);

    }

}
