import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese tres números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("El mayor es: " + a);
        else if (b >= a && b >= c)
            System.out.println("El mayor es: " + b);
        else
            System.out.println("El mayor es: " + c);
    }
}
