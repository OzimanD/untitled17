package DmytroBondar.lessons.oop.employees2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final int AGE = 30;
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Doe", "Developer", 3333.33, LocalDate.of(1990, 12, 12)));
        employees.add(new Employee("Jane", "Scott", "Manager", 3210.99, LocalDate.of(2000, 7, 7)));
        employees.add(new Employee("Jack", "Parker", "HR", 2000.5, LocalDate.of(1999, 7, 13)));
        employees.add(new Employee("Jill", "Williams", "QA", 3131.31, LocalDate.of(1995, 5, 5)));

        Main main = new Main();
        System.out.println("Average salary: " + main.getAverageSalary(employees));
        System.out.println("Employees with salary greater than average and age less than " + AGE + ":");
        main.printList(main.getEmployeesLessThan(employees, AGE));
    }

    public List<Employee> getEmployeesLessThan(List<Employee> employees, int age) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() > getAverageSalary(employees) && employee.getBirthDate().isAfter(LocalDate.now().minusYears(age))) {
                result.add(employee);
            }
        }
        return result;
    }

    public double getAverageSalary(List<Employee> employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum / employees.size();
    }

    public <T> void printList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }
}
