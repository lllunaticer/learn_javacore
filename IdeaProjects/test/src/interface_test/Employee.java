package interface_test;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String aName, double aSalary){
        this.name = aName;
        this.salary = aSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double bypercent){
        this.salary =  this.salary*(1+bypercent/100);
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }

    public int hashCode(){
        return Objects.hash(salary, name );
    }
}
