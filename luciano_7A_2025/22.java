import java.util.Random;

public class Ejercicio22 {
    public static void main(String[] args) {
        Random rand = new Random();
        int contador = 0;

        while (contador < 10) {
            char[] categorias = {'A', 'B', 'C'};
            char categoria = categorias[rand.nextInt(categorias.length)];
            int antiguedad = rand.nextInt(20) + 1; // 1 a 20 años
            double sueldoBruto = 10000 + rand.nextDouble() * 40000; // entre 10k y 50k

            double aumento = 0;
            if (antiguedad >= 1 && antiguedad <= 5) {
                aumento = 0.05;
            } else if (antiguedad >= 6 && antiguedad <= 10) {
                aumento = 0.10;
            } else if (antiguedad > 10) {
                aumento = 0.30;
            }

            int plus = switch (categoria) {
                case 'A' -> 1000;
                case 'B' -> 2000;
                case 'C' -> 3000;
                default -> 0;
            };

            double sueldoNeto = sueldoBruto + (sueldoBruto * aumento) + plus;

            System.out.printf("Empleado %d: Categoría %c, Antigüedad %d años, Sueldo Bruto $%.2f, Sueldo Neto $%.2f%n",
                    contador + 1, categoria, antiguedad, sueldoBruto, sueldoNeto);

            contador++;
        }
    }
}