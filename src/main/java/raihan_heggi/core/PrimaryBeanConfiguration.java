package raihan_heggi.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import raihan_heggi.core.data.Foo;

@Configuration
public class PrimaryBeanConfiguration {

    @Primary
    @Bean(name = "fooFirst")
    public Foo foo_1() {
        Foo foo = new Foo();
        return foo;
    }

    @Bean(name = "fooSecond")
    public Foo foo_2() {
        Foo foo = new Foo();
        return foo;
    }

}
