
import java.util.Scanner;
public class nume {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double N, num, total=0, promedio, mayor=0, menor=99999;

        System.out.println("Ingrese la cantidad de números a ingresar: ");
        N = leer.nextDouble();

        for (int i=0; i<N; i++){
            System.out.println("Ingrese los números: ");
            num = leer.nextDouble();
            total = total + num;
            if (num > mayor){
                mayor = num;
            }
            if (num < menor){
                menor = num;
            }
        }
        promedio = total / N;
        System.out.printf("Total de la suma: %.2f%n", total);
        System.out.printf("Promedio de los números: %.2f%n", promedio);
        System.out.printf("Mayor de los números ingresados: %.2f%n", mayor);
        System.out.printf("Menor de los números ingresados: %.2f%n", menor);
    }
}
