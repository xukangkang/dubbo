package org.apache.dubbo.demo.spi.contract;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

//@SPI("adidas")
@SPI
public interface Football {
    // 如果@Adaptive的value对应的url中的value不为空，则取value对应的url中的value对应的实现类。
    // value是一个数组，下标小的数组元素优先使用，
    // 如果从url中没找到下标小的元素对应的value，则继续判断后面的数组元素。
    // 如果value为空，则判断类上的@SPI注解是否有value，有则使用@SPI中的value，否则异常。
    //@Adaptive
    @Adaptive("brand")
    String getBrand(URL url);

    int getPrice();
}
