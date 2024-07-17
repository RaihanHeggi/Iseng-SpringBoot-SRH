package raihan_heggi.core;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import raihan_heggi.core.data.Bar;
import raihan_heggi.core.data.Foo;
import raihan_heggi.core.data.FooBar;

@Configuration
public class OptionalConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    // Implementasi Foobar dengan optional annotation
    @Bean
    public FooBar foobar(Optional<Foo> foo, Optional<Bar> bar) {
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
