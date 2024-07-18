package raihan_heggi.core.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

import raihan_heggi.core.data.Foo;

@Component
public class FooBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor{

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        GenericBeanDefinition definition =  new GenericBeanDefinition();
        definition.setBeanClass(Foo.class);
        definition.setScope("singleton");
        
        // Wajib untuk melakukan register agar sistem dapat mengenal beansnya
        registry.registerBeanDefinition("foo", definition);
    }
    
}
