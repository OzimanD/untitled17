package AnnaP.July4;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Workers worker1 = new Workers("Anna", "Pozina", "Vyacheslavivna", "engineer", 1989, "Female");
        Workers worker2 = new Workers("Kolya", "Petrova", "Vyacheslavivna", "cleaner", 1910, "Male");
        Workers worker3 = new Workers("Petya", "Sidorova", "Vyacheslavivna", "writer", 1966, "Male");
        Workers worker4 = new Workers("Dima", "Yakovenko", "Vyacheslavivna", "engineer", 1933, "Female");
        Workers worker5 = new Workers("Lina", "Simirenko", "Vyacheslavivna", "writer", 1990, "Male");
        Workers worker6 = new Workers("Katya", "Pedchenko", "Vyacheslavivna", "seller", 1920, "Male");
        Workers worker7 = new Workers("Lena", "Lubenko", "Vyacheslavivna", "engineer", 1933, "Male");
        List<Workers> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);
        workers.add(worker5);
        workers.add(worker6);
        workers.add(worker7);

        Main main = new Main();

        System.out.println(main.engineerWorkers(workers, "Engineer", "Male", 65));
        System.out.println("________________");
        System.out.println(main.engineerWorkers(workers, "Engineer", "Female", 60));
        try {
            main.saveToFile(workers);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(LocalDateTime.now());

    }

    public List<Workers> engineerWorkers(List<Workers> workers, String job, String sex, int year) {
        List<Workers> workersMen = new ArrayList<>();
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getWorkType().equalsIgnoreCase(job) && (2024 - workers.get(i).getYear()) > year && workers.get(i).getSex().equalsIgnoreCase(sex)) {
                workersMen.add(workers.get(i));
            }
        }
        return workersMen;
    }

    public void saveToFile(List<Workers> workers) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(
                "/Users/annapozina/Desktop/Java.pages"), "Cp866"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("workers.txt"), "Cp866"));
        int c = 0;
        for (int i = 0; i < workers.size(); i++) {
            bw.write(workers.get(i).getName());
            bw.write("  ");
            bw.write(workers.get(i).getSureName());
            bw.write("  ");
            bw.write(String.valueOf(workers.get(i).getYear()));
            bw.write("  ");
            bw.write(workers.get(i).getWorkType());
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
        System.out.println("The job's finished.");
    }
}


//    Фамилия
//            Имя
//    Отчество
//            Пол
//Должность
//        Дата рождения
//
//        Вывести данные об инженерах, пенсионно-
//        го возраста (мужчинам больше 65-ти лет,
//
//        женщинам 60).