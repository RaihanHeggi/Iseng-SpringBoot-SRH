package raihan_heggi.core.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class server{
    
    @PostConstruct
    public void start(){
        log.info("Start Server");
    }

    @PreDestroy
    public void stop(){
        log.info("Stop Server");
    }

    // @Override
    // public void destroy() throws Exception {
    //     stop();
    // }

    // @Override
    // public void afterPropertiesSet() throws Exception {
    //     start();    
    // }
}
