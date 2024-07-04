package AnnaP.HomeWork5List;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Group student1 = new Group("Muller O.P. ", LocalDate.of(2000, 2, 4), new int[]{2, 4, 5});
//        Group student2 = new Group("Tuka L.M.", LocalDate.of(2001, 2, 4), new int[]{5, 4, 1});
//        Group student3 = new Group("Rura N.C.", LocalDate.of(2002, 2, 4), new int[]{4, 5, 5});
//        Group student4 = new Group("Pepe F.G.", LocalDate.of(2003, 2, 4), new int[]{2, 4, 4});
//        Group student5 = new Group("Ahmed H.F.", LocalDate.of(2000, 2, 4), new int[]{2, 3, 5});
//        Group student6 = new Group("Roller G.L.", LocalDate.of(1999, 2, 4), new int[]{4, 4, 3});

        List<Group> fullGroup = new ArrayList<>();
        addStudent(fullGroup);
        addStudent(fullGroup);
        addStudent(fullGroup);
        System.out.println(fullGroup.toString());


    }

    static void addStudent(List<Group> fullGroup) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String name = scanner.next(); // name of the student

        System.out.println("Input birth year");
        int year = scanner.nextInt();
        System.out.println("Input birth month");
        int month = scanner.nextInt();
        System.out.println("Input birth day");
        int day = scanner.nextInt();
        LocalDate date = LocalDate.of(year, month, day); // date of birth


        System.out.println("Input your score 1");
        int mark1 = scanner.nextInt();
        System.out.println("Input your score 2");
        int mark2 = scanner.nextInt();
        System.out.println("Input your score 3");
        int mark3 = scanner.nextInt();
        int[] marks = {mark1, mark2, mark3}; // scores in array

        Group student = new Group(name, date, marks); //adding all data about student
        fullGroup.add(student); // adding student to the Array

        System.out.println("New student: " + student.toString());
    }

    public static void sortByAge(List<Group> fullGroup) {
        double average = 0.0;
        double averageCounter = 0.0;
        for (int i = 0; i < fullGroup.size(); i++) {
            int[] scores = fullGroup.get(i).getSes();
            int score = 0;

            for (int j = 0; j < scores.length; j++) {
                score = scores[j] + score;
            }
            average = score / scores.length;
            System.out.println("average score for Student " + fullGroup.get(i).getName() + " is {" + average + "}");

            if (average > averageCounter) {
                averageCounter = average;
            }

        }


    }
}

//    Описать структуру с именем GROUP, содержащую поля: Name –
//        фамилия и инициалы, DAT – дата рождения (год, месяц, число), SES
//        – успеваемость (массив из трех элементов).
//        Написать программу, выполняющую:
//         ввод с клавиатуры данных в массив GR5,состоящий из 10 структур
//        типа GROUP;
//         вывод на экран записей, упорядоченных по возрастанию поля SES;
//         вывод списка студентов, возраст которых на 01.12.2010 года не
//        превышает 20 лет;
//         если таких студентов нет – выдать сообщение.



//    Фамилия
//            Амплуа
//Возраст
//        Количество игр
//        Количество голов
//
//        Определить лучшего форварда, и
//        вывести сведения о футболистах,
//        сыгравших менее 5-ти игр.