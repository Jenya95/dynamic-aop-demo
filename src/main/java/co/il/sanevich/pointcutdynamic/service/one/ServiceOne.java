package co.il.sanevich.pointcutdynamic.service.one;

import co.il.sanevich.pointcutdynamic.service.Worker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ServiceOne implements Worker {
    public void doJob() {
        log.info("ServiceOne worked");
    }
}
