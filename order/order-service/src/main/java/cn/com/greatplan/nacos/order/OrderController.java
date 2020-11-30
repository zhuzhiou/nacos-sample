package cn.com.greatplan.nacos.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuzhiou
 * @date 2020/11/29 16:36
 */
@RestController
public class OrderController {

    private OrderService orderService;

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * 下订单
     *
     * @param order
     * @return
     */
    @PostMapping(path = "/placeOrder")
    public String sayHello(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }
}
