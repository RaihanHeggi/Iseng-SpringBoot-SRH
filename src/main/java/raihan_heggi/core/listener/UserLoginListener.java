package raihan_heggi.core.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import raihan_heggi.core.event.UserEvent;

@Slf4j
@Component
public class UserLoginListener implements ApplicationListener<UserEvent> {
    @Override
    public void onApplicationEvent(UserEvent event) {
        log.info("Success Login for {}", event.getUser());
    }

}
