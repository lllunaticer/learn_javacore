package interface_test;
import java.util.*;

public class TestInterface {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry", 1000);
        staff[1] = new Employee("Rom", 3000);
        staff[2] = new Employee("Hermine", 2000);

        System.out.println("before the sort:");
        for(Employee p: staff){
            System.out.println("the name is "+p.getName()+", the salary is "+p.getSalary());
        }

        Arrays.sort(staff);
        System.out.println("after the sort:");
        for(Employee p: staff){
            System.out.println("the name is "+p.getName()+", the salary is "+p.getSalary());
            System.out.println("the hashcode is:"+p.hashCode());
        }

    }
}
