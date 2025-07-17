public class Ejercicio20 {
    public static void main(String[] args) {
        int max = 0, min = 100, num;

        for (int i = 0; i < 10; i++) {
            num = (int) (Math.random() * 100);
            System.out.println("Número " + (i+1) + ": " + num);
            if (i == 0) {
                max = min = num;
            } else {
                if (num > max) max = num;
                if (num < min) min = num;
            }
        }

        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}
