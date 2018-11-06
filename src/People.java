/**
 *@version  1.0 05 ноября 2018
 * @author  Natasha Yatcenya
 */
public class People {
    private String name;
    private int age;

    People( String n, int a) {
        this.name = n;
        this.age = a;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}
