package hashtable;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author boyiren
 * @date 2019-10-23
 */
public class HashMapTest {

    @Test
    public void put() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "2");
        System.out.println(hashMap);
    }
}
