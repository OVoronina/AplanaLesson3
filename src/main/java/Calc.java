import java.util.Scanner;

public class Calc {
    public void m1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Выберете действие: \n1 - сложение \n2 - вычитание \n3 - умножение \n4 - деление");
        int znak = scanner.nextInt();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();
        System.out.print("Результат: ");
        double x = 0;
        if(znak == 1) x = (a + b);
        if (znak == 2) x = (a - b);
        if (znak == 3) x = (a * b);
        if (znak == 4) x = (a / b);
        System.out.printf("%.4f",x);
    }
}

