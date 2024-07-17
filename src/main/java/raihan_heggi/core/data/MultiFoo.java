package raihan_heggi.core.data;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class MultiFoo {
    
    @Getter
    private List<Foo> foos;

    // Implementasi Object Provide (Legacy dari Optional) 
    // Object Provider bisa untuk mendapatkan bean yang lebih dari satu
    public MultiFoo(ObjectProvider<Foo> objectProvider){
        
        // Collector untuk mendapatkan data foo dari stream
        foos = objectProvider.stream().collect(Collectors.toList());
    }

}   
