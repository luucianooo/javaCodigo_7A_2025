public class Ejercicio19 {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 100);
            System.out.println("Número " + (i+1) + ": " + num);
            suma += num;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + (suma / 10.0));
    }
}
