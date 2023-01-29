package hattasugiarto.spring.core;

import hattasugiarto.spring.core.configuration.BarConfiguration;
import hattasugiarto.spring.core.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
