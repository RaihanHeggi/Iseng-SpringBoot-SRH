package raihan_heggi.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import raihan_heggi.core.data.Car;
import raihan_heggi.core.service.idGeneratorService;

@Configuration
@Import({
    Car.class,
    idGeneratorService.class
})
public class BeanProcessorConfiguration {
    
}
