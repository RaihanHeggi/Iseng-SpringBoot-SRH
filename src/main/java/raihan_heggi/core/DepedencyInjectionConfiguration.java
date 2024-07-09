package raihan_heggi.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import raihan_heggi.core.data.Bar;
import raihan_heggi.core.data.Foo;
import raihan_heggi.core.data.FooBar;

@Configuration
public class DepedencyInjectionConfiguration {
    
    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar foobar(Foo foo, Bar bar){
        return FooBar(foo, bar)
    }
    
}
