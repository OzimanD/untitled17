package AnnaP.OOPlesson3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Anna", "12", 3,4,4);
        Student student2 = new Student("Anna2", "13", 5,5,4);
        Student student3 = new Student("Anna3", "13", 5,5,3);
        Student student4 = new Student("Anna4", "12", 5,4,1);

        Student[] students = {student1, student2, student3, student4};
        averageMark(students);
    }
     public static void averageMark(Student[] students){
         for (int i = 0; i < students.length; i++) {
            double average = (students[i].getMarkPh() + students[i].getMarkInf() + students[i].getHist())/3.0;
            if (average>4){
                System.out.println("student " + students[i].getSurname() + " has average mark = " + average + " and it is higher than 4");
            }
         }

     }

}

//    Фамилия
//            Группа
//    Физика
//            Информ
//История
//
//        Определить средний бал оценок по
//
//        всем предметам, и вывести сведе-
//        ния о студентах, средний балл
//
//        которых больше 4.
