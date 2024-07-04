package AnnaP.June18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Petrov", "N1", 3,4,5);
        Student student2 = new Student("Sidorov", "N3", 5,2,5);
        Student student3 = new Student("Muller", "N1", 2,5,4);
        Student student4 = new Student("Olye", "N1", 5,1,4);
        Student student5 = new Student("Yeti", "N1", 3,5,3);
        Student student6 = new Student("Isana", "N1", 2,3,5);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        Main main = new Main();
        System.out.println(main.averagePhiNote(students));


    }

    double averagePhiNote(List<Student> students){
        int sum = 0;
        for (int i = 0; i < students.size(); i++) {
             sum += students.get(i).getPhyNote();
        }
        double res = (double) sum / students.size();
        return res;
    }
}


//    Фамилия
//            Группа
//    Физика
//            Информ
//История
//
//        Определить средний бал оценок по
//        физике, количество студентов с
//        оценкой 5 по информатике и
//        вывести сведения о них.
