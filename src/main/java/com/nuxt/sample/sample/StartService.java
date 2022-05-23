package com.nuxt.sample.sample;

import lombok.RequiredArgsConstructor;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class StartService {
    private final List<AbstractSample> abstractSamples;

    private Map<String, AbstractSample> processor = new LinkedHashMap<>();

    @PostConstruct
    public void init() {
        abstractSamples.forEach(s -> processor.put(s.getType(), s));
    }

    public void start(String param) {
        System.out.println("start");
        String enumType = "test"; // param;
        processor.get(enumType).callProcess(param);
    }
}
