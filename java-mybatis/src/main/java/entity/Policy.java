package entity;

/**
 * 保单 实体类
 *
 * @author boyiren
 * @date 2019-08-31
 */
public class Policy {
    private int id;
    private String number;
    private String name;
    private int typeId;
    private PolicyType policyType;

    public Policy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String policyNo) {
        this.number = policyNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public PolicyType getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType;
    }

    @Override
    public String toString() {
        return "Policy[id=" + this.id + ", number=" + this.number + ", name=" + this.name + ", typeId=" + this.typeId + "]";
    }
}
