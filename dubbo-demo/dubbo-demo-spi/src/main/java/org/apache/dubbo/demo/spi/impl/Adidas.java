package org.apache.dubbo.demo.spi.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.demo.spi.contract.Football;

public class Adidas implements Football {
    @Override
    public String getBrand(URL url) {
        return "adidas";
    }

    @Override
    public int getPrice() {
        return 500;
    }
}
