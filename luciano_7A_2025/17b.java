import java.util.Scanner;

public class Ejercicio17b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }

        System.out.println("Suma de pares: " + suma);
    }
}
