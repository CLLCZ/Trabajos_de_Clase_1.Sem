import java.util.Scanner;
public class poten {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num, potencia;
        System.out.println("Ingrese el número hasta el cual desea conocer su potencia: ");
        num = leer.nextDouble();
        System.out.println("Número potencia");
        System.out.println("---------------");


        for (int i=1; i<=num; i++ ){

            potencia = Math.pow(i, i);
            System.out.printf("%d^%d es %.2f%n", i , i, potencia);

        }
    }
}
