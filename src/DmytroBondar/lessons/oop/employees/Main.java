package DmytroBondar.lessons.oop.employees;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static DmytroBondar.lessons.oop.employees.Position.*;
import static DmytroBondar.lessons.oop.employees.Sex.FEMALE;
import static DmytroBondar.lessons.oop.employees.Sex.MALE;

public class Main {
    public static final int RETIREMENT_AGE_FOR_MALE = 65;
    public static final int RETIREMENT_AGE_FOR_FEMALE = 60;
    public static final List<Position> LIST_OF_RETIREMENT_POSITIONS = List.of(SOFTWARE_ENGINEER, QA_ENGINEER);
    public static final String FILE_NAME = "ListOfRetirementEmployees";

    public static void main(String[] args) throws IOException {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ivan", "Ivanov", MALE, SOFTWARE_ENGINEER, LocalDate.of(1990, 1, 1)));
        employees.add(new Employee("Natalia", "Jackson", FEMALE, SOFTWARE_ENGINEER, LocalDate.of(1955, 10, 25)));
        employees.add(new Employee("Adam", "Lee", MALE, MANAGER, LocalDate.of(1980, 11, 11)));
        employees.add(new Employee("Anna", "Clark", FEMALE, QA_ENGINEER, LocalDate.of(1950, 12, 12)));
        employees.add(new Employee("Daniel", "Alvarez", MALE, QA_ENGINEER, LocalDate.of(1959, 5,5)));
        employees.add(new Employee("Amelia", "Williams", FEMALE, SOFTWARE_ENGINEER, LocalDate.of(1990, 8, 8)));
        employees.add(new Employee("Roman", "Scott", MALE, SOFTWARE_ENGINEER, LocalDate.of(1959, 11, 11)));
        employees.add(new Employee("Alice", "Parker", FEMALE, ACCOUNTANT, LocalDate.of(1950, 8, 8)));

        Main main = new Main();
        List<Employee> listOfRetirementEmployees = main.getEmployeesOfRetirementAgeByPositions(employees, LIST_OF_RETIREMENT_POSITIONS, RETIREMENT_AGE_FOR_MALE, RETIREMENT_AGE_FOR_FEMALE);

        System.out.println("List of retirement employees:");
        main.printList(listOfRetirementEmployees);

        System.out.println("---------------------------------");

        main.saveToFile(listOfRetirementEmployees);
        //main.deleteFile();
    }

    public List<Employee> getEmployeesOfRetirementAgeByPositions(List<Employee> employees, List<Position> positions, int retirementAgeForMale, int retirementAgeForFemale) {
        List<Employee> employeesOfRetirementAgeByPositions = new ArrayList<>();
        for (Employee employee : employees) {
            int retirementAge = employee.getSex().equals(MALE) ? retirementAgeForMale : retirementAgeForFemale;
            if (positions.contains(employee.getPosition()) && employee.getBirthDate().plusYears(retirementAge).isBefore(LocalDate.now())) {
                employeesOfRetirementAgeByPositions.add(employee);
            }
        }
        return employeesOfRetirementAgeByPositions;
    }

    public <T> void printList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

    public void saveToFile(List<Employee> employees) throws IOException {
        BufferedWriter bw = null;
        try {
            System.out.println("Try to save a list of retirement employees to file:");
            File file = new File(FILE_NAME);
            if (file.createNewFile()) {
                System.out.printf("File \"%s\" created in project root directory\n", file.getName());
            } else {
                System.out.printf("File \"%s\" already exists in the project root directory\n", file.getName());
            }
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FILE_NAME), "Cp866"));
            for (Employee employee : employees) {
                bw.write(employee.toString());
                bw.newLine();
            }
            System.out.printf("List of retirement employees saved to file: \"%s\"\n", file.getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                bw.flush();
                bw.close();
            }
        }
    }

    public void deleteFile(){
        File file = new File(FILE_NAME);
        if (file.delete()) {
            System.out.printf("File \"%s\" deleted\n", file.getName());
        } else {
            System.out.printf("File \"%s\" not found\n", file.getName());
        }
    }
}
