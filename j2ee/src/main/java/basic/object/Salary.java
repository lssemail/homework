package basic.object;

/**
 * Created by shuai on 2017/2/19.
 */
public class Salary extends Employee {

    public Salary(String name, String address, int number) {
        super(name, address, number);
    }

    @Override
    void hello() {
        System.out.println(super.getNumber());
    }
}
