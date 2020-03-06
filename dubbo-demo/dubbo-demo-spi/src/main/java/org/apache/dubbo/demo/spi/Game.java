package org.apache.dubbo.demo.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.demo.spi.contract.FootballStar;

import java.util.HashMap;
import java.util.Map;

public class Game {
    public static void main(String[] args) {
        ExtensionLoader<FootballStar> extensionLoader = ExtensionLoader.getExtensionLoader(FootballStar.class);
        FootballStar cr7 = extensionLoader.getExtension("cr7");
        Map<String,String> map = new HashMap<>();
        map.put("brand","adidas");
        URL url = new URL("","",1,map);
        cr7.getLikeFootballColor(url);

        map = new HashMap<>();
        map.put("brand","nike");
        url = new URL("","",1,map);
        cr7.getLikeFootballColor(url);
    }
}
