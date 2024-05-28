import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
    //    number(int num);

    }
    public static int number(int num){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your 2 digit number here : ");
        int res = in.nextInt();
        int  res1 = res / 10;
        int  res2 = res % 10;
         return res1 + res2;
    }

}
//Напишіть метод, який приймає число та повертає суму цифр цього числа.