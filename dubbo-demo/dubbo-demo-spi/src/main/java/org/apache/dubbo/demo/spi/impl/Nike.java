package org.apache.dubbo.demo.spi.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.demo.spi.contract.Football;

public class Nike implements Football {
    @Override
    public String getBrand(URL url) {
        return "nike";
    }

    @Override
    public int getPrice() {
        return 600;
    }
}
