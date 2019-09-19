package level1.container;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection 测试
 * 使用 ArrayList 类来存储数据，向上转型为 Collection，然后测试 Collection 中的方法
 *
 * @author boyiren
 * @date 2019-09-19
 */
public class CollectionTest {
    Collection collection = new ArrayList();

    @Test
    public void testSize() {
        Assert.assertEquals(collection.size(), 0);
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(collection.isEmpty());
    }

    @Test
    public void contains() {
        Assert.assertFalse(collection.contains(1));
    }
}
