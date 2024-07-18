package raihan_heggi.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import raihan_heggi.core.service.MerchantServiceImpl;

@Configuration
@Import({
    MerchantServiceImpl.class
})
public class MerchantServiceConfiguration {
    
}
