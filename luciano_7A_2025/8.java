public class Punto8 {
public static void main(String[] args) {
int jugador1 = 0; // 0: piedra
int jugador2 = 2; // 2: tijera
if (jugador1 == jugador2) {
System.out.println("Empate");
} else if ((jugador1 == 0 && jugador2 == 2) ||
(jugador1 == 1 && jugador2 == 0) ||
(jugador1 == 2 && jugador2 == 1)) {
System.out.println("Jugador 1 gana");
} else {
System.out.println("Jugador 2 gana");
}
}
}