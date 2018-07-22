import java.util.*;

class Employee {
    private String name;
    private String email;
    private Date dateOfBirth;
    private double salary;

    public Employee(String name, String email, Date dateOfBirth, double salary) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    // Getters and Setters (Omitted for brevity)
}
