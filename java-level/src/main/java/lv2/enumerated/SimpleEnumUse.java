package lv2.enumerated;

/**
 * @author boyiren
 * @date 2019-10-02
 */
public class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;

        System.out.println(howHot);
        System.out.println(howHot.name());
        System.out.println(howHot.hashCode());
        System.out.println(howHot.toString());
        System.out.println(howHot.getClass());
        System.out.println(howHot.getDeclaringClass());
        System.out.println(howHot.ordinal());

        for (Spiciness spiciness : Spiciness.values()) {
            System.out.println(spiciness + ".ordinal" + spiciness.ordinal());
        }
    }
}
