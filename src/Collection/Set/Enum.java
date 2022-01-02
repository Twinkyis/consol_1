package Collection.Set;

public class Enum {
    public static void main(String[] args) {
        System.out.println(myEnum.FRIDAY.ordinal());
        System.out.println(myEnum.SATURDAY);
    }
}

enum myEnum {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
        }