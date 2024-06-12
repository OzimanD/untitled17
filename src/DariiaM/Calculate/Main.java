package DariiaM.Calculate;

public class Main implements MainInterface {

    @Override
    public double add(double num1, double num2) {

        return num1+num2;
    }

    @Override
    public double div(double num1, double num2) {
        return num1/num2;
    }

    @Override
    public double minus(double num1, double num2) {
        return num1-num2;
    }

    @Override
    public double multiplication(double num1, double num2) {
        return num1*num2;
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.add(2,4);
        System.out.println(main.add(2,4));
    }
}
