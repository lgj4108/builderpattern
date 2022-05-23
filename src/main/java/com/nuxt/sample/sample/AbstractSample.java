package com.nuxt.sample.sample;

import java.util.List;

public abstract class AbstractSample {
    private List<String> products;

    public AbstractSample(List<String> products) {
        this.products = products;
    }
    public abstract String getType();

    public void callProcess(String param) {
        System.out.println("test");

        System.out.println("products" + this.products.size());


        String data = createData(param);

        insertData(data);
        System.out.println("end");
    }

    protected String createData(String param) {
        System.out.println(param);

        return "data";
    }

    protected void insertData(String data) {
        System.out.println(data);
    }
}
