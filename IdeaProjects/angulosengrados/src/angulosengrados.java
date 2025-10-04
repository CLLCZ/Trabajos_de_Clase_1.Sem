import java.util.Scanner;
public class angulosengrados {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un ángulo en grados: ");
        double grados = leer.nextDouble();
        double radianes = Math.toRadians(grados);
        double seno = Math.sin(radianes);
        double coseno = Math.cos(radianes);
        double tangente = seno / coseno;
        double secante = 1 / coseno;
        double cotangente = coseno / seno;
        double cosecante = 1 / seno;
        System.out.printf("Tangente del angulo: %2f%n", tangente);
        System.out.printf("Secante del angulo: %2f%n", secante);
        System.out.printf("Cotangente del angulo: %2f%n", cotangente);
        System.out.printf("Cosecante del angulo: %2f%n", cosecante);

    }

}
