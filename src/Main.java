import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> department = new ArrayList<>();
        department.add("Marketing");
        department.add("Human resources");
        department.add("Financial");
        department.add("Logistics");

        for (String departmentType : department)
            System.out.println(departmentType);

        Set<Employee>staff = new HashSet<>();
        staff.add(new Employee("Financial specialist", 10000));
        staff.add(new Employee("Logistician", 20000));
        staff.add(new Employee("Marketing expert", 15000));
        staff.add(new Employee("HR manager", 10000));

        for (Employee vacancies : staff)
            System.out.println(vacancies.toString());

        Set<Integer>salary = new TreeSet<>();
        salary.add(10000);
        salary.add(13000);
        salary.add(15000);
        salary.add(18000);
        salary.add(20000);

        for (Integer potentialSalary : salary)
            System.out.print(potentialSalary + ", ");

    }
}