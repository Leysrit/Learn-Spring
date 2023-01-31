package hattasugiarto.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "hattasugiarto.spring.core.repository",
        "hattasugiarto.spring.core.service",
        "hattasugiarto.spring.core.configuration"
})
public class ComponentConfiguration {

}
