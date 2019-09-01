import entity.Policy;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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

            List<Policy> policies = session.selectList("listPolicy");
            for (Policy policy : policies) {
                System.out.println(policy.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
