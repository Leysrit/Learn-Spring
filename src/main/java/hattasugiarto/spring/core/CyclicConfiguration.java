package hattasugiarto.spring.core;

import hattasugiarto.spring.core.data.cyclic.CyclicA;
import hattasugiarto.spring.core.data.cyclic.CyclicB;
import hattasugiarto.spring.core.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;

public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return  new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }
}
