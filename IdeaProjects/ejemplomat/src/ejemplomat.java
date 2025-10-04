import java.util.Scanner;
public class ejemplomat {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un número decimal: ");
        double numero = leer.nextDouble();
        System.out.println("Ingresa un ángulo en grados: ");
        double grados = leer.nextDouble();
        double raiz = Math.sqrt(Math.abs(numero));
        double potencia = Math.pow(numero, 2);
        double abs = Math.abs(numero);
        double redondear = Math.round(numero);
        double maximo = Math.max(numero, 100);
        double minimo = Math.min(numero, 100);
        double radianes = Math.toRadians(grados);
        double seno = Math.sin(radianes);
        double coseno = Math.cos(radianes);
        double tangente = Math.tan(radianes);
        System.out.printf("Raiz del mimero: 3.2f", raiz);
        System.out.printf("Potencia: %.2f", potencia);
        System.out.printf("Valor absoluto: %.2f", abs);
        System.out.printf("Redondeado: %.2f", redondear);
        System.out.printf("Maximo: %.2f", maximo);
        System.out.printf("Minimo: %.2f", minimo);
        System.out.printf("Grados en radianes: %.2f", radianes);
        System.out.printf("Seno: %.2f", seno);
        System.out.printf("Coseno: %.2f", coseno);
        System.out.printf("Tangente: %.2f", tangente);
    }
}