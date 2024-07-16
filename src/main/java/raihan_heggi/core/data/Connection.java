package raihan_heggi.core.data;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Connection implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        log.info("Destroying Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Initializing Bean");
    }

}
