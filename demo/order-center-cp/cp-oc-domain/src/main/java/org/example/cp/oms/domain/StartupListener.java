package org.example.cp.oms.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import io.github.dddplus.runtime.IStartupListener;

@Component
@Slf4j
public class StartupListener implements IStartupListener {

    @Override
    public void onStartComplete() {
        log.info("DDD framework booted!");
    }
}
