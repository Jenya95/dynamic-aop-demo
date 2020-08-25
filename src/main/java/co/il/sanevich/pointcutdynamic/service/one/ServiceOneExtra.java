package co.il.sanevich.pointcutdynamic.service.one;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServiceOneExtra {
    public void doJob() {
        log.info("ServiceOneExtra worked");
    }

}
