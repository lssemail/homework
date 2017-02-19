package basic.object;

/**
 * Created by Mr.shuai on 2017/2/19.
 * 测试多态
 */
public class Test {

    public static void main(String[] args) {
        show(new Apple());
        show(new Lenovo());
    }

    public static void show(Computer computer) {

        computer.introduce();
        if(computer instanceof Apple) {
            Apple apple = (Apple) computer;
            apple.price();
        } else if(computer instanceof Lenovo) {
            Lenovo lenovo = (Lenovo) computer;
            lenovo.price();
        }
    }
}

abstract class Computer {

    abstract void introduce();
}

class Apple extends Computer {

    @Override
    void introduce() {
        System.out.println("Apple!!");
    }

    public void  price() {
        System.out.println("apple price: $ 1000.");
    }
}

class Lenovo extends Computer {

    @Override
    void introduce() {
        System.out.println("Lenovo!!");
    }

    public void  price() {
        System.out.println("Lenovo price: $ 2000.");
    }
}
