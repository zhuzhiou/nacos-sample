package cn.com.greatplan.nacos.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhuzhiou
 * @date 2020/11/29 15:46
 */
@RestController
@RefreshScope
public class InventoryController {

    private InventoryService inventoryService;

    @Autowired
    public void setInventoryService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    /**
     * 从库存里减去数量
     *
     * @param productId 商品ID
     * @return
     */
    @PostMapping("/checkout")
    public void checkout(@RequestParam("product_id") String productId, @RequestParam("quantity") int quantity) {
        inventoryService.checkout(productId, quantity);
    }
}
