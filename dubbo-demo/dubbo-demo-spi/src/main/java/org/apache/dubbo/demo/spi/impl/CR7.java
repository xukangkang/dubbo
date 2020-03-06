package org.apache.dubbo.demo.spi.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.demo.spi.contract.Football;
import org.apache.dubbo.demo.spi.contract.FootballStar;

public class CR7 implements FootballStar {
    private Football football;
    public void setFootball(Football football){
        this.football = football;
    }
    @Override
    public void getLikeFootballColor(URL url) {
        System.out.println("我是CR7，我喜欢" + football.getBrand(url)+ "的足球");
        //football.getPrice();
    }
}
