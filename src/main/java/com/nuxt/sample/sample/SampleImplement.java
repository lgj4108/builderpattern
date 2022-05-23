package com.nuxt.sample.sample;

import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;

import java.util.List;

@Component
public class SampleImplement extends AbstractSample {
    //    private Validator validator;

    public SampleImplement(List<String> products) {
        super(products);
    }

    @Override
    public String getType() {
        return "test";
    }

    @Override
    protected String createData(String param) {
//        validator.validate();
        String superData = super.createData(param);
        return superData.concat("11");
    }
}
