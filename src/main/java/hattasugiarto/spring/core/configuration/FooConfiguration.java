package hattasugiarto.spring.core.configuration;

import hattasugiarto.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {
    @Bean
    public Foo foo(){
        return new Foo();
    }
}
