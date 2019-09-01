package entity;

import java.util.List;

/**
 * 保单种类 实体类
 *
 * @author boyiren
 * @date 2019-09-01
 */
public class PolicyType {
    private int id;
    private String name;
    private List<Policy> policies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    @Override
    public String toString() {
        return "PolicyType[id=" + this.id + ", name=" + this.name + "]";
    }
}
