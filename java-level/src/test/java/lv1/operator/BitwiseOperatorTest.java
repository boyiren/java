package lv1.operator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 测试位操作符
 *
 * @author boyiren
 * @date 2019-10-30
 */
public class BitwiseOperatorTest {

    /**
     * 将整数转换成二进制（字符串格式）
     */
    @Test
    public void convertToBinary() {
        int i = 5;
        String b = (Integer.toBinaryString(i));
        assertEquals(b, "101");

        System.out.println("int最大正数：" + Integer.MAX_VALUE);
        System.out.println("int最大正数二进制表示：" + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("int最小负数：" + Integer.MIN_VALUE);
        System.out.println("int最小负数二进制表示：" + Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE - 1);
    }

    /**
     * 按位或
     */
    @Test
    public void bitwiseOR() {
        // 5的二进制是101
        int i = 5;
        // 6的二进制是110
        int j = 6;
        // 则5和6按位或的结果是111 -> 7
        assertEquals(5 | 6, 7);
    }

    /**
     * 按位与
     */
    @Test
    public void bitwiseAND() {
        // 5的二进制是101
        int i = 5;
        // 6的二进制是110
        int j = 6;
        // 则5和6按位与的结果是100 -> 4
        assertEquals(5 & 6, 4);
    }

    /**
     * 按位异或，不同为1，相同为0
     */
    @Test
    public void bitwiseXOR() {
        // 5的二进制是101
        int i = 5;
        // 6的二进制是110
        int j = 6;
        // 则5和6按位异或的结果是011 -> 3
        assertEquals(5 ^ 6, 3);
    }

    /**
     * 取反
     */
    @Test
    public void bitwiseNOT() {
        /*
        5的二进制是101，这没错，只不过Java中int类型的数据占4个byte，1个byte==8个bit。
        因此int类型数据需要32个bit的存储空间。则5的二进制101其实在这里，前面省略了32-3=29个0。
        当使用Java的按位取反运算符 ~ 对int类型数据进行取反时。
        其实是对32个bit进行运算，而不是对101进行运算。
        101其实是toBinaryString()函数对正数二进制转换的一种简化效果,忽略了前面的0而已。
        如果你对负数使用toBinaryString()，则会看到32个bit的数据。

        int类型的5实际二进制是 00000000 00000000 00000000 00000101
        按位取反，0变1，1变0   11111111 11111111 11111111 11111010
        按照二进制换算成十进制，上面应该是4,294,967,290，其实这是错的。
        ‬1.int类型的二进制是有符号位的，也就是32个bit的第一个bit是符号位，0为正，1为负
        既然1为负，那么去掉符号位，上面的二进制因该是-2,147,483,642，这也是错的。
        2.在Java中，负数是用补码来表示的，也就是上面的二进制其实是负数的补码。
        那么真实的负数就是补码减1，在取反码（符号位不变）
        11111111 11111111 11111111 11111010 -> 减 1
        11111111 11111111 11111111 11111001 -> 取反码（符号位不变）
        10000000 00000000 00000000 00000110 -> -6
        */
        int i = 5;
        assertEquals(~i, -6);
    }

    /**
     * 左移
     */
    @Test
    public void leftShift() {
        int i = 5;
        assertEquals(i<<1, 10);
    }

    /**
     * 右移
     * 对于正数， 带符号右移 >> 会把所有的位右移，并在最前面补0
     * 对于负数， 带符号右移 >> 会把所有的位右移，并在最前面补1
     */
    @Test
    public void rightShift() {
        int i = 11;
        assertEquals(i>>1, 5);
    }

    /**
     * 无符号右移
     * 无符号右移>>>会把第一位的1也向右移动，导致移动后，第一位变成0
     * 这样就会使得负数在无符号右移后，得到一个正数
     * 简单的说：
     * 带符号右移 >> 移动后正的还是正的，负的还是负的,符号不变
     * 无符号右移>>>移动后，变正的了
     */
    @Test
    public void unsignedRightShift() {
        int i = 11;
        assertEquals(i>>>1, 5);
    }
}