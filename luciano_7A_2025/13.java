import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del mes: ");
        String mes = sc.next().toLowerCase();

        switch (mes) {
            case "febrero":
                System.out.println("28 días");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("30 días");
                break;
            default:
                System.out.println("31 días");
        }
    }
}
