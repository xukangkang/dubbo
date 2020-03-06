package org.apache.dubbo.demo.spi.contract;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface FootballStar {

    void getLikeFootballColor(URL url);
}
