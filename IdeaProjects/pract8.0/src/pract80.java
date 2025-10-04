import java.util.Scanner;
public class pract80 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double c, num, sum=0, prom;

        System.out.println("Ingrese la cantidad de números que desea ingresar:");
        c = leer.nextDouble();

        for (int i=0; i<c; i++) {
            System.out.println("Ingrese los números: ");
            num = leer.nextDouble();

            sum = sum + num;
            if ((num % 2) == 0) {
                System.out.println("El numero es par");
            } else if ((num % 2) == 1) {
                System.out.println("El numero es impar");
            }
        }
        prom = sum / c;
        System.out.printf("La suma de los numeros ingresados es de = %.2f%n", sum);
        System.out.printf("El promedio es de= %.2f%n", prom);
    }
}
