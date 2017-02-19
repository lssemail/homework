package basic.object;

/**
 * Created by shuai on 2017/2/19.
 */
public class Mouse extends Animal {

    public Mouse(String name) {
        super(name);
    }

        public static void indtruduce() {
        System.out.println("sub indtruduce!!");
    }


    public static void main(String[] args) {
        Animal.indtruduce();
        Mouse.indtruduce();
    }
}
