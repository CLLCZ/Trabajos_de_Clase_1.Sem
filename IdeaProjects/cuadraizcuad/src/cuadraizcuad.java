import java.util.Scanner;
public class cuadraizcuad {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.printf("Ingrese valor de A: ");
        double a = leer.nextDouble();

        System.out.printf("Ingrese valor de B: ");
        double b = leer.nextDouble();

        double y = (3 * Math.pow(a, 2) * b * Math.sqrt(2 * a));
        double w = (4 * Math.sqrt((2 * a) * a) * ( 3 * Math.pow(a, 2) * Math.pow(b, 2) - Math.sqrt(2 * a)));
        double z = (12 * Math.pow(a, 0.5) / Math.pow(b, 0.75));

        System.out.printf("Valor de Y 3a^2b^2√2a: %.2f%n", y);

        System.out.printf("Valor de W 4√2^a*a(3a^2b^2-√2a): %.2f%n", w);

        System.out.printf("Valor de Z 12a^1/2 / b^3/4: %.2f%n", z);


    }
}
