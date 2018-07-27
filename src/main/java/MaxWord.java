import java.util.Scanner;


public class MaxWord {
    public void m2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int x = scanner.nextInt();
        String[] arr = new String[x];
        String musor = scanner.nextLine();
        System.out.println("Заполните все элементы массива:");
        int n = 0;
        for(int i=0; i<x; i++) {
            System.out.print("Элемент - " + (i+1) + ": ");
            arr[i] = scanner.nextLine();
            if (arr[i].length() > n) n = arr[i].length();
        }
        for (String h:arr){
            if (h.length()==n) {
                System.out.println("Результат: " + h + "\nКоличество символов: " + n);
            }
        }
    }
}
