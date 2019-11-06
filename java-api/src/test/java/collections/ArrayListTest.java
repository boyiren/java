package collections;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 测试 ArrayList API
 *
 * @author boyiren
 * @date 2019-09-21
 */
public class ArrayListTest {

    @Test
    public void add() {
        System.out.println("----- 测试 ArrayList add() 以及了解底层实现 -----");
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 什么都不添加的话打印的是一个空的数组，这就要看底层的toString是如何实现的了
        System.out.println(arrayList);
        // add(E e) 总共做了三步
        // 1.ensureCapacityInternal(size + 1);
        // 2.elementData[size++] = e;
        // 3.return true;
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList);
    }
}
