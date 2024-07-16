package raihan_heggi.core;

import org.springframework.context.annotation.Configuration;

import raihan_heggi.core.data.Bar;

@Configuration
public class BarConfiguration {

    public Bar bar() {
        return new Bar();
    }

}
