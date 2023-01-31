package hattasugiarto.spring.core;

import hattasugiarto.spring.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "hattasugiarto.spring.core.repository",
        "hattasugiarto.spring.core.service",
        "hattasugiarto.spring.core.configuration"
})

@Import(MultiFoo.class)
public class ComponentConfiguration {

}
