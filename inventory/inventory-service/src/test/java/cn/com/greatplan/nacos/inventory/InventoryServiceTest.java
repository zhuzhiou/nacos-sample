package cn.com.greatplan.nacos.inventory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author zhuzhiou
 * @date 2020/11/29 17:54
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class InventoryServiceTest {

    private InventoryService inventoryService;

    @Autowired
    public void setInventoryService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @Test
    public void testCheckout_success() {
        inventoryService.checkout("a", 10);
    }

    @Test
    public void testCheckout_fail() {
        assertThrows(UnsupportedOperationException.class, () -> {
            inventoryService.checkout("c", 1000);
        });
    }
}
