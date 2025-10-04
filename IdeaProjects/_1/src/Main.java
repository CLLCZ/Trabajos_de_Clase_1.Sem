import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre = null;
        int numero = 0;
        double numeroDecimal = 0.0;

        System.out.println("Escribe un nombre:  ");
        nombre = leer.nextLine();
        try {
            System.out.println("Escribe un numero entero: ");
            numero = leer.nextInt();
            System.out.println("Escribe un numero decimal: ");
            numeroDecimal = leer.nextDouble();
        } catch (InputMismatchException imo) {
            System.out.println("Error, no especicaste un numero");
        }
        System.out.println("El nombre es: " + nombre);
        System.out.println("El numero es: " + numero);
        System.out.println("El numero decimal es: " + numeroDecimal);

    }
}