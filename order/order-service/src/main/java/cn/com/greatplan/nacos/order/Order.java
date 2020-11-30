package cn.com.greatplan.nacos.order;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author zhuzhiou
 * @date 2020/11/29 16:42
 */
public class Order {

    @JsonProperty("product_id")
    private String productId;

    private int quantity;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
