package com.nuxt.sample.factory;

import org.springframework.stereotype.Service;

@Service
public class CallProcess {

    public void call() {
        new Factory.FactoryBuilder("", "")
                .setArgs()
                .setProcessor()
                .build()
                .excute();
    }
}
