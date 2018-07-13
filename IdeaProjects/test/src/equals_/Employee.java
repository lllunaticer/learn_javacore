package equals_;
import java.time.*;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String aName, double aSalary, int year, int month, int day){
        this.name = aName;
        this.salary = aSalary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public Employee(String aName) {
        this.name = aName;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        this.salary = this.salary*(1+byPercent/100);
    }

    public boolean equals(Object otherObeject){
        if(this==otherObeject) return true;
        if(otherObeject==null) return false;
        if(getClass()!=otherObeject.getClass()) return false;
        Employee other = (Employee) otherObeject;
        boolean flag =  Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
        return flag;
    }

    public int hashCode(){
        return Objects.hash(name, salary, hireDay);
    }

    public String toString(){
        return getClass().getName()+"[name"+name+",salary"+salary+",hireday"+hireDay+"],";
    }
}
