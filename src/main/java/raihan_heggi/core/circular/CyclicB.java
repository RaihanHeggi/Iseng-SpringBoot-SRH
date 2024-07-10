package raihan_heggi.core.circular;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicB {
    
    private CyclicC cyclicC;

}
