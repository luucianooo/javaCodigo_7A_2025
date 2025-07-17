import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese clase de auto (a, b o c): ");
        char clase = sc.next().toLowerCase().charAt(0);

        switch (clase) {
            case 'a':
                System.out.println("4 ruedas, 1 motor");
                break;
            case 'b':
                System.out.println("4 ruedas, 1 motor, cierre centralizado, aire");
                break;
            case 'c':
                System.out.println("4 ruedas, 1 motor, cierre centralizado, aire, airbag");
                break;
            default:
                System.out.println("Clase inválida");
        }
    }
}
