package AnnaP;

public class Task1 {
    public static void main(String[] args) {
        int number = 122;
        sum(number);

    }

    public static int sum(int one) {
        int count = 10;
        int sum = 0;
        for (int i = 0; i < one; i++) {
            int v = one/count;
            one = one - v;
            sum = v + sum;
            count *=10;
        }
        sum = sum + (one%10);
        System.out.println(sum);
//        int sum = (one / 100) + (one / 10) + (one % 10);
//        System.out.println(sum);
        return sum;
    }
}

//Завдання 1
//        Напишіть метод, який приймає число та повертає суму цифр цього числа.
