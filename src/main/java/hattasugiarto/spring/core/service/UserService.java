package hattasugiarto.spring.core.service;

import hattasugiarto.spring.core.data.User;
import hattasugiarto.spring.core.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password){
        if(isLoginSuccess(username, password)){
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        }else {
            return false;
        }
    }

    private boolean isLoginSuccess(String username, String password) {
        return "hatta".equals(username) && "hatta".equals(password);
    }
}
