package cn.com.greatplan.nacos.order;

import cn.com.greatplan.nacos.inventory.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author zhuzhiou
 * @date 2020/11/29 16:41
 */
@Service
public class OrderService {

    private InventoryService inventoryService;

    @Autowired
    public void setInventoryService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public String placeOrder(Order order) {
        String productId = order.getProductId();
        int quantity = order.getQuantity();

        inventoryService.checkout(productId, quantity);
        return UUID.randomUUID().toString();
    }
}
