package com.nuxt.sample.sample;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public void test() {
        System.out.println("bean 주입");
    }
}
