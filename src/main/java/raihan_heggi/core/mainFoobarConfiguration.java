package raihan_heggi.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import raihan_heggi.core.configuration.BarConfiguration;
import raihan_heggi.core.configuration.FooConfiguration;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class mainFoobarConfiguration {
}
