package cn.com.greatplan.nacos.inventory;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhuzhiou
 * @date 2020/11/29 15:26
 */
@FeignClient(contextId = "inventoryService", name = "inventory-service")
public interface InventoryService {

    /**
     * 从库存里减去数量
     *
     * @param productId 商品ID
     * @param quantity 数据
     * @return 库存
     */
    @PostMapping(path = "/checkout")
    void checkout(@RequestParam("product_id") String productId, @RequestParam("quantity") int quantity);
}
