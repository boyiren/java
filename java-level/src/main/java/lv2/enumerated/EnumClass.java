package lv2.enumerated;

/**
 * @author boyiren
 * @date 2019-10-02
 */
public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery shrubbery : Shrubbery.values()) {
            System.out.println(shrubbery + " ordinal: " + shrubbery.ordinal());
            System.out.println(shrubbery.compareTo(Shrubbery.CRAWLING) + " " + shrubbery.equals(Shrubbery.CRAWLING) + " " + (shrubbery == Shrubbery.CRAWLING));
            System.out.println(shrubbery.getDeclaringClass());
            System.out.println(shrubbery.name());
            System.out.println("----------------------------------------------------");
        }
    }
}

/**
 * 灌木 枚举
 */
enum Shrubbery {
    /**
     * 地面
     */
    GROUND,
    /**
     * 爬行
     */
    CRAWLING,
    /**
     * 附着
     */
    HANGING}
