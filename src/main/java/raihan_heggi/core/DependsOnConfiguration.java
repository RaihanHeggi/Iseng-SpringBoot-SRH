package raihan_heggi.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import lombok.extern.slf4j.Slf4j;
import raihan_heggi.core.data.Bar;
import raihan_heggi.core.data.Foo;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Bean
    @Lazy
    @DependsOn({
        "bar"
    })
    public Foo foo() {
        log.info("Creating Foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Creating Bar");
        return new Bar();
    }

}
