import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //commit - означает сохранение (фиксацию) текущей версии программы

        //красный цвет - не отслеживаемые файлы
        //зеленый цвет - отслеживаемые файлы

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scn.nextInt();
        System.out.print("Enter b: ");
        int b = scn.nextInt();
        System.out.println("sum = "+(a+b));
    }
}