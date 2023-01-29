package hattasugiarto.spring.core.configuration;

import hattasugiarto.spring.core.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    @Bean
    public Bar bar(){
        return new Bar();
    }
}
