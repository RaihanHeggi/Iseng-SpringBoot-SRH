package raihan_heggi.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "raihan_heggi.core.repository",
        "raihan_heggi.core.service",
        "raihan_heggi.core.configuration"
})
public class ComponentConfiguration {

}
