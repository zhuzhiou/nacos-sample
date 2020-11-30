package cn.com.greatplan.nacos.inventory;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.SynchronizedBag;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

/**
 * @author zhuzhiou
 * @date 2020/11/29 15:46
 */
@Service
public class InventoryService {

    private Bag<String> inventories = SynchronizedBag.synchronizedBag(new HashBag<>());

    public InventoryService(Map<String, Integer> inventories) {
        Set<String> keySet = inventories.keySet();
        for (String key : keySet) {
            this.inventories.add(key, inventories.get(key));
        }
    }

    /**
     * 从库存里减去数量
     *
     * @param productId 商品ID
     */
    public void checkout(String productId, int quantity) {
        if (inventories.getCount(productId) < quantity || !inventories.remove(productId, quantity)) {
            throw new UnsupportedOperationException("库存不足");
        }
    }
}
