package co.il.sanevich.pointcutdynamic.service.two;

import co.il.sanevich.pointcutdynamic.service.Worker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ServiceTwo implements Worker {
    public void doJob() {
        log.info("ServiceTwo worked");
    }
}
