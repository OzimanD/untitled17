package DmytroBondar.lessons;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

        reshuffle(arr);

        System.out.println(sumDigits(1234));

        System.out.println(reverseOrder(1234));

        System.out.println(getNumberOfName());

        System.out.println(getNumberOfDate());
    }

    //масив 3х3 зробити перестановку таким чином щоб рядки стали стовпчиками
    public static void reshuffle(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    //Завдання 1
    //Напишіть метод, який приймає число та повертає суму цифр цього числа.
    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    //Завдання 2
    //Напишіть метод, який приймає число, яке не містить нулів та повертає цифри у зворотному порядку.
    //Наприклад, на вхід 789, на вихід 987.
    public static int reverseOrder(int number) {
        int res = 0;
        while (number != 0) {
            res = res * 10 + number % 10;
            number /= 10;
        }
        return res;
    }

    //Завдання 3
    //Створіть програму, яка виводить у консоль число імені, наприклад, на вхід Roman = R(18) + O(15) + M(13) + A(1) + N(14) = 61, на вихід 61.
    public static int getNumberOfName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name:" );
        String name = scanner.next().toUpperCase();
        char[] nameChars = name.toCharArray();
        int numberOfName = 0;
        for (char nameChar : nameChars) {
            numberOfName += nameChar - 64;
        }
        return numberOfName;
    }

    //Завдання 4
    //Створіть програму, яка виводить у консоль число дати. Наприклад, на вхід 02/11/1995 = 0 + 2 + 1 + 1 + 1 + 9 + 9 + 5 = 28, на вихід = 28.
    public static int getNumberOfDate() {
        String date = "02/11/1995";
        char[] dateChars = date.toCharArray();
        int numberOfDate = 0;

        for (char dateChar : dateChars) {
            if (dateChar == '/') {
                continue;
            }
            numberOfDate += dateChar - 48;
        }

        return numberOfDate;
    }
}

