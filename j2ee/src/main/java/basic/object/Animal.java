package basic.object;

/**
 * Created by shuai on 2017/2/19.
 */
public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "eating!!");
    }

    public void sleep() {
        System.out.println(name + "sleeping!!");
    }

    public static void indtruduce() {
        System.out.println("super indtruduce!!");
    }
}
