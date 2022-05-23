package com.nuxt.sample.factory;

public interface Process {
    <T> T getType(T t);
    void process();

}
