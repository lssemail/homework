package basic.object;

/**
 * Created by shuai on 2017/2/19.
 */
public class AbstractDemo {

    public static void main(String[] args) {

//        Employee employee = new Employee().hello();
//
//        System.out.println(employee.computePay());

        Salary salary = new Salary("George W.", "Houston, TX", 43);
        salary.hello();
        System.out.println(salary.computePay());
    }
}
