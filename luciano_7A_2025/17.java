import java.util.Scanner;

public class Ejercicio17a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) suma += i;
        }

        System.out.println("Suma de pares: " + suma);
    }
}
