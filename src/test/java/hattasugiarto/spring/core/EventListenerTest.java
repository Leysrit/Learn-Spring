package hattasugiarto.spring.core;

import hattasugiarto.spring.core.listener.LoginSuccessListener;
import hattasugiarto.spring.core.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class
    })
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEventListener(){
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("hatta", "hatta");
        userService.login("hatta", "123");
        userService.login("hatta", "456");
    }
}
