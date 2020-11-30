package cn.com.greatplan.nacos.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 库存服务
 *
 * @author zhuzhiou
 * @date 2020/11/29 15:45
 */
@EnableFeignClients
@SpringBootApplication
public class InventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);
    }

    @ConfigurationProperties(prefix = "inventories")
    @Bean
    public Map<String, Integer> inventories() {
        return new HashMap<>();
    }
}
