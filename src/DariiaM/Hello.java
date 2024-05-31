package DariiaM;

public class Hello {
    public static void Track (int A, int B){
        int [] sum = new int[6];
        int j = 0;
        if ( A < B){
            int C = 0;
            for (int i = A; i <= B; i++) {
                C++;
                sum [j] = i;
                j++;
            }
            System.out.println(C);
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum [i]);
        }
    }

    public static void main(String[] args) {
        Track(5,10);
    }
}
//Даны два целых числа A и B (A < B). Вывести в порядке возрастания все
//целые числа, расположенные между A и B (включая сами числа A и B), а
//также количество N этих чисел.