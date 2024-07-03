package DmytroBondar.homeworks.hw03_JavaEssential.hw03_InheritanceAndPolymorphism.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DocumentWorker documentWorker;
        final String proKey = "pro";
        final String expKey = "exp";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the key: ");
        String key = scanner.nextLine().toLowerCase();
        documentWorker = switch (key) {
            case proKey -> new ProDocumentWorker();
            case expKey -> new ExpertDocumentWorker();
            default -> new DocumentWorker();
        };

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}
