package cn.com.greatplan.nacos.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 使用 nacos 的一个示例
 *
 * @author zhuzhiou
 * @date 2020/11/29 17:15
 */
@EnableFeignClients(basePackages = "cn.com.greatplan.nacos.inventory")
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
