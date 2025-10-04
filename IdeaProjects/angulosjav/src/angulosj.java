import java.util.Scanner;
public class angulosj {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el angulo en grados para saber su tipo: ");

        double grados = leer.nextDouble();

        if (grados < 90) {
            System.out.println("El angulo ingresado es agudo");
        }
        if (grados > 90) {
            System.out.println("El angulo ingresado es obtuso");
        }
        if (grados == 90 ) {
            System.out.println("El angulo ingresado es recto");
        }

    }

}
