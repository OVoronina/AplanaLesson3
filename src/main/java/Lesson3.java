import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Calc object = new Calc();
        MaxWord object2 = new MaxWord();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете задание:\n1 - калькулятор \n2 - слова");
        int choice = scanner.nextInt();
        if (choice == 1) object.m1();
        else if (choice == 2) object2.m2();
        else System.out.println("Промах");
    }
}
