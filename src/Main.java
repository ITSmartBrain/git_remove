import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //commit - означает сохранение (фиксацию) текущей версии программы

        //красный цвет - не отслеживаемые файлы
        //зеленый цвет - отслеживаемые файлы
        //белый цвет - закомиченые файлы (сохраненные)
        //синий цвет - в закомиченных файлах произошли изменения, которые пока не закомичены (не сохранены)

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scn.nextInt();
        System.out.print("Enter b: ");
        int b = scn.nextInt();
        System.out.println("sum = "+(a+b));
        System.out.println("mult = "+(a*b));
        if(b!=0) {
            System.out.println("division = " + (a / b));
        }else{
            System.out.println("На ноль делить нельзя");
        }
    }
}