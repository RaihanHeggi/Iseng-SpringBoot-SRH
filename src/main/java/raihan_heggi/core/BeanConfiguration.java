package raihan_heggi.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import raihan_heggi.core.data.Foo;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo1() {
        Foo foo = new Foo();
        log.info("Creating Foo 1");
        return foo;
    }

    @Bean
    public Foo foo2(){
        Foo foo = new Foo();
        log.info("Creating Foo 2");
        return foo;
    }
}
