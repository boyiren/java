package entity;

import java.util.List;

/**
 * 保险订单 实体类
 *
 * @author boyiren
 * @date 2019-09-07
 */
public class PolicyOrder {
    private int id;
    private String code;
    private List<OrderItem> orderItems;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
