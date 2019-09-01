package entity;

/**
 * 保单 实体类
 *
 * @author boyiren
 * @date 2019-08-31
 */
public class Policy {
    private int id;
    private String policyNo;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
