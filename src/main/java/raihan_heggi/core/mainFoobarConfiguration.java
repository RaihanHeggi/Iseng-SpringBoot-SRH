package raihan_heggi.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
    FooConfiguration.class,
    BarConfiguration.class
})
public class mainFoobarConfiguration {

    private ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(mainFoobarConfiguration.class);
}
