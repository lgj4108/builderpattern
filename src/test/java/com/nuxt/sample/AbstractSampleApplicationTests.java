package com.nuxt.sample;

import com.nuxt.sample.factory.CallProcess;
import com.nuxt.sample.sample.StartService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AbstractSampleApplicationTests {

    @Autowired
    StartService service;

    @Autowired
    CallProcess callProcess;

    @Test
    void contextLoads() {
        service.start("params");

        callProcess.call();
    }



}
