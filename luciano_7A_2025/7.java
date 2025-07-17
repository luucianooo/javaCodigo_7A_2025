public class Punto7 {
    public static void main(String[] args) {
        int a = 15, b = 22, c = 10;
        int mayor = a;

        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        System.out.println("El mayor es: " + mayor);
    }
}

