package raihan_heggi.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import raihan_heggi.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
        "raihan_heggi.core.repository",
        "raihan_heggi.core.service",
        "raihan_heggi.core.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {

}
