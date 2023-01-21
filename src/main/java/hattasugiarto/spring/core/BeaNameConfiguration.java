package hattasugiarto.spring.core;

import hattasugiarto.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeaNameConfiguration {
    @Primary
    @Bean(name = "fooFirst")
    public Foo foo1(){
        return new Foo();
    }

    @Bean(name = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }
}
