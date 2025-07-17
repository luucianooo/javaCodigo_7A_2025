import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("0 = Piedra, 1 = Papel, 2 = Tijera");
        System.out.print("Jugador 1: ");
        int jugador1 = sc.nextInt();

        System.out.print("Jugador 2: ");
        int jugador2 = sc.nextInt();

        if ((jugador1 == 0 && jugador2 == 2) ||
            (jugador1 == 1 && jugador2 == 0) ||
            (jugador1 == 2 && jugador2 == 1)) {
            System.out.println("Gana el Jugador 1");
        } else if
