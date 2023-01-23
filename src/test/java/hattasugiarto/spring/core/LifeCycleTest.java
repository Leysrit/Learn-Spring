package hattasugiarto.spring.core;

import hattasugiarto.spring.core.data.Connection;
import hattasugiarto.spring.core.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @AfterEach
    void tearDown(){
        applicationContext.close();
        applicationContext.registerShutdownHook();
    }

    @Test
    void testConnection(){
        Connection connection = applicationContext.getBean(Connection.class);
    }

    @Test
    void testServer(){
        Server server = applicationContext.getBean(Server.class);
    }
}
