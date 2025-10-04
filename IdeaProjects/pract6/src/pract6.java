import java.util.Scanner;
public class pract6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double N, totalp=0, totaln=0;
        byte X;

        do {
            System.out.println("Ingrese un número");
            N = leer.nextDouble();
            System.out.println("Ingrese '0' si quiere continuar agregando números");
            X = leer.nextByte();

            if (N > 0) {
                totalp = N + totalp;
            }
            if (N < 0) {
                totaln = N + totaln;
            }
        } while (X == 0);

        System.out.printf("Total de numeros positivos: %.2f%n", totalp);
        System.out.printf("Total de numeros negativos: %.2f%n", totaln);

    }
}
