package com.video;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZomgController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/zomg")
    public Zomg zomg() {
        return new Zomg(counter.incrementAndGet(),
                            String.format("it works!"));
    }

}
