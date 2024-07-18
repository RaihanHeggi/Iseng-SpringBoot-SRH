package raihan_heggi.core.event;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationEvent;

import lombok.Getter;

public class UserEvent extends ApplicationEvent{

    
    @Getter
    private final User user;
    
    public UserEvent(User user) {
        super(user);
        this.user = user;
    }


}
