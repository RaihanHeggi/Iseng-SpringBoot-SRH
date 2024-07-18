package raihan_heggi.core.data;

import org.springframework.stereotype.Component;

import lombok.Getter;
import raihan_heggi.core.generator.idGenerator;

@Component
public class Car implements idGenerator{
    
    @Getter
    private String id;

    @Override
    public void setID(String id) {
        this.id = id;
    }


    
}
