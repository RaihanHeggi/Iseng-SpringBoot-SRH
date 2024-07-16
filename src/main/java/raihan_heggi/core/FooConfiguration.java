package raihan_heggi.core;

import org.springframework.context.annotation.Configuration;

import raihan_heggi.core.data.Foo;

@Configuration
public class FooConfiguration {
    
    public Foo foo(){
        return new Foo();
    }

}
