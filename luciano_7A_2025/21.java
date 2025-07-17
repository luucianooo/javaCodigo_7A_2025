import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la categoría (A, B, C): ");
        char categoria = sc.next().toUpperCase().charAt(0);

        System.out.print("Ingrese la antigüedad en años: ");
        int antiguedad = sc.nextInt();

        System.out.print("Ingrese el sueldo bruto: ");
        double sueldoBruto = sc.nextDouble();

        double aumento = 0;

        if (antiguedad >= 1 && antiguedad <= 5) {
            aumento = 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            aumento = 0.10;
        } else if (antiguedad > 10) {
            aumento = 0.30;
        }

        int plus = 0;
        switch (categoria) {
            case 'A':
                plus = 1000;
                break;
            case 'B':
                plus = 2000;
                break;
            case 'C':
                plus = 3000;
                break;
            default:
                System.out.println("Categoría inválida.");
                return;
        }

        double sueldoNeto = sueldoBruto + (sueldoBruto * aumento) + plus;
        System.out.println("El sueldo neto es: $" + sueldoNeto);
    }
}
