package raihan_heggi.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import raihan_heggi.core.repository.ProductRepository;
import raihan_heggi.core.repository.ConfigureRepository;

@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    @Getter
    private ConfigureRepository configureRepository;

    // Example Constructor Dependency Injection
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Jikalau ada 2 constructor maka perlu pake annotation autowired
    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }

    // Setter Method Depedency Injection
    @Autowired
    void setConfigureRepository(ConfigureRepository configureRepository) {
        this.configureRepository = configureRepository;
    }
}
