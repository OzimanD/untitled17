package DariiaM;

public class Task3 {
    public static void Loop (int A, int B){
        int N = 0;
     if (A < B) {
         for (int i = B - 1; i > A; i--) {
             N++;
             System.out.println(i);
         }
         }
        System.out.println(N);
    }

    public static void main(String[] args) {
        Loop(2 , 6);
    }
}
//Даны два целых числа A и B (A < B). Вывести в порядке убывания все
//        целые числа, расположенные между A и B (не включая числа A и B), а
//также количество N этих чисел.