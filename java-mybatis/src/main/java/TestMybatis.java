import entity.OrderItem;
import entity.Policy;
import entity.PolicyOrder;
import entity.PolicyType;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试 Mybatis
 *
 * @author boyiren
 * @date 2019-08-31
 */
public class TestMybatis {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();

            // 增
            Policy p = new Policy();
            p.setId(5);
            p.setNumber("100");
            p.setName("保单100");
            p.setTypeId(1);
            session.insert("addPolicy", p);
            // 删
            session.delete("deletePolicy", p);

            // 改
            Policy p2 = new Policy();
            p2.setId(4);
            p2.setName("保单由4变成400");
            session.update("updatePolicy", p2);

            // 查
            System.out.println("查询全部：");
            List<Policy> policies = session.selectList("listPolicy");
            for (Policy policy : policies) {
                System.out.println(policy);
            }
            // 模糊查询
            System.out.println("--------------------------");
            System.out.println("模糊查询：");
            List<Policy> policies1 = session.selectList("selectByName", "变成");
            for (Policy policy : policies1) {
                System.out.println(policy);
            }
            // 多条件查询，将条件放入map里
            System.out.println("--------------------------");
            System.out.println("多条件查询：");
            Map<String, Object> params = new HashMap<>(2);
            params.put("name", "保单");
            params.put("number", "2");
            List<Policy> policies2 = session.selectList("selectByNoAndName", params);
            for (Policy policy : policies2) {
                System.out.println(policy);
            }

            // 一对多查询
            System.out.println("--------------------------");
            System.out.println("一对多查询：");
            List<PolicyType> policyTypes = session.selectList("listPolicyType");
            for (PolicyType policyType : policyTypes) {
                System.out.println(policyType);
                List<Policy> policies3 = policyType.getPolicies();
                for (Policy policy : policies3) {
                    System.out.println("\t" + policy);
                }
            }

            // 多对一查询
            System.out.println("--------------------------");
            System.out.println("多对一查询：");
            List<Policy> policies3 = session.selectList("listPolicyWithPolicyType");
            for (Policy policy : policies3) {
                System.out.println(policy + "\t对应的分类是\t" + policy.getPolicyType());
            }

            // 多对多查询
            System.out.println("--------------------------");
            System.out.println("多对多查询：");
            List<PolicyOrder> policyOrders = session.selectList("listPolicyOrder");
            for (PolicyOrder policyOrder : policyOrders) {
                System.out.println(policyOrder.getCode());
                List<OrderItem> orderItems = policyOrder.getOrderItems();
                for (OrderItem orderItem : orderItems) {
                    System.out.format("\t%s\t%d%n",
                            orderItem.getPolicy().getName(), orderItem.getNumber());
                }
            }

            session.commit();
            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
