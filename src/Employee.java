import java.util.Objects;

public class Employee {

    String job;
    int salary;

    public Employee(String job, int salary) {
        this.job = job;
        this.salary = salary;
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && job.equals(employee.job);
    }

    @Override
    public int hashCode() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
