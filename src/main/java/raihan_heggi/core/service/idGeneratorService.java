package raihan_heggi.core.service;

import java.util.UUID;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import raihan_heggi.core.generator.idGenerator;

@Slf4j
@Component
public class idGeneratorService implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("ID Generator for Bean : {}", beanName);
        if (bean instanceof idGenerator) {
            idGenerator idGenerator = (idGenerator) bean;
            log.info("Set ID for Bean : {}", beanName);
            idGenerator.setID(UUID.randomUUID().toString());
        }

        return bean;
    }

}
