package com.nuxt.sample.factory;

import com.nuxt.sample.sample.AbstractSample;
import com.nuxt.sample.sample.SampleImplement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Factory extends CallProcess {

    private List<String> products;
    private String orderTypeCode;
    private String orderSystemDivisionCode;
    private AbstractSample abstractSample;

    public static class FactoryBuilder {
        private List<String> products;
        private String orderTypeCode;
        private String orderSystemDivisionCode;
        private AbstractSample abstractSample;

        public FactoryBuilder(String orderTypeCode, String orderSystemDivisionCode) {
            this.orderTypeCode = orderTypeCode;
            this.orderSystemDivisionCode = orderSystemDivisionCode;
        }

        public FactoryBuilder setArgs() {
            this.products = Arrays.asList("test", "test1", "test2");
            return this;
        }

        public FactoryBuilder setProcessor() {
            this.abstractSample = new SampleImplement(this.products);
            return this;
        }

        public Factory build() {
            return new Factory(products, orderTypeCode, orderSystemDivisionCode, abstractSample);
        }

    }

    public void excute() {
        System.out.println("builder test");
        abstractSample.callProcess("");
    }
}
