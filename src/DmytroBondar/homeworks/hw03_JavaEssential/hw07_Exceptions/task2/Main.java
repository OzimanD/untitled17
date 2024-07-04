package DmytroBondar.homeworks.hw03_JavaEssential.hw07_Exceptions.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int WORKERS_COUNT = 5;

    public static void main(String[] args) {

        List<Worker> workers = new ArrayList<>();

        System.out.println("Enter information about " + WORKERS_COUNT + " workers: ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < WORKERS_COUNT; i++) {
            System.out.println("Enter last name and initials for worker " + (i + 1) + ": ");
            String lastNameAndInitials = scanner.nextLine();
            System.out.println("Enter job title: for worker " + (i + 1) + ": ");
            String jobTitle = scanner.nextLine();
            System.out.println("Enter year of employment for worker " + (i + 1) + ": ");
            try {
                int yearOfEmployment = scanner.nextInt();
                if (yearOfEmployment < 1900 || yearOfEmployment > 2024) {
                    throw new Exception();
                }
                workers.add(new Worker(lastNameAndInitials, jobTitle, yearOfEmployment));
                scanner.nextLine();
            } catch (Exception e) {
                System.err.println("Invalid year of employment. Please enter again.");
                scanner.nextLine();
                i--;
            }
        }

        System.out.println("Workers: ");
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
