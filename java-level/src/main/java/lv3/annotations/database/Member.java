package lv3.annotations.database;

import lombok.Getter;

/**
 * @author boyiren
 * @date 2019-09-29
 */
@Getter
@DBTable(name = "MEMBER")
public class Member {
    @SQLString(30)
    String firstName;

    @SQLString(50)
    String lastName;

    @SQLInteger
    Integer age;

    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String handle;

    static int memberCount;

    @Override
    public String toString() {
        return handle;
    }
}
