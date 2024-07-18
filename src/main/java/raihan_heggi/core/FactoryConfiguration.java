package raihan_heggi.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import raihan_heggi.core.factory.PaymentGatewayClientBean;

@Configuration
@Import({
    PaymentGatewayClientBean.class
})
public class FactoryConfiguration {
    
}
