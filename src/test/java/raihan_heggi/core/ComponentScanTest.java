package raihan_heggi.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import raihan_heggi.core.data.Bar;
import raihan_heggi.core.data.Foo;
import raihan_heggi.core.data.MultiFoo;
import raihan_heggi.core.repository.ProductRepository;
import raihan_heggi.core.repository.ConfigureRepository;
import raihan_heggi.core.repository.CustomerRepository;
import raihan_heggi.core.service.CustomerService;
import raihan_heggi.core.service.ProductService;

public class ComponentScanTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        // applicationContext = new
        // AnnotationConfigApplicationContext(ScanConfiguration.class);
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testScan() {
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
    }

    @Test
    void testConstructorDI() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    void testSetterDI() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        ConfigureRepository configureRepository = applicationContext.getBean(ConfigureRepository.class);

        Assertions.assertSame(configureRepository, productService.getConfigureRepository());
    }

    @Test
    void testFieldDI() {
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository",
                CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository",
                CustomerRepository.class);

        Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
        Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
    }

    @Test
    void testObjectProvider() {
        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);

        Assertions.assertEquals(3, multiFoo.getFoos().size());
    }

}
