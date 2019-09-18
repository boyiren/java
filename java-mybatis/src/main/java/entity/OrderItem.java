package entity;

/**
 * 订单项 实体类
 *
 * @author boyiren
 * @date 2019-09-07
 */
public class OrderItem {
    private int id;
    private int number;
    private PolicyOrder policyOrder;
    private Policy policy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PolicyOrder getPolicyOrder() {
        return policyOrder;
    }

    public void setPolicyOrder(PolicyOrder policyOrder) {
        this.policyOrder = policyOrder;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }
}
